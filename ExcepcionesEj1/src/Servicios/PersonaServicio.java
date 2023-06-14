/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class PersonaServicio {
    

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A continuación, ingrese sus datos");
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su sexo (H: hombre, M: mujer, O: otro)");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Ingreso invalido, intentelo nuevamente");
            sexo = leer.next();
        }
        System.out.println("Ingrese su peso en Kg");
        double peso = leer.nextDouble();
        System.out.println("Por ultimo, ingrese su altura en mm");
        int altura = leer.nextInt();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Persona wacho) {
       return wacho.getEdad() >= 18;
    }
    
    public int calcularIMC(Persona wacho){
        double alt = (double) wacho.getAltura()/100;
        double imc = wacho.getPeso()/(Math.pow(alt, 2));
        if (imc < 20){
            return -1;
        }else if (imc>=20 && imc <= 25){
            return 0;
        }else{
            return 1;
        }
        }
    
    public void infoPersona(Persona wacho){
          System.out.println("La persona " + wacho.getNombre() + " es mayor de edad?: " +esMayorDeEdad(wacho));
        if (calcularIMC(wacho) == -1) {
            System.out.println(wacho.getNombre() + " está por debajo de su peso ideal.");
        } else if (calcularIMC(wacho) == 0) {
            System.out.println(wacho.getNombre() + " está en su peso ideal.");
        } else {
            System.out.println(wacho.getNombre() + " está por arriba de su peso ideal.");
        }
    }
}
