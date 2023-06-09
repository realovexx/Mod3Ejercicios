/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Alquiler {
    private String nombre;
    private int dni;
    private Date inicio;
    private Date fin;
    private int posicion;
    private Barco barco;
    private Scanner leer;

    public Alquiler() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alquiler(String nombre, int dni, Date inicio, Date fin, int posicion, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.inicio = inicio;
        this.fin = fin;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Datos de Alquiler: " + "\n Nombre del Solicitante: " + nombre + "\n DNI: " + dni + "\n Fecha de inicio: " + inicio + "\n Fecha de fin: " + fin + "\n Posicion de amarre: " + posicion + "\n Unidad: " + barco + '}';
    }
    
    
}
