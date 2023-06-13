/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Alojamiento;
import entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author OvExX
 */
public class Comparadores {
    
    
public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>(){
    @Override
    public int compare(Hotel hotel1, Hotel hotel2) {
        return hotel2.getPrecioHab().compareTo(hotel1.getPrecioHab());
    }
};
} 
