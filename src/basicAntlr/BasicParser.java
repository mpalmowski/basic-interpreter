// Generated from D:/Workspace/IntelliJ/basicInterpreter\Basic.g4 by ANTLR 4.7
package basicAntlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, DATA=2, READ=3, PRINT=4, GOTO=5, IF=6, THEN=7, FOR=8, TO=9, STEP=10, 
		NEXT=11, DEF=12, REM=13, STOP=14, END=15, SIN=16, COS=17, TAN=18, ATN=19, 
		EXP=20, ABS=21, LOG=22, SQR=23, RND=24, INT=25, ID=26, NUMBER=27, FLOAT=28, 
		STRING=29, PLUS=30, MINUS=31, MULTIPLY=32, DIVIDE=33, POWER=34, LESS=35, 
		LESS_OR_EQUAL=36, EQUAL=37, GREATER=38, GREATER_OR_EQUAL=39, NOT_EQUAL=40, 
		COMMA=41, SEMICOLON=42, DOT=43, LPAREN=44, RPAREN=45, WHITESPACE=46, NEWLINE=47;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_letStatement = 2, RULE_dataStatement = 3, 
		RULE_readStatement = 4, RULE_printStatement = 5, RULE_gotoStatement = 6, 
		RULE_ifStatement = 7, RULE_forOpening = 8, RULE_forClosing = 9, RULE_forStatement = 10, 
		RULE_defStatement = 11, RULE_remStatement = 12, RULE_stopStatement = 13, 
		RULE_endStatement = 14, RULE_printSeparator = 15, RULE_printArgument = 16, 
		RULE_expression = 17, RULE_expressionAtom = 18, RULE_functionCall = 19, 
		RULE_multiplyDivideOp = 20, RULE_addSubtractOp = 21, RULE_logicalOperator = 22, 
		RULE_builtInFunction = 23, RULE_lineNumber = 24, RULE_number = 25;
	public static final String[] ruleNames = {
		"program", "statement", "letStatement", "dataStatement", "readStatement", 
		"printStatement", "gotoStatement", "ifStatement", "forOpening", "forClosing", 
		"forStatement", "defStatement", "remStatement", "stopStatement", "endStatement", 
		"printSeparator", "printArgument", "expression", "expressionAtom", "functionCall", 
		"multiplyDivideOp", "addSubtractOp", "logicalOperator", "builtInFunction", 
		"lineNumber", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'<'", "'<='", "'='", "'>'", "'>='", "'<>'", "','", "';'", "'.'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "DATA", "READ", "PRINT", "GOTO", "IF", "THEN", "FOR", "TO", 
		"STEP", "NEXT", "DEF", "REM", "STOP", "END", "SIN", "COS", "TAN", "ATN", 
		"EXP", "ABS", "LOG", "SQR", "RND", "INT", "ID", "NUMBER", "FLOAT", "STRING", 
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "LESS", "LESS_OR_EQUAL", 
		"EQUAL", "GREATER", "GREATER_OR_EQUAL", "NOT_EQUAL", "COMMA", "SEMICOLON", 
		"DOT", "LPAREN", "RPAREN", "WHITESPACE", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BasicParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					statement();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58);
			endStatement();
			setState(59);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(BasicParser.NEWLINE, 0); }
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StopStatementContext stopStatement() {
			return getRuleContext(StopStatementContext.class,0);
		}
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public RemStatementContext remStatement() {
			return getRuleContext(RemStatementContext.class,0);
		}
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(61);
				lineNumber();
				}
			}

			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(64);
				letStatement();
				}
				break;
			case DATA:
				{
				setState(65);
				dataStatement();
				}
				break;
			case READ:
				{
				setState(66);
				readStatement();
				}
				break;
			case PRINT:
				{
				setState(67);
				printStatement();
				}
				break;
			case GOTO:
				{
				setState(68);
				gotoStatement();
				}
				break;
			case IF:
				{
				setState(69);
				ifStatement();
				}
				break;
			case FOR:
				{
				setState(70);
				forStatement();
				}
				break;
			case STOP:
				{
				setState(71);
				stopStatement();
				}
				break;
			case DEF:
				{
				setState(72);
				defStatement();
				}
				break;
			case REM:
				{
				setState(73);
				remStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(BasicParser.LET, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LET);
			setState(79);
			match(ID);
			setState(80);
			match(EQUAL);
			setState(81);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataStatementContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(BasicParser.DATA, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(DATA);
			setState(84);
			number();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				number();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(READ);
			setState(93);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				match(ID);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public List<PrintArgumentContext> printArgument() {
			return getRuleContexts(PrintArgumentContext.class);
		}
		public PrintArgumentContext printArgument(int i) {
			return getRuleContext(PrintArgumentContext.class,i);
		}
		public List<PrintSeparatorContext> printSeparator() {
			return getRuleContexts(PrintSeparatorContext.class);
		}
		public PrintSeparatorContext printSeparator(int i) {
			return getRuleContext(PrintSeparatorContext.class,i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PRINT);
			setState(102);
			printArgument();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON) {
				{
				{
				setState(103);
				printSeparator();
				setState(104);
				printArgument();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(BasicParser.GOTO, 0); }
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(GOTO);
			setState(112);
			lineNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			expression(0);
			setState(116);
			logicalOperator();
			setState(117);
			expression(0);
			setState(118);
			match(THEN);
			setState(119);
			lineNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForOpeningContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BasicParser.FOR, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public TerminalNode STEP() { return getToken(BasicParser.STEP, 0); }
		public ForOpeningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forOpening; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitForOpening(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForOpeningContext forOpening() throws RecognitionException {
		ForOpeningContext _localctx = new ForOpeningContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forOpening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(ID);
			setState(123);
			match(EQUAL);
			setState(124);
			expression(0);
			setState(125);
			match(TO);
			setState(126);
			expression(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(127);
				match(STEP);
				setState(128);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClosingContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public ForClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClosing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitForClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClosingContext forClosing() throws RecognitionException {
		ForClosingContext _localctx = new ForClosingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forClosing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(NEXT);
			setState(132);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForOpeningContext forOpening() {
			return getRuleContext(ForOpeningContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BasicParser.NEWLINE, 0); }
		public ForClosingContext forClosing() {
			return getRuleContext(ForClosingContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			forOpening();
			setState(135);
			match(NEWLINE);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					statement();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(142);
				lineNumber();
				}
			}

			setState(145);
			forClosing();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefStatementContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(BasicParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(BasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BasicParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DEF);
			setState(148);
			match(ID);
			setState(149);
			match(LPAREN);
			setState(150);
			match(ID);
			setState(151);
			match(RPAREN);
			setState(152);
			match(EQUAL);
			setState(153);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemStatementContext extends ParserRuleContext {
		public TerminalNode REM() { return getToken(BasicParser.REM, 0); }
		public RemStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitRemStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemStatementContext remStatement() throws RecognitionException {
		RemStatementContext _localctx = new RemStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_remStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(REM);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(156);
					matchWildcard();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopStatementContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(BasicParser.STOP, 0); }
		public StopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopStatementContext stopStatement() throws RecognitionException {
		StopStatementContext _localctx = new StopStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BasicParser.NEWLINE, i);
		}
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitEndStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_endStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(164);
				lineNumber();
				}
			}

			setState(167);
			match(END);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintSeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(BasicParser.SEMICOLON, 0); }
		public PrintSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSeparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSeparatorContext printSeparator() throws RecognitionException {
		PrintSeparatorContext _localctx = new PrintSeparatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BasicParser.STRING, 0); }
		public PrintArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentContext printArgument() throws RecognitionException {
		PrintArgumentContext _localctx = new PrintArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printArgument);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
			case COS:
			case TAN:
			case ATN:
			case EXP:
			case ABS:
			case LOG:
			case SQR:
			case RND:
			case INT:
			case ID:
			case NUMBER:
			case FLOAT:
			case PLUS:
			case MINUS:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				expression(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public TerminalNode POWER() { return getToken(BasicParser.POWER, 0); }
		public MultiplyDivideOpContext multiplyDivideOp() {
			return getRuleContext(MultiplyDivideOpContext.class,0);
		}
		public AddSubtractOpContext addSubtractOp() {
			return getRuleContext(AddSubtractOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(181);
				match(LPAREN);
				setState(182);
				expression(0);
				setState(183);
				match(RPAREN);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case ATN:
			case EXP:
			case ABS:
			case LOG:
			case SQR:
			case RND:
			case INT:
			case ID:
			case NUMBER:
			case FLOAT:
			case PLUS:
			case MINUS:
				{
				setState(185);
				expressionAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						match(POWER);
						setState(190);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						multiplyDivideOp();
						setState(193);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						addSubtractOp();
						setState(197);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionAtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionAtom);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(BasicParser.ID, 0); }
		public BuiltInFunctionContext builtInFunction() {
			return getRuleContext(BuiltInFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(209);
				match(ID);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case ATN:
			case EXP:
			case ABS:
			case LOG:
			case SQR:
			case RND:
			case INT:
				{
				setState(210);
				builtInFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(213);
			match(LPAREN);
			setState(214);
			expression(0);
			setState(215);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyDivideOpContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(BasicParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(BasicParser.DIVIDE, 0); }
		public MultiplyDivideOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDivideOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitMultiplyDivideOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDivideOpContext multiplyDivideOp() throws RecognitionException {
		MultiplyDivideOpContext _localctx = new MultiplyDivideOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplyDivideOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSubtractOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public AddSubtractOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubtractOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitAddSubtractOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubtractOpContext addSubtractOp() throws RecognitionException {
		AddSubtractOpContext _localctx = new AddSubtractOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_addSubtractOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(BasicParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(BasicParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(BasicParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(BasicParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(BasicParser.NOT_EQUAL, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInFunctionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(BasicParser.SIN, 0); }
		public TerminalNode COS() { return getToken(BasicParser.COS, 0); }
		public TerminalNode TAN() { return getToken(BasicParser.TAN, 0); }
		public TerminalNode ATN() { return getToken(BasicParser.ATN, 0); }
		public TerminalNode EXP() { return getToken(BasicParser.EXP, 0); }
		public TerminalNode ABS() { return getToken(BasicParser.ABS, 0); }
		public TerminalNode LOG() { return getToken(BasicParser.LOG, 0); }
		public TerminalNode SQR() { return getToken(BasicParser.SQR, 0); }
		public TerminalNode RND() { return getToken(BasicParser.RND, 0); }
		public TerminalNode INT() { return getToken(BasicParser.INT, 0); }
		public BuiltInFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitBuiltInFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionContext builtInFunction() throws RecognitionException {
		BuiltInFunctionContext _localctx = new BuiltInFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_builtInFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ATN) | (1L << EXP) | (1L << ABS) | (1L << LOG) | (1L << SQR) | (1L << RND) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitLineNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(BasicParser.FLOAT, 0); }
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(230);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00eb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\3\5\3A"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0084\n\n\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13"+
		"\f\3\f\5\f\u0092\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\17\3\17\3\20\5\20\u00a8\n\20"+
		"\3\20\3\20\7\20\u00ac\n\20\f\20\16\20\u00af\13\20\3\21\3\21\3\22\3\22"+
		"\5\22\u00b5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ca\n\23\f\23"+
		"\16\23\u00cd\13\23\3\24\3\24\3\24\5\24\u00d2\n\24\3\25\3\25\5\25\u00d6"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\5\33\u00e7\n\33\3\33\3\33\3\33\3\u00a1\3$\34\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\3\2+,\3\2\"#\3\2 !\3\2"+
		"%*\3\2\22\33\3\2\35\36\2\u00ed\29\3\2\2\2\4@\3\2\2\2\6P\3\2\2\2\bU\3\2"+
		"\2\2\n^\3\2\2\2\fg\3\2\2\2\16q\3\2\2\2\20t\3\2\2\2\22{\3\2\2\2\24\u0085"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u0095\3\2\2\2\32\u009d\3\2\2\2\34\u00a4\3"+
		"\2\2\2\36\u00a7\3\2\2\2 \u00b0\3\2\2\2\"\u00b4\3\2\2\2$\u00bc\3\2\2\2"+
		"&\u00d1\3\2\2\2(\u00d5\3\2\2\2*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00df\3"+
		"\2\2\2\60\u00e1\3\2\2\2\62\u00e3\3\2\2\2\64\u00e6\3\2\2\2\668\5\4\3\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5"+
		"\36\20\2=>\7\2\2\3>\3\3\2\2\2?A\5\62\32\2@?\3\2\2\2@A\3\2\2\2AL\3\2\2"+
		"\2BM\5\6\4\2CM\5\b\5\2DM\5\n\6\2EM\5\f\7\2FM\5\16\b\2GM\5\20\t\2HM\5\26"+
		"\f\2IM\5\34\17\2JM\5\30\r\2KM\5\32\16\2LB\3\2\2\2LC\3\2\2\2LD\3\2\2\2"+
		"LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2"+
		"MN\3\2\2\2NO\7\61\2\2O\5\3\2\2\2PQ\7\3\2\2QR\7\34\2\2RS\7\'\2\2ST\5$\23"+
		"\2T\7\3\2\2\2UV\7\4\2\2V[\5\64\33\2WX\7+\2\2XZ\5\64\33\2YW\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2][\3\2\2\2^_\7\5\2\2_d\7\34\2\2"+
		"`a\7+\2\2ac\7\34\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\13\3\2\2"+
		"\2fd\3\2\2\2gh\7\6\2\2hn\5\"\22\2ij\5 \21\2jk\5\"\22\2km\3\2\2\2li\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pn\3\2\2\2qr\7\7\2\2rs\5"+
		"\62\32\2s\17\3\2\2\2tu\7\b\2\2uv\5$\23\2vw\5.\30\2wx\5$\23\2xy\7\t\2\2"+
		"yz\5\62\32\2z\21\3\2\2\2{|\7\n\2\2|}\7\34\2\2}~\7\'\2\2~\177\5$\23\2\177"+
		"\u0080\7\13\2\2\u0080\u0083\5$\23\2\u0081\u0082\7\f\2\2\u0082\u0084\5"+
		"$\23\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\7\r\2\2\u0086\u0087\7\34\2\2\u0087\25\3\2\2\2\u0088\u0089\5\22"+
		"\n\2\u0089\u008d\7\61\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0092\5\62\32\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\24\13\2\u0094\27\3\2"+
		"\2\2\u0095\u0096\7\16\2\2\u0096\u0097\7\34\2\2\u0097\u0098\7.\2\2\u0098"+
		"\u0099\7\34\2\2\u0099\u009a\7/\2\2\u009a\u009b\7\'\2\2\u009b\u009c\5$"+
		"\23\2\u009c\31\3\2\2\2\u009d\u00a1\7\17\2\2\u009e\u00a0\13\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\33\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5\35"+
		"\3\2\2\2\u00a6\u00a8\5\62\32\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ad\7\21\2\2\u00aa\u00ac\7\61\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\37\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b5\5$\23\2\u00b3\u00b5\7\37\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\b\23\1\2\u00b7\u00b8\7.\2\2\u00b8\u00b9"+
		"\5$\23\2\u00b9\u00ba\7/\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5&\24\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00cb\3\2\2\2\u00be\u00bf\f\6"+
		"\2\2\u00bf\u00c0\7$\2\2\u00c0\u00ca\5$\23\7\u00c1\u00c2\f\5\2\2\u00c2"+
		"\u00c3\5*\26\2\u00c3\u00c4\5$\23\6\u00c4\u00ca\3\2\2\2\u00c5\u00c6\f\4"+
		"\2\2\u00c6\u00c7\5,\27\2\u00c7\u00c8\5$\23\5\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00be\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc%\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d2\5\64\33\2\u00cf\u00d2\7\34\2\2\u00d0\u00d2\5(\25"+
		"\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\'"+
		"\3\2\2\2\u00d3\u00d6\7\34\2\2\u00d4\u00d6\5\60\31\2\u00d5\u00d3\3\2\2"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7.\2\2\u00d8\u00d9"+
		"\5$\23\2\u00d9\u00da\7/\2\2\u00da)\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc+"+
		"\3\2\2\2\u00dd\u00de\t\4\2\2\u00de-\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0"+
		"/\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\7\35\2\2\u00e4"+
		"\63\3\2\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\t\7\2\2\u00e9\65\3\2\2\2\259@L[dn\u0083"+
		"\u008d\u0091\u00a1\u00a7\u00ad\u00b4\u00bc\u00c9\u00cb\u00d1\u00d5\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}