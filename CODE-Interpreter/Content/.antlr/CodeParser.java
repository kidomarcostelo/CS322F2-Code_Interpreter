// Generated from c:\Users\Kid Omar Costelo\Documents\School\3rd year 2nd sem\Programming Language\CS322F2-Code_Interpreter\CODE-Interpreter\Content\Code.g4 by ANTLR 4.9.2
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
		T__17=18, T__18=19, T__19=20, IF=21, ELSE=22, BEGIN_IF=23, END_IF=24, 
		WHILE=25, BEGIN_WHILE=26, END_WHILE=27, FOR=28, BEGIN_FOR=29, END_FOR=30, 
		SWITCH=31, BEGIN_SWITCH=32, END_SWITCH=33, CASE=34, DEFAULT=35, BREAK=36, 
		NEWLINE=37, TAB=38, COMMENT=39, WS=40, ESCAPE=41, BEGIN=42, END=43, CODE=44, 
		BEGIN_CODE=45, END_CODE=46, DATA_TYPE=47, BOOLVAL=48, INTEGERVAL=49, FLOATVAL=50, 
		CHARVAL=51, STRINGVAL=52, SCAN=53, DISPLAY=54, RESERVE_WORD=55, EQUALS=56, 
		COMMA=57, IDENTIFIER=58;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_initialization = 3, 
		RULE_assignment = 4, RULE_executable = 5, RULE_functionCall = 6, RULE_display = 7, 
		RULE_scan = 8, RULE_expression = 9, RULE_boolExpression = 10, RULE_ifBlock = 11, 
		RULE_elseIfBlock = 12, RULE_conditionalBlock = 13, RULE_whileBlock = 14, 
		RULE_forBlock = 15, RULE_forBody = 16, RULE_switchBlock = 17, RULE_caseBlock = 18, 
		RULE_defaultBlock = 19, RULE_multOp = 20, RULE_addOp = 21, RULE_compareOp = 22, 
		RULE_equalsOp = 23, RULE_logicOp = 24, RULE_concat = 25, RULE_newline = 26, 
		RULE_constant = 27, RULE_identifier = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "initialization", "assignment", 
			"executable", "functionCall", "display", "scan", "expression", "boolExpression", 
			"ifBlock", "elseIfBlock", "conditionalBlock", "whileBlock", "forBlock", 
			"forBody", "switchBlock", "caseBlock", "defaultBlock", "multOp", "addOp", 
			"compareOp", "equalsOp", "logicOp", "concat", "newline", "constant", 
			"identifier"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(58);
				match(NEWLINE);
				}
			}

			setState(61);
			match(BEGIN_CODE);
			setState(62);
			statement();
			setState(63);
			match(NEWLINE);
			setState(64);
			match(END_CODE);
			setState(65);
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
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(NEWLINE);
					setState(68);
					match(TAB);
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATA_TYPE:
						{
						setState(69);
						declaration();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(70);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(81); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						match(NEWLINE);
						setState(79);
						match(TAB);
						setState(80);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						match(NEWLINE);
						setState(86);
						match(TAB);
						setState(89);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(87);
							executable();
							}
							break;
						case IF:
						case WHILE:
						case FOR:
						case SWITCH:
						case SCAN:
						case DISPLAY:
							{
							setState(88);
							functionCall();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(95);
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
			setState(98);
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
			setState(100);
			match(DATA_TYPE);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(101);
					match(COMMA);
					}
				}

				setState(104);
				assignment();
				}
				}
				setState(107); 
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(IDENTIFIER);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					equalsOp();
					setState(112);
					expression(0);
					}
					}
					setState(116); 
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
			setState(120);
			match(IDENTIFIER);
			{
			setState(121);
			equalsOp();
			setState(122);
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
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				{
				setState(124);
				display();
				}
				break;
			case SCAN:
				{
				setState(125);
				scan();
				}
				break;
			case IF:
				{
				setState(126);
				ifBlock();
				}
				break;
			case WHILE:
				{
				setState(127);
				whileBlock();
				}
				break;
			case FOR:
				{
				setState(128);
				forBlock();
				}
				break;
			case SWITCH:
				{
				setState(129);
				switchBlock();
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
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DISPLAY);
			setState(133);
			expression(0);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(134);
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
			setState(137);
			match(SCAN);
			setState(138);
			match(IDENTIFIER);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					match(IDENTIFIER);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new EqualsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(IDENTIFIER);
				setState(150);
				equalsOp();
				setState(151);
				expression(11);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__0);
				setState(154);
				expression(10);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				functionCall();
				}
				break;
			case 6:
				{
				_localctx = new ParethesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__1);
				setState(157);
				expression(0);
				setState(158);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new NewlineExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				newline();
				}
				break;
			case 8:
				{
				_localctx = new EscapeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(ESCAPE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						multOp();
						setState(166);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(169);
						addOp();
						setState(170);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						concat();
						setState(174);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ComparativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177);
						compareOp();
						setState(178);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						logicOp();
						setState(182);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolIdentifierExpressionContext extends BoolExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public BoolIdentifierExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolLogicalExpressionContext extends BoolExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public BoolLogicalExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolComparativeExpressionContext extends BoolExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public BoolComparativeExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BoolParethesizedExpressionContext extends BoolExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolParethesizedExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolExpression);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BoolIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new BoolParethesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__1);
				setState(191);
				expression(0);
				setState(192);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BoolComparativeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				expression(0);
				setState(195);
				compareOp();
				setState(196);
				expression(0);
				}
				break;
			case 4:
				_localctx = new BoolLogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				expression(0);
				setState(199);
				logicOp();
				setState(200);
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
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
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
			setState(204);
			match(IF);
			setState(205);
			match(T__1);
			setState(206);
			boolExpression();
			setState(207);
			match(T__2);
			setState(208);
			conditionalBlock();
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(209);
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
			setState(212);
			match(NEWLINE);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				match(TAB);
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(218);
			match(ELSE);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(219);
				conditionalBlock();
				}
				break;
			case IF:
				{
				setState(220);
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
			setState(223);
			match(NEWLINE);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				match(TAB);
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(229);
			match(BEGIN_IF);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(NEWLINE);
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(231);
						match(TAB);
						}
						}
						setState(234); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(236);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(237);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(245);
			match(NEWLINE);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				match(TAB);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(251);
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
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode BEGIN_WHILE() { return getToken(CodeParser.BEGIN_WHILE, 0); }
		public TerminalNode END_WHILE() { return getToken(CodeParser.END_WHILE, 0); }
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
			setState(253);
			match(WHILE);
			setState(254);
			match(T__1);
			setState(255);
			boolExpression();
			setState(256);
			match(T__2);
			setState(257);
			match(NEWLINE);
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				match(TAB);
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(263);
			match(BEGIN_WHILE);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(270);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(271);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(279);
			match(NEWLINE);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				match(TAB);
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(285);
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
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public TerminalNode END_FOR() { return getToken(CodeParser.END_FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ExecutableContext executable() {
			return getRuleContext(ExecutableContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(FOR);
			{
			setState(288);
			match(T__1);
			setState(289);
			assignment();
			setState(290);
			match(T__3);
			setState(291);
			boolExpression();
			setState(292);
			match(T__3);
			setState(293);
			executable();
			setState(294);
			match(T__2);
			}
			setState(296);
			match(NEWLINE);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				match(TAB);
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(302);
			match(BEGIN_FOR);
			setState(303);
			forBody();
			setState(304);
			match(NEWLINE);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				match(TAB);
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(310);
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

	public static class ForBodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
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
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public ForBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
	}

	public final ForBodyContext forBody() throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(NEWLINE);
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(313);
						match(TAB);
						}
						}
						setState(316); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(320);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(318);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(319);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CodeParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode BEGIN_SWITCH() { return getToken(CodeParser.BEGIN_SWITCH, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public TerminalNode END_SWITCH() { return getToken(CodeParser.END_SWITCH, 0); }
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(SWITCH);
			setState(328);
			match(T__1);
			setState(329);
			expression(0);
			setState(330);
			match(T__2);
			setState(331);
			match(NEWLINE);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(TAB);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(337);
			match(BEGIN_SWITCH);
			setState(338);
			caseBlock();
			setState(339);
			match(NEWLINE);
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(TAB);
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(345);
			match(END_SWITCH);
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

	public static class CaseBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode CASE() { return getToken(CodeParser.CASE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public TerminalNode BREAK() { return getToken(CodeParser.BREAK, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
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
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_caseBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(NEWLINE);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				match(TAB);
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(353);
			match(CASE);
			setState(354);
			constant();
			setState(355);
			match(T__4);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					match(NEWLINE);
					setState(358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(357);
						match(TAB);
						}
						}
						setState(360); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(364);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(362);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(363);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(371);
				match(NEWLINE);
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					match(TAB);
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB );
				setState(377);
				match(BREAK);
				}
				break;
			}
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(380);
				caseBlock();
				}
				break;
			case 2:
				{
				setState(381);
				defaultBlock();
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

	public static class DefaultBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeParser.NEWLINE, i);
		}
		public TerminalNode DEFAULT() { return getToken(CodeParser.DEFAULT, 0); }
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public TerminalNode BREAK() { return getToken(CodeParser.BREAK, 0); }
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
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(NEWLINE);
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				match(TAB);
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(390);
			match(DEFAULT);
			setState(391);
			match(T__4);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					match(NEWLINE);
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(393);
						match(TAB);
						}
						}
						setState(396); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					setState(400);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(398);
						executable();
						}
						break;
					case IF:
					case WHILE:
					case FOR:
					case SWITCH:
					case SCAN:
					case DISPLAY:
						{
						setState(399);
						functionCall();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(407);
				match(NEWLINE);
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(408);
					match(TAB);
					}
					}
					setState(411); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TAB );
				setState(413);
				match(BREAK);
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

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
		enterRule(_localctx, 44, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_equalsOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 48, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
		enterRule(_localctx, 50, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__19);
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
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\3\3\3\3\6\3T\n\3\r\3\16\3U\3\3\3\3\3\3\3\3\5\3\\\n\3\7\3^\n\3\f\3\16"+
		"\3a\13\3\5\3c\n\3\3\4\3\4\3\5\3\5\5\5i\n\5\3\5\6\5l\n\5\r\5\16\5m\3\6"+
		"\3\6\3\6\3\6\3\6\6\6u\n\6\r\6\16\6v\5\6y\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n"+
		"\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00d5\n\r\3\16\3\16\6\16\u00d9\n\16\r\16\16\16\u00da\3"+
		"\16\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\6\17\u00e4\n\17\r\17\16\17\u00e5"+
		"\3\17\3\17\3\17\6\17\u00eb\n\17\r\17\16\17\u00ec\3\17\3\17\5\17\u00f1"+
		"\n\17\7\17\u00f3\n\17\f\17\16\17\u00f6\13\17\3\17\3\17\6\17\u00fa\n\17"+
		"\r\17\16\17\u00fb\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0106\n"+
		"\20\r\20\16\20\u0107\3\20\3\20\3\20\6\20\u010d\n\20\r\20\16\20\u010e\3"+
		"\20\3\20\5\20\u0113\n\20\7\20\u0115\n\20\f\20\16\20\u0118\13\20\3\20\3"+
		"\20\6\20\u011c\n\20\r\20\16\20\u011d\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u012d\n\21\r\21\16\21\u012e\3\21\3"+
		"\21\3\21\3\21\6\21\u0135\n\21\r\21\16\21\u0136\3\21\3\21\3\22\3\22\6\22"+
		"\u013d\n\22\r\22\16\22\u013e\3\22\3\22\5\22\u0143\n\22\7\22\u0145\n\22"+
		"\f\22\16\22\u0148\13\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0150\n\23"+
		"\r\23\16\23\u0151\3\23\3\23\3\23\3\23\6\23\u0158\n\23\r\23\16\23\u0159"+
		"\3\23\3\23\3\24\3\24\6\24\u0160\n\24\r\24\16\24\u0161\3\24\3\24\3\24\3"+
		"\24\3\24\6\24\u0169\n\24\r\24\16\24\u016a\3\24\3\24\5\24\u016f\n\24\7"+
		"\24\u0171\n\24\f\24\16\24\u0174\13\24\3\24\3\24\6\24\u0178\n\24\r\24\16"+
		"\24\u0179\3\24\5\24\u017d\n\24\3\24\3\24\5\24\u0181\n\24\3\25\3\25\6\25"+
		"\u0185\n\25\r\25\16\25\u0186\3\25\3\25\3\25\3\25\6\25\u018d\n\25\r\25"+
		"\16\25\u018e\3\25\3\25\5\25\u0193\n\25\7\25\u0195\n\25\f\25\16\25\u0198"+
		"\13\25\3\25\3\25\6\25\u019c\n\25\r\25\16\25\u019d\3\25\5\25\u01a1\n\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\2\3\24\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:\2\7\3\2\b\n\3\2\13\f\3\2\r\22\3\2\23\24\3\2"+
		"\62\66\2\u01da\2=\3\2\2\2\4M\3\2\2\2\6d\3\2\2\2\bf\3\2\2\2\nx\3\2\2\2"+
		"\fz\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u008b\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3\2\2\2\32\u00d6\3\2\2\2\34\u00e1\3"+
		"\2\2\2\36\u00ff\3\2\2\2 \u0121\3\2\2\2\"\u0146\3\2\2\2$\u0149\3\2\2\2"+
		"&\u015d\3\2\2\2(\u0182\3\2\2\2*\u01a2\3\2\2\2,\u01a4\3\2\2\2.\u01a6\3"+
		"\2\2\2\60\u01a8\3\2\2\2\62\u01aa\3\2\2\2\64\u01ac\3\2\2\2\66\u01ae\3\2"+
		"\2\28\u01b0\3\2\2\2:\u01b2\3\2\2\2<>\7\'\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2"+
		"\2\2?@\7/\2\2@A\5\4\3\2AB\7\'\2\2BC\7\60\2\2CD\7\2\2\3D\3\3\2\2\2EF\7"+
		"\'\2\2FI\7(\2\2GJ\5\6\4\2HJ\5\16\b\2IG\3\2\2\2IH\3\2\2\2JL\3\2\2\2KE\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2Nb\3\2\2\2OM\3\2\2\2PQ\7\'\2\2QR\7"+
		"(\2\2RT\5\6\4\2SP\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V_\3\2\2\2WX\7"+
		"\'\2\2X[\7(\2\2Y\\\5\f\7\2Z\\\5\16\b\2[Y\3\2\2\2[Z\3\2\2\2\\^\3\2\2\2"+
		"]W\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bS\3\2\2\2"+
		"bc\3\2\2\2c\5\3\2\2\2de\5\b\5\2e\7\3\2\2\2fk\7\61\2\2gi\7;\2\2hg\3\2\2"+
		"\2hi\3\2\2\2ij\3\2\2\2jl\5\n\6\2kh\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2n\t\3\2\2\2oy\7<\2\2pt\7<\2\2qr\5\60\31\2rs\5\24\13\2su\3\2\2\2tq\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xo\3\2\2\2xp\3\2\2\2y\13"+
		"\3\2\2\2z{\7<\2\2{|\5\60\31\2|}\5\24\13\2}\r\3\2\2\2~\u0085\5\20\t\2\177"+
		"\u0085\5\22\n\2\u0080\u0085\5\30\r\2\u0081\u0085\5\36\20\2\u0082\u0085"+
		"\5 \21\2\u0083\u0085\5$\23\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\17\3\2\2\2\u0086\u0087\78\2\2\u0087\u0089\5\24\13\2\u0088\u008a\7\'\2"+
		"\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c"+
		"\7\67\2\2\u008c\u0091\7<\2\2\u008d\u008e\7;\2\2\u008e\u0090\7<\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\23\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\b\13\1\2\u0095\u00a5"+
		"\58\35\2\u0096\u00a5\5:\36\2\u0097\u0098\7<\2\2\u0098\u0099\5\60\31\2"+
		"\u0099\u009a\5\24\13\r\u009a\u00a5\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u00a5"+
		"\5\24\13\f\u009d\u00a5\5\16\b\2\u009e\u009f\7\4\2\2\u009f\u00a0\5\24\13"+
		"\2\u00a0\u00a1\7\5\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a5\5\66\34\2\u00a3"+
		"\u00a5\7+\2\2\u00a4\u0094\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u0097\3\2"+
		"\2\2\u00a4\u009b\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00bc\3\2\2\2\u00a6\u00a7\f\t"+
		"\2\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\5\24\13\n\u00a9\u00bb\3\2\2\2\u00aa"+
		"\u00ab\f\b\2\2\u00ab\u00ac\5,\27\2\u00ac\u00ad\5\24\13\t\u00ad\u00bb\3"+
		"\2\2\2\u00ae\u00af\f\7\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\5\24\13\b"+
		"\u00b1\u00bb\3\2\2\2\u00b2\u00b3\f\6\2\2\u00b3\u00b4\5.\30\2\u00b4\u00b5"+
		"\5\24\13\7\u00b5\u00bb\3\2\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\5\62\32"+
		"\2\u00b8\u00b9\5\24\13\6\u00b9\u00bb\3\2\2\2\u00ba\u00a6\3\2\2\2\u00ba"+
		"\u00aa\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\25\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00cd\7<\2\2\u00c0\u00c1\7\4\2\2"+
		"\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\5\2\2\u00c3\u00cd\3\2\2\2\u00c4\u00c5"+
		"\5\24\13\2\u00c5\u00c6\5.\30\2\u00c6\u00c7\5\24\13\2\u00c7\u00cd\3\2\2"+
		"\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca\5\62\32\2\u00ca\u00cb\5\24\13\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00bf\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c4\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0"+
		"\7\4\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7\5\2\2\u00d2\u00d4\5\34\17"+
		"\2\u00d3\u00d5\5\32\16\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\31\3\2\2\2\u00d6\u00d8\7\'\2\2\u00d7\u00d9\7(\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00df\7\30\2\2\u00dd\u00e0\5\34\17\2\u00de\u00e0\5\30\r"+
		"\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e3"+
		"\7\'\2\2\u00e2\u00e4\7(\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f4\7\31"+
		"\2\2\u00e8\u00ea\7\'\2\2\u00e9\u00eb\7(\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00f1\5\f\7\2\u00ef\u00f1\5\16\b\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f3\u00f6\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f9\7\'\2\2\u00f8\u00fa\7(\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe\35\3\2\2\2\u00ff\u0100\7\33"+
		"\2\2\u0100\u0101\7\4\2\2\u0101\u0102\5\26\f\2\u0102\u0103\7\5\2\2\u0103"+
		"\u0105\7\'\2\2\u0104\u0106\7(\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0116\7\34\2\2\u010a\u010c\7\'\2\2\u010b\u010d\7(\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u0113\5\f\7\2\u0111\u0113\5\16\b\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0111\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u010a\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7\'\2\2\u011a\u011c\7(\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\35\2\2\u0120\37\3\2\2\2\u0121\u0122"+
		"\7\36\2\2\u0122\u0123\7\4\2\2\u0123\u0124\5\n\6\2\u0124\u0125\7\6\2\2"+
		"\u0125\u0126\5\26\f\2\u0126\u0127\7\6\2\2\u0127\u0128\5\f\7\2\u0128\u0129"+
		"\7\5\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7\'\2\2\u012b\u012d\7(\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0132\5\"\22\2\u0132"+
		"\u0134\7\'\2\2\u0133\u0135\7(\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\7 \2\2\u0139!\3\2\2\2\u013a\u013c\7\'\2\2\u013b\u013d\7(\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u0143\5\f\7\2\u0141\u0143\5\16\b\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u013a\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"#\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7!\2\2\u014a\u014b\7\4\2\2\u014b"+
		"\u014c\5\24\13\2\u014c\u014d\7\5\2\2\u014d\u014f\7\'\2\2\u014e\u0150\7"+
		"(\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\"\2\2\u0154\u0155\5&"+
		"\24\2\u0155\u0157\7\'\2\2\u0156\u0158\7(\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\7#\2\2\u015c%\3\2\2\2\u015d\u015f\7\'\2\2\u015e\u0160"+
		"\7(\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7$\2\2\u0164\u0165\58\35"+
		"\2\u0165\u0172\7\7\2\2\u0166\u0168\7\'\2\2\u0167\u0169\7(\2\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016f\5\f\7\2\u016d\u016f\5\16\b\2\u016e\u016c\3"+
		"\2\2\2\u016e\u016d\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0166\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017c\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0177\7\'\2\2\u0176\u0178\7(\2\2\u0177"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7&\2\2\u017c\u0175\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u0181\5&\24\2\u017f\u0181\5("+
		"\25\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\'\3\2\2\2\u0182\u0184\7\'\2\2\u0183\u0185\7(\2\2\u0184\u0183\3\2\2\2"+
		"\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0189\7%\2\2\u0189\u0196\7\7\2\2\u018a\u018c\7\'\2\2\u018b"+
		"\u018d\7(\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0193\5\f\7\2\u0191"+
		"\u0193\5\16\b\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u0195\3"+
		"\2\2\2\u0194\u018a\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u01a0\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\7\'"+
		"\2\2\u019a\u019c\7(\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7&"+
		"\2\2\u01a0\u0199\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1)\3\2\2\2\u01a2\u01a3"+
		"\t\2\2\2\u01a3+\3\2\2\2\u01a4\u01a5\t\3\2\2\u01a5-\3\2\2\2\u01a6\u01a7"+
		"\t\4\2\2\u01a7/\3\2\2\2\u01a8\u01a9\7:\2\2\u01a9\61\3\2\2\2\u01aa\u01ab"+
		"\t\5\2\2\u01ab\63\3\2\2\2\u01ac\u01ad\7\25\2\2\u01ad\65\3\2\2\2\u01ae"+
		"\u01af\7\26\2\2\u01af\67\3\2\2\2\u01b0\u01b1\t\6\2\2\u01b19\3\2\2\2\u01b2"+
		"\u01b3\7<\2\2\u01b3;\3\2\2\2\65=IMU[_bhmvx\u0084\u0089\u0091\u00a4\u00ba"+
		"\u00bc\u00cc\u00d4\u00da\u00df\u00e5\u00ec\u00f0\u00f4\u00fb\u0107\u010e"+
		"\u0112\u0116\u011d\u012e\u0136\u013e\u0142\u0146\u0151\u0159\u0161\u016a"+
		"\u016e\u0172\u0179\u017c\u0180\u0186\u018e\u0192\u0196\u019d\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}