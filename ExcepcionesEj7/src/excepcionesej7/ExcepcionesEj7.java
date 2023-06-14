/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej7;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*Dado el método metodoB de la clase B, indique:
        
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

        class B {
        
public void metodoB() {
        
    sentencia_b1
try {
    sentencia_b2
} catch (MioException e){
    sentencia_b3
}
finally
    sentencia_b4
 }
        
}*/

//a) Se ejecuta:
//sentencia_b1
//sentencia_b2
//sentencia_b3
//sentencia_b4

//b) Se ejecuta:
//sentencia_b1
//sentencia_b2
//sentencia_b4 <- el finally se ejecuta siempre, se produzca la excepcion o no.

    }
    
}
