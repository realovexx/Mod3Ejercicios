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
public class Barco {
    protected String matricula;
    protected double eslora;
    protected int modelo;
    protected Scanner leer;

    public Barco() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Barco(String matricula, double eslora, int modelo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.modelo = modelo;
    }
    
    public void crearBarco(){
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la matricula del barco");
        matricula = leer.next();
        System.out.println("Ingrese el tamaño en metros de la eslora (use coma para el decimal)");
        eslora = leer.nextDouble();
        System.out.println("Ingrese el año de fabricacion");
        int anio = leer.nextInt();
        Date d = new Date();
        while (anio>(d.getYear()+1900)){
            System.out.println("No se puede ingresar una fecha futura, intentelo nuevamente");
            anio = leer.nextInt();
        }
        modelo = anio;
    }
        
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Barco: " + "\n Numero de matricula: " + matricula + "\n Tamaño de la eslora: " + eslora + "m \n Año de fabricacion:" + modelo + '}';
    }
    
    
    
}
