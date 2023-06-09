/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
   
    public Animal(String nombre, String alimento, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }

    public abstract void alimentarse();
    
    
    
}
