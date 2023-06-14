/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej8;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
        
class Uno{
private static int metodo() {
int valor=0;
try {
valor = valor+1;
valor = valor + Integer.parseInt (”42”);
valor = valor +1;
System.out.println(”Valor final del try:” + valor) ;
} catch (NumberFormatException e) {
Valor = valor + Integer.parseInt(”42”);
System.out.println(“Valor final del catch:” + valor);
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor +1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
11
public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
}
}  <- en clase Uno, no va a haber excepciones, por lo que se ejecutaran las lineas 26 
}  <- (con valor 44), la linea 32 (con valor 45), la linea 35 (con valor 46), y el retorno 46.
        
        
        
class Dos{
private static int metodo() {
int valor=0;
try{
valor = valor + 1;                                       <- valor =1
valor = valor + Integer.parseInt (”W”);                  <- esto gatilla la excepcion
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt (”42”);                 <- ejecuta el catch. valor = 1+42
System.out.println(”Valor final del catch: ” + valor) ;  <- primera impresion con valor 43
} finally {
valor = valor + 1;                                       <- valor = 43+1
System.out.println(”Valor final del finally: ” + valor) ;<- segunda impresion con valor 44
}
valor = valor + 1;                                       <- valor = 44+1
System.out.println(”Valor antes del return: ” + valor) ; <- tercera impresion con valor 45
return valor;                                            <- cuarta impresion con valor 45
}
public static void main (String[] args) {
try{
System.out.println ( metodo ( ) ) ;
} catch(Exception e) {
System.err.println ( ” Excepcion en metodo ( ) ” ) ;    <- Esto no se ejecuta. porque ya se lidio con la excepcion en el catch.
e.printStackTrace();
}
}
 }

        
        
class Tres{
private static int metodo( ) {
int valor=0;
try{
valor = valor + 1;                                       <- valor =1
valor = valor + Integer.parseInt (”W”);                  <- esto gatilla la excepcion
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt (”W”);                 <- ejecuta el catch. pero genera otra excepcion
System.out.println(”Valor final del catch: ” + valor);
} finally{
valor = valor + 1;
System.out.println(”Valor final del finally:” + valor); <- esto deberia tirar valor 1, ya que no puede sumarle W
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;<- y esto deberia dar valor 2.
return valor;
}
public static void main (String[] args) {
try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println(”Excepcion en metodo ( ) ” ) ;       <- como la excepcion sobrevivio al catch, se ejecuta esto
e.printStackTrace();                                    <- y se muestra el path del error (NuymberFormatException)
}
}
}*/
    }
    
}
