
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package sintactico;

import lexico.Yylex;
import java.io.FileReader;
import java.lang.Math;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\003\004\000\002\003\003\000\002\004\003" +
    "\000\002\004\006\000\002\004\006\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\012\005\000\002" +
    "\012\005\000\002\012\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\003\000\002\011\005\000\002\011\003" +
    "\000\002\010\005\000\002\010\005\000\002\010\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\005\000\002" +
    "\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\004\004\005\001\002\000\004\002\064\001" +
    "\002\000\010\005\013\006\011\020\007\001\002\000\010" +
    "\005\ufffd\006\ufffd\020\ufffd\001\002\000\006\014\056\026" +
    "\057\001\002\000\010\005\055\006\011\020\007\001\002" +
    "\000\014\015\023\016\021\017\016\020\025\021\015\001" +
    "\002\000\010\005\ufffc\006\ufffc\020\ufffc\001\002\000\004" +
    "\002\uffff\001\002\000\004\007\053\001\002\000\012\015" +
    "\023\016\021\020\025\021\015\001\002\000\004\007\050" +
    "\001\002\000\026\007\uffec\010\uffec\011\uffec\012\uffec\013" +
    "\uffec\022\uffec\023\uffec\024\uffec\025\uffec\027\045\001\002" +
    "\000\020\007\ufff1\010\ufff1\011\ufff1\022\ufff1\023\ufff1\024" +
    "\ufff1\025\ufff1\001\002\000\026\007\uffeb\010\uffeb\011\uffeb" +
    "\012\uffeb\013\uffeb\022\uffeb\023\uffeb\024\uffeb\025\uffeb\027" +
    "\uffeb\001\002\000\024\007\uffef\010\uffef\011\uffef\012\041" +
    "\013\042\022\uffef\023\uffef\024\uffef\025\uffef\001\002\000" +
    "\026\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea\022\uffea" +
    "\023\uffea\024\uffea\025\uffea\027\uffea\001\002\000\016\007" +
    "\033\010\027\011\030\023\026\024\032\025\031\001\002" +
    "\000\026\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\022" +
    "\uffe8\023\uffe8\024\uffe8\025\uffe8\027\uffe8\001\002\000\012" +
    "\015\023\016\021\020\025\021\015\001\002\000\012\015" +
    "\023\016\021\020\025\021\015\001\002\000\012\015\023" +
    "\016\021\020\025\021\015\001\002\000\012\015\023\016" +
    "\021\020\025\021\015\001\002\000\012\015\023\016\021" +
    "\020\025\021\015\001\002\000\010\005\ufff9\006\ufff9\020" +
    "\ufff9\001\002\000\010\007\ufff5\010\027\011\030\001\002" +
    "\000\010\007\ufff4\010\027\011\030\001\002\000\020\007" +
    "\ufff2\010\ufff2\011\ufff2\022\ufff2\023\ufff2\024\ufff2\025\ufff2" +
    "\001\002\000\020\007\ufff3\010\ufff3\011\ufff3\022\ufff3\023" +
    "\ufff3\024\ufff3\025\ufff3\001\002\000\010\007\ufff6\010\027" +
    "\011\030\001\002\000\012\015\023\016\021\020\025\021" +
    "\015\001\002\000\012\015\023\016\021\020\025\021\015" +
    "\001\002\000\024\007\uffed\010\uffed\011\uffed\012\uffed\013" +
    "\uffed\022\uffed\023\uffed\024\uffed\025\uffed\001\002\000\024" +
    "\007\uffee\010\uffee\011\uffee\012\uffee\013\uffee\022\uffee\023" +
    "\uffee\024\uffee\025\uffee\001\002\000\012\015\023\016\021" +
    "\020\025\021\015\001\002\000\024\007\uffec\010\uffec\011" +
    "\uffec\012\uffec\013\uffec\022\uffec\023\uffec\024\uffec\025\uffec" +
    "\001\002\000\024\007\ufff0\010\ufff0\011\ufff0\012\041\013" +
    "\042\022\ufff0\023\ufff0\024\ufff0\025\ufff0\001\002\000\010" +
    "\005\ufff8\006\ufff8\020\ufff8\001\002\000\010\010\027\011" +
    "\030\022\052\001\002\000\026\007\uffe9\010\uffe9\011\uffe9" +
    "\012\uffe9\013\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9\027" +
    "\uffe9\001\002\000\010\005\ufff7\006\ufff7\020\ufff7\001\002" +
    "\000\010\005\ufffe\006\ufffe\020\ufffe\001\002\000\004\002" +
    "\000\001\002\000\012\015\023\016\021\020\025\021\015" +
    "\001\002\000\012\015\023\016\021\020\025\021\015\001" +
    "\002\000\010\007\061\010\027\011\030\001\002\000\010" +
    "\005\ufffa\006\ufffa\020\ufffa\001\002\000\010\007\063\010" +
    "\027\011\030\001\002\000\010\005\ufffb\006\ufffb\020\ufffb" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\004\002\003\001\001\000\002\001\001\000" +
    "\010\003\007\004\005\005\011\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\053\005\011\001\001\000" +
    "\014\006\023\007\016\010\021\011\017\012\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\006\050\007\016\010\021\011\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\006\037\007\016\010\021\011" +
    "\017\001\001\000\010\007\016\010\021\011\036\001\001" +
    "\000\010\007\016\010\021\011\035\001\001\000\012\006" +
    "\034\007\016\010\021\011\017\001\001\000\012\006\033" +
    "\007\016\010\021\011\017\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\043\001\001\000" +
    "\004\007\042\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\007\045\010\046\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\006\061\007\016\010\021\011\017\001\001" +
    "\000\012\006\057\007\016\010\021\011\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   public static void main(String args[]) throws Exception {
		      parser p = new parser(new Yylex(new FileReader(args[0])));      
		      System.out.println("\n Análisis sintáctico: ");
		      System.out.println("-----------------------------------------\n");
		      p.parse();
    } // End Main
                            
	public parser (java.io.Reader input) { super(new lexico.Yylex(input)); }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


	NewHashMap variables = new NewHashMap();
	boolean output = false;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= inicio BLOQUE fin 
            {
              Object RESULT =null;
		 if (output) System.out.println("\tSINT: PROGRAMA <- inicio BLOQUE fin"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAMA ::= inicio fin 
            {
              Object RESULT =null;
		 if (output) System.out.println("\tSINT: PROGRAMA <- inicio fin"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // BLOQUE ::= BLOQUE INSTRUCCION 
            {
              Object RESULT =null;
		 if (output) System.out.println("\tSINT: BLOQUE <- BLOQUE INSTRUCCION"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // BLOQUE ::= INSTRUCCION 
            {
              Object RESULT =null;
		 if (output) System.out.println("\tSINT: BLOQUE <- INSTRUCCION"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INSTRUCCION ::= IMPRIMIR 
            {
              Object RESULT =null;
		 
					if (output) System.out.println("\tSINT: INSTRUCCION <- IMPRIMIR"); 
			   	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INSTRUCCION ::= var asigna EXPRESION finSent 
            {
              Object RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
			   		if (output) System.out.println("\tSINT: INSTRUCCION <- var asigna EXPRESION finSent");
			   		variables.put(v,e);
			   	
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INSTRUCCION ::= var substra EXPRESION finSent 
            {
              Object RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String v1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
					if (output) System.out.println("\tSINT: INSTRUCCION <- var substra EXPRESION"); 
					RESULT = variables.get(v1) - e1;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // IMPRIMIR ::= imprime EXPRESION finSent 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
				if (output) System.out.println("\tSINT: IMPRIMIR <- imprime EXPRESION finSent"); 
				System.out.println(e);
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // IMPRIMIR ::= imprime cadena finSent 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
				if (output) System.out.println("\tSINT: IMPRIMIR <- imprime cadena finSent"); 
				System.out.println(c);
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // IMPRIMIR ::= imprime LOGICO finSent 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
				if (output) System.out.println("\tSINT: IMPRIMIR <- imprime LOGICO finSent"); 
				System.out.println(l);
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // LOGICO ::= EXPRESION iguala EXPRESION 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: LOGICO <- EXPRESION iguala EXPRESION");
					RESULT = e1.equals(e2);							
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LOGICO",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LOGICO ::= EXPRESION mayor EXPRESION 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: LOGICO <- EXPRESION mayor EXPRESION");
					RESULT = e1 > e2;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LOGICO",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LOGICO ::= EXPRESION menor EXPRESION 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: LOGICO <- EXPRESION menor EXPRESION");
					RESULT = e1 < e2;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("LOGICO",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPRESION ::= EXPRESION mas RAIZ 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: EXPRESION <- EXPRESION mas RAIZ");
					RESULT = e + r;							
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESION ::= EXPRESION menos RAIZ 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: EXPRESION <- EXPRESION menos RAIZ");
					RESULT = e - r;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESION ::= RAIZ 
            {
              Double RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
					if (output) System.out.println("\tSINT: EXPRESION <- RAIZ"); 
					RESULT = r;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // RAIZ ::= FACTOR raiz TERMINO 
            {
              Double RESULT =null;
		int f1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int f1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double f1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int t2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int t2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: RAIZ <- FACTOR raiz TERMINO");
					RESULT = Math.pow(f1,1/t2);							
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RAIZ",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // RAIZ ::= TERMINO 
            {
              Double RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
					if (output) System.out.println("\tSINT: RAIZ <- TERMINO"); 
					RESULT = t;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RAIZ",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // TERMINO ::= TERMINO por FACTOR 
            {
              Double RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: TERMINO <- TERMINO por FACTOR"); 	
					RESULT = t * e;							
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERMINO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TERMINO ::= TERMINO entre FACTOR 
            {
              Double RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double t = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: TERMINO <- TERMINO entre FACTOR");
					RESULT = t / e;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERMINO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // TERMINO ::= FACTOR 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double f = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
					if (output) System.out.println("\tSINT: TERMINO <- FACTOR");
					RESULT = f;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERMINO",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // FACTOR ::= entero 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
				if (output) System.out.println("\tSINT: FACTOR <- entero"); 
				RESULT = e;
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // FACTOR ::= real 
            {
              Double RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double r = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
				if (output) System.out.println("\tSINT: FACTOR <- real"); 
				RESULT = r;
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // FACTOR ::= abre_parentesis EXPRESION cierra_parentesis 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                	if (output) System.out.println("\tSINT: TERMINO <- abre_parentesis EXPRESION cierra_parentesis");
					RESULT = (e);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // FACTOR ::= var 
            {
              Double RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
				if (output) System.out.println("\tSINT: FACTOR <- var"); 
				RESULT = variables.get(v);
			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
