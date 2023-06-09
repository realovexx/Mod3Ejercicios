/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public final class Caballo extends Animal{
        private String razaCaballo;
    
    public Caballo(String razaCaballo, String nombre, String alimento, int edad){
        super (nombre, alimento, edad);
        this.razaCaballo = razaCaballo;
    }
    @Override
  public void alimentarse(){
        System.out.println("El perro "+nombre+" es un "+razaCaballo+" de "+edad+" años, y le gusta comer "+alimento);
  }
}
