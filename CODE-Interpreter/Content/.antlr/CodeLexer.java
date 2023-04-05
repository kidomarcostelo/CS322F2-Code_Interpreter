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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, CONDITIONAL=11, LOOP=12, NEWLINE=13, TAB=14, BEGIN_CODE=15, END_CODE=16, 
		DATA_TYPE=17, BOOLVAL=18, INTEGERVAL=19, FLOATVAL=20, CHARVAL=21, RESERVE_WORD=22, 
		IDENTIFIER=23, EQUALS=24, COMMA=25, COMMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "IF", "ELSE", "CONDITIONAL", "LOOP", "NEWLINE", "TAB", "BEGIN", 
			"END", "CODE", "BEGIN_CODE", "END_CODE", "DATA_TYPE", "BOOLVAL", "INTEGERVAL", 
			"FLOATVAL", "CHARVAL", "RESERVE_WORD", "IDENTIFIER", "EQUALS", "COMMA", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'=='", "'AND'", "'OR'", 
			"'NOT'", null, "'WHILE'", null, "'\t'", null, null, null, null, null, 
			null, null, null, null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "CONDITIONAL", 
			"LOOP", "NEWLINE", "TAB", "BEGIN_CODE", "END_CODE", "DATA_TYPE", "BOOLVAL", 
			"INTEGERVAL", "FLOATVAL", "CHARVAL", "RESERVE_WORD", "IDENTIFIER", "EQUALS", 
			"COMMA", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16j\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u009e\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00a9\n\30\3\31\6\31\u00ac\n\31\r\31\16\31\u00ad\3\32\6\32"+
		"\u00b1\n\32\r\32\16\32\u00b2\3\32\3\32\6\32\u00b7\n\32\r\32\16\32\u00b8"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u00da\n\34\3\35\3\35\7\35\u00de\n\35\f\35\16\35\u00e1"+
		"\13\35\3\36\3\36\3\37\3\37\3 \3 \7 \u00e9\n \f \16 \u00ec\13 \3 \5 \u00ef"+
		"\n \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2"+
		"\33\r\35\16\37\17!\20#\2%\2\'\2)\21+\22-\23/\24\61\25\63\26\65\27\67\30"+
		"9\31;\32=\33?\34\3\2\6\3\2\62;\4\2C\\c|\5\2C\\aac|\4\2\f\f\17\17\2\u0100"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2"+
		"\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2"+
		"\25W\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33i\3\2\2\2\35k\3\2\2\2\37q\3\2\2"+
		"\2!t\3\2\2\2#v\3\2\2\2%|\3\2\2\2\'\u0080\3\2\2\2)\u0085\3\2\2\2+\u0089"+
		"\3\2\2\2-\u009d\3\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00b0\3\2\2"+
		"\2\65\u00ba\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00e2\3\2\2\2=\u00e4"+
		"\3\2\2\2?\u00e6\3\2\2\2AB\7*\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EF\7,\2"+
		"\2F\b\3\2\2\2GH\7\61\2\2H\n\3\2\2\2IJ\7-\2\2J\f\3\2\2\2KL\7/\2\2L\16\3"+
		"\2\2\2MN\7?\2\2NO\7?\2\2O\20\3\2\2\2PQ\7C\2\2QR\7P\2\2RS\7F\2\2S\22\3"+
		"\2\2\2TU\7Q\2\2UV\7T\2\2V\24\3\2\2\2WX\7P\2\2XY\7Q\2\2YZ\7V\2\2Z\26\3"+
		"\2\2\2[\\\7K\2\2\\]\7H\2\2]\30\3\2\2\2^_\7G\2\2_`\7N\2\2`a\7U\2\2ab\7"+
		"G\2\2b\32\3\2\2\2cj\5\27\f\2de\5\31\r\2ef\7\"\2\2fg\5\27\f\2gj\3\2\2\2"+
		"hj\5\31\r\2ic\3\2\2\2id\3\2\2\2ih\3\2\2\2j\34\3\2\2\2kl\7Y\2\2lm\7J\2"+
		"\2mn\7K\2\2no\7N\2\2op\7G\2\2p\36\3\2\2\2qr\7\17\2\2rs\7\f\2\2s \3\2\2"+
		"\2tu\7\13\2\2u\"\3\2\2\2vw\7D\2\2wx\7G\2\2xy\7I\2\2yz\7K\2\2z{\7P\2\2"+
		"{$\3\2\2\2|}\7G\2\2}~\7P\2\2~\177\7F\2\2\177&\3\2\2\2\u0080\u0081\7E\2"+
		"\2\u0081\u0082\7Q\2\2\u0082\u0083\7F\2\2\u0083\u0084\7G\2\2\u0084(\3\2"+
		"\2\2\u0085\u0086\5#\22\2\u0086\u0087\7\"\2\2\u0087\u0088\5\'\24\2\u0088"+
		"*\3\2\2\2\u0089\u008a\5%\23\2\u008a\u008b\7\"\2\2\u008b\u008c\5\'\24\2"+
		"\u008c,\3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7P\2\2\u008f\u009e\7V\2"+
		"\2\u0090\u0091\7E\2\2\u0091\u0092\7J\2\2\u0092\u0093\7C\2\2\u0093\u009e"+
		"\7T\2\2\u0094\u0095\7D\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7Q\2\2\u0097"+
		"\u009e\7N\2\2\u0098\u0099\7H\2\2\u0099\u009a\7N\2\2\u009a\u009b\7Q\2\2"+
		"\u009b\u009c\7C\2\2\u009c\u009e\7V\2\2\u009d\u008d\3\2\2\2\u009d\u0090"+
		"\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0098\3\2\2\2\u009e.\3\2\2\2\u009f"+
		"\u00a0\7V\2\2\u00a0\u00a1\7T\2\2\u00a1\u00a2\7W\2\2\u00a2\u00a9\7G\2\2"+
		"\u00a3\u00a4\7H\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7"+
		"\7U\2\2\u00a7\u00a9\7G\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"\60\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\62\3\2\2\2\u00af\u00b1"+
		"\t\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\7\60\2\2\u00b5\u00b7\t"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\u00bc\t\3\2\2"+
		"\u00bc\u00bd\7)\2\2\u00bd\66\3\2\2\2\u00be\u00da\5-\27\2\u00bf\u00da\5"+
		"#\22\2\u00c0\u00da\5%\23\2\u00c1\u00da\5\'\24\2\u00c2\u00da\5/\30\2\u00c3"+
		"\u00c4\5\33\16\2\u00c4\u00c5\5\35\17\2\u00c5\u00da\3\2\2\2\u00c6\u00c7"+
		"\7F\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7R\2\2\u00ca"+
		"\u00cb\7N\2\2\u00cb\u00cc\7C\2\2\u00cc\u00da\7[\2\2\u00cd\u00ce\7U\2\2"+
		"\u00ce\u00cf\7E\2\2\u00cf\u00d0\7C\2\2\u00d0\u00da\7P\2\2\u00d1\u00d2"+
		"\7D\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7I\2\2\u00d4\u00d5\7K\2\2\u00d5"+
		"\u00d6\7P\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8\7K\2\2\u00d8\u00da\7H\2"+
		"\2\u00d9\u00be\3\2\2\2\u00d9\u00bf\3\2\2\2\u00d9\u00c0\3\2\2\2\u00d9\u00c1"+
		"\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00c3\3\2\2\2\u00d9\u00c6\3\2\2\2\u00d9"+
		"\u00cd\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da8\3\2\2\2\u00db\u00df\t\4\2\2"+
		"\u00dc\u00de\t\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0:\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\7?\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5>\3\2\2\2\u00e6\u00ea"+
		"\7%\2\2\u00e7\u00e9\n\5\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00ef\5\37\20\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\b \2\2\u00f1@\3\2\2\2\r\2i\u009d\u00a8\u00ad"+
		"\u00b2\u00b8\u00d9\u00df\u00ea\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}