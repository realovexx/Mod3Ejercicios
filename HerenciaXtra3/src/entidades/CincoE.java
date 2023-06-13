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
public final class CincoE extends CuatroE{
    private int cantSalones;
    private int cantSuites;
    private int cantLimo;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CincoE() {
    }

    public CincoE(int cantSalones, int cantSuites, int cantLimo, String gym, String resto, int capResto, int habitaciones, int camas, int pisos, Double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gym, resto, capResto, habitaciones, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public void crearHotel5Estrellas(){
        super.crearHotel4estrellas();
        System.out.println("Ingrese la cantidad de Suites");
        cantSuites = leer.nextInt();
        System.out.println("Ingrese la cantidad de Salones de Conferencias");
        cantSalones = leer.nextInt();
        System.out.println("Ingrese la cantidad de limosinas con las que cuenta el hotel");
        cantLimo = leer.nextInt();
    }
    
    @Override
    public void calcularPrecioHab(){
        super.calcularPrecioHab();
        precioHab += (15*cantLimo);
    }
    
    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "" + "\n Cantidad de Salones de conferencias: " + cantSalones + ""
                + "\n Cantidad de Habitaciones Suites: " + cantSuites + "\n Cantidad de Limosinas disponibles: " + cantLimo ;
    }
    
    
}
