// Generated from d:\Projects\Javascript\Thyme\src\grammar\Thyme.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ThymeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, BOOL_TRUE=27, BOOL_FALSE=28, NUMBER_LITERAL=29, STRING_LITERAL=30, 
		IDENTIFIER=31, ARROW=32, ASSIGN=33, BLOCK_COMMENT=34, LINE_COMMENT=35, 
		WS=36;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_statementList = 2, RULE_ifStatement = 3, 
		RULE_assignStatement = 4, RULE_expressionList = 5, RULE_expression = 6, 
		RULE_term = 7, RULE_memberAccessor = 8, RULE_functionCall = 9, RULE_functionLiteral = 10;
	public static final String[] ruleNames = {
		"script", "statement", "statementList", "ifStatement", "assignStatement", 
		"expressionList", "expression", "term", "memberAccessor", "functionCall", 
		"functionLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'?'", "'{'", "'}'", "':'", "','", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'^'", "'+'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='", "'&&'", "'||'", "'.'", "'['", "']'", "'true'", "'false'", null, 
		null, null, "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOL_TRUE", "BOOL_FALSE", "NUMBER_LITERAL", "STRING_LITERAL", 
		"IDENTIFIER", "ARROW", "ASSIGN", "BLOCK_COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Thyme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ThymeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ThymeParser.EOF, 0); }
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public AssignStatementContext assignStatement(int i) {
			return getRuleContext(AssignStatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				assignStatement();
				setState(23);
				match(T__0);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(29);
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
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				assignStatement();
				setState(32);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				ifStatement();
				setState(35);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				functionCall();
				setState(38);
				match(T__0);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==IDENTIFIER) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			expression(0);
			setState(50);
			match(T__2);
			setState(51);
			match(T__3);
			setState(52);
			match(T__4);
			setState(53);
			statementList();
			setState(54);
			match(T__5);
			setState(55);
			match(T__6);
			setState(56);
			match(T__4);
			setState(57);
			statementList();
			setState(58);
			match(T__5);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ThymeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			memberAccessor();
			setState(61);
			match(ASSIGN);
			setState(62);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__9:
			case T__24:
			case BOOL_TRUE:
			case BOOL_FALSE:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				expression(0);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(65);
					match(T__7);
					setState(66);
					expression(0);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegateExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAccessorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberAccessorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExpressionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivModPowExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivModPowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new NegateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				match(T__8);
				setState(77);
				expression(11);
				}
				break;
			case T__9:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(T__9);
				setState(79);
				expression(10);
				}
				break;
			case T__1:
			case T__24:
			case BOOL_TRUE:
			case BOOL_FALSE:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModPowExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(84);
						((MulDivModPowExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((MulDivModPowExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(87);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__14) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(96);
						match(T__21);
						setState(97);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						match(T__22);
						setState(100);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(T__3);
						setState(103);
						expression(0);
						setState(104);
						match(T__6);
						setState(105);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new MemberAccessorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(T__23);
						setState(109);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAcessorTermContext extends TermContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public MemberAcessorTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralFalseContext extends TermContext {
		public TerminalNode BOOL_FALSE() { return getToken(ThymeParser.BOOL_FALSE, 0); }
		public BooleanLiteralFalseContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ListLiteralContext extends TermContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends TermContext {
		public TerminalNode STRING_LITERAL() { return getToken(ThymeParser.STRING_LITERAL, 0); }
		public StringLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionLiteralTermContext extends TermContext {
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public FunctionLiteralTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralTrueContext extends TermContext {
		public TerminalNode BOOL_TRUE() { return getToken(ThymeParser.BOOL_TRUE, 0); }
		public BooleanLiteralTrueContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallTermContext extends TermContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesysExpressionContext extends TermContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesysExpressionContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class NullLiteralContext extends TermContext {
		public TerminalNode BOOL_FALSE() { return getToken(ThymeParser.BOOL_FALSE, 0); }
		public NullLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class NumberLiteralContext extends TermContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(ThymeParser.NUMBER_LITERAL, 0); }
		public NumberLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ParenthesysExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__1);
				setState(116);
				expression(0);
				setState(117);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new MemberAcessorTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				memberAccessor();
				}
				break;
			case 3:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(NUMBER_LITERAL);
				}
				break;
			case 4:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				_localctx = new BooleanLiteralTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(BOOL_TRUE);
				}
				break;
			case 6:
				_localctx = new BooleanLiteralFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(BOOL_FALSE);
				}
				break;
			case 7:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				match(BOOL_FALSE);
				}
				break;
			case 8:
				_localctx = new FunctionLiteralTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				functionLiteral();
				}
				break;
			case 9:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				match(T__24);
				setState(127);
				expressionList();
				setState(128);
				match(T__25);
				}
				break;
			case 10:
				_localctx = new FunctionCallTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
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

	public static class MemberAccessorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ThymeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ThymeParser.IDENTIFIER, i);
		}
		public MemberAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessor; }
	}

	public final MemberAccessorContext memberAccessor() throws RecognitionException {
		MemberAccessorContext _localctx = new MemberAccessorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memberAccessor);
		try {
			int _alt;
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(IDENTIFIER);
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(T__23);
						setState(136);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode IDENTIFIER() { return getToken(ThymeParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
			setState(144);
			match(T__1);
			setState(145);
			expressionList();
			setState(146);
			match(T__2);
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

	public static class FunctionLiteralContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ThymeParser.ARROW, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__1);
			setState(149);
			expressionList();
			setState(150);
			match(T__2);
			setState(151);
			match(ARROW);
			setState(152);
			match(T__4);
			setState(153);
			statementList();
			setState(154);
			match(T__5);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7"+
		"F\n\7\f\7\16\7I\13\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\n"+
		"\3\n\3\n\3\n\6\n\u008c\n\n\r\n\16\n\u008d\5\n\u0090\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\3\16\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\6\3\2\r\20\4\2\13\13\21\21\3\2\22\25\3\2\26\27\2\u00ae"+
		"\2\33\3\2\2\2\4*\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\n>\3\2\2\2\fK\3\2\2\2"+
		"\16S\3\2\2\2\20\u0085\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u0096"+
		"\3\2\2\2\30\31\5\n\6\2\31\32\7\3\2\2\32\34\3\2\2\2\33\30\3\2\2\2\34\35"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2"+
		"\2\2!\"\5\n\6\2\"#\7\3\2\2#+\3\2\2\2$%\5\b\5\2%&\7\3\2\2&+\3\2\2\2\'("+
		"\5\24\13\2()\7\3\2\2)+\3\2\2\2*!\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+\5\3\2\2"+
		"\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2"+
		"\61/\3\2\2\2\62\63\7\4\2\2\63\64\5\16\b\2\64\65\7\5\2\2\65\66\7\6\2\2"+
		"\66\67\7\7\2\2\678\5\6\4\289\7\b\2\29:\7\t\2\2:;\7\7\2\2;<\5\6\4\2<=\7"+
		"\b\2\2=\t\3\2\2\2>?\5\22\n\2?@\7#\2\2@A\5\16\b\2A\13\3\2\2\2BG\5\16\b"+
		"\2CD\7\n\2\2DF\5\16\b\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2"+
		"\2\2IG\3\2\2\2JL\3\2\2\2KB\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MN\b\b\1\2NO\7"+
		"\13\2\2OT\5\16\b\rPQ\7\f\2\2QT\5\16\b\fRT\5\20\t\2SM\3\2\2\2SP\3\2\2\2"+
		"SR\3\2\2\2Tr\3\2\2\2UV\f\13\2\2VW\t\2\2\2Wq\5\16\b\fXY\f\n\2\2YZ\t\3\2"+
		"\2Zq\5\16\b\13[\\\f\t\2\2\\]\t\4\2\2]q\5\16\b\n^_\f\b\2\2_`\t\5\2\2`q"+
		"\5\16\b\tab\f\7\2\2bc\7\30\2\2cq\5\16\b\bde\f\6\2\2ef\7\31\2\2fq\5\16"+
		"\b\7gh\f\5\2\2hi\7\6\2\2ij\5\16\b\2jk\7\t\2\2kl\5\16\b\6lq\3\2\2\2mn\f"+
		"\4\2\2no\7\32\2\2oq\5\16\b\5pU\3\2\2\2pX\3\2\2\2p[\3\2\2\2p^\3\2\2\2p"+
		"a\3\2\2\2pd\3\2\2\2pg\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"s\17\3\2\2\2tr\3\2\2\2uv\7\4\2\2vw\5\16\b\2wx\7\5\2\2x\u0086\3\2\2\2y"+
		"\u0086\5\22\n\2z\u0086\7\37\2\2{\u0086\7 \2\2|\u0086\7\35\2\2}\u0086\7"+
		"\36\2\2~\u0086\7\36\2\2\177\u0086\5\26\f\2\u0080\u0081\7\33\2\2\u0081"+
		"\u0082\5\f\7\2\u0082\u0083\7\34\2\2\u0083\u0086\3\2\2\2\u0084\u0086\5"+
		"\24\13\2\u0085u\3\2\2\2\u0085y\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085"+
		"|\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\21\3\2\2\2\u0087\u0090\7!\2\2\u0088"+
		"\u008b\7!\2\2\u0089\u008a\7\32\2\2\u008a\u008c\7!\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u0090\23\3\2\2"+
		"\2\u0091\u0092\7!\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\f\7\2\u0094\u0095"+
		"\7\5\2\2\u0095\25\3\2\2\2\u0096\u0097\7\4\2\2\u0097\u0098\5\f\7\2\u0098"+
		"\u0099\7\5\2\2\u0099\u009a\7\"\2\2\u009a\u009b\7\7\2\2\u009b\u009c\5\6"+
		"\4\2\u009c\u009d\7\b\2\2\u009d\27\3\2\2\2\r\35*/GKSpr\u0085\u008d\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}