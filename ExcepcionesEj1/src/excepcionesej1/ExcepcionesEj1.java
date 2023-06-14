/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej1;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona wacho = null;
        PersonaServicio ps = new PersonaServicio();
        try{
        System.out.println(ps.esMayorDeEdad(wacho));
       }catch(NullPointerException a){
            System.out.println("No se puede obtener edad de un objeto vacio");
        }
    }
    
}
