// Generated from d:\Projects\Javascript\Thyme\js\lib\grammar\tmp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tmpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, L_PAREN=19, R_PAREN=20, L_BRACKET=21, R_BRACKET=22, COLON=23, 
		IMPORTAR=24, LISTA=25, ESCOLHA=26, OUTROCASO=27, CASO=28, NOVO=29, DECLARAR=30, 
		ACESSAR=31, ESTE=32, ERRO=33, ESPERAR=34, ENCERRAR=35, INTEIRO_ALEATORIO=36, 
		REAL_ALEATORIO=37, TEXTO_ALEATORIO=38, LOGICO_ALEATORIO=39, PARA=40, PARAR=41, 
		ENQUANTO=42, RETORNAR=43, PROCEDIMENTO=44, SE=45, SENAO=46, PONTOEVIRGULA=47, 
		RECEBE=48, INCREMENTAR=49, DECREMENTAR=50, ADICIONAR=51, DIMINUIR=52, 
		MULTIPLICAR=53, DIVIDIR=54, MAIS=55, MENOS=56, VEZES=57, DIVISAO=58, MODULO=59, 
		POTENCIA=60, MAIOR_QUE=61, MAIOR_OU_IGUAL=62, MENOR_QUE=63, MENOR_OU_IGUAL=64, 
		IGUAL=65, DIFERENTE=66, NAO=67, E=68, OU=69, TEXTO=70, REAL=71, INTEIRO=72, 
		TIPO_TEXTO=73, TIPO_INTEIRO=74, TIPO_REAL=75, TIPO_LOGICO=76, TIPO_OBJETO=77, 
		VERDADEIRO=78, FALSO=79, NULO=80, ID=81, COMENTARIO=82, WS=83;
	public static final int
		RULE_program = 0, RULE_object_oriented_program = 1, RULE_procedural_program = 2, 
		RULE_include = 3, RULE_codeBlock = 4, RULE_statement = 5, RULE_constructorDeclaration = 6, 
		RULE_memberDeclaration = 7, RULE_modifier = 8, RULE_modifierMemberDeclaration = 9, 
		RULE_mainMethod = 10, RULE_mainClassDefinition = 11, RULE_classDefinition = 12, 
		RULE_functionCall = 13, RULE_retornarStatement = 14, RULE_customFunctionDeclaration = 15, 
		RULE_customProcedureDeclaration = 16, RULE_customMethodCall = 17, RULE_case = 18, 
		RULE_defaultCase = 19, RULE_escolhaCaso = 20, RULE_seStmt = 21, RULE_se = 22, 
		RULE_senaoSe = 23, RULE_senao = 24, RULE_parar = 25, RULE_enquanto = 26, 
		RULE_para = 27, RULE_dataType = 28, RULE_varDeclarationPart = 29, RULE_multipleVarDeclaration = 30, 
		RULE_singleVarDeclaration = 31, RULE_varDeclaration = 32, RULE_multipleDeclaration = 33, 
		RULE_varAssignment = 34, RULE_listaClear = 35, RULE_listaAdd = 36, RULE_listaInsert = 37, 
		RULE_listaRemoveByIndex = 38, RULE_listaRemoveByReference = 39, RULE_arrayGet = 40, 
		RULE_memberAcessorPart = 41, RULE_memberAccessor = 42, RULE_expressionList = 43, 
		RULE_expression = 44, RULE_term = 45;
	public static final String[] ruleNames = {
		"program", "object_oriented_program", "procedural_program", "include", 
		"codeBlock", "statement", "constructorDeclaration", "memberDeclaration", 
		"modifier", "modifierMemberDeclaration", "mainMethod", "mainClassDefinition", 
		"classDefinition", "functionCall", "retornarStatement", "customFunctionDeclaration", 
		"customProcedureDeclaration", "customMethodCall", "case", "defaultCase", 
		"escolhaCaso", "seStmt", "se", "senaoSe", "senao", "parar", "enquanto", 
		"para", "dataType", "varDeclarationPart", "multipleVarDeclaration", "singleVarDeclaration", 
		"varDeclaration", "multipleDeclaration", "varAssignment", "listaClear", 
		"listaAdd", "listaInsert", "listaRemoveByIndex", "listaRemoveByReference", 
		"arrayGet", "memberAcessorPart", "memberAccessor", "expressionList", "expression", 
		"term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'acessivel'", "'inacessivel'", "'principal'", "'classe'", "'Principal'", 
		"'['", "']'", "','", "'.guardar'", "'.zerar'", "'.adicionar'", "'.inserir'", 
		"'.removerPorIndice'", "'.removerPorReferencia'", "'.pegar'", "'?'", "'extrairTipo'", 
		"'.tamanho'", "'('", "')'", "'{'", "'}'", "':'", "'importar'", "'Lista'", 
		"'escolha'", "'outrocaso'", "'caso'", null, "'declarar'", "'.'", "'este'", 
		"'Sistema.erro'", "'Sistema.esperar'", "'Sistema.encerrar'", "'inteiro.aleatorio'", 
		"'decimal.aleatorio'", "'texto.aleatorio'", "'logico.aleatorio'", "'para'", 
		"'parar'", "'enquanto'", "'retornar'", "'semretorno'", "'se'", "'senao'", 
		"';'", "'='", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
		null, null, null, null, null, null, "'texto'", "'inteiro'", "'decimal'", 
		"'logico'", "'Objeto'", "'verdadeiro'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "L_PAREN", "R_PAREN", "L_BRACKET", 
		"R_BRACKET", "COLON", "IMPORTAR", "LISTA", "ESCOLHA", "OUTROCASO", "CASO", 
		"NOVO", "DECLARAR", "ACESSAR", "ESTE", "ERRO", "ESPERAR", "ENCERRAR", 
		"INTEIRO_ALEATORIO", "REAL_ALEATORIO", "TEXTO_ALEATORIO", "LOGICO_ALEATORIO", 
		"PARA", "PARAR", "ENQUANTO", "RETORNAR", "PROCEDIMENTO", "SE", "SENAO", 
		"PONTOEVIRGULA", "RECEBE", "INCREMENTAR", "DECREMENTAR", "ADICIONAR", 
		"DIMINUIR", "MULTIPLICAR", "DIVIDIR", "MAIS", "MENOS", "VEZES", "DIVISAO", 
		"MODULO", "POTENCIA", "MAIOR_QUE", "MAIOR_OU_IGUAL", "MENOR_QUE", "MENOR_OU_IGUAL", 
		"IGUAL", "DIFERENTE", "NAO", "E", "OU", "TEXTO", "REAL", "INTEIRO", "TIPO_TEXTO", 
		"TIPO_INTEIRO", "TIPO_REAL", "TIPO_LOGICO", "TIPO_OBJETO", "VERDADEIRO", 
		"FALSO", "NULO", "ID", "COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "tmp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tmpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tmpParser.EOF, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public MainClassDefinitionContext mainClassDefinition() {
			return getRuleContext(MainClassDefinitionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORTAR) {
					{
					{
					setState(92);
					include();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				classDefinition();
				setState(99);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORTAR) {
					{
					{
					setState(101);
					include();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				mainClassDefinition();
				setState(108);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORTAR) {
					{
					{
					setState(110);
					include();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				codeBlock();
				setState(117);
				match(EOF);
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

	public static class Object_oriented_programContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tmpParser.EOF, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public MainClassDefinitionContext mainClassDefinition() {
			return getRuleContext(MainClassDefinitionContext.class,0);
		}
		public Object_oriented_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_oriented_program; }
	}

	public final Object_oriented_programContext object_oriented_program() throws RecognitionException {
		Object_oriented_programContext _localctx = new Object_oriented_programContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object_oriented_program);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORTAR) {
					{
					{
					setState(121);
					include();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				classDefinition();
				setState(128);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORTAR) {
					{
					{
					setState(130);
					include();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				mainClassDefinition();
				setState(137);
				match(EOF);
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

	public static class Procedural_programContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tmpParser.EOF, 0); }
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public Procedural_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_program; }
	}

	public final Procedural_programContext procedural_program() throws RecognitionException {
		Procedural_programContext _localctx = new Procedural_programContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedural_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORTAR) {
				{
				{
				setState(141);
				include();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			codeBlock();
			setState(148);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode IMPORTAR() { return getToken(tmpParser.IMPORTAR, 0); }
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode PONTOEVIRGULA() { return getToken(tmpParser.PONTOEVIRGULA, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IMPORTAR);
			setState(151);
			match(ID);
			setState(152);
			match(PONTOEVIRGULA);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					statement();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public CustomMethodCallContext customMethodCall() {
			return getRuleContext(CustomMethodCallContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(tmpParser.PONTOEVIRGULA, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public SeStmtContext seStmt() {
			return getRuleContext(SeStmtContext.class,0);
		}
		public EscolhaCasoContext escolhaCaso() {
			return getRuleContext(EscolhaCasoContext.class,0);
		}
		public PararContext parar() {
			return getRuleContext(PararContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public RetornarStatementContext retornarStatement() {
			return getRuleContext(RetornarStatementContext.class,0);
		}
		public ListaAddContext listaAdd() {
			return getRuleContext(ListaAddContext.class,0);
		}
		public ListaInsertContext listaInsert() {
			return getRuleContext(ListaInsertContext.class,0);
		}
		public ListaRemoveByIndexContext listaRemoveByIndex() {
			return getRuleContext(ListaRemoveByIndexContext.class,0);
		}
		public ListaRemoveByReferenceContext listaRemoveByReference() {
			return getRuleContext(ListaRemoveByReferenceContext.class,0);
		}
		public CustomFunctionDeclarationContext customFunctionDeclaration() {
			return getRuleContext(CustomFunctionDeclarationContext.class,0);
		}
		public CustomProcedureDeclarationContext customProcedureDeclaration() {
			return getRuleContext(CustomProcedureDeclarationContext.class,0);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				customMethodCall();
				setState(161);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				varDeclaration();
				setState(164);
				match(PONTOEVIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				varAssignment();
				setState(167);
				match(PONTOEVIRGULA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				seStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				escolhaCaso();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				parar();
				setState(172);
				match(PONTOEVIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				enquanto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				para();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				retornarStatement();
				setState(177);
				match(PONTOEVIRGULA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				listaAdd();
				setState(180);
				match(PONTOEVIRGULA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(182);
				listaInsert();
				setState(183);
				match(PONTOEVIRGULA);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(185);
				listaRemoveByIndex();
				setState(186);
				match(PONTOEVIRGULA);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				listaRemoveByReference();
				setState(189);
				match(PONTOEVIRGULA);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(191);
				customFunctionDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(192);
				customProcedureDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(193);
				functionCall();
				setState(194);
				match(PONTOEVIRGULA);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public MultipleDeclarationContext multipleDeclaration() {
			return getRuleContext(MultipleDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__0);
			setState(199);
			match(ID);
			setState(200);
			match(L_PAREN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (LISTA - 25)) | (1L << (TIPO_TEXTO - 25)) | (1L << (TIPO_INTEIRO - 25)) | (1L << (TIPO_REAL - 25)) | (1L << (TIPO_LOGICO - 25)) | (1L << (TIPO_OBJETO - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(201);
				multipleDeclaration();
				}
			}

			setState(204);
			match(R_PAREN);
			setState(205);
			match(L_BRACKET);
			setState(206);
			codeBlock();
			setState(207);
			match(R_BRACKET);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(tmpParser.PONTOEVIRGULA, 0); }
		public CustomFunctionDeclarationContext customFunctionDeclaration() {
			return getRuleContext(CustomFunctionDeclarationContext.class,0);
		}
		public CustomProcedureDeclarationContext customProcedureDeclaration() {
			return getRuleContext(CustomProcedureDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_memberDeclaration);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				varDeclaration();
				setState(210);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				customFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				customProcedureDeclaration();
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

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class ModifierMemberDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ModifierMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierMemberDeclaration; }
	}

	public final ModifierMemberDeclarationContext modifierMemberDeclaration() throws RecognitionException {
		ModifierMemberDeclarationContext _localctx = new ModifierMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifierMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			modifier();
			setState(219);
			memberDeclaration();
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

	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(tmpParser.PROCEDIMENTO, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__0);
			setState(222);
			match(PROCEDIMENTO);
			setState(223);
			match(T__2);
			setState(224);
			match(L_PAREN);
			setState(225);
			match(R_PAREN);
			setState(226);
			match(L_BRACKET);
			setState(227);
			codeBlock();
			setState(228);
			match(R_BRACKET);
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

	public static class MainClassDefinitionContext extends ParserRuleContext {
		public TerminalNode DECLARAR() { return getToken(tmpParser.DECLARAR, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public List<ModifierMemberDeclarationContext> modifierMemberDeclaration() {
			return getRuleContexts(ModifierMemberDeclarationContext.class);
		}
		public ModifierMemberDeclarationContext modifierMemberDeclaration(int i) {
			return getRuleContext(ModifierMemberDeclarationContext.class,i);
		}
		public MainClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassDefinition; }
	}

	public final MainClassDefinitionContext mainClassDefinition() throws RecognitionException {
		MainClassDefinitionContext _localctx = new MainClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainClassDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DECLARAR);
			setState(231);
			match(T__3);
			setState(232);
			match(T__4);
			setState(233);
			match(L_BRACKET);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					modifierMemberDeclaration();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(240);
			mainMethod();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(241);
				modifierMemberDeclaration();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(R_BRACKET);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode DECLARAR() { return getToken(tmpParser.DECLARAR, 0); }
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public List<ModifierMemberDeclarationContext> modifierMemberDeclaration() {
			return getRuleContexts(ModifierMemberDeclarationContext.class);
		}
		public ModifierMemberDeclarationContext modifierMemberDeclaration(int i) {
			return getRuleContext(ModifierMemberDeclarationContext.class,i);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DECLARAR);
			setState(250);
			match(T__3);
			setState(251);
			match(ID);
			setState(252);
			match(L_BRACKET);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					modifierMemberDeclaration();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(259);
				constructorDeclaration();
				}
				break;
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(262);
				modifierMemberDeclaration();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(R_BRACKET);
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
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EncerrarContext extends FunctionCallContext {
		public TerminalNode ENCERRAR() { return getToken(tmpParser.ENCERRAR, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public EncerrarContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}
	public static class ErroContext extends FunctionCallContext {
		public TerminalNode ERRO() { return getToken(tmpParser.ERRO, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ErroContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}
	public static class EsperarContext extends FunctionCallContext {
		public TerminalNode ESPERAR() { return getToken(tmpParser.ESPERAR, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public EsperarContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ERRO:
				_localctx = new ErroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ERRO);
				setState(271);
				match(L_PAREN);
				setState(272);
				expression(0);
				setState(273);
				match(R_PAREN);
				}
				break;
			case ENCERRAR:
				_localctx = new EncerrarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ENCERRAR);
				setState(276);
				match(L_PAREN);
				setState(277);
				match(R_PAREN);
				}
				break;
			case ESPERAR:
				_localctx = new EsperarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(ESPERAR);
				setState(279);
				match(L_PAREN);
				setState(280);
				expression(0);
				setState(281);
				match(R_PAREN);
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

	public static class RetornarStatementContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(tmpParser.RETORNAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetornarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornarStatement; }
	}

	public final RetornarStatementContext retornarStatement() throws RecognitionException {
		RetornarStatementContext _localctx = new RetornarStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retornarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RETORNAR);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << LISTA) | (1L << NOVO) | (1L << ESTE) | (1L << ERRO) | (1L << ESPERAR) | (1L << ENCERRAR) | (1L << MENOS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NAO - 67)) | (1L << (TEXTO - 67)) | (1L << (REAL - 67)) | (1L << (INTEIRO - 67)) | (1L << (TIPO_TEXTO - 67)) | (1L << (TIPO_INTEIRO - 67)) | (1L << (TIPO_REAL - 67)) | (1L << (TIPO_LOGICO - 67)) | (1L << (TIPO_OBJETO - 67)) | (1L << (VERDADEIRO - 67)) | (1L << (FALSO - 67)) | (1L << (NULO - 67)) | (1L << (ID - 67)))) != 0)) {
				{
				setState(286);
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

	public static class CustomFunctionDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public MultipleDeclarationContext multipleDeclaration() {
			return getRuleContext(MultipleDeclarationContext.class,0);
		}
		public CustomFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customFunctionDeclaration; }
	}

	public final CustomFunctionDeclarationContext customFunctionDeclaration() throws RecognitionException {
		CustomFunctionDeclarationContext _localctx = new CustomFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_customFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			dataType(0);
			setState(290);
			match(ID);
			setState(291);
			match(L_PAREN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (LISTA - 25)) | (1L << (TIPO_TEXTO - 25)) | (1L << (TIPO_INTEIRO - 25)) | (1L << (TIPO_REAL - 25)) | (1L << (TIPO_LOGICO - 25)) | (1L << (TIPO_OBJETO - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(292);
				multipleDeclaration();
				}
			}

			setState(295);
			match(R_PAREN);
			setState(296);
			match(L_BRACKET);
			setState(297);
			codeBlock();
			setState(298);
			match(R_BRACKET);
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

	public static class CustomProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(tmpParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public MultipleDeclarationContext multipleDeclaration() {
			return getRuleContext(MultipleDeclarationContext.class,0);
		}
		public CustomProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customProcedureDeclaration; }
	}

	public final CustomProcedureDeclarationContext customProcedureDeclaration() throws RecognitionException {
		CustomProcedureDeclarationContext _localctx = new CustomProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_customProcedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(PROCEDIMENTO);
			setState(301);
			match(ID);
			setState(302);
			match(L_PAREN);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (LISTA - 25)) | (1L << (TIPO_TEXTO - 25)) | (1L << (TIPO_INTEIRO - 25)) | (1L << (TIPO_REAL - 25)) | (1L << (TIPO_LOGICO - 25)) | (1L << (TIPO_OBJETO - 25)) | (1L << (ID - 25)))) != 0)) {
				{
				setState(303);
				multipleDeclaration();
				}
			}

			setState(306);
			match(R_PAREN);
			setState(307);
			match(L_BRACKET);
			setState(308);
			codeBlock();
			setState(309);
			match(R_BRACKET);
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

	public static class CustomMethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode ACESSAR() { return getToken(tmpParser.ACESSAR, 0); }
		public CustomMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customMethodCall; }
	}

	public final CustomMethodCallContext customMethodCall() throws RecognitionException {
		CustomMethodCallContext _localctx = new CustomMethodCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_customMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(311);
				memberAccessor();
				setState(312);
				match(ACESSAR);
				}
				break;
			}
			setState(316);
			match(ID);
			setState(317);
			match(L_PAREN);
			setState(318);
			expressionList();
			setState(319);
			match(R_PAREN);
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

	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(tmpParser.CASO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(tmpParser.COLON, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PararContext parar() {
			return getRuleContext(PararContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(tmpParser.PONTOEVIRGULA, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CASO);
			setState(322);
			expression(0);
			setState(323);
			match(COLON);
			setState(324);
			codeBlock();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAR) {
				{
				setState(325);
				parar();
				setState(326);
				match(PONTOEVIRGULA);
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode OUTROCASO() { return getToken(tmpParser.OUTROCASO, 0); }
		public TerminalNode COLON() { return getToken(tmpParser.COLON, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(OUTROCASO);
			setState(331);
			match(COLON);
			setState(332);
			codeBlock();
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

	public static class EscolhaCasoContext extends ParserRuleContext {
		public TerminalNode ESCOLHA() { return getToken(tmpParser.ESCOLHA, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public List<CaseContext> case() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public EscolhaCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolhaCaso; }
	}

	public final EscolhaCasoContext escolhaCaso() throws RecognitionException {
		EscolhaCasoContext _localctx = new EscolhaCasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_escolhaCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ESCOLHA);
			setState(335);
			match(L_PAREN);
			setState(336);
			expression(0);
			setState(337);
			match(R_PAREN);
			setState(338);
			match(L_BRACKET);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(339);
				case();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTROCASO) {
				{
				setState(345);
				defaultCase();
				}
			}

			setState(348);
			match(R_BRACKET);
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

	public static class SeStmtContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public List<SenaoSeContext> senaoSe() {
			return getRuleContexts(SenaoSeContext.class);
		}
		public SenaoSeContext senaoSe(int i) {
			return getRuleContext(SenaoSeContext.class,i);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seStmt; }
	}

	public final SeStmtContext seStmt() throws RecognitionException {
		SeStmtContext _localctx = new SeStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_seStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			se();
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					senaoSe();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(357);
				senao();
				}
				break;
			}
			setState(360);
			match(R_BRACKET);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(tmpParser.SE, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SE);
			setState(363);
			match(L_PAREN);
			setState(364);
			expression(0);
			setState(365);
			match(R_PAREN);
			setState(366);
			match(L_BRACKET);
			setState(367);
			codeBlock();
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

	public static class SenaoSeContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public TerminalNode SENAO() { return getToken(tmpParser.SENAO, 0); }
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public SenaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senaoSe; }
	}

	public final SenaoSeContext senaoSe() throws RecognitionException {
		SenaoSeContext _localctx = new SenaoSeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senaoSe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(R_BRACKET);
			setState(370);
			match(SENAO);
			setState(371);
			se();
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

	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public TerminalNode SENAO() { return getToken(tmpParser.SENAO, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(R_BRACKET);
			setState(374);
			match(SENAO);
			setState(375);
			match(L_BRACKET);
			setState(376);
			codeBlock();
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

	public static class PararContext extends ParserRuleContext {
		public TerminalNode PARAR() { return getToken(tmpParser.PARAR, 0); }
		public PararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parar; }
	}

	public final PararContext parar() throws RecognitionException {
		PararContext _localctx = new PararContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(PARAR);
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

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(tmpParser.ENQUANTO, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ENQUANTO);
			setState(381);
			match(L_PAREN);
			setState(382);
			expression(0);
			setState(383);
			match(R_PAREN);
			setState(384);
			match(L_BRACKET);
			setState(385);
			codeBlock();
			setState(386);
			match(R_BRACKET);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(tmpParser.PARA, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(tmpParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(tmpParser.PONTOEVIRGULA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(PARA);
			setState(389);
			match(L_PAREN);
			setState(390);
			varDeclaration();
			setState(391);
			match(PONTOEVIRGULA);
			setState(392);
			expression(0);
			setState(393);
			match(PONTOEVIRGULA);
			setState(394);
			varAssignment();
			setState(395);
			match(R_PAREN);
			setState(396);
			match(L_BRACKET);
			setState(397);
			codeBlock();
			setState(398);
			match(R_BRACKET);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode TIPO_TEXTO() { return getToken(tmpParser.TIPO_TEXTO, 0); }
		public TerminalNode TIPO_LOGICO() { return getToken(tmpParser.TIPO_LOGICO, 0); }
		public TerminalNode TIPO_INTEIRO() { return getToken(tmpParser.TIPO_INTEIRO, 0); }
		public TerminalNode TIPO_REAL() { return getToken(tmpParser.TIPO_REAL, 0); }
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode TIPO_OBJETO() { return getToken(tmpParser.TIPO_OBJETO, 0); }
		public TerminalNode LISTA() { return getToken(tmpParser.LISTA, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		return dataType(0);
	}

	private DataTypeContext dataType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataTypeContext _localctx = new DataTypeContext(_ctx, _parentState);
		DataTypeContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_dataType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_TEXTO:
				{
				setState(401);
				match(TIPO_TEXTO);
				}
				break;
			case TIPO_LOGICO:
				{
				setState(402);
				match(TIPO_LOGICO);
				}
				break;
			case TIPO_INTEIRO:
				{
				setState(403);
				match(TIPO_INTEIRO);
				}
				break;
			case TIPO_REAL:
				{
				setState(404);
				match(TIPO_REAL);
				}
				break;
			case ID:
				{
				setState(405);
				match(ID);
				}
				break;
			case TIPO_OBJETO:
				{
				setState(406);
				match(TIPO_OBJETO);
				}
				break;
			case LISTA:
				{
				setState(407);
				match(LISTA);
				setState(408);
				match(MENOR_QUE);
				setState(409);
				dataType(0);
				setState(410);
				match(MAIOR_QUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DataTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(414);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(415);
					match(T__5);
					setState(416);
					match(T__6);
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class VarDeclarationPartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode RECEBE() { return getToken(tmpParser.RECEBE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationPart; }
	}

	public final VarDeclarationPartContext varDeclarationPart() throws RecognitionException {
		VarDeclarationPartContext _localctx = new VarDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_varDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ID);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEBE) {
				{
				setState(423);
				match(RECEBE);
				setState(424);
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

	public static class MultipleVarDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<VarDeclarationPartContext> varDeclarationPart() {
			return getRuleContexts(VarDeclarationPartContext.class);
		}
		public VarDeclarationPartContext varDeclarationPart(int i) {
			return getRuleContext(VarDeclarationPartContext.class,i);
		}
		public MultipleVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleVarDeclaration; }
	}

	public final MultipleVarDeclarationContext multipleVarDeclaration() throws RecognitionException {
		MultipleVarDeclarationContext _localctx = new MultipleVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multipleVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			dataType(0);
			setState(428);
			varDeclarationPart();
			setState(431); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				match(T__7);
				setState(430);
				varDeclarationPart();
				}
				}
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class SingleVarDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VarDeclarationPartContext varDeclarationPart() {
			return getRuleContext(VarDeclarationPartContext.class,0);
		}
		public SingleVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarDeclaration; }
	}

	public final SingleVarDeclarationContext singleVarDeclaration() throws RecognitionException {
		SingleVarDeclarationContext _localctx = new SingleVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_singleVarDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			dataType(0);
			setState(436);
			varDeclarationPart();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public MultipleVarDeclarationContext multipleVarDeclaration() {
			return getRuleContext(MultipleVarDeclarationContext.class,0);
		}
		public SingleVarDeclarationContext singleVarDeclaration() {
			return getRuleContext(SingleVarDeclarationContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varDeclaration);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				multipleVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				singleVarDeclaration();
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

	public static class MultipleDeclarationContext extends ParserRuleContext {
		public List<SingleVarDeclarationContext> singleVarDeclaration() {
			return getRuleContexts(SingleVarDeclarationContext.class);
		}
		public SingleVarDeclarationContext singleVarDeclaration(int i) {
			return getRuleContext(SingleVarDeclarationContext.class,i);
		}
		public MultipleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleDeclaration; }
	}

	public final MultipleDeclarationContext multipleDeclaration() throws RecognitionException {
		MultipleDeclarationContext _localctx = new MultipleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multipleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			singleVarDeclaration();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(443);
				match(T__7);
				setState(444);
				singleVarDeclaration();
				}
				}
				setState(449);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
	 
		public VarAssignmentContext() { }
		public void copyFrom(VarAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDividedContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode DIVIDIR() { return getToken(tmpParser.DIVIDIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDividedContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarMinusContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode DIMINUIR() { return getToken(tmpParser.DIMINUIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarMinusContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class ArraySetContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public TerminalNode RECEBE() { return getToken(tmpParser.RECEBE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySetContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class ListSetContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListSetContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarTimesContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode MULTIPLICAR() { return getToken(tmpParser.MULTIPLICAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarTimesContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarIncrementContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode INCREMENTAR() { return getToken(tmpParser.INCREMENTAR, 0); }
		public VarIncrementContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarPlusContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode ADICIONAR() { return getToken(tmpParser.ADICIONAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarPlusContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarAssignContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode RECEBE() { return getToken(tmpParser.RECEBE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class VarDecrementContext extends VarAssignmentContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode DECREMENTAR() { return getToken(tmpParser.DECREMENTAR, 0); }
		public VarDecrementContext(VarAssignmentContext ctx) { copyFrom(ctx); }
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_varAssignment);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ArraySetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				memberAccessor();
				setState(451);
				arrayGet();
				setState(452);
				match(RECEBE);
				setState(453);
				expression(0);
				}
				break;
			case 2:
				_localctx = new VarAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				memberAccessor();
				setState(456);
				match(RECEBE);
				setState(457);
				expression(0);
				}
				break;
			case 3:
				_localctx = new ListSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				memberAccessor();
				setState(460);
				match(T__8);
				setState(461);
				match(L_PAREN);
				setState(462);
				expression(0);
				setState(463);
				match(T__7);
				setState(464);
				expression(0);
				setState(465);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new VarIncrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				memberAccessor();
				setState(468);
				match(INCREMENTAR);
				}
				break;
			case 5:
				_localctx = new VarDecrementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				memberAccessor();
				setState(471);
				match(DECREMENTAR);
				}
				break;
			case 6:
				_localctx = new VarPlusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				memberAccessor();
				setState(474);
				match(ADICIONAR);
				setState(475);
				expression(0);
				}
				break;
			case 7:
				_localctx = new VarMinusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				memberAccessor();
				setState(478);
				match(DIMINUIR);
				setState(479);
				expression(0);
				}
				break;
			case 8:
				_localctx = new VarTimesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(481);
				memberAccessor();
				setState(482);
				match(MULTIPLICAR);
				setState(483);
				expression(0);
				}
				break;
			case 9:
				_localctx = new VarDividedContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(485);
				memberAccessor();
				setState(486);
				match(DIVIDIR);
				setState(487);
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

	public static class ListaClearContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListaClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaClear; }
	}

	public final ListaClearContext listaClear() throws RecognitionException {
		ListaClearContext _localctx = new ListaClearContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_listaClear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			memberAccessor();
			setState(492);
			match(T__9);
			setState(493);
			match(L_PAREN);
			setState(494);
			match(R_PAREN);
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

	public static class ListaAddContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListaAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAdd; }
	}

	public final ListaAddContext listaAdd() throws RecognitionException {
		ListaAddContext _localctx = new ListaAddContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listaAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			memberAccessor();
			setState(497);
			match(T__10);
			setState(498);
			match(L_PAREN);
			setState(499);
			expression(0);
			setState(500);
			match(R_PAREN);
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

	public static class ListaInsertContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListaInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaInsert; }
	}

	public final ListaInsertContext listaInsert() throws RecognitionException {
		ListaInsertContext _localctx = new ListaInsertContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listaInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			memberAccessor();
			setState(503);
			match(T__11);
			setState(504);
			match(L_PAREN);
			setState(505);
			expression(0);
			setState(506);
			match(T__7);
			setState(507);
			expression(0);
			setState(508);
			match(R_PAREN);
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

	public static class ListaRemoveByIndexContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListaRemoveByIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaRemoveByIndex; }
	}

	public final ListaRemoveByIndexContext listaRemoveByIndex() throws RecognitionException {
		ListaRemoveByIndexContext _localctx = new ListaRemoveByIndexContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listaRemoveByIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			memberAccessor();
			setState(511);
			match(T__12);
			setState(512);
			match(L_PAREN);
			setState(513);
			expression(0);
			setState(514);
			match(R_PAREN);
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

	public static class ListaRemoveByReferenceContext extends ParserRuleContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListaRemoveByReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaRemoveByReference; }
	}

	public final ListaRemoveByReferenceContext listaRemoveByReference() throws RecognitionException {
		ListaRemoveByReferenceContext _localctx = new ListaRemoveByReferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaRemoveByReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			memberAccessor();
			setState(517);
			match(T__13);
			setState(518);
			match(L_PAREN);
			setState(519);
			expression(0);
			setState(520);
			match(R_PAREN);
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

	public static class ArrayGetContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGet; }
	}

	public final ArrayGetContext arrayGet() throws RecognitionException {
		ArrayGetContext _localctx = new ArrayGetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__5);
			setState(523);
			expression(0);
			setState(524);
			match(T__6);
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

	public static class MemberAcessorPartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode ESTE() { return getToken(tmpParser.ESTE, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ArrayGetContext arrayGet() {
			return getRuleContext(ArrayGetContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemberAcessorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAcessorPart; }
	}

	public final MemberAcessorPartContext memberAcessorPart() throws RecognitionException {
		MemberAcessorPartContext _localctx = new MemberAcessorPartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_memberAcessorPart);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(ESTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(ID);
				setState(529);
				match(T__14);
				setState(530);
				match(L_PAREN);
				setState(531);
				expression(0);
				setState(532);
				match(R_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				match(ID);
				setState(535);
				arrayGet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				match(ID);
				setState(537);
				match(L_PAREN);
				setState(538);
				expressionList();
				setState(539);
				match(R_PAREN);
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
		public List<MemberAcessorPartContext> memberAcessorPart() {
			return getRuleContexts(MemberAcessorPartContext.class);
		}
		public MemberAcessorPartContext memberAcessorPart(int i) {
			return getRuleContext(MemberAcessorPartContext.class,i);
		}
		public List<TerminalNode> ACESSAR() { return getTokens(tmpParser.ACESSAR); }
		public TerminalNode ACESSAR(int i) {
			return getToken(tmpParser.ACESSAR, i);
		}
		public MemberAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessor; }
	}

	public final MemberAccessorContext memberAccessor() throws RecognitionException {
		MemberAccessorContext _localctx = new MemberAccessorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_memberAccessor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			memberAcessorPart();
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(544);
					match(ACESSAR);
					setState(545);
					memberAcessorPart();
					}
					} 
				}
				setState(550);
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
		enterRule(_localctx, 86, RULE_expressionList);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case L_PAREN:
			case L_BRACKET:
			case LISTA:
			case NOVO:
			case ESTE:
			case ERRO:
			case ESPERAR:
			case ENCERRAR:
			case MENOS:
			case NAO:
			case TEXTO:
			case REAL:
			case INTEIRO:
			case TIPO_TEXTO:
			case TIPO_INTEIRO:
			case TIPO_REAL:
			case TIPO_LOGICO:
			case TIPO_OBJETO:
			case VERDADEIRO:
			case FALSO:
			case NULO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				expression(0);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(552);
					match(T__7);
					setState(553);
					expression(0);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case R_PAREN:
			case R_BRACKET:
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
		public TerminalNode MENOS() { return getToken(tmpParser.MENOS, 0); }
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
		public TerminalNode MAIS() { return getToken(tmpParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(tmpParser.MENOS, 0); }
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
		public TerminalNode MAIOR_QUE() { return getToken(tmpParser.MAIOR_QUE, 0); }
		public TerminalNode MAIOR_OU_IGUAL() { return getToken(tmpParser.MAIOR_OU_IGUAL, 0); }
		public TerminalNode MENOR_QUE() { return getToken(tmpParser.MENOR_QUE, 0); }
		public TerminalNode MENOR_OU_IGUAL() { return getToken(tmpParser.MENOR_OU_IGUAL, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(tmpParser.COLON, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeOfExpressionContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public TypeOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode E() { return getToken(tmpParser.E, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NAO() { return getToken(tmpParser.NAO, 0); }
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
		public TerminalNode IGUAL() { return getToken(tmpParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(tmpParser.DIFERENTE, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OU() { return getToken(tmpParser.OU, 0); }
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
		public TerminalNode VEZES() { return getToken(tmpParser.VEZES, 0); }
		public TerminalNode DIVISAO() { return getToken(tmpParser.DIVISAO, 0); }
		public TerminalNode MODULO() { return getToken(tmpParser.MODULO, 0); }
		public TerminalNode POTENCIA() { return getToken(tmpParser.POTENCIA, 0); }
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new NegateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(563);
				match(MENOS);
				setState(564);
				expression(11);
				}
				break;
			case NAO:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(565);
				match(NAO);
				setState(566);
				expression(10);
				}
				break;
			case T__16:
				{
				_localctx = new TypeOfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				match(T__16);
				setState(568);
				match(L_PAREN);
				setState(569);
				expression(0);
				setState(570);
				match(R_PAREN);
				}
				break;
			case L_PAREN:
			case L_BRACKET:
			case LISTA:
			case NOVO:
			case ESTE:
			case ERRO:
			case ESPERAR:
			case ENCERRAR:
			case TEXTO:
			case REAL:
			case INTEIRO:
			case TIPO_TEXTO:
			case TIPO_INTEIRO:
			case TIPO_REAL:
			case TIPO_LOGICO:
			case TIPO_OBJETO:
			case VERDADEIRO:
			case FALSO:
			case NULO:
			case ID:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572);
				term(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(599);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModPowExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(575);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(576);
						((MulDivModPowExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VEZES) | (1L << DIVISAO) | (1L << MODULO) | (1L << POTENCIA))) != 0)) ) {
							((MulDivModPowExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(577);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(578);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(579);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAIS || _la==MENOS) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(580);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(581);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(582);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (MAIOR_QUE - 61)) | (1L << (MAIOR_OU_IGUAL - 61)) | (1L << (MENOR_QUE - 61)) | (1L << (MENOR_OU_IGUAL - 61)))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(583);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(584);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(585);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFERENTE) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(586);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(587);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(588);
						match(E);
						setState(589);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(590);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(591);
						match(OU);
						setState(592);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(593);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(594);
						match(T__15);
						setState(595);
						expression(0);
						setState(596);
						match(COLON);
						setState(597);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class ArrayInstantiateContext extends TermContext {
		public TerminalNode NOVO() { return getToken(tmpParser.NOVO, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInstantiateContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class FloatLiteralContext extends TermContext {
		public TerminalNode REAL() { return getToken(tmpParser.REAL, 0); }
		public FloatLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class LengthExpressionContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LengthExpressionContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralTrueContext extends TermContext {
		public TerminalNode VERDADEIRO() { return getToken(tmpParser.VERDADEIRO, 0); }
		public BooleanLiteralTrueContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class DataTypeLiteralContext extends TermContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ListInstantiateContext extends TermContext {
		public TerminalNode NOVO() { return getToken(tmpParser.NOVO, 0); }
		public TerminalNode LISTA() { return getToken(tmpParser.LISTA, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ListInstantiateContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAcessorTermContext extends TermContext {
		public MemberAccessorContext memberAccessor() {
			return getRuleContext(MemberAccessorContext.class,0);
		}
		public MemberAcessorTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralFalseContext extends TermContext {
		public TerminalNode FALSO() { return getToken(tmpParser.FALSO, 0); }
		public BooleanLiteralFalseContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ListLiteralContext extends TermContext {
		public TerminalNode L_BRACKET() { return getToken(tmpParser.L_BRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(tmpParser.R_BRACKET, 0); }
		public ListLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ClassInstantiateContext extends TermContext {
		public TerminalNode NOVO() { return getToken(tmpParser.NOVO, 0); }
		public TerminalNode ID() { return getToken(tmpParser.ID, 0); }
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ClassInstantiateContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends TermContext {
		public TerminalNode TEXTO() { return getToken(tmpParser.TEXTO, 0); }
		public StringLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class TypeCastContext extends TermContext {
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallTermContext extends TermContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallTermContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesysExpressionContext extends TermContext {
		public TerminalNode L_PAREN() { return getToken(tmpParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(tmpParser.R_PAREN, 0); }
		public ParenthesysExpressionContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class NullLiteralContext extends TermContext {
		public TerminalNode NULO() { return getToken(tmpParser.NULO, 0); }
		public NullLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends TermContext {
		public TerminalNode INTEIRO() { return getToken(tmpParser.INTEIRO, 0); }
		public IntegerLiteralContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesysExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(605);
				match(L_PAREN);
				setState(606);
				expression(0);
				setState(607);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new MemberAcessorTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(609);
				memberAccessor();
				}
				break;
			case 3:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(610);
				match(INTEIRO);
				}
				break;
			case 4:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(611);
				match(REAL);
				}
				break;
			case 5:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				match(TEXTO);
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				match(VERDADEIRO);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLiteralFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(614);
				match(FALSO);
				}
				break;
			case 8:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				match(NULO);
				}
				break;
			case 9:
				{
				_localctx = new ListLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(616);
				match(L_BRACKET);
				setState(617);
				expressionList();
				setState(618);
				match(R_BRACKET);
				}
				break;
			case 10:
				{
				_localctx = new TypeCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				match(L_PAREN);
				setState(621);
				dataType(0);
				setState(622);
				match(R_PAREN);
				setState(623);
				expression(0);
				}
				break;
			case 11:
				{
				_localctx = new ClassInstantiateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				match(NOVO);
				setState(626);
				match(ID);
				setState(627);
				match(L_PAREN);
				setState(628);
				expressionList();
				setState(629);
				match(R_PAREN);
				}
				break;
			case 12:
				{
				_localctx = new ListInstantiateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(NOVO);
				setState(632);
				match(LISTA);
				setState(633);
				match(MENOR_QUE);
				setState(634);
				dataType(0);
				setState(635);
				match(MAIOR_QUE);
				setState(636);
				match(L_PAREN);
				setState(637);
				match(R_PAREN);
				}
				break;
			case 13:
				{
				_localctx = new ArrayInstantiateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				match(NOVO);
				setState(640);
				dataType(0);
				setState(641);
				match(T__5);
				setState(642);
				expression(0);
				setState(643);
				match(T__6);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(645);
				functionCall();
				}
				break;
			case 15:
				{
				_localctx = new DataTypeLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				dataType(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LengthExpressionContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(649);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(650);
					match(T__17);
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 44:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 45:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0293\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\3\2\7\2"+
		"i\n\2\f\2\16\2l\13\2\3\2\3\2\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3\2\3\2\3"+
		"\2\5\2z\n\2\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3\3\7\3\u0086"+
		"\n\3\f\3\16\3\u0089\13\3\3\3\3\3\3\3\5\3\u008e\n\3\3\4\7\4\u0091\n\4\f"+
		"\4\16\4\u0094\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\7\6\u009e\n\6\f\6\16"+
		"\6\u00a1\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c7\n\7\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00ee\n\r"+
		"\f\r\16\r\u00f1\13\r\3\r\3\r\7\r\u00f5\n\r\f\r\16\r\u00f8\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13\16\3\16"+
		"\5\16\u0107\n\16\3\16\7\16\u010a\n\16\f\16\16\16\u010d\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u011e\n\17\3\20\3\20\5\20\u0122\n\20\3\21\3\21\3\21\3\21\5\21\u0128\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0133\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u013d\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u014b\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0157\n\26\f\26\16\26\u015a\13"+
		"\26\3\26\5\26\u015d\n\26\3\26\3\26\3\27\3\27\7\27\u0163\n\27\f\27\16\27"+
		"\u0166\13\27\3\27\5\27\u0169\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u019f\n\36\3\36\3\36\3\36\7\36\u01a4\n\36\f\36\16\36"+
		"\u01a7\13\36\3\37\3\37\3\37\5\37\u01ac\n\37\3 \3 \3 \3 \6 \u01b2\n \r"+
		" \16 \u01b3\3!\3!\3!\3\"\3\"\5\"\u01bb\n\"\3#\3#\3#\7#\u01c0\n#\f#\16"+
		"#\u01c3\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ec\n"+
		"$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u0220\n+\3,\3,\3,\7,\u0225\n,\f,\16,\u0228\13"+
		",\3-\3-\3-\7-\u022d\n-\f-\16-\u0230\13-\3-\5-\u0233\n-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u0240\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u025a\n.\f.\16.\u025d\13.\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u028a\n/\3/\3"+
		"/\7/\u028e\n/\f/\16/\u0291\13/\3/\2\5:Z\\\60\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\7\3\2\3\4\3\2"+
		";>\3\29:\3\2?B\3\2CD\2\u02c3\2y\3\2\2\2\4\u008d\3\2\2\2\6\u0092\3\2\2"+
		"\2\b\u0098\3\2\2\2\n\u009f\3\2\2\2\f\u00c6\3\2\2\2\16\u00c8\3\2\2\2\20"+
		"\u00d8\3\2\2\2\22\u00da\3\2\2\2\24\u00dc\3\2\2\2\26\u00df\3\2\2\2\30\u00e8"+
		"\3\2\2\2\32\u00fb\3\2\2\2\34\u011d\3\2\2\2\36\u011f\3\2\2\2 \u0123\3\2"+
		"\2\2\"\u012e\3\2\2\2$\u013c\3\2\2\2&\u0143\3\2\2\2(\u014c\3\2\2\2*\u0150"+
		"\3\2\2\2,\u0160\3\2\2\2.\u016c\3\2\2\2\60\u0173\3\2\2\2\62\u0177\3\2\2"+
		"\2\64\u017c\3\2\2\2\66\u017e\3\2\2\28\u0186\3\2\2\2:\u019e\3\2\2\2<\u01a8"+
		"\3\2\2\2>\u01ad\3\2\2\2@\u01b5\3\2\2\2B\u01ba\3\2\2\2D\u01bc\3\2\2\2F"+
		"\u01eb\3\2\2\2H\u01ed\3\2\2\2J\u01f2\3\2\2\2L\u01f8\3\2\2\2N\u0200\3\2"+
		"\2\2P\u0206\3\2\2\2R\u020c\3\2\2\2T\u021f\3\2\2\2V\u0221\3\2\2\2X\u0232"+
		"\3\2\2\2Z\u023f\3\2\2\2\\\u0289\3\2\2\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\32\16\2ef\7\2\2\3fz\3\2\2"+
		"\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2"+
		"\2mn\5\30\r\2no\7\2\2\3oz\3\2\2\2pr\5\b\5\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\n\6\2wx\7\2\2\3xz\3\2\2\2ya\3\2"+
		"\2\2yj\3\2\2\2ys\3\2\2\2z\3\3\2\2\2{}\5\b\5\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5"+
		"\32\16\2\u0082\u0083\7\2\2\3\u0083\u008e\3\2\2\2\u0084\u0086\5\b\5\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\30\r\2\u008b"+
		"\u008c\7\2\2\3\u008c\u008e\3\2\2\2\u008d~\3\2\2\2\u008d\u0087\3\2\2\2"+
		"\u008e\5\3\2\2\2\u008f\u0091\5\b\5\2\u0090\u008f\3\2\2\2\u0091\u0094\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\5\n\6\2\u0096\u0097\7\2\2\3\u0097\7\3\2\2\2"+
		"\u0098\u0099\7\32\2\2\u0099\u009a\7S\2\2\u009a\u009b\7\61\2\2\u009b\t"+
		"\3\2\2\2\u009c\u009e\5\f\7\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\61\2\2\u00a4\u00c7\3\2\2\2\u00a5"+
		"\u00a6\5B\"\2\u00a6\u00a7\7\61\2\2\u00a7\u00c7\3\2\2\2\u00a8\u00a9\5F"+
		"$\2\u00a9\u00aa\7\61\2\2\u00aa\u00c7\3\2\2\2\u00ab\u00c7\5,\27\2\u00ac"+
		"\u00c7\5*\26\2\u00ad\u00ae\5\64\33\2\u00ae\u00af\7\61\2\2\u00af\u00c7"+
		"\3\2\2\2\u00b0\u00c7\5\66\34\2\u00b1\u00c7\58\35\2\u00b2\u00b3\5\36\20"+
		"\2\u00b3\u00b4\7\61\2\2\u00b4\u00c7\3\2\2\2\u00b5\u00b6\5J&\2\u00b6\u00b7"+
		"\7\61\2\2\u00b7\u00c7\3\2\2\2\u00b8\u00b9\5L\'\2\u00b9\u00ba\7\61\2\2"+
		"\u00ba\u00c7\3\2\2\2\u00bb\u00bc\5N(\2\u00bc\u00bd\7\61\2\2\u00bd\u00c7"+
		"\3\2\2\2\u00be\u00bf\5P)\2\u00bf\u00c0\7\61\2\2\u00c0\u00c7\3\2\2\2\u00c1"+
		"\u00c7\5 \21\2\u00c2\u00c7\5\"\22\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5"+
		"\7\61\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00a2\3\2\2\2\u00c6\u00a5\3\2\2\2"+
		"\u00c6\u00a8\3\2\2\2\u00c6\u00ab\3\2\2\2\u00c6\u00ac\3\2\2\2\u00c6\u00ad"+
		"\3\2\2\2\u00c6\u00b0\3\2\2\2\u00c6\u00b1\3\2\2\2\u00c6\u00b2\3\2\2\2\u00c6"+
		"\u00b5\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00be\3\2"+
		"\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7"+
		"\r\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\7S\2\2\u00ca\u00cc\7\25\2\2"+
		"\u00cb\u00cd\5D#\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d1\5\n\6\2"+
		"\u00d1\u00d2\7\30\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\5B\"\2\u00d4\u00d5"+
		"\7\61\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d9\5 \21\2\u00d7\u00d9\5\"\22\2"+
		"\u00d8\u00d3\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\21"+
		"\3\2\2\2\u00da\u00db\t\2\2\2\u00db\23\3\2\2\2\u00dc\u00dd\5\22\n\2\u00dd"+
		"\u00de\5\20\t\2\u00de\25\3\2\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\7.\2"+
		"\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\7\26\2\2\u00e4"+
		"\u00e5\7\27\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\7\30\2\2\u00e7\27\3\2"+
		"\2\2\u00e8\u00e9\7 \2\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ef\7\27\2\2\u00ec\u00ee\5\24\13\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f6\5\26\f\2\u00f3\u00f5\5\24\13\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\31\3\2\2"+
		"\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7S\2\2\u00fe\u0102"+
		"\7\27\2\2\u00ff\u0101\5\24\13\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0107\5\16\b\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u010b\3\2\2\2\u0108\u010a\5\24\13\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7\30\2\2\u010f\33\3\2\2\2\u0110\u0111\7#\2"+
		"\2\u0111\u0112\7\25\2\2\u0112\u0113\5Z.\2\u0113\u0114\7\26\2\2\u0114\u011e"+
		"\3\2\2\2\u0115\u0116\7%\2\2\u0116\u0117\7\25\2\2\u0117\u011e\7\26\2\2"+
		"\u0118\u0119\7$\2\2\u0119\u011a\7\25\2\2\u011a\u011b\5Z.\2\u011b\u011c"+
		"\7\26\2\2\u011c\u011e\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0115\3\2\2\2"+
		"\u011d\u0118\3\2\2\2\u011e\35\3\2\2\2\u011f\u0121\7-\2\2\u0120\u0122\5"+
		"Z.\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123\u0124"+
		"\5:\36\2\u0124\u0125\7S\2\2\u0125\u0127\7\25\2\2\u0126\u0128\5D#\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\26"+
		"\2\2\u012a\u012b\7\27\2\2\u012b\u012c\5\n\6\2\u012c\u012d\7\30\2\2\u012d"+
		"!\3\2\2\2\u012e\u012f\7.\2\2\u012f\u0130\7S\2\2\u0130\u0132\7\25\2\2\u0131"+
		"\u0133\5D#\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134\u0135\7\26\2\2\u0135\u0136\7\27\2\2\u0136\u0137\5\n\6\2\u0137"+
		"\u0138\7\30\2\2\u0138#\3\2\2\2\u0139\u013a\5V,\2\u013a\u013b\7!\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\7S\2\2\u013f\u0140\7\25\2\2\u0140\u0141\5X-\2\u0141\u0142"+
		"\7\26\2\2\u0142%\3\2\2\2\u0143\u0144\7\36\2\2\u0144\u0145\5Z.\2\u0145"+
		"\u0146\7\31\2\2\u0146\u014a\5\n\6\2\u0147\u0148\5\64\33\2\u0148\u0149"+
		"\7\61\2\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\'\3\2\2\2\u014c\u014d\7\35\2\2\u014d\u014e\7\31\2\2\u014e\u014f"+
		"\5\n\6\2\u014f)\3\2\2\2\u0150\u0151\7\34\2\2\u0151\u0152\7\25\2\2\u0152"+
		"\u0153\5Z.\2\u0153\u0154\7\26\2\2\u0154\u0158\7\27\2\2\u0155\u0157\5&"+
		"\24\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\5("+
		"\25\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\7\30\2\2\u015f+\3\2\2\2\u0160\u0164\5.\30\2\u0161\u0163\5\60\31"+
		"\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5\62\32\2"+
		"\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\7\30\2\2\u016b-\3\2\2\2\u016c\u016d\7/\2\2\u016d\u016e\7\25\2\2\u016e"+
		"\u016f\5Z.\2\u016f\u0170\7\26\2\2\u0170\u0171\7\27\2\2\u0171\u0172\5\n"+
		"\6\2\u0172/\3\2\2\2\u0173\u0174\7\30\2\2\u0174\u0175\7\60\2\2\u0175\u0176"+
		"\5.\30\2\u0176\61\3\2\2\2\u0177\u0178\7\30\2\2\u0178\u0179\7\60\2\2\u0179"+
		"\u017a\7\27\2\2\u017a\u017b\5\n\6\2\u017b\63\3\2\2\2\u017c\u017d\7+\2"+
		"\2\u017d\65\3\2\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\25\2\2\u0180\u0181"+
		"\5Z.\2\u0181\u0182\7\26\2\2\u0182\u0183\7\27\2\2\u0183\u0184\5\n\6\2\u0184"+
		"\u0185\7\30\2\2\u0185\67\3\2\2\2\u0186\u0187\7*\2\2\u0187\u0188\7\25\2"+
		"\2\u0188\u0189\5B\"\2\u0189\u018a\7\61\2\2\u018a\u018b\5Z.\2\u018b\u018c"+
		"\7\61\2\2\u018c\u018d\5F$\2\u018d\u018e\7\26\2\2\u018e\u018f\7\27\2\2"+
		"\u018f\u0190\5\n\6\2\u0190\u0191\7\30\2\2\u01919\3\2\2\2\u0192\u0193\b"+
		"\36\1\2\u0193\u019f\7K\2\2\u0194\u019f\7N\2\2\u0195\u019f\7L\2\2\u0196"+
		"\u019f\7M\2\2\u0197\u019f\7S\2\2\u0198\u019f\7O\2\2\u0199\u019a\7\33\2"+
		"\2\u019a\u019b\7A\2\2\u019b\u019c\5:\36\2\u019c\u019d\7?\2\2\u019d\u019f"+
		"\3\2\2\2\u019e\u0192\3\2\2\2\u019e\u0194\3\2\2\2\u019e\u0195\3\2\2\2\u019e"+
		"\u0196\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u0199\3\2"+
		"\2\2\u019f\u01a5\3\2\2\2\u01a0\u01a1\f\3\2\2\u01a1\u01a2\7\b\2\2\u01a2"+
		"\u01a4\7\t\2\2\u01a3\u01a0\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6;\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab"+
		"\7S\2\2\u01a9\u01aa\7\62\2\2\u01aa\u01ac\5Z.\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac=\3\2\2\2\u01ad\u01ae\5:\36\2\u01ae\u01b1\5<\37\2"+
		"\u01af\u01b0\7\n\2\2\u01b0\u01b2\5<\37\2\u01b1\u01af\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4?\3\2\2\2\u01b5"+
		"\u01b6\5:\36\2\u01b6\u01b7\5<\37\2\u01b7A\3\2\2\2\u01b8\u01bb\5> \2\u01b9"+
		"\u01bb\5@!\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbC\3\2\2\2\u01bc"+
		"\u01c1\5@!\2\u01bd\u01be\7\n\2\2\u01be\u01c0\5@!\2\u01bf\u01bd\3\2\2\2"+
		"\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2E\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\5V,\2\u01c5\u01c6\5R*\2\u01c6\u01c7"+
		"\7\62\2\2\u01c7\u01c8\5Z.\2\u01c8\u01ec\3\2\2\2\u01c9\u01ca\5V,\2\u01ca"+
		"\u01cb\7\62\2\2\u01cb\u01cc\5Z.\2\u01cc\u01ec\3\2\2\2\u01cd\u01ce\5V,"+
		"\2\u01ce\u01cf\7\13\2\2\u01cf\u01d0\7\25\2\2\u01d0\u01d1\5Z.\2\u01d1\u01d2"+
		"\7\n\2\2\u01d2\u01d3\5Z.\2\u01d3\u01d4\7\26\2\2\u01d4\u01ec\3\2\2\2\u01d5"+
		"\u01d6\5V,\2\u01d6\u01d7\7\63\2\2\u01d7\u01ec\3\2\2\2\u01d8\u01d9\5V,"+
		"\2\u01d9\u01da\7\64\2\2\u01da\u01ec\3\2\2\2\u01db\u01dc\5V,\2\u01dc\u01dd"+
		"\7\65\2\2\u01dd\u01de\5Z.\2\u01de\u01ec\3\2\2\2\u01df\u01e0\5V,\2\u01e0"+
		"\u01e1\7\66\2\2\u01e1\u01e2\5Z.\2\u01e2\u01ec\3\2\2\2\u01e3\u01e4\5V,"+
		"\2\u01e4\u01e5\7\67\2\2\u01e5\u01e6\5Z.\2\u01e6\u01ec\3\2\2\2\u01e7\u01e8"+
		"\5V,\2\u01e8\u01e9\78\2\2\u01e9\u01ea\5Z.\2\u01ea\u01ec\3\2\2\2\u01eb"+
		"\u01c4\3\2\2\2\u01eb\u01c9\3\2\2\2\u01eb\u01cd\3\2\2\2\u01eb\u01d5\3\2"+
		"\2\2\u01eb\u01d8\3\2\2\2\u01eb\u01db\3\2\2\2\u01eb\u01df\3\2\2\2\u01eb"+
		"\u01e3\3\2\2\2\u01eb\u01e7\3\2\2\2\u01ecG\3\2\2\2\u01ed\u01ee\5V,\2\u01ee"+
		"\u01ef\7\f\2\2\u01ef\u01f0\7\25\2\2\u01f0\u01f1\7\26\2\2\u01f1I\3\2\2"+
		"\2\u01f2\u01f3\5V,\2\u01f3\u01f4\7\r\2\2\u01f4\u01f5\7\25\2\2\u01f5\u01f6"+
		"\5Z.\2\u01f6\u01f7\7\26\2\2\u01f7K\3\2\2\2\u01f8\u01f9\5V,\2\u01f9\u01fa"+
		"\7\16\2\2\u01fa\u01fb\7\25\2\2\u01fb\u01fc\5Z.\2\u01fc\u01fd\7\n\2\2\u01fd"+
		"\u01fe\5Z.\2\u01fe\u01ff\7\26\2\2\u01ffM\3\2\2\2\u0200\u0201\5V,\2\u0201"+
		"\u0202\7\17\2\2\u0202\u0203\7\25\2\2\u0203\u0204\5Z.\2\u0204\u0205\7\26"+
		"\2\2\u0205O\3\2\2\2\u0206\u0207\5V,\2\u0207\u0208\7\20\2\2\u0208\u0209"+
		"\7\25\2\2\u0209\u020a\5Z.\2\u020a\u020b\7\26\2\2\u020bQ\3\2\2\2\u020c"+
		"\u020d\7\b\2\2\u020d\u020e\5Z.\2\u020e\u020f\7\t\2\2\u020fS\3\2\2\2\u0210"+
		"\u0220\7S\2\2\u0211\u0220\7\"\2\2\u0212\u0213\7S\2\2\u0213\u0214\7\21"+
		"\2\2\u0214\u0215\7\25\2\2\u0215\u0216\5Z.\2\u0216\u0217\7\26\2\2\u0217"+
		"\u0220\3\2\2\2\u0218\u0219\7S\2\2\u0219\u0220\5R*\2\u021a\u021b\7S\2\2"+
		"\u021b\u021c\7\25\2\2\u021c\u021d\5X-\2\u021d\u021e\7\26\2\2\u021e\u0220"+
		"\3\2\2\2\u021f\u0210\3\2\2\2\u021f\u0211\3\2\2\2\u021f\u0212\3\2\2\2\u021f"+
		"\u0218\3\2\2\2\u021f\u021a\3\2\2\2\u0220U\3\2\2\2\u0221\u0226\5T+\2\u0222"+
		"\u0223\7!\2\2\u0223\u0225\5T+\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2"+
		"\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227W\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0229\u022e\5Z.\2\u022a\u022b\7\n\2\2\u022b\u022d\5Z.\2\u022c"+
		"\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0233\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0229\3\2\2\2\u0232\u0231\3\2\2\2\u0233Y\3\2\2\2\u0234\u0235\b.\1\2\u0235"+
		"\u0236\7:\2\2\u0236\u0240\5Z.\r\u0237\u0238\7E\2\2\u0238\u0240\5Z.\f\u0239"+
		"\u023a\7\23\2\2\u023a\u023b\7\25\2\2\u023b\u023c\5Z.\2\u023c\u023d\7\26"+
		"\2\2\u023d\u0240\3\2\2\2\u023e\u0240\5\\/\2\u023f\u0234\3\2\2\2\u023f"+
		"\u0237\3\2\2\2\u023f\u0239\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u025b\3\2"+
		"\2\2\u0241\u0242\f\13\2\2\u0242\u0243\t\3\2\2\u0243\u025a\5Z.\f\u0244"+
		"\u0245\f\n\2\2\u0245\u0246\t\4\2\2\u0246\u025a\5Z.\13\u0247\u0248\f\t"+
		"\2\2\u0248\u0249\t\5\2\2\u0249\u025a\5Z.\n\u024a\u024b\f\b\2\2\u024b\u024c"+
		"\t\6\2\2\u024c\u025a\5Z.\t\u024d\u024e\f\7\2\2\u024e\u024f\7F\2\2\u024f"+
		"\u025a\5Z.\b\u0250\u0251\f\6\2\2\u0251\u0252\7G\2\2\u0252\u025a\5Z.\7"+
		"\u0253\u0254\f\5\2\2\u0254\u0255\7\22\2\2\u0255\u0256\5Z.\2\u0256\u0257"+
		"\7\31\2\2\u0257\u0258\5Z.\6\u0258\u025a\3\2\2\2\u0259\u0241\3\2\2\2\u0259"+
		"\u0244\3\2\2\2\u0259\u0247\3\2\2\2\u0259\u024a\3\2\2\2\u0259\u024d\3\2"+
		"\2\2\u0259\u0250\3\2\2\2\u0259\u0253\3\2\2\2\u025a\u025d\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c[\3\2\2\2\u025d\u025b\3\2\2\2"+
		"\u025e\u025f\b/\1\2\u025f\u0260\7\25\2\2\u0260\u0261\5Z.\2\u0261\u0262"+
		"\7\26\2\2\u0262\u028a\3\2\2\2\u0263\u028a\5V,\2\u0264\u028a\7J\2\2\u0265"+
		"\u028a\7I\2\2\u0266\u028a\7H\2\2\u0267\u028a\7P\2\2\u0268\u028a\7Q\2\2"+
		"\u0269\u028a\7R\2\2\u026a\u026b\7\27\2\2\u026b\u026c\5X-\2\u026c\u026d"+
		"\7\30\2\2\u026d\u028a\3\2\2\2\u026e\u026f\7\25\2\2\u026f\u0270\5:\36\2"+
		"\u0270\u0271\7\26\2\2\u0271\u0272\5Z.\2\u0272\u028a\3\2\2\2\u0273\u0274"+
		"\7\37\2\2\u0274\u0275\7S\2\2\u0275\u0276\7\25\2\2\u0276\u0277\5X-\2\u0277"+
		"\u0278\7\26\2\2\u0278\u028a\3\2\2\2\u0279\u027a\7\37\2\2\u027a\u027b\7"+
		"\33\2\2\u027b\u027c\7A\2\2\u027c\u027d\5:\36\2\u027d\u027e\7?\2\2\u027e"+
		"\u027f\7\25\2\2\u027f\u0280\7\26\2\2\u0280\u028a\3\2\2\2\u0281\u0282\7"+
		"\37\2\2\u0282\u0283\5:\36\2\u0283\u0284\7\b\2\2\u0284\u0285\5Z.\2\u0285"+
		"\u0286\7\t\2\2\u0286\u028a\3\2\2\2\u0287\u028a\5\34\17\2\u0288\u028a\5"+
		":\36\2\u0289\u025e\3\2\2\2\u0289\u0263\3\2\2\2\u0289\u0264\3\2\2\2\u0289"+
		"\u0265\3\2\2\2\u0289\u0266\3\2\2\2\u0289\u0267\3\2\2\2\u0289\u0268\3\2"+
		"\2\2\u0289\u0269\3\2\2\2\u0289\u026a\3\2\2\2\u0289\u026e\3\2\2\2\u0289"+
		"\u0273\3\2\2\2\u0289\u0279\3\2\2\2\u0289\u0281\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u0289\u0288\3\2\2\2\u028a\u028f\3\2\2\2\u028b\u028c\f\3\2\2\u028c"+
		"\u028e\7\24\2\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290]\3\2\2\2\u0291\u028f\3\2\2\2-ajsy~\u0087"+
		"\u008d\u0092\u009f\u00c6\u00cc\u00d8\u00ef\u00f6\u0102\u0106\u010b\u011d"+
		"\u0121\u0127\u0132\u013c\u014a\u0158\u015c\u0164\u0168\u019e\u01a5\u01ab"+
		"\u01b3\u01ba\u01c1\u01eb\u021f\u0226\u022e\u0232\u023f\u0259\u025b\u0289"+
		"\u028f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}