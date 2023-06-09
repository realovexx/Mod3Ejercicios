/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class Jugador {
    private String nombre;
    private String apellido;
    private int pos;
    private int num;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int pos, int num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pos = pos;
        this.num = num;
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

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre = " + nombre + ", apellido = " + apellido + ", posicion = " + pos + ", numero = " + num + '}';
    }
    
    
}
