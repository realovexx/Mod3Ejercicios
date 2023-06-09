/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class Persona {
    private String nombre;
    private Dni du;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni du) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.du = du;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDu() {
        return du;
    }

    public void setDu(Dni du) {
        this.du = du;
    }
        
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", du=" + du + '}';
    }
    private String apellido;
}
