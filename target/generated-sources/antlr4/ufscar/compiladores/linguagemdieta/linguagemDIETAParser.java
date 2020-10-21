// Generated from ufscar\compiladores\linguagemdieta\linguagemDIETA.g4 by ANTLR 4.8
package ufscar.compiladores.linguagemdieta;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class linguagemDIETAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18, COMENTARIOS=19, NUM_INT=20, QUANTIDADE=21, CADEIA=22, IDENT=23, 
		ERRO_CADEIA=24, ERRO_COMENTARIO=25, ERRO_SIMBOLO=26;
	public static final int
		RULE_ficha = 0, RULE_cabeçalho = 1, RULE_rodape = 2, RULE_profissional = 3, 
		RULE_crn = 4, RULE_num_identificador = 5, RULE_especialidade = 6, RULE_cliente = 7, 
		RULE_data = 8, RULE_endereco = 9, RULE_telefone = 10, RULE_ddd = 11, RULE_dieta = 12, 
		RULE_corpo = 13, RULE_refeicao = 14, RULE_nome_refeicao = 15, RULE_opcao_alimentos = 16, 
		RULE_alimentos = 17, RULE_alimento = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"ficha", "cabeçalho", "rodape", "profissional", "crn", "num_identificador", 
			"especialidade", "cliente", "data", "endereco", "telefone", "ddd", "dieta", 
			"corpo", "refeicao", "nome_refeicao", "opcao_alimentos", "alimentos", 
			"alimento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'profissional'", "':'", "'CRN'", "'-'", "'especialidade'", "'cliente'", 
			"'/'", "'endereco'", "'('", "')'", "'dieta'", "'fim_dieta'", "'refeicao'", 
			"'{'", "'}'", "'|'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "COMENTARIOS", "NUM_INT", "QUANTIDADE", 
			"CADEIA", "IDENT", "ERRO_CADEIA", "ERRO_COMENTARIO", "ERRO_SIMBOLO"
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
	public String getGrammarFileName() { return "linguagemDIETA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public linguagemDIETAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FichaContext extends ParserRuleContext {
		public CabeçalhoContext cabeçalho() {
			return getRuleContext(CabeçalhoContext.class,0);
		}
		public RodapeContext rodape() {
			return getRuleContext(RodapeContext.class,0);
		}
		public DietaContext dieta() {
			return getRuleContext(DietaContext.class,0);
		}
		public FichaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ficha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterFicha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitFicha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitFicha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FichaContext ficha() throws RecognitionException {
		FichaContext _localctx = new FichaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ficha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			cabeçalho();
			setState(39);
			rodape();
			setState(40);
			dieta();
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

	public static class CabeçalhoContext extends ParserRuleContext {
		public ProfissionalContext profissional() {
			return getRuleContext(ProfissionalContext.class,0);
		}
		public CrnContext crn() {
			return getRuleContext(CrnContext.class,0);
		}
		public EspecialidadeContext especialidade() {
			return getRuleContext(EspecialidadeContext.class,0);
		}
		public ClienteContext cliente() {
			return getRuleContext(ClienteContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public CabeçalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeçalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterCabeçalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitCabeçalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitCabeçalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeçalhoContext cabeçalho() throws RecognitionException {
		CabeçalhoContext _localctx = new CabeçalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabeçalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			profissional();
			setState(43);
			crn();
			setState(44);
			especialidade();
			setState(45);
			cliente();
			setState(46);
			data();
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

	public static class RodapeContext extends ParserRuleContext {
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public TelefoneContext telefone() {
			return getRuleContext(TelefoneContext.class,0);
		}
		public RodapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rodape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterRodape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitRodape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitRodape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RodapeContext rodape() throws RecognitionException {
		RodapeContext _localctx = new RodapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rodape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			endereco();
			setState(49);
			telefone();
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

	public static class ProfissionalContext extends ParserRuleContext {
		public Token cadeia;
		public TerminalNode CADEIA() { return getToken(linguagemDIETAParser.CADEIA, 0); }
		public ProfissionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profissional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterProfissional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitProfissional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitProfissional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProfissionalContext profissional() throws RecognitionException {
		ProfissionalContext _localctx = new ProfissionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_profissional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(T__1);
			setState(53);
			((ProfissionalContext)_localctx).cadeia = match(CADEIA);
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

	public static class CrnContext extends ParserRuleContext {
		public Token digito;
		public Num_identificadorContext num_identificador() {
			return getRuleContext(Num_identificadorContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(linguagemDIETAParser.NUM_INT, 0); }
		public CrnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterCrn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitCrn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitCrn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrnContext crn() throws RecognitionException {
		CrnContext _localctx = new CrnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			match(T__3);
			setState(57);
			((CrnContext)_localctx).digito = match(NUM_INT);
			setState(58);
			num_identificador();
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

	public static class Num_identificadorContext extends ParserRuleContext {
		public Token identificador;
		public TerminalNode NUM_INT() { return getToken(linguagemDIETAParser.NUM_INT, 0); }
		public Num_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterNum_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitNum_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitNum_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_identificadorContext num_identificador() throws RecognitionException {
		Num_identificadorContext _localctx = new Num_identificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((Num_identificadorContext)_localctx).identificador = match(NUM_INT);
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

	public static class EspecialidadeContext extends ParserRuleContext {
		public Token cadeia;
		public TerminalNode CADEIA() { return getToken(linguagemDIETAParser.CADEIA, 0); }
		public EspecialidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especialidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterEspecialidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitEspecialidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitEspecialidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecialidadeContext especialidade() throws RecognitionException {
		EspecialidadeContext _localctx = new EspecialidadeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_especialidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__4);
			setState(63);
			match(T__1);
			setState(64);
			((EspecialidadeContext)_localctx).cadeia = match(CADEIA);
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

	public static class ClienteContext extends ParserRuleContext {
		public Token cadeia;
		public TerminalNode CADEIA() { return getToken(linguagemDIETAParser.CADEIA, 0); }
		public ClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cliente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClienteContext cliente() throws RecognitionException {
		ClienteContext _localctx = new ClienteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cliente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__5);
			setState(67);
			match(T__1);
			setState(68);
			((ClienteContext)_localctx).cadeia = match(CADEIA);
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

	public static class DataContext extends ParserRuleContext {
		public Token dia;
		public Token mes;
		public Token ano;
		public List<TerminalNode> NUM_INT() { return getTokens(linguagemDIETAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(linguagemDIETAParser.NUM_INT, i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((DataContext)_localctx).dia = match(NUM_INT);
			setState(71);
			match(T__6);
			setState(72);
			((DataContext)_localctx).mes = match(NUM_INT);
			setState(73);
			match(T__6);
			setState(74);
			((DataContext)_localctx).ano = match(NUM_INT);
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

	public static class EnderecoContext extends ParserRuleContext {
		public Token cadeia;
		public TerminalNode CADEIA() { return getToken(linguagemDIETAParser.CADEIA, 0); }
		public EnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endereco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterEndereco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitEndereco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitEndereco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnderecoContext endereco() throws RecognitionException {
		EnderecoContext _localctx = new EnderecoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_endereco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__7);
			setState(77);
			match(T__1);
			setState(78);
			((EnderecoContext)_localctx).cadeia = match(CADEIA);
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

	public static class TelefoneContext extends ParserRuleContext {
		public Token digito1;
		public Token digito2;
		public DddContext ddd() {
			return getRuleContext(DddContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(linguagemDIETAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(linguagemDIETAParser.NUM_INT, i);
		}
		public TelefoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterTelefone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitTelefone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitTelefone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TelefoneContext telefone() throws RecognitionException {
		TelefoneContext _localctx = new TelefoneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_telefone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			ddd();
			setState(81);
			((TelefoneContext)_localctx).digito1 = match(NUM_INT);
			setState(82);
			match(T__3);
			setState(83);
			((TelefoneContext)_localctx).digito2 = match(NUM_INT);
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

	public static class DddContext extends ParserRuleContext {
		public Token digito3;
		public TerminalNode NUM_INT() { return getToken(linguagemDIETAParser.NUM_INT, 0); }
		public DddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterDdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitDdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitDdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DddContext ddd() throws RecognitionException {
		DddContext _localctx = new DddContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ddd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
			setState(86);
			((DddContext)_localctx).digito3 = match(NUM_INT);
			setState(87);
			match(T__9);
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

	public static class DietaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public DietaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dieta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterDieta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitDieta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitDieta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DietaContext dieta() throws RecognitionException {
		DietaContext _localctx = new DietaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dieta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__10);
			setState(90);
			corpo();
			setState(91);
			match(T__11);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<RefeicaoContext> refeicao() {
			return getRuleContexts(RefeicaoContext.class);
		}
		public RefeicaoContext refeicao(int i) {
			return getRuleContext(RefeicaoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(93);
				refeicao();
				}
				}
				setState(98);
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

	public static class RefeicaoContext extends ParserRuleContext {
		public Nome_refeicaoContext ident_refeicao;
		public Opcao_alimentosContext opcao_alimentos() {
			return getRuleContext(Opcao_alimentosContext.class,0);
		}
		public Nome_refeicaoContext nome_refeicao() {
			return getRuleContext(Nome_refeicaoContext.class,0);
		}
		public RefeicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refeicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterRefeicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitRefeicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitRefeicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefeicaoContext refeicao() throws RecognitionException {
		RefeicaoContext _localctx = new RefeicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_refeicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__12);
			setState(100);
			match(T__13);
			setState(101);
			((RefeicaoContext)_localctx).ident_refeicao = nome_refeicao();
			setState(102);
			opcao_alimentos();
			setState(103);
			match(T__14);
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

	public static class Nome_refeicaoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(linguagemDIETAParser.IDENT, 0); }
		public Nome_refeicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_refeicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterNome_refeicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitNome_refeicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitNome_refeicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_refeicaoContext nome_refeicao() throws RecognitionException {
		Nome_refeicaoContext _localctx = new Nome_refeicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nome_refeicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IDENT);
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

	public static class Opcao_alimentosContext extends ParserRuleContext {
		public AlimentosContext a1;
		public AlimentosContext alimentos;
		public List<AlimentosContext> outrosA1 = new ArrayList<AlimentosContext>();
		public List<AlimentosContext> alimentos() {
			return getRuleContexts(AlimentosContext.class);
		}
		public AlimentosContext alimentos(int i) {
			return getRuleContext(AlimentosContext.class,i);
		}
		public Opcao_alimentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcao_alimentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterOpcao_alimentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitOpcao_alimentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitOpcao_alimentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcao_alimentosContext opcao_alimentos() throws RecognitionException {
		Opcao_alimentosContext _localctx = new Opcao_alimentosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opcao_alimentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((Opcao_alimentosContext)_localctx).a1 = alimentos();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(108);
				match(T__15);
				setState(109);
				((Opcao_alimentosContext)_localctx).alimentos = alimentos();
				((Opcao_alimentosContext)_localctx).outrosA1.add(((Opcao_alimentosContext)_localctx).alimentos);
				}
				}
				setState(114);
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

	public static class AlimentosContext extends ParserRuleContext {
		public AlimentoContext a2;
		public AlimentoContext alimento;
		public List<AlimentoContext> outrosA2 = new ArrayList<AlimentoContext>();
		public List<AlimentoContext> alimento() {
			return getRuleContexts(AlimentoContext.class);
		}
		public AlimentoContext alimento(int i) {
			return getRuleContext(AlimentoContext.class,i);
		}
		public AlimentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alimentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterAlimentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitAlimentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitAlimentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlimentosContext alimentos() throws RecognitionException {
		AlimentosContext _localctx = new AlimentosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alimentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((AlimentosContext)_localctx).a2 = alimento();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(116);
				match(T__16);
				setState(117);
				((AlimentosContext)_localctx).alimento = alimento();
				((AlimentosContext)_localctx).outrosA2.add(((AlimentosContext)_localctx).alimento);
				}
				}
				setState(122);
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

	public static class AlimentoContext extends ParserRuleContext {
		public Token cadeia;
		public TerminalNode QUANTIDADE() { return getToken(linguagemDIETAParser.QUANTIDADE, 0); }
		public TerminalNode CADEIA() { return getToken(linguagemDIETAParser.CADEIA, 0); }
		public AlimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).enterAlimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguagemDIETAListener ) ((linguagemDIETAListener)listener).exitAlimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof linguagemDIETAVisitor ) return ((linguagemDIETAVisitor<? extends T>)visitor).visitAlimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlimentoContext alimento() throws RecognitionException {
		AlimentoContext _localctx = new AlimentoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			match(QUANTIDADE);
			setState(124);
			match(T__3);
			setState(125);
			((AlimentoContext)_localctx).cadeia = match(CADEIA);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\7\17a\n\17\f\17\16\17d\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22q\n\22"+
		"\f\22\16\22t\13\22\3\23\3\23\3\23\7\23y\n\23\f\23\16\23|\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"\2\2\2q\2(\3\2\2\2\4,\3\2\2\2\6\62\3\2\2\2\b\65\3\2\2\2\n9\3\2\2\2\f>"+
		"\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24N\3\2\2\2\26R\3\2\2\2\30"+
		"W\3\2\2\2\32[\3\2\2\2\34b\3\2\2\2\36e\3\2\2\2 k\3\2\2\2\"m\3\2\2\2$u\3"+
		"\2\2\2&}\3\2\2\2()\5\4\3\2)*\5\6\4\2*+\5\32\16\2+\3\3\2\2\2,-\5\b\5\2"+
		"-.\5\n\6\2./\5\16\b\2/\60\5\20\t\2\60\61\5\22\n\2\61\5\3\2\2\2\62\63\5"+
		"\24\13\2\63\64\5\26\f\2\64\7\3\2\2\2\65\66\7\3\2\2\66\67\7\4\2\2\678\7"+
		"\30\2\28\t\3\2\2\29:\7\5\2\2:;\7\6\2\2;<\7\26\2\2<=\5\f\7\2=\13\3\2\2"+
		"\2>?\7\26\2\2?\r\3\2\2\2@A\7\7\2\2AB\7\4\2\2BC\7\30\2\2C\17\3\2\2\2DE"+
		"\7\b\2\2EF\7\4\2\2FG\7\30\2\2G\21\3\2\2\2HI\7\26\2\2IJ\7\t\2\2JK\7\26"+
		"\2\2KL\7\t\2\2LM\7\26\2\2M\23\3\2\2\2NO\7\n\2\2OP\7\4\2\2PQ\7\30\2\2Q"+
		"\25\3\2\2\2RS\5\30\r\2ST\7\26\2\2TU\7\6\2\2UV\7\26\2\2V\27\3\2\2\2WX\7"+
		"\13\2\2XY\7\26\2\2YZ\7\f\2\2Z\31\3\2\2\2[\\\7\r\2\2\\]\5\34\17\2]^\7\16"+
		"\2\2^\33\3\2\2\2_a\5\36\20\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"\35\3\2\2\2db\3\2\2\2ef\7\17\2\2fg\7\20\2\2gh\5 \21\2hi\5\"\22\2ij\7\21"+
		"\2\2j\37\3\2\2\2kl\7\31\2\2l!\3\2\2\2mr\5$\23\2no\7\22\2\2oq\5$\23\2p"+
		"n\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s#\3\2\2\2tr\3\2\2\2uz\5&\24\2"+
		"vw\7\23\2\2wy\5&\24\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{%\3\2\2"+
		"\2|z\3\2\2\2}~\7\27\2\2~\177\7\6\2\2\177\u0080\7\30\2\2\u0080\'\3\2\2"+
		"\2\5brz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}