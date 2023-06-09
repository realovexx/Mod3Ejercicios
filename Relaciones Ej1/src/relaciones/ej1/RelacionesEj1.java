/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones.ej1;

import entidades.Dni;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona chabon = new Persona();
        Dni d = new Dni();
        System.out.println("Ingresa nombre");
        chabon.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        chabon.setApellido(leer.next());
        System.out.println("Ingrese tipo de documento");
        d.setSerie(leer.next().charAt(0));
        System.out.println("Ingrese numero de documento");
        d.setNum(leer.nextInt());
        chabon.setDu(d);
        System.out.println(chabon.toString());
    }
    
}
