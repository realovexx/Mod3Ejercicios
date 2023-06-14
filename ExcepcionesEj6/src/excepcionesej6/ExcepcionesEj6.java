/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej6;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     /*   Dado el método metodoA de la clase A, indique:
        
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

        
        class A {
        
public void metodoA() {
        
    sentencia_a1
    sentencia_a2

try {
    sentencia_a3
    sentencia_a4
} catch (MioException e){
    sentencia_a6
 }
        
    sentencia_a5
 }
        
}*/

     //a) Se ejecuta:
     //sentencia_a1
     //sentencia_a2
     //sentencia_a3
     //sentencia_a4   <- Esta puede no ejecutarse si la sentencia_a3 es la que provoca la excepcion
     //sentencia_a6
     
     //b) Se ejecuta:
     //sentencia_a1
     //sentencia_a2
     //sentencia_a3
     //sentencia_a4
     //sentencia_a5 <- Si no se gatilla la excepcion, no se ejecuta el catch
    }
    
}
