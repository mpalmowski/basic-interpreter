// Generated from D:/Workspace/IntelliJ/basicInterpreter\Basic.g4 by ANTLR 4.7
package basicAntlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, DATA=2, READ=3, PRINT=4, GOTO=5, IF=6, THEN=7, FOR=8, TO=9, STEP=10, 
		NEXT=11, DEF=12, REM=13, STOP=14, END=15, ID=16, NUMBER=17, FLOAT=18, 
		STRING=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, POWER=24, LESS=25, 
		LESS_OR_EQUAL=26, EQUAL=27, GREATER=28, GREATER_OR_EQUAL=29, NOT_EQUAL=30, 
		COMMA=31, SEMICOLON=32, DOT=33, LPAREN=34, RPAREN=35, WHITESPACE=36, NEWLINE=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "DATA", "READ", "PRINT", "GOTO", "IF", "THEN", "FOR", "TO", "STEP", 
		"NEXT", "DEF", "REM", "STOP", "END", "ID", "NUMBER", "FLOAT", "STRING", 
		"LETTER", "DIGIT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "LESS", 
		"LESS_OR_EQUAL", "EQUAL", "GREATER", "GREATER_OR_EQUAL", "NOT_EQUAL", 
		"COMMA", "SEMICOLON", "DOT", "LPAREN", "RPAREN", "WHITESPACE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'<'", "'<='", "'='", "'>'", "'>='", "'<>'", "','", "';'", "'.'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "DATA", "READ", "PRINT", "GOTO", "IF", "THEN", "FOR", "TO", 
		"STEP", "NEXT", "DEF", "REM", "STOP", "END", "ID", "NUMBER", "FLOAT", 
		"STRING", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "POWER", "LESS", "LESS_OR_EQUAL", 
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


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u015b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2X\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"x\n\5\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3"+
		"\7\3\7\5\7\u0096\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\5\n\u00ae\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e4\n"+
		"\20\3\21\3\21\5\21\u00e8\n\21\3\21\3\21\3\21\7\21\u00ed\n\21\f\21\16\21"+
		"\u00f0\13\21\3\22\6\22\u00f3\n\22\r\22\16\22\u00f4\3\22\3\22\5\22\u00f9"+
		"\n\22\3\22\6\22\u00fc\n\22\r\22\16\22\u00fd\7\22\u0100\n\22\f\22\16\22"+
		"\u0103\13\22\3\23\7\23\u0106\n\23\f\23\16\23\u0109\13\23\3\23\3\23\6\23"+
		"\u010d\n\23\r\23\16\23\u010e\3\23\3\23\5\23\u0113\n\23\3\23\6\23\u0116"+
		"\n\23\r\23\16\23\u0117\7\23\u011a\n\23\f\23\16\23\u011d\13\23\3\24\3\24"+
		"\3\24\3\24\7\24\u0123\n\24\f\24\16\24\u0126\13\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\5(\u0156\n(\3(\3(\5(\u015a\n(\3\u0124"+
		"\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\26/\27\61\30\63\31\65\32\67\339\34;"+
		"\35=\36?\37A C!E\"G#I$K%M&O\'\3\2\6\4\2GGgg\4\2C\\c|\3\2\62;\4\2\13\13"+
		"\"\"\2\u017a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3W\3\2\2\2\5a\3\2\2\2\7k\3\2\2\2\t"+
		"w\3\2\2\2\13\u008f\3\2\2\2\r\u0095\3\2\2\2\17\u009f\3\2\2\2\21\u00a7\3"+
		"\2\2\2\23\u00ad\3\2\2\2\25\u00b7\3\2\2\2\27\u00c1\3\2\2\2\31\u00c9\3\2"+
		"\2\2\33\u00d1\3\2\2\2\35\u00db\3\2\2\2\37\u00e3\3\2\2\2!\u00e7\3\2\2\2"+
		"#\u00f2\3\2\2\2%\u0107\3\2\2\2\'\u011e\3\2\2\2)\u0129\3\2\2\2+\u012b\3"+
		"\2\2\2-\u012d\3\2\2\2/\u012f\3\2\2\2\61\u0131\3\2\2\2\63\u0133\3\2\2\2"+
		"\65\u0135\3\2\2\2\67\u0137\3\2\2\29\u0139\3\2\2\2;\u013c\3\2\2\2=\u013e"+
		"\3\2\2\2?\u0140\3\2\2\2A\u0143\3\2\2\2C\u0146\3\2\2\2E\u0148\3\2\2\2G"+
		"\u014a\3\2\2\2I\u014c\3\2\2\2K\u014e\3\2\2\2M\u0150\3\2\2\2O\u0159\3\2"+
		"\2\2QR\7N\2\2RS\7G\2\2SX\7V\2\2TU\7n\2\2UV\7g\2\2VX\7v\2\2WQ\3\2\2\2W"+
		"T\3\2\2\2X\4\3\2\2\2YZ\7F\2\2Z[\7C\2\2[\\\7V\2\2\\b\7C\2\2]^\7f\2\2^_"+
		"\7c\2\2_`\7v\2\2`b\7c\2\2aY\3\2\2\2a]\3\2\2\2b\6\3\2\2\2cd\7T\2\2de\7"+
		"G\2\2ef\7C\2\2fl\7F\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jl\7f\2\2kc\3\2\2\2"+
		"kg\3\2\2\2l\b\3\2\2\2mn\7R\2\2no\7T\2\2op\7K\2\2pq\7P\2\2qx\7V\2\2rs\7"+
		"r\2\2st\7t\2\2tu\7k\2\2uv\7p\2\2vx\7v\2\2wm\3\2\2\2wr\3\2\2\2x\n\3\2\2"+
		"\2yz\7I\2\2z{\7Q\2\2{\177\3\2\2\2|~\7\"\2\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7V\2\2\u0083\u0090\7Q\2\2\u0084\u0085\7i\2\2\u0085\u0086\7q\2\2"+
		"\u0086\u008a\3\2\2\2\u0087\u0089\7\"\2\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7v\2\2\u008e\u0090\7q\2\2\u008fy\3\2\2\2\u008f"+
		"\u0084\3\2\2\2\u0090\f\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0096\7H\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0096\7h\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2"+
		"\2\u0096\16\3\2\2\2\u0097\u0098\7V\2\2\u0098\u0099\7J\2\2\u0099\u009a"+
		"\7G\2\2\u009a\u00a0\7P\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u00a0\7p\2\2\u009f\u0097\3\2\2\2\u009f\u009b\3\2\2"+
		"\2\u00a0\20\3\2\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a8"+
		"\7T\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a8\7t\2\2\u00a7"+
		"\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7V\2\2"+
		"\u00aa\u00ae\7Q\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ae\7q\2\2\u00ad\u00a9"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7U\2\2\u00b0"+
		"\u00b1\7V\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b8\7R\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b8\7r\2\2\u00b7\u00af"+
		"\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7P\2\2\u00ba"+
		"\u00bb\7G\2\2\u00bb\u00bc\7Z\2\2\u00bc\u00c2\7V\2\2\u00bd\u00be\7p\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf\u00c0\7z\2\2\u00c0\u00c2\7v\2\2\u00c1\u00b9"+
		"\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4"+
		"\u00c5\7G\2\2\u00c5\u00ca\7H\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8\u00ca\7h\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\32\3"+
		"\2\2\2\u00cb\u00cc\7T\2\2\u00cc\u00cd\7G\2\2\u00cd\u00d2\7O\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d2\7o\2\2\u00d1\u00cb\3\2\2"+
		"\2\u00d1\u00ce\3\2\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5"+
		"\7V\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00dc\7R\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7q\2\2\u00da\u00dc\7r\2\2\u00db\u00d3\3\2\2"+
		"\2\u00db\u00d7\3\2\2\2\u00dc\36\3\2\2\2\u00dd\u00de\7G\2\2\u00de\u00df"+
		"\7P\2\2\u00df\u00e4\7F\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"\u00e4\7f\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4 \3\2\2\2\u00e5"+
		"\u00e8\5)\25\2\u00e6\u00e8\7a\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00ed\5)\25\2\u00ea\u00ed\5+\26\2\u00eb"+
		"\u00ed\7a\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\5+\26\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0101"+
		"\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f9\5/\30\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\5+\26\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102$\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106"+
		"\5+\26\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7\60"+
		"\2\2\u010b\u010d\5+\26\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u011b\3\2\2\2\u0110\u0112\t\2"+
		"\2\2\u0111\u0113\5/\30\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0116\5+\26\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0110\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c&\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0124\7$\2\2\u011f\u0120"+
		"\7^\2\2\u0120\u0123\7$\2\2\u0121\u0123\13\2\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7$\2\2\u0128"+
		"(\3\2\2\2\u0129\u012a\t\3\2\2\u012a*\3\2\2\2\u012b\u012c\t\4\2\2\u012c"+
		",\3\2\2\2\u012d\u012e\7-\2\2\u012e.\3\2\2\2\u012f\u0130\7/\2\2\u0130\60"+
		"\3\2\2\2\u0131\u0132\7,\2\2\u0132\62\3\2\2\2\u0133\u0134\7\61\2\2\u0134"+
		"\64\3\2\2\2\u0135\u0136\7`\2\2\u0136\66\3\2\2\2\u0137\u0138\7>\2\2\u0138"+
		"8\3\2\2\2\u0139\u013a\7>\2\2\u013a\u013b\7?\2\2\u013b:\3\2\2\2\u013c\u013d"+
		"\7?\2\2\u013d<\3\2\2\2\u013e\u013f\7@\2\2\u013f>\3\2\2\2\u0140\u0141\7"+
		"@\2\2\u0141\u0142\7?\2\2\u0142@\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145"+
		"\7@\2\2\u0145B\3\2\2\2\u0146\u0147\7.\2\2\u0147D\3\2\2\2\u0148\u0149\7"+
		"=\2\2\u0149F\3\2\2\2\u014a\u014b\7\60\2\2\u014bH\3\2\2\2\u014c\u014d\7"+
		"*\2\2\u014dJ\3\2\2\2\u014e\u014f\7+\2\2\u014fL\3\2\2\2\u0150\u0151\t\5"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b\'\2\2\u0153N\3\2\2\2\u0154\u0156"+
		"\7\17\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2"+
		"\u0157\u015a\7\f\2\2\u0158\u015a\7\17\2\2\u0159\u0155\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015aP\3\2\2\2$\2Wakw\177\u008a\u008f\u0095\u009f\u00a7\u00ad"+
		"\u00b7\u00c1\u00c9\u00d1\u00db\u00e3\u00e7\u00ec\u00ee\u00f4\u00f8\u00fd"+
		"\u0101\u0107\u010e\u0112\u0117\u011b\u0122\u0124\u0155\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}