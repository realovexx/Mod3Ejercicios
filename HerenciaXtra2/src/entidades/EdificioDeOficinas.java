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
public class EdificioDeOficinas extends Edificio{
    public int nOfis;
    public int persXofi;
    public int nPisos;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nOfis, int persXofi, int nPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nOfis = nOfis;
        this.persXofi = persXofi;
        this.nPisos = nPisos;
    }
    
    public void crearOfi(){
        System.out.println("Carga de Edificio de Oficinas:");
        System.out.println(">-----------------------------<");
        super.crearEdificio();
        System.out.println("Ingrese la cantidad de pisos");
        nPisos = leer.nextInt();
        System.out.println("ingrese la cantidad total de oficinas (Max 1 por piso)");
        nOfis = leer.nextInt();
        while (nOfis>nPisos){
            System.out.println("No puede haber mas oficinas que pisos, intentelo nuevamente");
            nOfis = leer.nextInt();
        }
        System.out.println("Cuantas personas pueden trabajar en cada oficina?");
        persXofi = leer.nextInt();
    }
    
    @Override
    public void calcularSuperficie(){
        int superficie = ancho*largo*nOfis;
        System.out.println("La superficie total del edificio es "+superficie);
    }
    
    @Override
    public void calcularVolumen(){
        int volumen = ancho*largo*alto;
        System.out.println("El volumen del edificio es de: "+volumen);
    }
    
    public void cantPersonas(){
        int persTotal = persXofi*nOfis;
        System.out.println("En este edificio entran "+persXofi+" personas por oficina");
        System.out.println("Por lo que entran "+persTotal+" en todo el edificio");
    }
    
    public int getnOfis() {
        return nOfis;
    }

    public void setnOfis(int nOfis) {
        this.nOfis = nOfis;
    }

    public int getPersXofi() {
        return persXofi;
    }

    public void setPersXofi(int persXofi) {
        this.persXofi = persXofi;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    
    
}
