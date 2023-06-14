/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej3y4;

import entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero dn = new DivisionNumero();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
        System.out.println("Ingrese el dividendo");
        dn.setNum1(leer.next());
        System.out.println("Ingrese el divisor");
        dn.setNum2(leer.next());
        dn.parsearYdividir();
        }catch(ArithmeticException a){
            System.out.println("No se puede dividir por cero");      
        }catch(NumberFormatException b){
            System.out.println("Solo se puede operar con numeros");
        }// No se puede catchear una InputMismatchException en un Scanner para String. 
    }    // Esto es para numeros
    
}
