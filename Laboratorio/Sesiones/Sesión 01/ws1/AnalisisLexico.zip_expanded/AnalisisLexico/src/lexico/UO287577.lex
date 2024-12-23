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

SIGNO_NEGATIVO = "-"
SIGNO_POSITIVO = "+"
SIGNO = {SIGNO_NEGATIVO}|{SIGNO_POSITIVO}

ENTEROS = {SIGNO_NEGATIVO}?{DIGITOS}+

REALES = {SIGNO}?{DIGITOS}+"."{DIGITOS}+
REALES_CON_EXPONENTE = {REALES}([eE]{SIGNO}?{DIGITOS}+)?

ASIGNACION = ":="
VARIABLE = {MINUSCULAS}"_"?{ALFANUM}*

SIMBOLOS_PARA_CADENA =["+""-""*""/""y"]
SIMBOLO = " "|"+"|"-"|"*"|"/"|"("|")"
SIMBOLOS_NO_VALIDOS_PYTHON = [^;:\n\r#-]

TEXTO = ({BLANCO}?{ALFANUM}?{BLANCO}?)*

TEXTOCADENA = {TEXTO}({SIMBOLOS_PARA_CADENA}?{BLANCO}?)*
CADENA = ( \' {TEXTOCADENA} \')|( \" {TEXTOCADENA} \" )


LINEA = {SIMBOLO}+
DOBLEBARRA = "//"

COMENTARIO = {DOBLEBARRA}{LINEA}?{TEXTO}{LINEA}?

COMENTARIO_PYTHON = "#"{TEXTO}({SIMBOLOS_NO_VALIDOS_PYTHON}?{BLANCO}?)*

OCTALES_SIN_CERO = [1-7]

NUMEROS_OCTALES_CON_CERO = {SIGNO}?"0o"0
NUMEROS_OCTALES_SIN_CERO = {SIGNO}?"0o"{OCTALES_SIN_CERO}+

NUMEROS_OCTALES = {NUMEROS_OCTALES_CON_CERO}|{NUMEROS_OCTALES_SIN_CERO}

LISTA = ({NUMEROS_OCTALES}{BLANCO}*","{BLANCO}*{NUMEROS_OCTALES}{BLANCO}*","{BLANCO}*{NUMEROS_OCTALES})+

LISTA_UN_OCTAL = "("{NUMEROS_OCTALES}")"
LISTA_VARIOS_OCTALES = "("{LISTA}")"
LISTAS_OCTALES = {LISTA_UN_OCTAL}|{LISTA_VARIOS_OCTALES}

%%
"inicio" {System.out.print(" Palabra_reservada(inicio)");}
"fin" {System.out.print(" Palabra_reservada(fin)");}
{ASIGNACION} {System.out.print(" Palabra_reservada(asigna)");}
"imprime" {System.out.print(" Palabra_reservada(imprime)");}
{COMENTARIO} {System.out.print(" Comentario("+yytext()+")");}
{COMENTARIO_PYTHON} {System.out.print(" Comentario Python("+yytext()+")");}
; {System.out.print(" FinSentencia");}
\+ {System.out.print(" Mas");}
\- {System.out.print(" Menos");}
\* {System.out.print(" Por");}
\/ {System.out.print(" Entre");}
\( {System.out.print(" Abre-Par");}
\) {System.out.print(" Cierra-Par");}
{LISTAS_OCTALES} {System.out.print(" Lista octales("+yytext()+")");}
{NUMEROS_OCTALES} {System.out.print(" Número octal("+yytext()+")");}
{CADENA} {System.out.print(" Cadena("+yytext()+")");}
{VARIABLE} {System.out.print(" Variable("+yytext()+")");}
{ENTEROS} {System.out.print(" Entero("+yytext()+")");}
{REALES} {System.out.print(" Real("+yytext()+")");}
{REALES_CON_EXPONENTE} {System.out.print(" Real con exponente("+yytext()+")");}
" " { }
\n {System.out.print(yytext());}
{UO} {System.out.print(" Usuario detectado");}
{CORREO} {System.out.print( " Dominio detectado");}
{BLANCO} {System.out.print(yytext());}
. {System.out.print(" ERROR_Lexico");}