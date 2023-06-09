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
		T__17=18, T__18=19, T__19=20, IF=21, ELSE=22, BEGIN_IF=23, END_IF=24, 
		WHILE=25, BEGIN_WHILE=26, END_WHILE=27, FOR=28, BEGIN_FOR=29, END_FOR=30, 
		SWITCH=31, BEGIN_SWITCH=32, END_SWITCH=33, CASE=34, DEFAULT=35, BREAK=36, 
		NEWLINE=37, TAB=38, COMMENT=39, WS=40, ESCAPE=41, BEGIN=42, END=43, CODE=44, 
		BEGIN_CODE=45, END_CODE=46, DATA_TYPE=47, BOOLVAL=48, INTEGERVAL=49, FLOATVAL=50, 
		CHARVAL=51, STRINGVAL=52, SCAN=53, DISPLAY=54, RESERVE_WORD=55, EQUALS=56, 
		COMMA=57, IDENTIFIER=58;
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
			"T__17", "T__18", "T__19", "IF", "ELSE", "BEGIN_IF", "END_IF", "WHILE", 
			"BEGIN_WHILE", "END_WHILE", "FOR", "BEGIN_FOR", "END_FOR", "SWITCH", 
			"BEGIN_SWITCH", "END_SWITCH", "CASE", "DEFAULT", "BREAK", "NEWLINE", 
			"TAB", "COMMENT", "WS", "ESCAPE", "BEGIN", "END", "CODE", "BEGIN_CODE", 
			"END_CODE", "DATA_TYPE", "BOOLVAL", "INTEGERVAL", "FLOATVAL", "CHARVAL", 
			"STRINGVAL", "SCAN", "DISPLAY", "RESERVE_WORD", "EQUALS", "COMMA", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOT'", "'('", "')'", "';'", "':'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'=='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'AND'", "'OR'", 
			"'&'", "'$'", "'IF'", "'ELSE'", null, null, "'WHILE'", null, null, "'FOR'", 
			null, null, "'SWITCH'", "'BEGIN SWITCH'", "'END SWITCH'", "'CASE'", "'DEFAULT'", 
			"'BREAK'", null, "'\t'", null, "' '", null, "'BEGIN'", "'END'", "'CODE'", 
			null, null, null, null, null, null, null, null, "'SCAN:'", "'DISPLAY:'", 
			null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "BEGIN_IF", 
			"END_IF", "WHILE", "BEGIN_WHILE", "END_WHILE", "FOR", "BEGIN_FOR", "END_FOR", 
			"SWITCH", "BEGIN_SWITCH", "END_SWITCH", "CASE", "DEFAULT", "BREAK", "NEWLINE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\5(\u010b\n(\3(\5(\u010e\n(\3("+
		"\3(\7(\u0112\n(\f(\16(\u0115\13(\3(\3(\3)\3)\3)\3)\3*\3*\6*\u011f\n*\r"+
		"*\16*\u0120\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u014c\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0158\n\61\3\61\3\61\3\62\5\62\u015d\n\62\3"+
		"\62\6\62\u0160\n\62\r\62\16\62\u0161\3\63\5\63\u0165\n\63\3\63\6\63\u0168"+
		"\n\63\r\63\16\63\u0169\3\63\3\63\6\63\u016e\n\63\r\63\16\63\u016f\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\7\65\u0178\n\65\f\65\16\65\u017b\13\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u01a6\n8\39\39\3:\3:\3;\3;\7;\u01ae\n;\f;\16;\u01b1\13"+
		";\4\u0120\u0179\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<\3\2\7\4\2\f\f\17\17\3\2\62;\4\2C\\c|\5\2C\\"+
		"aac|\6\2\62;C\\aac|\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\3w\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r"+
		"\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b"+
		"\3\2\2\2\27\u008d\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u0094\3"+
		"\2\2\2\37\u0097\3\2\2\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a1\3\2\2\2\'"+
		"\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00ab\3\2\2\2/\u00b0\3\2"+
		"\2\2\61\u00b4\3\2\2\2\63\u00b8\3\2\2\2\65\u00be\3\2\2\2\67\u00c2\3\2\2"+
		"\29\u00c6\3\2\2\2;\u00ca\3\2\2\2=\u00ce\3\2\2\2?\u00d2\3\2\2\2A\u00d9"+
		"\3\2\2\2C\u00e6\3\2\2\2E\u00f1\3\2\2\2G\u00f6\3\2\2\2I\u00fe\3\2\2\2K"+
		"\u0104\3\2\2\2M\u0107\3\2\2\2O\u010a\3\2\2\2Q\u0118\3\2\2\2S\u011c\3\2"+
		"\2\2U\u0124\3\2\2\2W\u012a\3\2\2\2Y\u012e\3\2\2\2[\u0133\3\2\2\2]\u0137"+
		"\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c\u015c\3\2\2\2e\u0164\3\2\2\2g"+
		"\u0171\3\2\2\2i\u0175\3\2\2\2k\u017e\3\2\2\2m\u0184\3\2\2\2o\u01a5\3\2"+
		"\2\2q\u01a7\3\2\2\2s\u01a9\3\2\2\2u\u01ab\3\2\2\2wx\7P\2\2xy\7Q\2\2yz"+
		"\7V\2\2z\4\3\2\2\2{|\7*\2\2|\6\3\2\2\2}~\7+\2\2~\b\3\2\2\2\177\u0080\7"+
		"=\2\2\u0080\n\3\2\2\2\u0081\u0082\7<\2\2\u0082\f\3\2\2\2\u0083\u0084\7"+
		",\2\2\u0084\16\3\2\2\2\u0085\u0086\7\61\2\2\u0086\20\3\2\2\2\u0087\u0088"+
		"\7\'\2\2\u0088\22\3\2\2\2\u0089\u008a\7-\2\2\u008a\24\3\2\2\2\u008b\u008c"+
		"\7/\2\2\u008c\26\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f\30"+
		"\3\2\2\2\u0090\u0091\7@\2\2\u0091\32\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099 \3\2\2\2\u009a\u009b\7>\2\2\u009b"+
		"\u009c\7@\2\2\u009c\"\3\2\2\2\u009d\u009e\7C\2\2\u009e\u009f\7P\2\2\u009f"+
		"\u00a0\7F\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7T\2\2\u00a3"+
		"&\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7*"+
		"\3\2\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7H\2\2\u00aa,\3\2\2\2\u00ab\u00ac"+
		"\7G\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7G\2\2\u00af"+
		".\3\2\2\2\u00b0\u00b1\5U+\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\5+\26\2\u00b3"+
		"\60\3\2\2\2\u00b4\u00b5\5W,\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\5+\26\2"+
		"\u00b7\62\3\2\2\2\u00b8\u00b9\7Y\2\2\u00b9\u00ba\7J\2\2\u00ba\u00bb\7"+
		"K\2\2\u00bb\u00bc\7N\2\2\u00bc\u00bd\7G\2\2\u00bd\64\3\2\2\2\u00be\u00bf"+
		"\5U+\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\5\63\32\2\u00c1\66\3\2\2\2\u00c2"+
		"\u00c3\5W,\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\5\63\32\2\u00c58\3\2\2\2"+
		"\u00c6\u00c7\7H\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7T\2\2\u00c9:\3\2\2"+
		"\2\u00ca\u00cb\5U+\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\59\35\2\u00cd<\3"+
		"\2\2\2\u00ce\u00cf\5W,\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\59\35\2\u00d1"+
		">\3\2\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4\7Y\2\2\u00d4\u00d5\7K\2\2\u00d5"+
		"\u00d6\7V\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7J\2\2\u00d8@\3\2\2\2\u00d9"+
		"\u00da\7D\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7I\2\2\u00dc\u00dd\7K\2\2"+
		"\u00dd\u00de\7P\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1"+
		"\7Y\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7E\2\2\u00e4"+
		"\u00e5\7J\2\2\u00e5B\3\2\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7P\2\2\u00e8"+
		"\u00e9\7F\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7Y\2"+
		"\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7E\2\2\u00ef\u00f0"+
		"\7J\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7E\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4"+
		"\7U\2\2\u00f4\u00f5\7G\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7F\2\2\u00f7\u00f8"+
		"\7G\2\2\u00f8\u00f9\7H\2\2\u00f9\u00fa\7C\2\2\u00fa\u00fb\7W\2\2\u00fb"+
		"\u00fc\7N\2\2\u00fc\u00fd\7V\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7D\2\2\u00ff"+
		"\u0100\7T\2\2\u0100\u0101\7G\2\2\u0101\u0102\7C\2\2\u0102\u0103\7M\2\2"+
		"\u0103J\3\2\2\2\u0104\u0105\7\17\2\2\u0105\u0106\7\f\2\2\u0106L\3\2\2"+
		"\2\u0107\u0108\7\13\2\2\u0108N\3\2\2\2\u0109\u010b\5K&\2\u010a\u0109\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\5M\'\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\7%"+
		"\2\2\u0110\u0112\n\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\b(\2\2\u0117P\3\2\2\2\u0118\u0119\7\"\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\b)\2\2\u011bR\3\2\2\2\u011c\u011e\7]\2\2\u011d\u011f"+
		"\13\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7_\2\2\u0123T\3\2"+
		"\2\2\u0124\u0125\7D\2\2\u0125\u0126\7G\2\2\u0126\u0127\7I\2\2\u0127\u0128"+
		"\7K\2\2\u0128\u0129\7P\2\2\u0129V\3\2\2\2\u012a\u012b\7G\2\2\u012b\u012c"+
		"\7P\2\2\u012c\u012d\7F\2\2\u012dX\3\2\2\2\u012e\u012f\7E\2\2\u012f\u0130"+
		"\7Q\2\2\u0130\u0131\7F\2\2\u0131\u0132\7G\2\2\u0132Z\3\2\2\2\u0133\u0134"+
		"\5U+\2\u0134\u0135\7\"\2\2\u0135\u0136\5Y-\2\u0136\\\3\2\2\2\u0137\u0138"+
		"\5W,\2\u0138\u0139\7\"\2\2\u0139\u013a\5Y-\2\u013a^\3\2\2\2\u013b\u013c"+
		"\7K\2\2\u013c\u013d\7P\2\2\u013d\u014c\7V\2\2\u013e\u013f\7E\2\2\u013f"+
		"\u0140\7J\2\2\u0140\u0141\7C\2\2\u0141\u014c\7T\2\2\u0142\u0143\7D\2\2"+
		"\u0143\u0144\7Q\2\2\u0144\u0145\7Q\2\2\u0145\u014c\7N\2\2\u0146\u0147"+
		"\7H\2\2\u0147\u0148\7N\2\2\u0148\u0149\7Q\2\2\u0149\u014a\7C\2\2\u014a"+
		"\u014c\7V\2\2\u014b\u013b\3\2\2\2\u014b\u013e\3\2\2\2\u014b\u0142\3\2"+
		"\2\2\u014b\u0146\3\2\2\2\u014c`\3\2\2\2\u014d\u0157\7$\2\2\u014e\u014f"+
		"\7V\2\2\u014f\u0150\7T\2\2\u0150\u0151\7W\2\2\u0151\u0158\7G\2\2\u0152"+
		"\u0153\7H\2\2\u0153\u0154\7C\2\2\u0154\u0155\7N\2\2\u0155\u0156\7U\2\2"+
		"\u0156\u0158\7G\2\2\u0157\u014e\3\2\2\2\u0157\u0152\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\7$\2\2\u015ab\3\2\2\2\u015b\u015d\7/\2\2\u015c\u015b"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\t\3\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162d\3\2\2\2\u0163\u0165\7/\2\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\t\3\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\7\60\2\2\u016c\u016e\t\3\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170f\3\2\2\2"+
		"\u0171\u0172\7)\2\2\u0172\u0173\t\4\2\2\u0173\u0174\7)\2\2\u0174h\3\2"+
		"\2\2\u0175\u0179\7$\2\2\u0176\u0178\13\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7$\2\2\u017dj\3\2\2\2\u017e\u017f"+
		"\7U\2\2\u017f\u0180\7E\2\2\u0180\u0181\7C\2\2\u0181\u0182\7P\2\2\u0182"+
		"\u0183\7<\2\2\u0183l\3\2\2\2\u0184\u0185\7F\2\2\u0185\u0186\7K\2\2\u0186"+
		"\u0187\7U\2\2\u0187\u0188\7R\2\2\u0188\u0189\7N\2\2\u0189\u018a\7C\2\2"+
		"\u018a\u018b\7[\2\2\u018b\u018c\7<\2\2\u018cn\3\2\2\2\u018d\u01a6\5_\60"+
		"\2\u018e\u01a6\5U+\2\u018f\u01a6\5W,\2\u0190\u01a6\5Y-\2\u0191\u01a6\5"+
		"a\61\2\u0192\u01a6\5+\26\2\u0193\u0194\5-\27\2\u0194\u0195\5\63\32\2\u0195"+
		"\u01a6\3\2\2\2\u0196\u0197\7F\2\2\u0197\u0198\7K\2\2\u0198\u0199\7U\2"+
		"\2\u0199\u019a\7R\2\2\u019a\u019b\7N\2\2\u019b\u019c\7C\2\2\u019c\u01a6"+
		"\7[\2\2\u019d\u019e\7U\2\2\u019e\u019f\7E\2\2\u019f\u01a0\7C\2\2\u01a0"+
		"\u01a6\7P\2\2\u01a1\u01a6\5? \2\u01a2\u01a6\5E#\2\u01a3\u01a6\5G$\2\u01a4"+
		"\u01a6\5I%\2\u01a5\u018d\3\2\2\2\u01a5\u018e\3\2\2\2\u01a5\u018f\3\2\2"+
		"\2\u01a5\u0190\3\2\2\2\u01a5\u0191\3\2\2\2\u01a5\u0192\3\2\2\2\u01a5\u0193"+
		"\3\2\2\2\u01a5\u0196\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6p\3\2\2\2"+
		"\u01a7\u01a8\7?\2\2\u01a8r\3\2\2\2\u01a9\u01aa\7.\2\2\u01aat\3\2\2\2\u01ab"+
		"\u01af\t\5\2\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0v\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\21\2\u010a\u010d\u0113\u0120\u014b\u0157\u015c\u0161\u0164\u0169"+
		"\u016f\u0179\u01a5\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}