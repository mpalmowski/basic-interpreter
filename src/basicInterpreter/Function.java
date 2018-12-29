package basicInterpreter;

import basicAntlr.BasicParser;

public class Function {
    private String argument;
    private BasicParser.ExpressionContext expressionContext;

    Function(String argument, BasicParser.ExpressionContext expressionContext) {
        this.argument = argument;
        this.expressionContext = expressionContext;
    }

    public Double run(Double argumentValue, Scope parentScope, FunctionLibrary functions) {
        Scope localScope = new Scope(parentScope);
        localScope.set(argument, argumentValue);
        return new ExpressionVisitor(localScope, functions).visit(expressionContext);
    }
}
