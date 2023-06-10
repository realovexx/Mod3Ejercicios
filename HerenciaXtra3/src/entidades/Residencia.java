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
public final class Residencia extends XtraHotel{
   private int habs;
   private boolean descGremio;
   private boolean campDeport;
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Residencia() {
    }

    public Residencia(int habs, boolean descGremio, boolean campDeport, boolean privado, double area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.habs = habs;
        this.descGremio = descGremio;
        this.campDeport = campDeport;
    }

    public void crearResidencia(){
        super.crearAEH();
        System.out.println("Ingrese la cantidad de habitaciones de la Residencia");
        habs = leer.nextInt();
        System.out.println("Se hacen descuentos segun Gremio?");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.next();
        }
        opc.toUpperCase();
        if (opc.equals("S")) {
            descGremio = true;
        }else{
            descGremio = false;
        }
        System.out.println("Tiene campo deportivo?");
        opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.next();
        }
        opc.toUpperCase();
        if (opc.equals("S")) {
            campDeport = true;
        }else{
            campDeport = false;
        }
    }
    
    public int getHabs() {
        return habs;
    }

    public void setHabs(int habs) {
        this.habs = habs;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampDeport() {
        return campDeport;
    }

    public void setCampDeport(boolean campDeport) {
        this.campDeport = campDeport;
    }
   
   
}
