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
public class Velero extends Barco{
    public int mastiles;
    public Scanner leer;

    public Velero() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Velero(int mastiles, String matricula, Double eslora, int modelo) {
        super(matricula, eslora, modelo);
        this.mastiles = mastiles;
    }
    
    public void crearVelero(){
        super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles en su velero");
        mastiles = leer.nextInt();
    }
    
    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
     //   System.out.println(super.toString());
        return super.toString()+"\nTipo: Velero" + "\n Cantidad de mastiles: " + mastiles + '}';
    }
    
    
}
