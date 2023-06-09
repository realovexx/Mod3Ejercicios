/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public final class Gato extends Animal{
        private String razaGato;
    
    public Gato(String razaGato, String nombre, String alimento, int edad){
        super (nombre, alimento, edad);
        this.razaGato = razaGato;
    }
    @Override
  public void alimentarse(){
        System.out.println("El gato "+nombre+" es un "+razaGato+" de "+edad+" años, y le gusta comer "+alimento);
  }
}
