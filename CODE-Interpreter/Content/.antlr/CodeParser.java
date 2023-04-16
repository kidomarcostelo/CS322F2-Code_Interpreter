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
		T__17=18, T__18=19, IF=20, ELSE=21, BEGIN_IF=22, END_IF=23, LOOP=24, NEWLINE=25, 
		TAB=26, COMMENT=27, WS=28, ESCAPE=29, BEGIN=30, END=31, CODE=32, BEGIN_CODE=33, 
		END_CODE=34, DATA_TYPE=35, BOOLVAL=36, INTEGERVAL=37, FLOATVAL=38, CHARVAL=39, 
		STRINGVAL=40, SCAN=41, DISPLAY=42, RESERVE_WORD=43, EQUALS=44, COMMA=45, 
		IDENTIFIER=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_initialization = 3, 
		RULE_assignment = 4, RULE_executable = 5, RULE_functionCall = 6, RULE_display = 7, 
		RULE_scan = 8, RULE_expression = 9, RULE_boolExpression = 10, RULE_conditionalExpression = 11, 
		RULE_ifBlock = 12, RULE_elseIfBlock = 13, RULE_conditionalBlock = 14, 
		RULE_multOp = 15, RULE_addOp = 16, RULE_compareOp = 17, RULE_equalsOp = 18, 
		RULE_logicOp = 19, RULE_concat = 20, RULE_newline = 21, RULE_constant = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "initialization", "assignment", 
			"executable", "functionCall", "display", "scan", "expression", "boolExpression", 
			"conditionalExpression", "ifBlock", "elseIfBlock", "conditionalBlock", 
			"multOp", "addOp", "compareOp", "equalsOp", "logicOp", "concat", "newline", 
			"constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", 
			"'>'", "'<'", "'>='", "'<='", "'<>'", "'AND'", "'OR'", "'NOT'", "'&'", 
			"'$'", "'IF'", "'ELSE'", null, null, "'WHILE'", null, "'\t'", null, "' '", 
			null, "'BEGIN'", "'END'", "'CODE'", null, null, null, null, null, null, 
			null, null, "'SCAN:'", "'DISPLAY'", null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "ELSE", "BEGIN_IF", 
			"END_IF", "LOOP", "NEWLINE", "TAB", "COMMENT", "WS", "ESCAPE", "BEGIN", 
			"END", "CODE", "BEGIN_CODE", "END_CODE", "DATA_TYPE", "BOOLVAL", "INTEGERVAL", 
			"FLOATVAL", "CHARVAL", "STRINGVAL", "SCAN", "DISPLAY", "RESERVE_WORD", 
			"EQUALS", "COMMA", "IDENTIFIER"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(46);
				match(NEWLINE);
				}
			}

			setState(49);
			match(BEGIN_CODE);
			setState(50);
			statement();
			setState(51);
			match(NEWLINE);
			setState(52);
			match(END_CODE);
			setState(53);
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
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(55);
						declaration();
						}
						break;
					case 2:
						{
						setState(56);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(63); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(62);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(65); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(70);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(67);
							executable();
							}
							break;
						case 2:
							{
							setState(68);
							functionCall();
							}
							break;
						case 3:
							{
							setState(69);
							conditionalExpression();
							}
							break;
						}
						} 
					}
					setState(74);
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
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public TerminalNode TAB() { return getToken(CodeParser.TAB, 0); }
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
			setState(77);
			match(NEWLINE);
			setState(78);
			match(TAB);
			setState(79);
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
			setState(81);
			match(DATA_TYPE);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(82);
					match(COMMA);
					}
				}

				setState(85);
				assignment();
				}
				}
				setState(88); 
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(IDENTIFIER);
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					equalsOp();
					setState(93);
					expression(0);
					}
					}
					setState(97); 
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
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public TerminalNode TAB() { return getToken(CodeParser.TAB, 0); }
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
			setState(101);
			match(NEWLINE);
			setState(102);
			match(TAB);
			setState(103);
			match(IDENTIFIER);
			{
			setState(104);
			equalsOp();
			setState(105);
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
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public TerminalNode TAB() { return getToken(CodeParser.TAB, 0); }
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
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
			setState(107);
			match(NEWLINE);
			setState(108);
			match(TAB);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
			case DISPLAY:
				{
				setState(109);
				display();
				}
				break;
			case SCAN:
				{
				setState(110);
				scan();
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(113);
				match(NEWLINE);
				}
			}

			setState(116);
			match(DISPLAY);
			setState(117);
			match(T__0);
			setState(118);
			expression(0);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(119);
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
			setState(122);
			match(SCAN);
			setState(123);
			match(IDENTIFIER);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(COMMA);
					setState(125);
					match(IDENTIFIER);
					}
					} 
				}
				setState(130);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new EqualsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(IDENTIFIER);
				setState(135);
				equalsOp();
				setState(136);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new ParethesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__1);
				setState(140);
				expression(0);
				setState(141);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new NewlineExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				newline();
				}
				break;
			case 7:
				{
				_localctx = new EscapeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(ESCAPE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(148);
						multOp();
						setState(149);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						addOp();
						setState(153);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(156);
						concat();
						setState(157);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ComparativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(160);
						compareOp();
						setState(161);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						logicOp();
						setState(165);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(171);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__1);
				setState(174);
				expression(0);
				setState(175);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				expression(0);
				setState(178);
				compareOp();
				setState(179);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				expression(0);
				setState(182);
				logicOp();
				setState(183);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CodeParser.NEWLINE, 0); }
		public TerminalNode TAB() { return getToken(CodeParser.TAB, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NEWLINE);
			setState(188);
			match(TAB);
			setState(189);
			ifBlock();
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
		enterRule(_localctx, 24, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IF);
			{
			setState(192);
			boolExpression();
			}
			setState(193);
			conditionalBlock();
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(194);
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
		public TerminalNode TAB() { return getToken(CodeParser.TAB, 0); }
		public TerminalNode ELSE() { return getToken(CodeParser.ELSE, 0); }
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(NEWLINE);
			setState(198);
			match(TAB);
			setState(199);
			match(ELSE);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				{
				setState(200);
				conditionalBlock();
				}
				break;
			case IF:
				{
				setState(201);
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
		public List<TerminalNode> TAB() { return getTokens(CodeParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(CodeParser.TAB, i);
		}
		public TerminalNode BEGIN_IF() { return getToken(CodeParser.BEGIN_IF, 0); }
		public TerminalNode END_IF() { return getToken(CodeParser.END_IF, 0); }
		public List<DisplayContext> display() {
			return getRuleContexts(DisplayContext.class);
		}
		public DisplayContext display(int i) {
			return getRuleContext(DisplayContext.class,i);
		}
		public List<ScanContext> scan() {
			return getRuleContexts(ScanContext.class);
		}
		public ScanContext scan(int i) {
			return getRuleContext(ScanContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeParser.IDENTIFIER, i);
		}
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
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NEWLINE);
			setState(205);
			match(TAB);
			setState(206);
			match(BEGIN_IF);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					match(NEWLINE);
					setState(208);
					match(TAB);
					setState(209);
					match(TAB);
					setState(216);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEWLINE:
					case DISPLAY:
						{
						setState(210);
						display();
						}
						break;
					case SCAN:
						{
						setState(211);
						scan();
						}
						break;
					case IDENTIFIER:
						{
						setState(212);
						match(IDENTIFIER);
						{
						setState(213);
						equalsOp();
						setState(214);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(223);
			match(NEWLINE);
			setState(224);
			match(TAB);
			setState(225);
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

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 32, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		enterRule(_localctx, 34, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 36, RULE_equalsOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 38, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 40, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 42, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		enterRule(_localctx, 44, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00f6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\6\3B"+
		"\n\3\r\3\16\3C\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\5\3N\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\5\5V\n\5\3\5\6\5Y\n\5\r\5\16\5Z\3\6\3\6\3\6\3\6\3\6\6\6"+
		"b\n\6\r\6\16\6c\5\6f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\br"+
		"\n\b\3\t\5\tu\n\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\7\n\u0081\n"+
		"\n\f\n\16\n\u0084\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00aa\n\13\f\13\16\13\u00ad\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00db\n\20\7\20"+
		"\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\2\3\24\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\6\b"+
		"\3\2\t\n\3\2\13\20\3\2\21\23\3\2&*\2\u0101\2\61\3\2\2\2\4=\3\2\2\2\6O"+
		"\3\2\2\2\bS\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16m\3\2\2\2\20t\3\2\2\2\22|"+
		"\3\2\2\2\24\u0093\3\2\2\2\26\u00bb\3\2\2\2\30\u00bd\3\2\2\2\32\u00c1\3"+
		"\2\2\2\34\u00c7\3\2\2\2\36\u00ce\3\2\2\2 \u00e5\3\2\2\2\"\u00e7\3\2\2"+
		"\2$\u00e9\3\2\2\2&\u00eb\3\2\2\2(\u00ed\3\2\2\2*\u00ef\3\2\2\2,\u00f1"+
		"\3\2\2\2.\u00f3\3\2\2\2\60\62\7\33\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\7#\2\2\64\65\5\4\3\2\65\66\7\33\2\2\66\67\7$\2\2\67"+
		"8\7\2\2\38\3\3\2\2\29<\5\6\4\2:<\5\16\b\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>M\3\2\2\2?=\3\2\2\2@B\5\6\4\2A@\3\2\2\2BC\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2DJ\3\2\2\2EI\5\f\7\2FI\5\16\b\2GI\5\30\r\2HE\3\2"+
		"\2\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2MA\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OP\7\33\2\2PQ\7\34\2\2QR\5\b\5\2R\7"+
		"\3\2\2\2SX\7%\2\2TV\7/\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\n\6\2XU\3"+
		"\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\t\3\2\2\2\\f\7\60\2\2]a\7\60\2\2"+
		"^_\5&\24\2_`\5\24\13\2`b\3\2\2\2a^\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2df\3\2\2\2e\\\3\2\2\2e]\3\2\2\2f\13\3\2\2\2gh\7\33\2\2hi\7\34\2\2ij"+
		"\7\60\2\2jk\5&\24\2kl\5\24\13\2l\r\3\2\2\2mn\7\33\2\2nq\7\34\2\2or\5\20"+
		"\t\2pr\5\22\n\2qo\3\2\2\2qp\3\2\2\2r\17\3\2\2\2su\7\33\2\2ts\3\2\2\2t"+
		"u\3\2\2\2uv\3\2\2\2vw\7,\2\2wx\7\3\2\2xz\5\24\13\2y{\7\33\2\2zy\3\2\2"+
		"\2z{\3\2\2\2{\21\3\2\2\2|}\7+\2\2}\u0082\7\60\2\2~\177\7/\2\2\177\u0081"+
		"\7\60\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\13\1"+
		"\2\u0086\u0094\5.\30\2\u0087\u0094\7\60\2\2\u0088\u0089\7\60\2\2\u0089"+
		"\u008a\5&\24\2\u008a\u008b\5\24\13\f\u008b\u0094\3\2\2\2\u008c\u0094\5"+
		"\16\b\2\u008d\u008e\7\4\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7\5\2\2"+
		"\u0090\u0094\3\2\2\2\u0091\u0094\5,\27\2\u0092\u0094\7\37\2\2\u0093\u0085"+
		"\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u008c\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u00ab\3\2"+
		"\2\2\u0095\u0096\f\t\2\2\u0096\u0097\5 \21\2\u0097\u0098\5\24\13\n\u0098"+
		"\u00aa\3\2\2\2\u0099\u009a\f\b\2\2\u009a\u009b\5\"\22\2\u009b\u009c\5"+
		"\24\13\t\u009c\u00aa\3\2\2\2\u009d\u009e\f\7\2\2\u009e\u009f\5*\26\2\u009f"+
		"\u00a0\5\24\13\b\u00a0\u00aa\3\2\2\2\u00a1\u00a2\f\6\2\2\u00a2\u00a3\5"+
		"$\23\2\u00a3\u00a4\5\24\13\7\u00a4\u00aa\3\2\2\2\u00a5\u00a6\f\5\2\2\u00a6"+
		"\u00a7\5(\25\2\u00a7\u00a8\5\24\13\6\u00a8\u00aa\3\2\2\2\u00a9\u0095\3"+
		"\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\25\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00bc\7\60\2\2\u00af\u00b0"+
		"\7\4\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\7\5\2\2\u00b2\u00bc\3\2\2\2"+
		"\u00b3\u00b4\5\24\13\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\5\24\13\2\u00b6"+
		"\u00bc\3\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\5"+
		"\24\13\2\u00ba\u00bc\3\2\2\2\u00bb\u00ae\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\33\2"+
		"\2\u00be\u00bf\7\34\2\2\u00bf\u00c0\5\32\16\2\u00c0\31\3\2\2\2\u00c1\u00c2"+
		"\7\26\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c5\5\36\20\2\u00c4\u00c6\5\34"+
		"\17\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c8"+
		"\7\33\2\2\u00c8\u00c9\7\34\2\2\u00c9\u00cc\7\27\2\2\u00ca\u00cd\5\36\20"+
		"\2\u00cb\u00cd\5\32\16\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00de\7\30"+
		"\2\2\u00d1\u00d2\7\33\2\2\u00d2\u00d3\7\34\2\2\u00d3\u00da\7\34\2\2\u00d4"+
		"\u00db\5\20\t\2\u00d5\u00db\5\22\n\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8"+
		"\5&\24\2\u00d8\u00d9\5\24\13\2\u00d9\u00db\3\2\2\2\u00da\u00d4\3\2\2\2"+
		"\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d1"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\7"+
		"\34\2\2\u00e3\u00e4\7\31\2\2\u00e4\37\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e8\t\3\2\2\u00e8#\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea"+
		"%\3\2\2\2\u00eb\u00ec\7.\2\2\u00ec\'\3\2\2\2\u00ed\u00ee\t\5\2\2\u00ee"+
		")\3\2\2\2\u00ef\u00f0\7\24\2\2\u00f0+\3\2\2\2\u00f1\u00f2\7\25\2\2\u00f2"+
		"-\3\2\2\2\u00f3\u00f4\t\6\2\2\u00f4/\3\2\2\2\31\61;=CHJMUZceqtz\u0082"+
		"\u0093\u00a9\u00ab\u00bb\u00c5\u00cc\u00da\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}