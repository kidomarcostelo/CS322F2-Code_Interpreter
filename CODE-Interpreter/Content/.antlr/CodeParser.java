// Generated from c:\Users\Kid Omar Costelo\Documents\School\3rd year 2nd sem\CODE-Interpreter\CODE-Interpreter\CODE-Interpreter\Content\Code.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, IF=20, ELSE=21, BEGIN_IF=22, END_IF=23, WHILE=24, 
		BEGIN_WHILE=25, END_WHILE=26, FOR=27, BEGIN_FOR=28, END_FOR=29, NEWLINE=30, 
		TAB=31, COMMENT=32, WS=33, ESCAPE=34, BEGIN=35, END=36, CODE=37, BEGIN_CODE=38, 
		END_CODE=39, DATA_TYPE=40, BOOLVAL=41, INTEGERVAL=42, FLOATVAL=43, CHARVAL=44, 
		STRINGVAL=45, SCAN=46, DISPLAY=47, RESERVE_WORD=48, EQUALS=49, COMMA=50, 
		IDENTIFIER=51;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_initialization = 3, 
		RULE_assignment = 4, RULE_executable = 5, RULE_functionCall = 6, RULE_display = 7, 
		RULE_scan = 8, RULE_expression = 9, RULE_boolExpression = 10, RULE_ifBlock = 11, 
		RULE_elseIfBlock = 12, RULE_conditionalBlock = 13, RULE_whileBlock = 14, 
		RULE_forBlock = 15, RULE_multOp = 16, RULE_addOp = 17, RULE_compareOp = 18, 
		RULE_equalsOp = 19, RULE_logicOp = 20, RULE_concat = 21, RULE_newline = 22, 
		RULE_constant = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "initialization", "assignment", 
			"executable", "functionCall", "display", "scan", "expression", "boolExpression", 
			"ifBlock", "elseIfBlock", "conditionalBlock", "whileBlock", "forBlock", 
			"multOp", "addOp", "compareOp", "equalsOp", "logicOp", "concat", "newline", 
			"constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", 
			"'>'", "'<'", "'>='", "'<='", "'<>'", "'AND'", "'OR'", "'NOT'", "'&'", 
			"'$'", "'IF'", "'ELSE'", null, null, "'WHILE'", null, null, "'FOR'", 
			null, null, null, "'\t'", null, "' '", null, "'BEGIN'", "'END'", "'CODE'", 
			null, null, null, null, null, null, null, null, "'SCAN:'", "'DISPLAY'", 
			null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "ELSE", "BEGIN_IF", 
			"END_IF", "WHILE", "BEGIN_WHILE", "END_WHILE", "FOR", "BEGIN_FOR", "END_FOR", 
			"NEWLINE", "TAB", "COMMENT", "WS", "ESCAPE", "BEGIN", "END", "CODE", 
			"BEGIN_CODE", "END_CODE", "DATA_TYPE", "BOOLVAL", "INTEGERVAL", "FLOATVAL", 
			"CHARVAL", "STRINGVAL", "SCAN", "DISPLAY", "RESERVE_WORD", "EQUALS", 
			"COMMA", "IDENTIFIER"
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

	@Override
	public String getGrammarFileName() { return "Code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN_CODE() { return getToken(CodeParser.BEGIN_CODE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode END_CODE() { return getToken(CodeParser.END_CODE, 0); }
		public TerminalNode EOF() { return getToken(CodeParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(48);
				match(NEWLINE);
				}
			}

			setState(51);
			match(BEGIN_CODE);
			setState(52);
			statement();
			setState(53);
			match(NEWLINE);
			setState(54);
			match(END_CODE);
			setState(55);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<ExecutableContext> executable() {
			return getRuleContexts(ExecutableContext.class);
		}
		public ExecutableContext executable(int i) {
			return getRuleContext(ExecutableContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(57);
						match(NEWLINE);
						setState(58);
						match(TAB);
						setState(59);
						declaration();
						}
						break;
					case 2:
						{
						setState(60);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(NEWLINE);
						setState(67);
						match(TAB);
						setState(68);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(NEWLINE);
						setState(74);
						match(TAB);
						setState(77);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(75);
							executable();
							}
							break;
						case IF:
						case WHILE:
						case FOR:
						case NEWLINE:
						case SCAN:
						case DISPLAY:
							{
							setState(76);
							functionCall();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			initialization();
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

	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(CodeParser.DATA_TYPE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeParser.COMMA, i);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DATA_TYPE);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(89);
					match(COMMA);
					}
				}

				setState(92);
				assignment();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==IDENTIFIER );
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public List<EqualsOpContext> equalsOp() {
			return getRuleContexts(EqualsOpContext.class);
		}
		public EqualsOpContext equalsOp(int i) {
			return getRuleContext(EqualsOpContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(IDENTIFIER);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					equalsOp();
					setState(100);
					expression(0);
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EQUALS );
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

	public static class ExecutableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public EqualsOpContext equalsOp() {
			return getRuleContext(EqualsOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExecutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executable; }
	}

	public final ExecutableContext executable() throws RecognitionException {
		ExecutableContext _localctx = new ExecutableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_executable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			{
			setState(109);
			equalsOp();
			setState(110);
			expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case DISPLAY:
				{
				setState(112);
				display();
				}
				break;
			case SCAN:
				{
				setState(113);
				scan();
				}
				break;
			case IF:
				{
				setState(114);
				ifBlock();
				}
				break;
			case WHILE:
				{
				setState(115);
				whileBlock();
				}
				break;
			case FOR:
				{
				setState(116);
				forBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CodeParser.DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_display);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(119);
				match(NEWLINE);
				}
			}

			setState(122);
			match(DISPLAY);
			setState(123);
			match(T__0);
			setState(124);
			expression(0);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(125);
				match(NEWLINE);
				}
				break;
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(CodeParser.SCAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeParser.COMMA, i);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scan);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SCAN);
			setState(129);
			match(IDENTIFIER);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					match(IDENTIFIER);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public ComparativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EscapeExpressionContext extends ExpressionContext {
		public TerminalNode ESCAPE() { return getToken(CodeParser.ESCAPE, 0); }
		public EscapeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParethesizedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParethesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public EqualsOpContext equalsOp() {
			return getRuleContext(EqualsOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewlineExpressionContext extends ExpressionContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public NewlineExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new EqualsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(IDENTIFIER);
				setState(141);
				equalsOp();
				setState(142);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new ParethesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__1);
				setState(146);
				expression(0);
				setState(147);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new NewlineExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				newline();
				}
				break;
			case 7:
				{
				_localctx = new EscapeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ESCAPE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						multOp();
						setState(155);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158);
						addOp();
						setState(159);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						concat();
						setState(163);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ComparativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						compareOp();
						setState(167);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						logicOp();
						setState(171);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolExpression);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__1);
				setState(180);
				expression(0);
				setState(181);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				expression(0);
				setState(184);
				compareOp();
				setState(185);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				expression(0);
				setState(188);
				logicOp();
				setState(189);
				expression(0);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CodeParser.IF, 0); }
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ElseIfBlockContext elseIfBlock() {
			return getRuleContext(ElseIfBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IF);
			{
			setState(194);
			boolExpression();
			}
			setState(195);
			conditionalBlock();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(196);
				elseIfBlock();
				}
				break;
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

	public static class ElseIfBlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public TerminalNode ELSE() { return getToken(CodeParser.ELSE, 0); }
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(NEWLINE);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				match(TAB);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(205);
			match(ELSE);
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(206);
				conditionalBlock();
				}
				break;
			case IF:
				{
				setState(207);
				ifBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionalBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode BEGIN_IF() { return getToken(CodeParser.BEGIN_IF, 0); }
		public TerminalNode END_IF() { return getToken(CodeParser.END_IF, 0); }
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public List<ExecutableContext> executable() {
			return getRuleContexts(ExecutableContext.class);
		}
		public ExecutableContext executable(int i) {
			return getRuleContext(ExecutableContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(NEWLINE);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(TAB);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(216);
			match(BEGIN_IF);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(NEWLINE);
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(218);
						match(TAB);
						}
						}
						setState(221); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(225);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(223);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case NEWLINE:
					case SCAN:
					case DISPLAY:
						{
						setState(224);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(232);
			match(NEWLINE);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(TAB);
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(238);
			match(END_IF);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CodeParser.WHILE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode BEGIN_WHILE() { return getToken(CodeParser.BEGIN_WHILE, 0); }
		public TerminalNode END_WHILE() { return getToken(CodeParser.END_WHILE, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public List<ExecutableContext> executable() {
			return getRuleContexts(ExecutableContext.class);
		}
		public ExecutableContext executable(int i) {
			return getRuleContext(ExecutableContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHILE);
			{
			setState(241);
			boolExpression();
			}
			setState(242);
			match(NEWLINE);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(TAB);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(248);
			match(BEGIN_WHILE);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(NEWLINE);
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(250);
						match(TAB);
						}
						}
						setState(253); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(257);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(255);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case NEWLINE:
					case SCAN:
					case DISPLAY:
						{
						setState(256);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(264);
			match(NEWLINE);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(TAB);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(270);
			match(END_WHILE);
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CodeParser.FOR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode BEGIN_FOR() { return getToken(CodeParser.BEGIN_FOR, 0); }
		public TerminalNode END_FOR() { return getToken(CodeParser.END_FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeParser.COMMA, i);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public List<ExecutableContext> executable() {
			return getRuleContexts(ExecutableContext.class);
		}
		public ExecutableContext executable(int i) {
			return getRuleContext(ExecutableContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FOR);
			{
			setState(273);
			match(T__1);
			setState(274);
			assignment();
			setState(275);
			match(COMMA);
			setState(276);
			boolExpression();
			setState(277);
			match(COMMA);
			setState(278);
			executable();
			setState(279);
			match(T__2);
			}
			setState(281);
			match(NEWLINE);
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				match(TAB);
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(287);
			match(BEGIN_FOR);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(NEWLINE);
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(289);
						match(TAB);
						}
						}
						setState(292); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(296);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(294);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case NEWLINE:
					case SCAN:
					case DISPLAY:
						{
						setState(295);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(303);
			match(NEWLINE);
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				match(TAB);
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(309);
			match(END_FOR);
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

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class EqualsOpContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(CodeParser.EQUALS, 0); }
		public EqualsOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsOp; }
	}

	public final EqualsOpContext equalsOp() throws RecognitionException {
		EqualsOpContext _localctx = new EqualsOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equalsOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(EQUALS);
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

	public static class LogicOpContext extends ParserRuleContext {
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ConcatContext extends ParserRuleContext {
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__17);
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__18);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOLVAL() { return getToken(CodeParser.BOOLVAL, 0); }
		public TerminalNode INTEGERVAL() { return getToken(CodeParser.INTEGERVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(CodeParser.FLOATVAL, 0); }
		public TerminalNode CHARVAL() { return getToken(CodeParser.CHARVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(CodeParser.STRINGVAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << INTEGERVAL) | (1L << FLOATVAL) | (1L << CHARVAL) | (1L << STRINGVAL))) != 0)) ) {
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\3\3\3\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\3\3\3\3\5\3P\n\3\7\3R"+
		"\n\3\f\3\16\3U\13\3\5\3W\n\3\3\4\3\4\3\5\3\5\5\5]\n\5\3\5\6\5`\n\5\r\5"+
		"\16\5a\3\6\3\6\3\6\3\6\3\6\6\6i\n\6\r\6\16\6j\5\6m\n\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\5\t\u0081\n"+
		"\t\3\n\3\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00c8\n\r\3\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd"+
		"\3\16\3\16\3\16\5\16\u00d3\n\16\3\17\3\17\6\17\u00d7\n\17\r\17\16\17\u00d8"+
		"\3\17\3\17\3\17\6\17\u00de\n\17\r\17\16\17\u00df\3\17\3\17\5\17\u00e4"+
		"\n\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\17\3\17\6\17\u00ed\n\17"+
		"\r\17\16\17\u00ee\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u00f7\n\20\r\20\16"+
		"\20\u00f8\3\20\3\20\3\20\6\20\u00fe\n\20\r\20\16\20\u00ff\3\20\3\20\5"+
		"\20\u0104\n\20\7\20\u0106\n\20\f\20\16\20\u0109\13\20\3\20\3\20\6\20\u010d"+
		"\n\20\r\20\16\20\u010e\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\6\21\u011e\n\21\r\21\16\21\u011f\3\21\3\21\3\21\6\21"+
		"\u0125\n\21\r\21\16\21\u0126\3\21\3\21\5\21\u012b\n\21\7\21\u012d\n\21"+
		"\f\21\16\21\u0130\13\21\3\21\3\21\6\21\u0134\n\21\r\21\16\21\u0135\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\2\3\24\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\7\3\2\6\b\3\2\t\n\3\2\13\20\3\2\21\23\3\2+/\2\u0163\2\63"+
		"\3\2\2\2\4A\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16w\3"+
		"\2\2\2\20z\3\2\2\2\22\u0082\3\2\2\2\24\u0099\3\2\2\2\26\u00c1\3\2\2\2"+
		"\30\u00c3\3\2\2\2\32\u00c9\3\2\2\2\34\u00d4\3\2\2\2\36\u00f2\3\2\2\2 "+
		"\u0112\3\2\2\2\"\u0139\3\2\2\2$\u013b\3\2\2\2&\u013d\3\2\2\2(\u013f\3"+
		"\2\2\2*\u0141\3\2\2\2,\u0143\3\2\2\2.\u0145\3\2\2\2\60\u0147\3\2\2\2\62"+
		"\64\7 \2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7(\2\2\66\67"+
		"\5\4\3\2\678\7 \2\289\7)\2\29:\7\2\2\3:\3\3\2\2\2;<\7 \2\2<=\7!\2\2=@"+
		"\5\6\4\2>@\5\16\b\2?;\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"BV\3\2\2\2CA\3\2\2\2DE\7 \2\2EF\7!\2\2FH\5\6\4\2GD\3\2\2\2HI\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2JS\3\2\2\2KL\7 \2\2LO\7!\2\2MP\5\f\7\2NP\5\16\b\2O"+
		"M\3\2\2\2ON\3\2\2\2PR\3\2\2\2QK\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TW\3\2\2\2US\3\2\2\2VG\3\2\2\2VW\3\2\2\2W\5\3\2\2\2XY\5\b\5\2Y\7\3\2\2"+
		"\2Z_\7*\2\2[]\7\64\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\n\6\2_\\\3"+
		"\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2cm\7\65\2\2dh\7\65\2\2"+
		"ef\5(\25\2fg\5\24\13\2gi\3\2\2\2he\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2km\3\2\2\2lc\3\2\2\2ld\3\2\2\2m\13\3\2\2\2no\7\65\2\2op\5(\25\2pq\5"+
		"\24\13\2q\r\3\2\2\2rx\5\20\t\2sx\5\22\n\2tx\5\30\r\2ux\5\36\20\2vx\5 "+
		"\21\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\17\3\2\2\2y{"+
		"\7 \2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\61\2\2}~\7\3\2\2~\u0080\5\24"+
		"\13\2\177\u0081\7 \2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21"+
		"\3\2\2\2\u0082\u0083\7\60\2\2\u0083\u0088\7\65\2\2\u0084\u0085\7\64\2"+
		"\2\u0085\u0087\7\65\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a\u0088\3\2\2"+
		"\2\u008b\u008c\b\13\1\2\u008c\u009a\5\60\31\2\u008d\u009a\7\65\2\2\u008e"+
		"\u008f\7\65\2\2\u008f\u0090\5(\25\2\u0090\u0091\5\24\13\f\u0091\u009a"+
		"\3\2\2\2\u0092\u009a\5\16\b\2\u0093\u0094\7\4\2\2\u0094\u0095\5\24\13"+
		"\2\u0095\u0096\7\5\2\2\u0096\u009a\3\2\2\2\u0097\u009a\5.\30\2\u0098\u009a"+
		"\7$\2\2\u0099\u008b\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u008e\3\2\2\2\u0099"+
		"\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\u00b1\3\2\2\2\u009b\u009c\f\t\2\2\u009c\u009d\5\"\22\2\u009d"+
		"\u009e\5\24\13\n\u009e\u00b0\3\2\2\2\u009f\u00a0\f\b\2\2\u00a0\u00a1\5"+
		"$\23\2\u00a1\u00a2\5\24\13\t\u00a2\u00b0\3\2\2\2\u00a3\u00a4\f\7\2\2\u00a4"+
		"\u00a5\5,\27\2\u00a5\u00a6\5\24\13\b\u00a6\u00b0\3\2\2\2\u00a7\u00a8\f"+
		"\6\2\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\5\24\13\7\u00aa\u00b0\3\2\2\2\u00ab"+
		"\u00ac\f\5\2\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\5\24\13\6\u00ae\u00b0\3"+
		"\2\2\2\u00af\u009b\3\2\2\2\u00af\u009f\3\2\2\2\u00af\u00a3\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c2"+
		"\7\65\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7\5\2"+
		"\2\u00b8\u00c2\3\2\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\5&\24\2\u00bb"+
		"\u00bc\5\24\13\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf"+
		"\5*\26\2\u00bf\u00c0\5\24\13\2\u00c0\u00c2\3\2\2\2\u00c1\u00b4\3\2\2\2"+
		"\u00c1\u00b5\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\27"+
		"\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c7\5\34\17"+
		"\2\u00c6\u00c8\5\32\16\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\31\3\2\2\2\u00c9\u00cb\7 \2\2\u00ca\u00cc\7!\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d2\7\27\2\2\u00d0\u00d3\5\34\17\2\u00d1\u00d3\5\30\r"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d6"+
		"\7 \2\2\u00d5\u00d7\7!\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e7\7\30"+
		"\2\2\u00db\u00dd\7 \2\2\u00dc\u00de\7!\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00e4\5\f\7\2\u00e2\u00e4\5\16\b\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3"+
		"\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00db\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00ec\7 \2\2\u00eb\u00ed\7!\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\31\2\2\u00f1\35\3\2\2\2\u00f2\u00f3\7\32\2\2\u00f3\u00f4\5\26"+
		"\f\2\u00f4\u00f6\7 \2\2\u00f5\u00f7\7!\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u0107\7\33\2\2\u00fb\u00fd\7 \2\2\u00fc\u00fe\7!\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u0104\5\f\7\2\u0102\u0104\5\16\b\2\u0103\u0101\3"+
		"\2\2\2\u0103\u0102\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00fb\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7 \2\2\u010b\u010d\7!\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\7\34\2\2\u0111\37\3\2\2\2\u0112\u0113\7\35"+
		"\2\2\u0113\u0114\7\4\2\2\u0114\u0115\5\n\6\2\u0115\u0116\7\64\2\2\u0116"+
		"\u0117\5\26\f\2\u0117\u0118\7\64\2\2\u0118\u0119\5\f\7\2\u0119\u011a\7"+
		"\5\2\2\u011a\u011b\3\2\2\2\u011b\u011d\7 \2\2\u011c\u011e\7!\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u012e\7\36\2\2\u0122\u0124\7 \2\2\u0123"+
		"\u0125\7!\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u012b\5\f\7\2\u0129"+
		"\u012b\5\16\b\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012d\3"+
		"\2\2\2\u012c\u0122\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\7 "+
		"\2\2\u0132\u0134\7!\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\37"+
		"\2\2\u0138!\3\2\2\2\u0139\u013a\t\2\2\2\u013a#\3\2\2\2\u013b\u013c\t\3"+
		"\2\2\u013c%\3\2\2\2\u013d\u013e\t\4\2\2\u013e\'\3\2\2\2\u013f\u0140\7"+
		"\63\2\2\u0140)\3\2\2\2\u0141\u0142\t\5\2\2\u0142+\3\2\2\2\u0143\u0144"+
		"\7\24\2\2\u0144-\3\2\2\2\u0145\u0146\7\25\2\2\u0146/\3\2\2\2\u0147\u0148"+
		"\t\6\2\2\u0148\61\3\2\2\2\'\63?AIOSV\\ajlwz\u0080\u0088\u0099\u00af\u00b1"+
		"\u00c1\u00c7\u00cd\u00d2\u00d8\u00df\u00e3\u00e7\u00ee\u00f8\u00ff\u0103"+
		"\u0107\u010e\u011f\u0126\u012a\u012e\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}