/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej2;

import entidades.Clase;

/**
 *
 * @author OvExX
 */
public class ExcepcionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase clase = new Clase();
        String a[]={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
        clase.setArray(a);
        try{
        System.out.println(clase.getArray()[10]);
        }catch(ArrayIndexOutOfBoundsException z){
            System.out.println("El indice al que intenta acceder está fuera del rango del arreglo");  
        }
    }
    
}
