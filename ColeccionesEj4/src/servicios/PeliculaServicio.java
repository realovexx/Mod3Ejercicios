/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author OvExX
 */
public class PeliculaServicio {
    private ArrayList<Pelicula> listPeli;
    private Scanner leer;
        public PeliculaServicio() {
        this.listPeli = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    public void guardarListaPeli(){
        String opc;
        System.out.println("Guardaremos los datos de las peliculas");
        do{
        Pelicula peli = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Ahora su director");
        peli.setDirector(leer.next());
        System.out.println("Por ultimo, su duracion en horas");
        peli.setDuracion(leer.nextInt());
        listPeli.add(peli);
        System.out.println("Desea ingresar otra pelicula? S/n");
        opc = leer.next();
        }while(opc.equalsIgnoreCase("s"));
    }
    public void mostrar(){
        for (Pelicula aux : listPeli){
            System.out.println(aux);
        }
    }
    public void ordenarDuracionAsc(){
    // 
    Collections.sort(listPeli, Comparadores.compDuracion);
    mostrar() ;  
    }
    public void ordenarDuracionDesc(){
    Collections.sort(listPeli, Comparadores.compDuracion);
    Collections.reverse(listPeli);
    mostrar() ;  
    }
    public void ordenarTitulo(){
    listPeli.sort(Comparadores.compTitulo);
    mostrar()   ;
    }
    public void ordenarDirector(){
    listPeli.sort(Comparadores.compDirector);
    mostrar();
}
    
}
