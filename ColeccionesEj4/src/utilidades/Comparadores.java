/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author OvExX
 */
public class Comparadores {
    
   public static Comparator<Pelicula> compDuracion = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
       }
   };
       public static Comparator<Pelicula> compTitulo = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
       }
   };   
       public static Comparator<Pelicula> compDirector = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
       }
   };  
}
