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
public class XtraHotel extends Alojamiento{
    protected boolean privado;
    protected double area;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public XtraHotel() {
    }
    
    public XtraHotel(boolean privado, double area, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.area = area;
    }

    public void crearAEH(){
        super.crearAlojamiento();
        System.out.println("Es el alojamiento privado?(S/n)");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.next();
        }
        opc.toUpperCase();
        if (opc.equals("S")) {
            privado = true;
        }else{
            privado = false;
        }
        System.out.println("Ingrese el area cubierta en metros cuadrados");
        area = leer.nextDouble();
        
    }
    
    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "\n Tipo: Alojamiento Extra Hotelero" + "\n El alojamiento es privado?: " + privado + "\n Area en metros cuadrados: " + area ;
    }
    
    
    
    
}
