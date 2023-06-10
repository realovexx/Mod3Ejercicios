/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaxtra3;

import entidades.Camping;
import entidades.CincoE;
import entidades.CuatroE;
import entidades.Residencia;

/**
 *
 * @author OvExX
 */
public class HerenciaXtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuatroE h1 = new CuatroE();
        CincoE h2 = new CincoE();
        Camping c = new Camping();
        Residencia r = new Residencia();
        h1.crearHotel4estrellas();
        h1.calcularPrecioHab();
        System.out.println("Precio: "+h1.getPrecioHab());
        System.out.println(h1.toString());
        h2.crearHotel5Estrellas();
        h2.calcularPrecioHab();
        System.out.println("Precio: "+h2.getPrecioHab());
        System.out.println(h2.toString());
        c.crearCamping();
        System.out.println(c.toString());
        r.crearResidencia();
        System.out.println(r.toString());
        
    }
    
}
