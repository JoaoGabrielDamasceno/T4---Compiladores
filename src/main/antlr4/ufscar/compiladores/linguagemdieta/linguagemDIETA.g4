grammar linguagemDIETA;

@lexer::members {void erro(String msg) { throw new ParseCancellationException(msg); }}

WS : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

COMENTARIOS : '[' ~('\n' | '\r' | '}' )* ']' {skip();};

NUM_INT: ('0'..'9')+;

QUANTIDADE: ('0'..'9')+ ('g' | 'u' | 'kg');

CADEIA : '"' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

IDENT: ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_' )* ;


ficha: cabeçalho rodape dieta;

cabeçalho: profissional crn especialidade cliente data;

rodape: endereco telefone;

profissional: 'profissional' ':' cadeia=CADEIA;

crn: 'CRN' '-' digito=NUM_INT num_identificador;

num_identificador: identificador=NUM_INT;

especialidade: 'especialidade' ':' cadeia=CADEIA;

cliente: 'cliente' ':' cadeia=CADEIA;

data: NUM_INT '/' NUM_INT '/' NUM_INT; 

endereco: 'endereco' ':' CADEIA;

telefone: ddd NUM_INT '-' NUM_INT;

ddd: '(' NUM_INT ')';

dieta: 'dieta' corpo 'fim_dieta';

corpo: (refeicao)*;

refeicao: 'refeicao' '{' ident_refeicao=nome_refeicao opcao_alimentos '}';

nome_refeicao: IDENT ;

opcao_alimentos : alimentos ('|' alimentos)*;

alimentos: alimento ('+' alimento)*; 

alimento: (QUANTIDADE '-' CADEIA) ;

ERRO_CADEIA: '"' .*? {erro("Linha " + (getLine()) + ": cadeia literal nao fechada");};

ERRO_COMENTARIO:   '[' .*? {erro("Linha " + (getLine()) + ": comentario nao fechado");};

ERRO_SIMBOLO: . {erro("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");};