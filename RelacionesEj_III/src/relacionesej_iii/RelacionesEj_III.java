/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesej_iii;

import entidades.Baraja;
import entidades.Carta;

/**
 *
 * @author OvExX
 */
public class RelacionesEj_III {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b = new Baraja();
        for (Carta aux : b.getMazo()){
            System.out.println(aux.toString());
        }
        
    }
    
}
