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
public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public void crearEdificio(){
        System.out.println("Ingrese el alto del edificio en metros");
        alto = leer.nextInt();
        System.out.println("Ingrese el ancho");
        ancho = leer.nextInt();
        System.out.println("Ingrese el largo");
        largo = leer.nextInt();
        leer.nextLine();
    }
    
    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    
}
