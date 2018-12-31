package basicInterpreter;

import basicAntlr.BasicParser;

import java.util.Queue;

public class ForLoop extends BasicVisitor {
    private String iterationVariableName;
    private Double startValue = null, endValue, step;

    ForLoop(Scope scope, FunctionLibrary functions, Queue<Double> data) {
        this.scope = scope;
        this.functions = functions;
        this.data = data;
    }

    @Override
    public Boolean visitForLoop(BasicParser.ForLoopContext ctx) {
        rememberLineNumbers(ctx.statement());
        visit(ctx.forStatement());

        Double currentValue = startValue;
        while ((startValue <= endValue && currentValue <= endValue)||(startValue >= endValue && currentValue >= endValue)) {
            for(BasicParser.StatementContext statementContext : ctx.statement())
                if(!visit(statementContext)){
                    if(statementContext.stopStatement() != null)
                        return true;
                    if(statementContext.endStatement() != null)
                        return false;
                }

            visit(ctx.nextStatement());
            currentValue = scope.get(iterationVariableName);
            visit(ctx.forStatement());
        }

        return true;
    }

    @Override
    public Boolean visitForStatement(BasicParser.ForStatementContext ctx) {
        iterationVariableName = ctx.ID().getText();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope, functions);
        if(startValue == null) {
            startValue = expressionVisitor.visit(ctx.expression(0));
            scope.set(iterationVariableName, startValue);
        }
        endValue = expressionVisitor.visit(ctx.expression(1));

        if(ctx.STEP() != null) {
            step = expressionVisitor.visit(ctx.expression(2));
        } else if(startValue <= endValue) {
            step = 1.0;
        } else {
            step = -1.0;
        }

        return true;
    }

    @Override
    public Boolean visitNextStatement(BasicParser.NextStatementContext ctx) {
        Double value = scope.get(iterationVariableName);
        value += step;
        scope.set(iterationVariableName, value);
        return true;
    }
}
