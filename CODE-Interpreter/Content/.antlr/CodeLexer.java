// Generated from c:\Users\Kid Omar Costelo\Documents\School\3rd year 2nd sem\Programming Language\CS322F2-Code_Interpreter\CODE-Interpreter\Content\Code.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IF=19, ELSE=20, BEGIN_IF=21, END_IF=22, WHILE=23, BEGIN_WHILE=24, 
		END_WHILE=25, FOR=26, BEGIN_FOR=27, END_FOR=28, NEWLINE=29, TAB=30, COMMENT=31, 
		WS=32, ESCAPE=33, BEGIN=34, END=35, CODE=36, BEGIN_CODE=37, END_CODE=38, 
		DATA_TYPE=39, BOOLVAL=40, INTEGERVAL=41, FLOATVAL=42, CHARVAL=43, STRINGVAL=44, 
		SCAN=45, DISPLAY=46, RESERVE_WORD=47, EQUALS=48, COMMA=49, IDENTIFIER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "IF", "ELSE", "BEGIN_IF", "END_IF", "WHILE", "BEGIN_WHILE", 
			"END_WHILE", "FOR", "BEGIN_FOR", "END_FOR", "NEWLINE", "TAB", "COMMENT", 
			"WS", "ESCAPE", "BEGIN", "END", "CODE", "BEGIN_CODE", "END_CODE", "DATA_TYPE", 
			"BOOLVAL", "INTEGERVAL", "FLOATVAL", "CHARVAL", "STRINGVAL", "SCAN", 
			"DISPLAY", "RESERVE_WORD", "EQUALS", "COMMA", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOT'", "'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", 
			"'>'", "'<'", "'>='", "'<='", "'<>'", "'AND'", "'OR'", "'&'", "'$'", 
			"'IF'", "'ELSE'", null, null, "'WHILE'", null, null, "'FOR'", null, null, 
			null, "'\t'", null, "' '", null, "'BEGIN'", "'END'", "'CODE'", null, 
			null, null, null, null, null, null, null, "'SCAN:'", "'DISPLAY:'", null, 
			"'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IF", "ELSE", "BEGIN_IF", "END_IF", 
			"WHILE", "BEGIN_WHILE", "END_WHILE", "FOR", "BEGIN_FOR", "END_FOR", "NEWLINE", 
			"TAB", "COMMENT", "WS", "ESCAPE", "BEGIN", "END", "CODE", "BEGIN_CODE", 
			"END_CODE", "DATA_TYPE", "BOOLVAL", "INTEGERVAL", "FLOATVAL", "CHARVAL", 
			"STRINGVAL", "SCAN", "DISPLAY", "RESERVE_WORD", "EQUALS", "COMMA", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \5 \u00c5\n \3 \5 \u00c8\n \3 \3 \7 \u00cc\n \f \16 \u00cf"+
		"\13 \3 \3 \3!\3!\3!\3!\3\"\3\"\6\"\u00d9\n\"\r\"\16\"\u00da\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0106\n(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0112\n)\3)\3)\3*\5*\u0117\n*\3*\6*\u011a\n"+
		"*\r*\16*\u011b\3+\5+\u011f\n+\3+\6+\u0122\n+\r+\16+\u0123\3+\3+\6+\u0128"+
		"\n+\r+\16+\u0129\3,\3,\3,\3,\3-\3-\7-\u0132\n-\f-\16-\u0135\13-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u015c\n\60\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u0164\n\63\f"+
		"\63\16\63\u0167\13\63\4\u00da\u0133\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64\3\2\7\4\2\f\f\17\17\3\2\62;\4\2C\\c|\5\2C\\"+
		"aac|\6\2\62;C\\aac|\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5k"+
		"\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w"+
		"\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33\u0083"+
		"\3\2\2\2\35\u0086\3\2\2\2\37\u0089\3\2\2\2!\u008d\3\2\2\2#\u0090\3\2\2"+
		"\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0097\3\2\2\2+\u009c\3\2\2\2-\u00a0"+
		"\3\2\2\2/\u00a4\3\2\2\2\61\u00aa\3\2\2\2\63\u00ae\3\2\2\2\65\u00b2\3\2"+
		"\2\2\67\u00b6\3\2\2\29\u00ba\3\2\2\2;\u00be\3\2\2\2=\u00c1\3\2\2\2?\u00c4"+
		"\3\2\2\2A\u00d2\3\2\2\2C\u00d6\3\2\2\2E\u00de\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00e8\3\2\2\2K\u00ed\3\2\2\2M\u00f1\3\2\2\2O\u0105\3\2\2\2Q\u0107\3\2"+
		"\2\2S\u0116\3\2\2\2U\u011e\3\2\2\2W\u012b\3\2\2\2Y\u012f\3\2\2\2[\u0138"+
		"\3\2\2\2]\u013e\3\2\2\2_\u015b\3\2\2\2a\u015d\3\2\2\2c\u015f\3\2\2\2e"+
		"\u0161\3\2\2\2gh\7P\2\2hi\7Q\2\2ij\7V\2\2j\4\3\2\2\2kl\7*\2\2l\6\3\2\2"+
		"\2mn\7+\2\2n\b\3\2\2\2op\7,\2\2p\n\3\2\2\2qr\7\61\2\2r\f\3\2\2\2st\7\'"+
		"\2\2t\16\3\2\2\2uv\7-\2\2v\20\3\2\2\2wx\7/\2\2x\22\3\2\2\2yz\7?\2\2z{"+
		"\7?\2\2{\24\3\2\2\2|}\7@\2\2}\26\3\2\2\2~\177\7>\2\2\177\30\3\2\2\2\u0080"+
		"\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082\32\3\2\2\2\u0083\u0084\7>\2\2\u0084"+
		"\u0085\7?\2\2\u0085\34\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7@\2\2\u0088"+
		"\36\3\2\2\2\u0089\u008a\7C\2\2\u008a\u008b\7P\2\2\u008b\u008c\7F\2\2\u008c"+
		" \3\2\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7T\2\2\u008f\"\3\2\2\2\u0090"+
		"\u0091\7(\2\2\u0091$\3\2\2\2\u0092\u0093\7&\2\2\u0093&\3\2\2\2\u0094\u0095"+
		"\7K\2\2\u0095\u0096\7H\2\2\u0096(\3\2\2\2\u0097\u0098\7G\2\2\u0098\u0099"+
		"\7N\2\2\u0099\u009a\7U\2\2\u009a\u009b\7G\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\5E#\2\u009d\u009e\7\"\2\2\u009e\u009f\5\'\24\2\u009f,\3\2\2\2\u00a0\u00a1"+
		"\5G$\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\5\'\24\2\u00a3.\3\2\2\2\u00a4\u00a5"+
		"\7Y\2\2\u00a5\u00a6\7J\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7N\2\2\u00a8"+
		"\u00a9\7G\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\5E#\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\u00ad\5/\30\2\u00ad\62\3\2\2\2\u00ae\u00af\5G$\2\u00af\u00b0\7\"\2\2"+
		"\u00b0\u00b1\5/\30\2\u00b1\64\3\2\2\2\u00b2\u00b3\7H\2\2\u00b3\u00b4\7"+
		"Q\2\2\u00b4\u00b5\7T\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\5E#\2\u00b7\u00b8"+
		"\7\"\2\2\u00b8\u00b9\5\65\33\2\u00b98\3\2\2\2\u00ba\u00bb\5G$\2\u00bb"+
		"\u00bc\7\"\2\2\u00bc\u00bd\5\65\33\2\u00bd:\3\2\2\2\u00be\u00bf\7\17\2"+
		"\2\u00bf\u00c0\7\f\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2>\3\2"+
		"\2\2\u00c3\u00c5\5;\36\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c8\5=\37\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\7%\2\2\u00ca\u00cc\n\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b \2\2\u00d1"+
		"@\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b!\2\2\u00d5"+
		"B\3\2\2\2\u00d6\u00d8\7]\2\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\7_\2\2\u00ddD\3\2\2\2\u00de\u00df\7D\2\2\u00df\u00e0"+
		"\7G\2\2\u00e0\u00e1\7I\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3\7P\2\2\u00e3"+
		"F\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7F\2\2\u00e7"+
		"H\3\2\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7Q\2\2\u00ea\u00eb\7F\2\2\u00eb"+
		"\u00ec\7G\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\5E#\2\u00ee\u00ef\7\"\2\2\u00ef"+
		"\u00f0\5I%\2\u00f0L\3\2\2\2\u00f1\u00f2\5G$\2\u00f2\u00f3\7\"\2\2\u00f3"+
		"\u00f4\5I%\2\u00f4N\3\2\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7P\2\2\u00f7"+
		"\u0106\7V\2\2\u00f8\u00f9\7E\2\2\u00f9\u00fa\7J\2\2\u00fa\u00fb\7C\2\2"+
		"\u00fb\u0106\7T\2\2\u00fc\u00fd\7D\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff"+
		"\7Q\2\2\u00ff\u0106\7N\2\2\u0100\u0101\7H\2\2\u0101\u0102\7N\2\2\u0102"+
		"\u0103\7Q\2\2\u0103\u0104\7C\2\2\u0104\u0106\7V\2\2\u0105\u00f5\3\2\2"+
		"\2\u0105\u00f8\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u0100\3\2\2\2\u0106P"+
		"\3\2\2\2\u0107\u0111\7$\2\2\u0108\u0109\7V\2\2\u0109\u010a\7T\2\2\u010a"+
		"\u010b\7W\2\2\u010b\u0112\7G\2\2\u010c\u010d\7H\2\2\u010d\u010e\7C\2\2"+
		"\u010e\u010f\7N\2\2\u010f\u0110\7U\2\2\u0110\u0112\7G\2\2\u0111\u0108"+
		"\3\2\2\2\u0111\u010c\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7$\2\2\u0114"+
		"R\3\2\2\2\u0115\u0117\7/\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u011a\t\3\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011cT\3\2\2\2\u011d\u011f"+
		"\7/\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u0122\t\3\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7\60\2\2\u0126"+
		"\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012aV\3\2\2\2\u012b\u012c\7)\2\2\u012c\u012d"+
		"\t\4\2\2\u012d\u012e\7)\2\2\u012eX\3\2\2\2\u012f\u0133\7$\2\2\u0130\u0132"+
		"\13\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137"+
		"\7$\2\2\u0137Z\3\2\2\2\u0138\u0139\7U\2\2\u0139\u013a\7E\2\2\u013a\u013b"+
		"\7C\2\2\u013b\u013c\7P\2\2\u013c\u013d\7<\2\2\u013d\\\3\2\2\2\u013e\u013f"+
		"\7F\2\2\u013f\u0140\7K\2\2\u0140\u0141\7U\2\2\u0141\u0142\7R\2\2\u0142"+
		"\u0143\7N\2\2\u0143\u0144\7C\2\2\u0144\u0145\7[\2\2\u0145\u0146\7<\2\2"+
		"\u0146^\3\2\2\2\u0147\u015c\5O(\2\u0148\u015c\5E#\2\u0149\u015c\5G$\2"+
		"\u014a\u015c\5I%\2\u014b\u015c\5Q)\2\u014c\u015c\5\'\24\2\u014d\u014e"+
		"\5)\25\2\u014e\u014f\5/\30\2\u014f\u015c\3\2\2\2\u0150\u0151\7F\2\2\u0151"+
		"\u0152\7K\2\2\u0152\u0153\7U\2\2\u0153\u0154\7R\2\2\u0154\u0155\7N\2\2"+
		"\u0155\u0156\7C\2\2\u0156\u015c\7[\2\2\u0157\u0158\7U\2\2\u0158\u0159"+
		"\7E\2\2\u0159\u015a\7C\2\2\u015a\u015c\7P\2\2\u015b\u0147\3\2\2\2\u015b"+
		"\u0148\3\2\2\2\u015b\u0149\3\2\2\2\u015b\u014a\3\2\2\2\u015b\u014b\3\2"+
		"\2\2\u015b\u014c\3\2\2\2\u015b\u014d\3\2\2\2\u015b\u0150\3\2\2\2\u015b"+
		"\u0157\3\2\2\2\u015c`\3\2\2\2\u015d\u015e\7?\2\2\u015eb\3\2\2\2\u015f"+
		"\u0160\7.\2\2\u0160d\3\2\2\2\u0161\u0165\t\5\2\2\u0162\u0164\t\6\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166f\3\2\2\2\u0167\u0165\3\2\2\2\21\2\u00c4\u00c7\u00cd\u00da\u0105"+
		"\u0111\u0116\u011b\u011e\u0123\u0129\u0133\u015b\u0165\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}