// Generated from br/ufscar/dc/compiladores/meu/lexico/MeuLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.meu.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, FALSO=3, VERDADEIRO=4, NEGACAO=5, REGISTRO=6, 
		FIM_REGISTRO=7, LEIA=8, ESCREVA=9, PROCEDIMENTO=10, FIM_PROCEDIMENTO=11, 
		RETORNE=12, FACA=13, FUNCAO=14, FIM_FUNCAO=15, DECLARE=16, TIPO=17, LITERAL=18, 
		VAR=19, CONSTANTE=20, REAL=21, LOGICO=22, INTEIRO=23, CASO=24, FIM_CASO=25, 
		SE=26, SENAO=27, FIM_SE=28, ENTAO=29, SEJA=30, ENQUANTO=31, FIM_ENQUANTO=32, 
		PARA=33, FIM_PARA=34, ATE=35, MAIOR_OU_IGUAL_QUE=36, IGUAL=37, DIFERENTE=38, 
		E=39, OU=40, ATRIBUICAO=41, MENOR_QUE=42, MAIOR_QUE=43, MENOR_OU_IGUAL_QUE=44, 
		NUM_REAL=45, NUM_INT=46, IDENT=47, SOMA=48, MODULO=49, SUBTRACAO=50, DIVISAO=51, 
		MULTIPLICACAO=52, REFERENCIA=53, DEREFERENCIA=54, FECHA_PARENTESES=55, 
		VIRGULA=56, ABRE_COLCHETES=57, FECHA_COLCHETES=58, PONTO=59, INTERVALO=60, 
		DOIS_PONTOS=61, ABRE_PARENTESES=62, CADEIA=63, CADEIA_NAO_FECHADA=64, 
		COMENTARIO_NAO_FECHADO=65, COMENTARIO=66, WS=67, ERRO=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FIM_ALGORITMO", "FALSO", "VERDADEIRO", "NEGACAO", "REGISTRO", 
			"FIM_REGISTRO", "LEIA", "ESCREVA", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"RETORNE", "FACA", "FUNCAO", "FIM_FUNCAO", "DECLARE", "TIPO", "LITERAL", 
			"VAR", "CONSTANTE", "REAL", "LOGICO", "INTEIRO", "CASO", "FIM_CASO", 
			"SE", "SENAO", "FIM_SE", "ENTAO", "SEJA", "ENQUANTO", "FIM_ENQUANTO", 
			"PARA", "FIM_PARA", "ATE", "MAIOR_OU_IGUAL_QUE", "IGUAL", "DIFERENTE", 
			"E", "OU", "ATRIBUICAO", "MENOR_QUE", "MAIOR_QUE", "MENOR_OU_IGUAL_QUE", 
			"NUM_REAL", "NUM_INT", "IDENT", "SOMA", "MODULO", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "REFERENCIA", "DEREFERENCIA", "FECHA_PARENTESES", "VIRGULA", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABRE_PARENTESES", "CADEIA", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"COMENTARIO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'falso'", "'verdadeiro'", "'nao'", 
			"'registro'", "'fim_registro'", "'leia'", "'escreva'", "'procedimento'", 
			"'fim_procedimento'", "'retorne'", "'faca'", "'funcao'", "'fim_funcao'", 
			"'declare'", "'tipo'", "'literal'", "'var'", "'constante'", "'real'", 
			"'logico'", "'inteiro'", "'caso'", "'fim_caso'", "'se'", "'senao'", "'fim_se'", 
			"'entao'", "'seja'", "'enquanto'", "'fim_enquanto'", "'para'", "'fim_para'", 
			"'ate'", "'>='", "'='", "'<>'", "'e'", "'ou'", "'<-'", "'<'", "'>'", 
			"'<='", null, null, null, "'+'", "'%'", "'-'", "'/'", "'*'", "'&'", "'^'", 
			"')'", "','", "'['", "']'", "'.'", "'..'", "':'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "FALSO", "VERDADEIRO", "NEGACAO", 
			"REGISTRO", "FIM_REGISTRO", "LEIA", "ESCREVA", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"RETORNE", "FACA", "FUNCAO", "FIM_FUNCAO", "DECLARE", "TIPO", "LITERAL", 
			"VAR", "CONSTANTE", "REAL", "LOGICO", "INTEIRO", "CASO", "FIM_CASO", 
			"SE", "SENAO", "FIM_SE", "ENTAO", "SEJA", "ENQUANTO", "FIM_ENQUANTO", 
			"PARA", "FIM_PARA", "ATE", "MAIOR_OU_IGUAL_QUE", "IGUAL", "DIFERENTE", 
			"E", "OU", "ATRIBUICAO", "MENOR_QUE", "MAIOR_QUE", "MENOR_OU_IGUAL_QUE", 
			"NUM_REAL", "NUM_INT", "IDENT", "SOMA", "MODULO", "SUBTRACAO", "DIVISAO", 
			"MULTIPLICACAO", "REFERENCIA", "DEREFERENCIA", "FECHA_PARENTESES", "VIRGULA", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABRE_PARENTESES", "CADEIA", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"COMENTARIO", "WS", "ERRO"
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


	public MeuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MeuLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0220\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-"+
		"\3.\6.\u01b9\n.\r.\16.\u01ba\3.\3.\6.\u01bf\n.\r.\16.\u01c0\3/\6/\u01c4"+
		"\n/\r/\16/\u01c5\3\60\3\60\7\60\u01ca\n\60\f\60\16\60\u01cd\13\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\7@\u01f2\n"+
		"@\f@\16@\u01f5\13@\3@\3@\3A\3A\3A\3A\7A\u01fd\nA\fA\16A\u0200\13A\3A\3"+
		"A\3B\3B\7B\u0206\nB\fB\16B\u0209\13B\3B\3B\3C\3C\7C\u020f\nC\fC\16C\u0212"+
		"\13C\3C\3C\3C\3C\3D\6D\u0219\nD\rD\16D\u021a\3D\3D\3E\3E\2\2F\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\3\2\t\3\2\62;\4\2C\\c"+
		"|\6\2\62;C\\aac|\5\2\f\f$$^^\3\2\177\177\5\2\f\f\17\17\177\177\5\2\13"+
		"\f\17\17\"\"\2\u022a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b"+
		"\3\2\2\2\5\u0095\3\2\2\2\7\u00a3\3\2\2\2\t\u00a9\3\2\2\2\13\u00b4\3\2"+
		"\2\2\r\u00b8\3\2\2\2\17\u00c1\3\2\2\2\21\u00ce\3\2\2\2\23\u00d3\3\2\2"+
		"\2\25\u00db\3\2\2\2\27\u00e8\3\2\2\2\31\u00f9\3\2\2\2\33\u0101\3\2\2\2"+
		"\35\u0106\3\2\2\2\37\u010d\3\2\2\2!\u0118\3\2\2\2#\u0120\3\2\2\2%\u0125"+
		"\3\2\2\2\'\u012d\3\2\2\2)\u0131\3\2\2\2+\u013b\3\2\2\2-\u0140\3\2\2\2"+
		"/\u0147\3\2\2\2\61\u014f\3\2\2\2\63\u0154\3\2\2\2\65\u015d\3\2\2\2\67"+
		"\u0160\3\2\2\29\u0166\3\2\2\2;\u016d\3\2\2\2=\u0173\3\2\2\2?\u0178\3\2"+
		"\2\2A\u0181\3\2\2\2C\u018e\3\2\2\2E\u0193\3\2\2\2G\u019c\3\2\2\2I\u01a0"+
		"\3\2\2\2K\u01a3\3\2\2\2M\u01a5\3\2\2\2O\u01a8\3\2\2\2Q\u01aa\3\2\2\2S"+
		"\u01ad\3\2\2\2U\u01b0\3\2\2\2W\u01b2\3\2\2\2Y\u01b4\3\2\2\2[\u01b8\3\2"+
		"\2\2]\u01c3\3\2\2\2_\u01c7\3\2\2\2a\u01ce\3\2\2\2c\u01d0\3\2\2\2e\u01d2"+
		"\3\2\2\2g\u01d4\3\2\2\2i\u01d6\3\2\2\2k\u01d8\3\2\2\2m\u01da\3\2\2\2o"+
		"\u01dc\3\2\2\2q\u01de\3\2\2\2s\u01e0\3\2\2\2u\u01e2\3\2\2\2w\u01e4\3\2"+
		"\2\2y\u01e6\3\2\2\2{\u01e9\3\2\2\2}\u01eb\3\2\2\2\177\u01ed\3\2\2\2\u0081"+
		"\u01f8\3\2\2\2\u0083\u0203\3\2\2\2\u0085\u020c\3\2\2\2\u0087\u0218\3\2"+
		"\2\2\u0089\u021e\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7i\2\2\u008e\u008f\7q\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7o\2\2\u0093\u0094\7q\2\2\u0094\4\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7k\2\2\u0097\u0098\7o\2\2\u0098\u0099\7a\2\2"+
		"\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2\u009b\u009c\7i\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7o\2\2\u00a1\u00a2\7q\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\b\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t"+
		"\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7f\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\n\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\f\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7i\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2"+
		"\u00bf\u00c0\7q\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7"+
		"k\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd\20\3\2\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7c\2\2"+
		"\u00d2\22\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7"+
		"e\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\24\3\2\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7f\2\2\u00e1"+
		"\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7p\2\2"+
		"\u00e5\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7"+
		"h\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed"+
		"\7r\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7e\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7o\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\30\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\32\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\34\3\2\2\2\u0106\u0107\7h\2\2\u0107"+
		"\u0108\7w\2\2\u0108\u0109\7p\2\2\u0109\u010a\7e\2\2\u010a\u010b\7c\2\2"+
		"\u010b\u010c\7q\2\2\u010c\36\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7"+
		"k\2\2\u010f\u0110\7o\2\2\u0110\u0111\7a\2\2\u0111\u0112\7h\2\2\u0112\u0113"+
		"\7w\2\2\u0113\u0114\7p\2\2\u0114\u0115\7e\2\2\u0115\u0116\7c\2\2\u0116"+
		"\u0117\7q\2\2\u0117 \3\2\2\2\u0118\u0119\7f\2\2\u0119\u011a\7g\2\2\u011a"+
		"\u011b\7e\2\2\u011b\u011c\7n\2\2\u011c\u011d\7c\2\2\u011d\u011e\7t\2\2"+
		"\u011e\u011f\7g\2\2\u011f\"\3\2\2\2\u0120\u0121\7v\2\2\u0121\u0122\7k"+
		"\2\2\u0122\u0123\7r\2\2\u0123\u0124\7q\2\2\u0124$\3\2\2\2\u0125\u0126"+
		"\7n\2\2\u0126\u0127\7k\2\2\u0127\u0128\7v\2\2\u0128\u0129\7g\2\2\u0129"+
		"\u012a\7t\2\2\u012a\u012b\7c\2\2\u012b\u012c\7n\2\2\u012c&\3\2\2\2\u012d"+
		"\u012e\7x\2\2\u012e\u012f\7c\2\2\u012f\u0130\7t\2\2\u0130(\3\2\2\2\u0131"+
		"\u0132\7e\2\2\u0132\u0133\7q\2\2\u0133\u0134\7p\2\2\u0134\u0135\7u\2\2"+
		"\u0135\u0136\7v\2\2\u0136\u0137\7c\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7v\2\2\u0139\u013a\7g\2\2\u013a*\3\2\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2\2\u013f,\3\2\2\2\u0140\u0141"+
		"\7n\2\2\u0141\u0142\7q\2\2\u0142\u0143\7i\2\2\u0143\u0144\7k\2\2\u0144"+
		"\u0145\7e\2\2\u0145\u0146\7q\2\2\u0146.\3\2\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7p\2\2\u0149\u014a\7v\2\2\u014a\u014b\7g\2\2\u014b\u014c\7k\2\2"+
		"\u014c\u014d\7t\2\2\u014d\u014e\7q\2\2\u014e\60\3\2\2\2\u014f\u0150\7"+
		"e\2\2\u0150\u0151\7c\2\2\u0151\u0152\7u\2\2\u0152\u0153\7q\2\2\u0153\62"+
		"\3\2\2\2\u0154\u0155\7h\2\2\u0155\u0156\7k\2\2\u0156\u0157\7o\2\2\u0157"+
		"\u0158\7a\2\2\u0158\u0159\7e\2\2\u0159\u015a\7c\2\2\u015a\u015b\7u\2\2"+
		"\u015b\u015c\7q\2\2\u015c\64\3\2\2\2\u015d\u015e\7u\2\2\u015e\u015f\7"+
		"g\2\2\u015f\66\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7g\2\2\u0162\u0163"+
		"\7p\2\2\u0163\u0164\7c\2\2\u0164\u0165\7q\2\2\u01658\3\2\2\2\u0166\u0167"+
		"\7h\2\2\u0167\u0168\7k\2\2\u0168\u0169\7o\2\2\u0169\u016a\7a\2\2\u016a"+
		"\u016b\7u\2\2\u016b\u016c\7g\2\2\u016c:\3\2\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u016f\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7c\2\2\u0171\u0172\7q\2\2"+
		"\u0172<\3\2\2\2\u0173\u0174\7u\2\2\u0174\u0175\7g\2\2\u0175\u0176\7l\2"+
		"\2\u0176\u0177\7c\2\2\u0177>\3\2\2\2\u0178\u0179\7g\2\2\u0179\u017a\7"+
		"p\2\2\u017a\u017b\7s\2\2\u017b\u017c\7w\2\2\u017c\u017d\7c\2\2\u017d\u017e"+
		"\7p\2\2\u017e\u017f\7v\2\2\u017f\u0180\7q\2\2\u0180@\3\2\2\2\u0181\u0182"+
		"\7h\2\2\u0182\u0183\7k\2\2\u0183\u0184\7o\2\2\u0184\u0185\7a\2\2\u0185"+
		"\u0186\7g\2\2\u0186\u0187\7p\2\2\u0187\u0188\7s\2\2\u0188\u0189\7w\2\2"+
		"\u0189\u018a\7c\2\2\u018a\u018b\7p\2\2\u018b\u018c\7v\2\2\u018c\u018d"+
		"\7q\2\2\u018dB\3\2\2\2\u018e\u018f\7r\2\2\u018f\u0190\7c\2\2\u0190\u0191"+
		"\7t\2\2\u0191\u0192\7c\2\2\u0192D\3\2\2\2\u0193\u0194\7h\2\2\u0194\u0195"+
		"\7k\2\2\u0195\u0196\7o\2\2\u0196\u0197\7a\2\2\u0197\u0198\7r\2\2\u0198"+
		"\u0199\7c\2\2\u0199\u019a\7t\2\2\u019a\u019b\7c\2\2\u019bF\3\2\2\2\u019c"+
		"\u019d\7c\2\2\u019d\u019e\7v\2\2\u019e\u019f\7g\2\2\u019fH\3\2\2\2\u01a0"+
		"\u01a1\7@\2\2\u01a1\u01a2\7?\2\2\u01a2J\3\2\2\2\u01a3\u01a4\7?\2\2\u01a4"+
		"L\3\2\2\2\u01a5\u01a6\7>\2\2\u01a6\u01a7\7@\2\2\u01a7N\3\2\2\2\u01a8\u01a9"+
		"\7g\2\2\u01a9P\3\2\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7w\2\2\u01acR\3"+
		"\2\2\2\u01ad\u01ae\7>\2\2\u01ae\u01af\7/\2\2\u01afT\3\2\2\2\u01b0\u01b1"+
		"\7>\2\2\u01b1V\3\2\2\2\u01b2\u01b3\7@\2\2\u01b3X\3\2\2\2\u01b4\u01b5\7"+
		">\2\2\u01b5\u01b6\7?\2\2\u01b6Z\3\2\2\2\u01b7\u01b9\4\62;\2\u01b8\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\7\60\2\2\u01bd\u01bf\4\62;\2\u01be\u01bd\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\\\3\2\2\2\u01c2\u01c4\t\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6^\3\2\2\2\u01c7\u01cb\t"+
		"\3\2\2\u01c8\u01ca\t\4\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc`\3\2\2\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01cf\7-\2\2\u01cfb\3\2\2\2\u01d0\u01d1\7\'\2\2\u01d1d\3\2\2\2"+
		"\u01d2\u01d3\7/\2\2\u01d3f\3\2\2\2\u01d4\u01d5\7\61\2\2\u01d5h\3\2\2\2"+
		"\u01d6\u01d7\7,\2\2\u01d7j\3\2\2\2\u01d8\u01d9\7(\2\2\u01d9l\3\2\2\2\u01da"+
		"\u01db\7`\2\2\u01dbn\3\2\2\2\u01dc\u01dd\7+\2\2\u01ddp\3\2\2\2\u01de\u01df"+
		"\7.\2\2\u01dfr\3\2\2\2\u01e0\u01e1\7]\2\2\u01e1t\3\2\2\2\u01e2\u01e3\7"+
		"_\2\2\u01e3v\3\2\2\2\u01e4\u01e5\7\60\2\2\u01e5x\3\2\2\2\u01e6\u01e7\7"+
		"\60\2\2\u01e7\u01e8\7\60\2\2\u01e8z\3\2\2\2\u01e9\u01ea\7<\2\2\u01ea|"+
		"\3\2\2\2\u01eb\u01ec\7*\2\2\u01ec~\3\2\2\2\u01ed\u01f3\7$\2\2\u01ee\u01ef"+
		"\7^\2\2\u01ef\u01f2\7$\2\2\u01f0\u01f2\n\5\2\2\u01f1\u01ee\3\2\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7$\2\2\u01f7"+
		"\u0080\3\2\2\2\u01f8\u01fe\7$\2\2\u01f9\u01fa\7^\2\2\u01fa\u01fd\7$\2"+
		"\2\u01fb\u01fd\n\5\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0202\7\f\2\2\u0202\u0082\3\2\2\2\u0203\u0207\7}"+
		"\2\2\u0204\u0206\n\6\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\7\f\2\2\u020b\u0084\3\2\2\2\u020c\u0210\7}\2\2\u020d"+
		"\u020f\n\7\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213"+
		"\u0214\7\177\2\2\u0214\u0215\3\2\2\2\u0215\u0216\bC\2\2\u0216\u0086\3"+
		"\2\2\2\u0217\u0219\t\b\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\bD"+
		"\2\2\u021d\u0088\3\2\2\2\u021e\u021f\13\2\2\2\u021f\u008a\3\2\2\2\16\2"+
		"\u01ba\u01c0\u01c5\u01cb\u01f1\u01f3\u01fc\u01fe\u0207\u0210\u021a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}