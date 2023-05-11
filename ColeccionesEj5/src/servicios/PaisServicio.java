/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author OvExX
 */
public class PaisServicio {
    private Set<String> listaPaises;
    private Scanner leer;

    public PaisServicio() {
        listaPaises = new TreeSet();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void llenarLista(){
        String opc;
        do{
        System.out.println("Ingrese un pais");
        listaPaises.add(leer.next());
            System.out.println("Desea ingresar otro pais?");
            opc = leer.next();
            while(!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.next();
            }
        }while (opc.equalsIgnoreCase("s"));
    }
    
    public void mostrarLista(){
        for (String aux : listaPaises) {
            System.out.println(aux);
        }
    }
    
   /* public void ordenarLista(){
        ArrayList<String> listaOrdenada = new ArrayList(listaPaises);
        Collections.sort(listaOrdenada);
        
    }*/
    
    public void buscarPais(){
        Iterator<String> ite = listaPaises.iterator();
        System.out.println("Que pais desea buscar?");
        String pais = leer.next();
        boolean sino = false;
        while (ite.hasNext()){
            if (ite.next().equalsIgnoreCase(pais)){
                ite.remove();
                sino = true;
            }
        }
        if (!sino){
            System.out.println("El pais no se encuentra en la lista");
        }else{
            mostrarLista();
        }
    }
        public void menu() {
        System.out.println("Completaremos la lista de paises:");
        llenarLista();
        int opc = 0;
        do {
        System.out.println("Menu");
        System.out.println("");
        System.out.println("Seleccione la opcion que desee");
        System.out.println("");
        System.out.println("1. Ingresar mas paises");
        System.out.println("2. Quitar un pais y mostrar la lista");
        System.out.println("3. Mostrar la lista");
        System.out.println("4. Salir");
        opc = leer.nextInt();
        switch (opc) {
                case 1:
                    llenarLista();
                    break;
                case 2:
                    buscarPais();
                    break;
                case 3:
                    mostrarLista();
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 4);
    }
}
