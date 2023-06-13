/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class CuatroE extends Hotel{
    protected String gym;
    protected String resto;
    protected int capResto;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuatroE() {
    }

    public CuatroE(String gym, String resto, int capResto, int habitaciones, int camas, int pisos, Double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.resto = resto;
        this.capResto = capResto;
    }
    
    public void crearHotel4estrellas(){
        //System.out.println("A continuacion, ingresaremos los datos del hotel de 4 estrellas.");
        //System.out.println("");
        super.crearHotel();
        System.out.println("Ingrese el tipo de gimnasio (A/B)");
        gym = leer.next();
        while (!gym.equalsIgnoreCase("a")&&!gym.equalsIgnoreCase("b")){
            System.out.println("Ingreso invalido, elija entre A o B");
            gym = leer.next();
        }
        gym = gym.toUpperCase();
        leer.nextLine();
        System.out.println("El hotel incluye un restaurante, ingrese su nombre");
        resto = leer.nextLine();
        System.out.println("Que capacidad tiene el restaurante?");
        capResto = leer.nextInt();
        while (capResto<=0){
            System.out.println("La capacidad del restaurante no puede ser menor a 1");
            System.out.println("Intentelo nuevamente");
            capResto = leer.nextInt();
        }
    }
    
    @Override
    public void calcularPrecioHab(){
        precioHab = 50d+camas;
        if (capResto<30&&capResto>0){
            precioHab += 10;
        }else if(capResto>=30&&capResto<=50){
            precioHab += 30;
        }else{
            precioHab += 50;
        }
        if (gym.equals("A")){
            precioHab += 50;
        }else{
            precioHab += 30;
        }
    }
    
    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getResto() {
        return resto;
    }

    public void setResto(String resto) {
        this.resto = resto;
    }

    public int getCapResto() {
        return capResto;
    }

    public void setCapResto(int capResto) {
        this.capResto = capResto;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n Tiene GYM?: " + gym + "\n Nombre del Restaurant: " + resto + "\n Capacidad del Restaurant: " + capResto ;
    }
    
    
    
}
