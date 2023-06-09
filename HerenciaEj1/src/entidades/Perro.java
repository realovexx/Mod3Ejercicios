/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public final class Perro extends Animal{

    private String razaPerro;
    
    public Perro(String razaPerro, String nombre, String alimento, int edad){
        super (nombre, alimento, edad);
        this.razaPerro = razaPerro;
    }
    @Override
  public void alimentarse(){
        System.out.println("El perro "+nombre+" es un "+razaPerro+" de "+edad+" años, y le gusta comer "+alimento);
  }
}
