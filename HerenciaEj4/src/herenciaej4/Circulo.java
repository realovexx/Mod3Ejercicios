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
public abstract class Circulo implements calculosFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    @Override
    public void calcularArea(){
        System.out.println("Ingrese el radio del circulo");
        double radio = leer.nextDouble();
        double area = PI*Math.pow(radio, 2);
        System.out.println("El area del circulo da "+area);
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("Ingrese el diámetro del circulo (radio x 2)");
        double diam = leer.nextDouble();
        double perim = PI*diam;
        System.out.println("El perimetro del circulo da "+perim);
    }
}
