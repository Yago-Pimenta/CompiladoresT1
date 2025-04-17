lexer grammar MeuLexer;

// Algoritmo
ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';

// Struct 
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';

// Booleanos
FALSO: 'falso';
VERDADEIRO: 'verdadeiro';
NAO: 'nao';

// Manipulação de funções
FACA: 'faca';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
RETORNE: 'retorne';

// Entrada e saída
LEIA: 'leia';
ESCREVA: 'escreva';

// Tipos de variáveis
DECLARE: 'declare';
TIPO: 'tipo';
LITERAL: 'literal';
VAR: 'var';
LOGICO: 'logico';
INTEIRO: 'inteiro';
CONSTANTE: 'constante';
REAL: 'real';

// Condições
SE: 'se';
SENAO: 'senao';
FIM_SE: 'fim_se';
ENTAO: 'entao';
CASO: 'caso';
FIM_CASO: 'fim_caso';

// Laços de repetição
PARA: 'para';
FIM_PARA: 'fim_para';
ATE: 'ate';
SEJA: 'seja';
ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';

// Operadores lógicos
E: 'e';
OU: 'ou';
IGUAL: '=';
DIFERENTE: '<>';
ATRIBUICAO: '<-';
MENOR: '<';
MAIOR: '>';
MENOR_IGUAL: '<=';
MAIOR_IGUAL: '>=';

// Operadores aritméticos
SOMA: '+';
MOD: '%';
SUBTRACAO: '-';
DIVISAO: '/';
MULTIPLICACAO: '*';
ENDERECO:'&';
PONT: '^';

// Números
NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

// Identificadores
IDENT: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Cadeias
CADEIA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '"';
CADEIA_NAO_FECHADA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '\n';

// Simbolos
PONTO: '.';
INTERVALO: '..';
DOIS_PONTOS: ':';
ABREPAR: '(';
FECHAPAR: ')';
VIRGULA: ',';
ABRECOL: '[';
FECHACOL: ']';

// Comentários
COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip;
COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

// White-spaces
WS: (' ' | '\t' | '\r' | '\n') -> skip;

// Cadeia que não caiu em nenhuma classificação ("Coringa")
ERRO: .;
