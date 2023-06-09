/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, Character consE, Double peso) {
        super(precio, color, consE, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga en Kg del lavarropas");
        Double c = leer.nextDouble();
        while (c<1){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            c = leer.nextDouble();
        }
        setCarga(c); 
        super.precioFinal();
        
       
    }
    
    public void precioFinalL(){
        super.precioFinal();
        Double pBase = getPrecio();
      // System.out.println("Precio generico: "+pBase);
        if (carga>30d){
            pBase += 500;
        }
        setPrecio(pBase);
        System.out.println("Precio final lavadora: "+getPrecio());
    }
    
    
}
