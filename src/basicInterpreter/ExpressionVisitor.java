package basicInterpreter;

import basicAntlr.BasicBaseVisitor;
import basicAntlr.BasicParser;

public class ExpressionVisitor extends BasicBaseVisitor<Double> {
    private Scope scope;
    private Memory<Function> functions;

    ExpressionVisitor(Scope scope, Memory<Function> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    private Double multiplyOrDivide(double valueLeft, double valueRight, BasicParser.MultiplyDivideOpContext ctx) {
        if (ctx.MULTIPLY() != null) {
            return valueLeft * valueRight;
        }

        if (ctx.DIVIDE() != null) {
            return valueLeft / valueRight;
        }

        return 0.0;
    }

    private Double addOrSubtract(double valueLeft, double valueRight, BasicParser.AddSubtractOpContext ctx) {
        if (ctx.MINUS() != null) {
            return valueLeft - valueRight;
        }

        if (ctx.PLUS() != null) {
            return valueLeft + valueRight;
        }

        return 0.0;
    }

    @Override
    public Double visitExpression(BasicParser.ExpressionContext ctx) {
        double val1, val2;

        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
            return visitExpression(ctx.expression(0));
        }

        if (ctx.POWER() != null) {
            val1 = visitExpression(ctx.expression(0));
            val2 = visitExpression(ctx.expression(1));
            return Math.pow(val1, val2);
        }

        if (ctx.multiplyDivideOp() != null) {
            val1 = visitExpression(ctx.expression(0));
            val2 = visitExpression(ctx.expression(1));
            return multiplyOrDivide(val1, val2, ctx.multiplyDivideOp());
        }

        if (ctx.addSubtractOp() != null) {
            val1 = visitExpression(ctx.expression(0));
            val2 = visitExpression(ctx.expression(1));
            return addOrSubtract(val1, val2, ctx.addSubtractOp());
        }

        if (ctx.expressionAtom() != null) {
            return visitExpressionAtom(ctx.expressionAtom());
        }

        return 0.0;
    }

    @Override
    public Double visitExpressionAtom(BasicParser.ExpressionAtomContext ctx) {
        if (ctx.number() != null) {
            return visitNumber(ctx.number());
        }

        if (ctx.ID() != null) {
            return scope.get(ctx.ID().getText());
        }

        if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        }

        return 0.0;
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
        Double argumentValue = visitExpression(ctx.expression());
        Function function = functions.get(ctx.ID().getText());
        if(function != null){
            return function.call(argumentValue, scope, functions);
        }
        return 0.0;
    }
}
