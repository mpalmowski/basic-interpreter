package basicInterpreter;

import basicAntlr.BasicLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import basicAntlr.BasicParser;
import basicAntlr.BasicBaseVisitor;

import java.util.HashMap;
import java.util.Map;

public class BasicVisitor extends BasicBaseVisitor<Boolean> {
    private Scope globalVariables;
    private FunctionLibrary functions;
    private Map<Integer, Integer> numberedStatements;
    private Integer nextStatement;

    public BasicVisitor() {
        this.globalVariables = new Scope();
        this.functions = new FunctionLibrary();
        this.numberedStatements = new HashMap<>();
    }

    private Integer getLineNumber(BasicParser.StatementContext ctx) {
        if (ctx.lineNumber() != null) {
            return Integer.parseInt(ctx.lineNumber().getText());
        }
        return -1;
    }

    @Override
    public Boolean visitProgram(BasicParser.ProgramContext ctx) {
        for (int i = 0; i < ctx.statement().size(); ++i) {
            int lineNumber = getLineNumber(ctx.statement(i));
            if (lineNumber >= 0) {
                numberedStatements.put(lineNumber, i);
            }
        }

        nextStatement = -1;
        for(int i=0; i<ctx.statement().size(); ++i){
            if(nextStatement >= 0){
                i = nextStatement;
                nextStatement = -1;
            }
            visitStatement(ctx.statement(i));
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
        Double value = new ExpressionVisitor(globalVariables, functions).visit(ctx.expression());
        globalVariables.set(name, value);
        return true;
    }

    @Override
    public Boolean visitPrintStatement(BasicParser.PrintStatementContext ctx) {
        for (ParseTree childTree : ctx.children) {
            visit(childTree);
        }
        System.out.print("\n");

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
            argument = new ExpressionVisitor(globalVariables, functions).visit(ctx.expression()).toString();
        } else if (ctx.STRING() != null) {
            argument = ctx.STRING().toString();
            argument = argument.substring(1, argument.length()-1);
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

    @Override
    public Boolean visitGotoStatement(BasicParser.GotoStatementContext ctx) {
        int lineNumber = Integer.parseInt(ctx.lineNumber().getText());
        nextStatement = numberedStatements.get(lineNumber);
        if(nextStatement == null){
            nextStatement = -1;
            //TODO throw exception
        }
        return true;
    }

    @Override
    public Boolean visitIfStatement(BasicParser.IfStatementContext ctx) {
        if(visit(ctx.logicalExpression())){
            int lineNumber = Integer.parseInt(ctx.lineNumber().getText());
            nextStatement = numberedStatements.get(lineNumber);
            if(nextStatement == null){
                nextStatement = -1;
                //TODO throw exception
            }
        }
        return true;
    }

    @Override
    public Boolean visitLogicalExpression(BasicParser.LogicalExpressionContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(globalVariables, functions);
        Double expression1 = expressionVisitor.visit(ctx.expression(0));
        Double expression2 = expressionVisitor.visit(ctx.expression(1));
        switch (ctx.operator.getType()){
            case BasicLexer.LESS:
                return expression1 < expression2;
            case BasicLexer.LESS_OR_EQUAL:
                return expression1 <= expression2;
            case BasicLexer.EQUAL:
                return expression1.equals(expression2);
            case BasicLexer.GREATER:
                return expression1 > expression2;
            case BasicLexer.GREATER_OR_EQUAL:
                return expression1 >= expression2;
            case BasicLexer.NOT_EQUAL:
                return !expression1.equals(expression2);
        }
        return false;
    }
}
