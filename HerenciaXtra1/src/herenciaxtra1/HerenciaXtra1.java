/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaxtra1;

import Servicios.AlquilerServicio;
import entidades.Alquiler;

/**
 *
 * @author OvExX
 */
public class HerenciaXtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlquilerServicio as = new AlquilerServicio();
        Alquiler a = as.nuevoAlq();
        as.calcularAlquiler(a);
        System.out.println(a.toString());
    }
    
}
