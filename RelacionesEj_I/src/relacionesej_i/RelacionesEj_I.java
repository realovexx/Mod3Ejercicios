/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionesej_i;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author OvExX
 */
public class RelacionesEj_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Perro d1 = new Perro("Alita","Negra",5,"Pequeña");
        Perro d2 = new Perro("Pimienta","Calico",4,"Mediana");
        p1.setNombre("Jorge");
        p1.setApellido("Vega");
        p1.setEdad(37);
        p1.setDoc(32267531);
        p1.setPerro(d1);
        p2.setNombre("Lau");
        p2.setApellido("Ortega");
        p2.setEdad(34);
        p2.setDoc(34049617);
        p2.setPerro(d2);
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
    }
    
}
