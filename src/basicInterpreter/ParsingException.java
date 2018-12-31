package basicInterpreter;

import org.antlr.v4.runtime.ParserRuleContext;

public class ParsingException extends RuntimeException {
    private ParserRuleContext context;

    ParsingException(String message, ParserRuleContext ctx) {
        super(message);
        this.context = ctx;
    }

    public ParserRuleContext getContext(){
        return context;
    }
}
