/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamanyo;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanyo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanyo = tamanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString() {
        return "Perro{" + "\nnombre=" + nombre + ", \nraza=" + raza + ", \nedad=" + edad + ", \ntamaño=" + tamanyo + '}';
    }
     
}
