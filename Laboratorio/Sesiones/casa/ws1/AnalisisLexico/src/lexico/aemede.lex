/* Fichero: ejemplo.lex */
package lexico;
import java.io.InputStreamReader;
import java.lang.System;
%%
%char
%public
%standalone
%full

DIGITOS = [0-9]

LETRAS = [a-zA-Z]
MINUSCULAS = [a-z]
MAYUSCULAS = [A-Z]

ALFANUM = ({LETRAS}|{DIGITOS})

UO = [uU][oO]{DIGITOS}{4,6}

NOMBRE = {LETRAS}(\.?{ALFANUM})*

DOMINIO = (uniovi\.)((es)|(com))

CORREO = {NOMBRE}@{DOMINIO}

BLANCO = " "|"	"

SIGNO = "-"
ENTEROS = {SIGNO}?{DIGITOS}+
REALES = {SIGNO}?{DIGITOS}+"."{DIGITOS}+

ASIGNACION = ":="
VARIABLE = {MINUSCULAS}"_"?{ALFANUM}*

SIMBOLOS =["+""-""*""/""y"]
CADENA = {CADENACONCOMILLASSIMPLES}|{CADENACONCOMILLASDOBLES}

CADENACONCOMILLASSIMPLES = \' ({BLANCO}?{ALFANUM}?{BLANCO}?{SIMBOLOS}?)* \'
CADENACONCOMILLASDOBLES =  \" ({BLANCO}?{ALFANUM}?{BLANCO}?{SIMBOLOS}?)* \"

%%
"inicio" {System.out.print(" Palabra_reservada(inicio)");}
"fin" {System.out.print(" Palabra_reservada(fin)");}
{ASIGNACION} {System.out.print(" Palabra_reservada(asigna)");}
"imprime" {System.out.print(" Palabra_reservada(imprime)");}
; {System.out.print(" FinSentencia");}
\+ {System.out.print(" Mas");}
\- {System.out.print(" Menos");}
\* {System.out.print(" Por");}
\/ {System.out.print(" Entre");}
\( {System.out.print(" Abre-Par");}
\) {System.out.print(" Cierra-Par");}
{CADENA} {System.out.print(" Cadena("+yytext()+")");}
{VARIABLE} {System.out.print(" Variable("+yytext()+")");}
{ENTEROS} {System.out.print(" Entero("+yytext()+")");}
{REALES} {System.out.print(" Real("+yytext()+")");}

" " { }
\n {System.out.print(yytext());}
{UO} {System.out.print(" Usuario detectado");}
{CORREO} {System.out.print( " Dominio detectado");}
{BLANCO} {System.out.print(yytext());}
. {System.out.print(" ERROR_Lexico");}
