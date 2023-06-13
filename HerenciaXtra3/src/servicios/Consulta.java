/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author OvExX
 */
public class Consulta /*implements Comparable<Alojamiento>*/ {

    private Scanner leer;

    public Consulta() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void todosAlojamientos(List<Alojamiento> z) {
        for (Alojamiento aux : z) {
            System.out.println(aux.toString());
            System.out.println("");
        }
    }

    public void hotelesOrdenados(List<Alojamiento> z) {
        List<Hotel> listhotel = new ArrayList();
        for (Alojamiento aux : z) {
            if (aux instanceof Hotel) {
                listhotel.add((Hotel) aux);
            }
        }
        Collections.sort(listhotel, Comparadores.ordenarPorPrecio);
        for (Hotel aux : listhotel) {
            System.out.println(aux.toString());
            System.out.println("");
        }
    }

    public void campingsResto(List<Alojamiento> z) {
        for (Alojamiento aux : z) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isResto()) {
                    System.out.println(aux.toString());
                    System.out.println("");
                }
            }
        }
    }

    public void resiDesc(List<Alojamiento> z) {
        for (Alojamiento aux : z) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescGremio()) {
                    System.out.println(aux.toString());
                    System.out.println("");
                }
            }
        }
    }
    
    public void menu(List<Alojamiento> z){
        int opc;
        do {            
            System.out.println("Menu");
            System.out.println("");
            System.out.println("1.- Mostrar todos los alojamientos");
            System.out.println("2.- Mostrar todos los Hoteles ordenados por precio");
            System.out.println("3.- Mostrar todos los Camping que tengan Restaurant");
            System.out.println("4.- Mostrar todas las Residencias que tengan descuento por Gremio");
            System.out.println("5.- Salir.");
            opc = leer.nextInt();
            while (opc<0 || opc >5){
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.nextInt();
            }
            switch (opc){
                case 1:
                    todosAlojamientos(z);
                    break;
                case 2:
                    hotelesOrdenados(z);
                    break;
                case 3:
                    campingsResto(z);
                case 4:
                    resiDesc(z);
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 5);
    }
}
