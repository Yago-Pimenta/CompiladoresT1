lexer grammar MeuLexer;

/* Palavras-chave para controle de fluxo do algoritmo */
ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';


/* Valores lógicos e operador de negação */
FALSO: 'falso';
VERDADEIRO: 'verdadeiro';
NEGACAO: 'nao';



/* Definição de tipos de registro (semelhante a structs) */
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';



/* Operações de entrada e saída de dados */
LEIA: 'leia';
ESCREVA: 'escreva';


/* Palavras reservadas para manipulação de funções e procedimentos */
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
RETORNE: 'retorne';
FACA: 'faca';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';


/* Declaração dos tipos de variáveis e constantes */
DECLARE: 'declare';
TIPO: 'tipo';
LITERAL: 'literal';
VAR: 'var';
CONSTANTE: 'constante';
REAL: 'real';

LOGICO: 'logico';
INTEIRO: 'inteiro';





/* Estruturas condicionais de seleção */
CASO: 'caso';
FIM_CASO: 'fim_caso';
SE: 'se';
SENAO: 'senao';
FIM_SE: 'fim_se';
ENTAO: 'entao';


/* Comandos para laços de repetição */

SEJA: 'seja';
ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';
PARA: 'para';
FIM_PARA: 'fim_para';
ATE: 'ate';

/* Operadores lógicos e relacionais */


MAIOR_OU_IGUAL_QUE: '>=';
IGUAL: '=';
DIFERENTE: '<>';
E: 'e';
OU: 'ou';
ATRIBUICAO: '<-';
MENOR_QUE: '<';
MAIOR_QUE: '>';
MENOR_OU_IGUAL_QUE: '<=';




/* Representação de números */

NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;
NUM_INT: [0-9]+; // Pequena alteração na regex


/* Identificadores para nomes */



IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;



/* Operadores aritméticos */
SOMA: '+';
MODULO: '%';
SUBTRACAO: '-';
DIVISAO: '/';
MULTIPLICACAO: '*';
REFERENCIA:'&'; 
DEREFERENCIA:'^'; 




/* Símbolos de pontuação */
FECHA_PARENTESES: ')';
VIRGULA: ',';
ABRE_COLCHETES: '['; 
FECHA_COLCHETES: ']'; 
PONTO: '.';
INTERVALO: '..';
DOIS_PONTOS: ':';
ABRE_PARENTESES: '('; 


/* Sequências de caracteres literais (strings) */
CADEIA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '"';
CADEIA_NAO_FECHADA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '\n';

/* Bloco de comentários */
COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

COMENTARIO: '{' ~([\n\r}])* '}' -> skip;

/* Caracteres de espaço */
WS: [ \t\r\n]+ -> skip; 

/* Caracteres não reconhecidos */
ERRO: .;
