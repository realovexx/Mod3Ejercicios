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
public final class Camping extends XtraHotel{
    protected int carpas;
    protected int banos;
    protected boolean resto;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Camping() {
    }

    public Camping(int carpas, int banos, boolean resto, boolean privado, double area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banos = banos;
        this.resto = resto;
    }

    public void crearCamping(){
        super.crearAEH();
        System.out.println("Cual es la capacidad para carpas del camping?");
        carpas = leer.nextInt();
        System.out.println("Cuantos baños tiene?");
        banos = leer.nextInt();
        System.out.println("Cuenta con restaurant?");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.next();
        }
        opc.toUpperCase();
        if (opc.equals("S")) {
            resto = true;
        }else{
            resto = false;
        }
    }
    
    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n Tipo: Camping." + "\n Capacidad máxima de carpas=" + carpas + ""
                + "\n Cantidad de baños: " + banos + "\n Tiene restaurant?: " + resto ;
    }
    
    
}
