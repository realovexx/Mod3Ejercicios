/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author OvExX
 */
public class aMotor extends Barco{
    protected Integer CV;

    public aMotor() {
    }

    public aMotor(Integer CV, String matricula, Double eslora, int modelo) {
        super(matricula, eslora, modelo);
        this.CV = CV;
    }

    public void crearBarcoAMotor(){
        super.crearBarco();
        System.out.println("Ingrese la potencia del barco en CV");
        CV = leer.nextInt();
    }
        
    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Tipo: Barco a Motor" + "\n Potencia: " + CV +"CV"+ '}';
    }
    
    
}
