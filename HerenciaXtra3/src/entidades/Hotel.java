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
public abstract class Hotel extends Alojamiento{
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected double precioHab;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }
    
    public void crearHotel(){
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de pisos del hotel");
        pisos = leer.nextInt();
        System.out.println("Ingrese la cantidad total de habitaciones");
        habitaciones = leer.nextInt();
        System.out.println("Ingrese la cantidad de camas");
        camas = leer.nextInt();
    }

    public abstract void calcularPrecioHab();
    
    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
}
