/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaej4;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public abstract class Rectangulo implements calculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    @Override
    public void calcularArea(){
        System.out.println("Ingrese el tamaño de la base");
        int base = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura");
        int altura = leer.nextInt();
        int area = base*altura;
        System.out.println("El area del rectangulo es "+area);
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("Ingrese el tamaño de la base");
        int base = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura");
        int altura = leer.nextInt();  
        int perim = (base+altura)*2;
        System.out.println("El perimetro del rectangulo es "+perim);
    }
}
