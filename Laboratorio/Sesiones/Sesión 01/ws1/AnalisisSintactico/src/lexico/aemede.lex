/* Fichero: ejemplo.lex */
package lexico;
import java.lang.System;
import sintactico.sym;
import java_cup.runtime.Symbol;
%%
%char
%public
%cup
%full
%type java_cup.runtime.Symbol

%{
boolean output = false;
%}

DIGITO = [0-9]
LETRA = [a-zA-Z]
SIMBOLO = {LETRA}|{DIGITO}|" "|\+|\-|\*|\/|\(|\)
LINEA = {SIMBOLO}+
SIGNO = [+-]
ENTERO = {SIGNO}?{DIGITO}+
CADENA = (\"{LINEA}?\")|('{LINEA}?')
REAL = {ENTERO}\.{DIGITO}+
DOBLEBARRA = \/\/
COMMENT = {DOBLEBARRA}{LINEA}
BLANCO = [" "\t]
MINUSCULAS = [a-z]
ALFANUM = ({LETRA}|{DIGITO})
VAR = {MINUSCULAS}"_"?{ALFANUM}*

%%
inicio 		{if (output) System.out.println("LEX: Palabra_reservada(inicio)"); 
			return new Symbol(sintactico.sym.inicio);}
fin 		{if (output) System.out.println("LEX: Palabra_reservada(fin)"); 
			return new Symbol(sintactico.sym.fin);}
imprime		{if (output) System.out.println("LEX: Palabra_reservada(imprime)"); 
			return new Symbol(sintactico.sym.imprime);}
;			{if (output) System.out.println("LEX: FinSentencia"); 
			return new Symbol(sintactico.sym.finSent);}
\+			{if (output) System.out.println("LEX: Mas"); 
			return new Symbol(sintactico.sym.mas);}
\-			{if (output) System.out.println("LEX: Menos"); 
			return new Symbol(sintactico.sym.menos);}
\*			{if (output) System.out.println("LEX: Por");
			return new Symbol(sintactico.sym.por);}
\/			{if (output) System.out.println("LEX: Entre");
			return new Symbol(sintactico.sym.entre);}
:=			{if (output) System.out.println("LEX: Asignacion");
			return new Symbol(sintactico.sym.asigna);}
"-="		{if (output) System.out.println("LEX: Substraccion");
			return new Symbol(sintactico.sym.substra);}
"^^"		{if (output) System.out.println("LEX: Raiz");
			return new Symbol(sintactico.sym.raiz);}
"=="		{if (output) System.out.println("LEX: Igualacion");
			return new Symbol(sintactico.sym.iguala);}
\>			{if (output) System.out.println("LEX: Mayor_que");
			return new Symbol(sintactico.sym.mayor);}
\<			{if (output) System.out.println("LEX: Menor_que");
			return new Symbol(sintactico.sym.menor);}
\(			{if (output) System.out.println("LEX: Abre-parentesis");
			return new Symbol(sintactico.sym.abre_parentesis);}
\)			{if (output) System.out.println("LEX: Cierra-parentesis");
			return new Symbol(sintactico.sym.cierra_parentesis);}
{ENTERO}	{if (output) System.out.println("LEX: Entero("+yytext()+")"); 
			return new Symbol(sintactico.sym.entero, new Double(yytext()));}
{CADENA}	{if (output) System.out.println("LEX: Cadena("+yytext()+")");
			return new Symbol(sintactico.sym.cadena, yytext());}
{VAR}		{if (output) System.out.println("LEX: Variable("+yytext()+")");
			return new Symbol(sintactico.sym.var, yytext());}
{REAL} 		{if (output) System.out.println("LEX: Real("+yytext()+")"); 
			return new Symbol(sintactico.sym.real, new Double(yytext()));}
{COMMENT}	{if (output) System.out.println("LEX: Comentario " + yytext()); }
{BLANCO} 	{}
[\n\r]		{}
.			{System.out.print(" ERROR_Lexico");}