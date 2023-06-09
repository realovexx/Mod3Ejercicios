/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesej2;

import entidades.Equipo;
import entidades.Jugador;

/**
 *
 * @author OvExX
 */
public class RelacionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo eq = new Equipo();
        eq.llenarEquipo();
        for (Jugador aux : eq.getTeam()) {
            System.out.println(aux);
        }
    }
    
}
