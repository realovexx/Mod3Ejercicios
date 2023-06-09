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
public class Polideportivo extends Edificio {
    public String nombre;
    public boolean techado;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public void crearPoli(){
        System.out.println("Carga de Polideportivo:");
        System.out.println(">-----------------------<");
        super.crearEdificio();
        System.out.println("Ingrese el nombre del Polideportivo");
        nombre = leer.nextLine();
        System.out.println("Es un predio techado? (S/n)");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido. Ingrese S o N");
            opc = leer.next();
        }
        if (opc.equalsIgnoreCase("s")){
            techado = true;
        }else{
            techado = false;
        }
    }
    
    @Override
    public void calcularSuperficie(){
        int superficie = ancho*largo;
        System.out.println("La superficie del polideportivo es de: "+superficie);
    }
    
    @Override
    public void calcularVolumen(){
        int volumen = ancho*largo*alto;
        System.out.println("El volumen del polideportivo es de: "+volumen);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }


    
}
