/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesej_ii;

/**
 *
 * @author OvExX
 */
public class RelacionesEj_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego j = new Juego();
        j = j.llenarJuego();
        j.ronda(j);
        
    }
    
}
