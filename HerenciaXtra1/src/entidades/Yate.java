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
public class Yate extends aMotor{
    public Integer camarotes;
    public Scanner leer;

    public Yate() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Yate(Integer camarotes, Integer CV, String matricula, Double eslora, int modelo) {
        super(CV, matricula, eslora, modelo);
        this.camarotes = camarotes;
    }
    
    public void crearYate(){
        super.crearBarcoAMotor();
        System.out.println("Ingrese la cantidad de camarotes del yate");
        camarotes = leer.nextInt();
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Tipo de BAM: Yate de Lujo" + "\n Cantidad de camarotes: " + camarotes + '}';
    }
    
    
}
