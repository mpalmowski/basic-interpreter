package basicInterpreter;

import basicAntlr.BasicBaseVisitor;
import basicAntlr.BasicLexer;
import basicAntlr.BasicParser;

public class ExpressionVisitor extends BasicBaseVisitor<Double> {
    private Scope scope;
    private FunctionLibrary functions;

    ExpressionVisitor(Scope scope, FunctionLibrary functions) {
        this.scope = scope;
        this.functions = functions;
    }

    @Override
    public Double visitParenExpression(BasicParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitPowerExpression(BasicParser.PowerExpressionContext ctx) {
        double val1, val2;
        val1 = visit(ctx.expression(0));
        val2 = visit(ctx.expression(1));
        return Math.pow(val1, val2);
    }

    @Override
    public Double visitMulDivExpression(BasicParser.MulDivExpressionContext ctx) {
        double val1, val2;
        val1 = visit(ctx.expression(0));
        val2 = visit(ctx.expression(1));
        switch (ctx.operator.getType()) {
            case BasicLexer.MULTIPLY:
                return val1 * val2;
            case BasicLexer.DIVIDE:
                return val1 / val2;
        }

        return 0.0;
    }

    @Override
    public Double visitAddSubExpression(BasicParser.AddSubExpressionContext ctx) {
        double val1, val2;
        val1 = visit(ctx.expression(0));
        val2 = visit(ctx.expression(1));
        switch (ctx.operator.getType()) {
            case BasicLexer.PLUS:
                return val1 + val2;
            case BasicLexer.MINUS:
                return val1 - val2;
        }

        return 0.0;
    }

    @Override
    public Double visitAtomExpression(BasicParser.AtomExpressionContext ctx) {
        return visit(ctx.expressionAtom());
    }

    @Override
    public Double visitExpressionAtom(BasicParser.ExpressionAtomContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Double visitNumber(BasicParser.NumberContext ctx) {
        Double value = 0.0;
        if (ctx.NUMBER() != null) {
            value = Double.parseDouble(ctx.NUMBER().getText());
        } else if (ctx.FLOAT() != null) {
            value = Double.parseDouble(ctx.FLOAT().getText());
        }

        if (ctx.MINUS() != null) {
            value *= -1;
        }

        return value;
    }

    @Override
    public Double visitFunctionCall(BasicParser.FunctionCallContext ctx) {
        Double argumentValue = visit(ctx.expression());
        return functions.run(ctx.ID().getText(), argumentValue, scope);
    }

    @Override
    public Double visitVariable(BasicParser.VariableContext ctx) {
        return scope.get(ctx.ID().getText());
    }
}
