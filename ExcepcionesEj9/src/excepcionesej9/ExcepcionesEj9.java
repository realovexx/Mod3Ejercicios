/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej9;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*Dado el método metodoC de la clase C, indique:
        
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
        
        
class C {
        
void metodoC() throws TuException{
    sentencia_c1
try {
    sentencia_c2
    sentencia_c3
} catch (MioException e){
    sentencia_c4
} catch (TuException e){
    sentencia_c5
    throw (e)
}
finally
    sentencia_c6
}
}
*/
       
//a) Se ejecuta:
//sentencia_c1
//sentencia_c2
//sentencia_c3 <- Siempre que la excepcion no este en c2
//sentencia_c4
//sentencia_c6

//b) Se ejecuta
//sentencia_c1
//sentencia_c2
//sentencia_c3 
//sentencia_c6 <- como no se cumple ninguna excepcion, salta al 6

//c) Se ejecuta:
//sentencia_c1
//sentencia_c2
//sentencia_c3 <- Siempre que la excepcion no este en c2
//sentencia_c5
//se imprime la excepcion TuExcepction alojada en otra clase.
//sentencia_c6 <- finally se ejecuta siempre

    }
    
}
