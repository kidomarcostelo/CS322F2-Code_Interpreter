// Generated from c:\Users\Kid Omar Costelo\Documents\School\3rd year 2nd sem\CODE-Interpreter\CODE-Interpreter\CODE-Interpreter\Content\Code.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, TAB=9, 
		BEGIN_CODE=10, END_CODE=11, DATA_TYPE=12, IDENTIFIER=13, BOOL=14, INTEGER=15, 
		FLOAT=16, CHAR=17, EQUALS=18, COMMA=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEWLINE", "TAB", 
			"BEGIN_CODE", "END_CODE", "DATA_TYPE", "IDENTIFIER", "BOOL", "INTEGER", 
			"FLOAT", "CHAR", "EQUALS", "COMMA", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'=='", null, "'\t'", 
			"'BEGIN CODE'", "'END CODE'", null, null, null, null, null, null, "'='", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NEWLINE", "TAB", "BEGIN_CODE", 
			"END_CODE", "DATA_TYPE", "IDENTIFIER", "BOOL", "INTEGER", "FLOAT", "CHAR", 
			"EQUALS", "COMMA", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Code.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\6\t=\n\t\r\t\16\t>\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\rg\n\r\3\16\3\16\7\16k\n\16\f\16\16\16n\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17y\n\17\3\20\6\20|\n\20\r\20\16\20}"+
		"\3\21\6\21\u0081\n\21\r\21\16\21\u0082\3\21\3\21\6\21\u0087\n\21\r\21"+
		"\16\21\u0088\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u0093\n\25\f"+
		"\25\16\25\u0096\13\25\3\25\5\25\u0099\n\25\3\25\3\25\2\2\26\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26\3\2\6\5\2C\\aac|\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2\u00a6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21<\3\2\2\2\23"+
		"@\3\2\2\2\25B\3\2\2\2\27M\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35x\3\2\2\2"+
		"\37{\3\2\2\2!\u0080\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2"+
		"\2\2)\u0090\3\2\2\2+,\7*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7,\2\2"+
		"\60\b\3\2\2\2\61\62\7\61\2\2\62\n\3\2\2\2\63\64\7-\2\2\64\f\3\2\2\2\65"+
		"\66\7/\2\2\66\16\3\2\2\2\678\7?\2\289\7?\2\29\20\3\2\2\2:;\7\17\2\2;="+
		"\7\f\2\2<:\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\22\3\2\2\2@A\7\13\2"+
		"\2A\24\3\2\2\2BC\7D\2\2CD\7G\2\2DE\7I\2\2EF\7K\2\2FG\7P\2\2GH\7\"\2\2"+
		"HI\7E\2\2IJ\7Q\2\2JK\7F\2\2KL\7G\2\2L\26\3\2\2\2MN\7G\2\2NO\7P\2\2OP\7"+
		"F\2\2PQ\7\"\2\2QR\7E\2\2RS\7Q\2\2ST\7F\2\2TU\7G\2\2U\30\3\2\2\2VW\7K\2"+
		"\2WX\7P\2\2Xg\7V\2\2YZ\7E\2\2Z[\7J\2\2[\\\7C\2\2\\g\7T\2\2]^\7D\2\2^_"+
		"\7Q\2\2_`\7Q\2\2`g\7N\2\2ab\7H\2\2bc\7N\2\2cd\7Q\2\2de\7C\2\2eg\7V\2\2"+
		"fV\3\2\2\2fY\3\2\2\2f]\3\2\2\2fa\3\2\2\2g\32\3\2\2\2hl\t\2\2\2ik\t\2\2"+
		"\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\34\3\2\2\2nl\3\2\2\2op\7V"+
		"\2\2pq\7T\2\2qr\7W\2\2ry\7G\2\2st\7H\2\2tu\7C\2\2uv\7N\2\2vw\7U\2\2wy"+
		"\7G\2\2xo\3\2\2\2xs\3\2\2\2y\36\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~ \3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\7\60\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\"\3\2\2\2"+
		"\u008a\u008b\t\4\2\2\u008b$\3\2\2\2\u008c\u008d\7?\2\2\u008d&\3\2\2\2"+
		"\u008e\u008f\7.\2\2\u008f(\3\2\2\2\u0090\u0094\7%\2\2\u0091\u0093\n\5"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5\21"+
		"\t\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\25\2\2\u009b*\3\2\2\2\f\2>flx}\u0082\u0088\u0094\u0098\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}