package basicInterpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import basicAntlr.BasicParser;
import basicAntlr.BasicBaseVisitor;

public class BasicVisitor extends BasicBaseVisitor<Boolean> {
    private Scope globalVariables;
    private FunctionLibrary functions;

    public BasicVisitor() {
        this.globalVariables = new Scope();
        this.functions = new FunctionLibrary();
    }

    @Override
    public Boolean visitProgram(BasicParser.ProgramContext ctx) {
        for (ParseTree childTree : ctx.children) {
            visit(childTree);
        }
        return true;
    }

    @Override
    public Boolean visitStatement(BasicParser.StatementContext ctx) {
        for (ParseTree childTree : ctx.children) {
            visit(childTree);
        }
        return true;
    }

    @Override
    public Boolean visitLetStatement(BasicParser.LetStatementContext ctx) {
        String name = ctx.ID().getText();
        Double value = new ExpressionVisitor(globalVariables, functions).visitExpression(ctx.expression());
        globalVariables.set(name, value);
        return true;
    }

    @Override
    public Boolean visitPrintStatement(BasicParser.PrintStatementContext ctx) {
        for (ParseTree childTree : ctx.children) {
            visit(childTree);
        }

        return true;
    }

    @Override
    public Boolean visitPrintSeparator(BasicParser.PrintSeparatorContext ctx) {
        if (ctx.COMMA() != null) {
            System.out.print(" ");
        } else if (ctx.SEMICOLON() != null) {
            System.out.print("\n");
        }

        return true;
    }

    @Override
    public Boolean visitPrintArgument(BasicParser.PrintArgumentContext ctx) {
        String argument = "";
        if (ctx.expression() != null) {
            argument = new ExpressionVisitor(globalVariables, functions).visitExpression(ctx.expression()).toString();
        }

        System.out.print(argument);

        return true;
    }

    @Override
    public Boolean visitDefStatement(BasicParser.DefStatementContext ctx) {
        String functionName = ctx.ID(0).getText();
        String functionArgument = ctx.ID(1).getText();
        BasicParser.ExpressionContext expressionContext = ctx.expression();
        Function newFunction = new Function(functionArgument, expressionContext);

        functions.set(functionName, newFunction);

        return true;
    }
}
