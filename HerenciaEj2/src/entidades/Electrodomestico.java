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
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consE;
    protected Double peso;
  //  protected Scanner leer;

    public Electrodomestico() {
    //    this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomestico(Double precio, String color, char consE, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consE = consE;
        this.peso = peso;
    }

    public void comprobarConsumo(Character cE) {
        char letra = String.valueOf(cE).toUpperCase().charAt(0);
        if (letra >= 'A' && letra < 'F') {
            setConsE(letra);
        } else {
            setConsE('F');
        }
    }

    public void comprobarColor(String color) {
        switch (color.toUpperCase()) {
            case "BLANCO":
                setColor("Blanco");
                break;
            case "NEGRO":
                setColor("Negro");
                break;
            case "ROJO":
                setColor("Rojo");
                break;
            case "AZUL":
                setColor("Azul");
                break;
            case "GRIS":
                setColor("Gris");
                break;
            default:
                setColor("Blanco");
                break;
        }

    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el peso del electrodomestico en Kg");
        Double p = leer.nextDouble();
        while (p<1){
            System.out.println("ingreso invalido, intentelo nuevamente");
            p = leer.nextDouble();
        }
        setPeso(p);
        System.out.println("Ingrese el color del electrodomestico");
        setColor(leer.next());
        comprobarColor(color);
        System.out.println("Ingrese la letra correspondiente al consumo energetico");
        setConsE(leer.next().charAt(0)); 
        comprobarConsumo(consE);
        precioFinal();
        
    }

    public void precioFinal() {
        Double pBase = 1000d;
        switch (consE) {
            case 'A':
                pBase += 1000d;
                break;
            case 'B':
                pBase += 800d;
                break;
            case 'C':
                pBase += 600d;
                break;
            case 'D':
                pBase += 500d;
                break;
            case 'E':
                pBase += 300d;
                break;
            case 'F':
                pBase += 100d;
                break;
        }
        if (peso>=1d && peso<=19d){
            pBase += 100d;
        }else if(peso>=20d && peso<=49d){
           pBase += 500d; 
        }else if(peso>=50d && peso<=79d){
           pBase += 800d; 
        }else{
           pBase += 1000d;
        }
        setPrecio(pBase);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsE() {
        return consE;
    }

    public void setConsE(char consE) {
        this.consE = consE;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}
