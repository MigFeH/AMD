/* Fichero: ejemplo.lex */
package lexico;
import java.io.InputStreamReader;
import java.lang.System;
%%
%char
%public
%standalone
%full

LETRA = [a-zA-Z]
DIGITO = [0-9]		
ALFANUM = ({LETRA}|{DIGITO})

DIGITOSUO = [0-9]

INICIALESU = [uU]
INICIALESO = [oO]

INICIALESUO = ({INICIALESU}{INICIALESO})

%%
; {System.out.print(" FinSentencia");}
\+ {System.out.print(" Mas");}
\- {System.out.print(" Menos");}
imprime {System.out.print(" Palabra_reservada(imprime)");}
{INICIALESUO}{DIGITOSUO}{DIGITOSUO}{DIGITOSUO}{DIGITOSUO}{DIGITOSUO}?{DIGITOSUO}? {System.out.print( "Usuario uo");}
{LETRA}+{
" " { }
\n {System.out.print(yytext());}
. {System.out.print(" ERROR_Lexico");}
