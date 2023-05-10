/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class RazasServicio {

    private ArrayList<String> a;
    private Scanner leer;

    public RazasServicio() {
        this.a = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    public void llenarDePerros() {
        leer.nextLine();
        String raza;
        System.out.println("Desea agregar una raza de perro?");
        System.out.println("Presione S para agregar, o N para salir");
        String b = leer.nextLine();
        while (!b.equalsIgnoreCase("s") && !b.equalsIgnoreCase("n")) {
            System.out.println("Ingreso invalido, intentelo nuevamente");
            b = leer.next();
        }
        while (b.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la raza");
            raza = leer.next();
            a.add(raza);
            System.out.println("Desea ingresar otra raza? S/n");
            b = leer.next();
            while (!b.equalsIgnoreCase("s") && !b.equalsIgnoreCase("n")) {
                System.out.println("Ingreso invalido, intentelo nuevamente");
                b = leer.next();
            }
            if (b.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("Volviendo al menu...");
        System.out.println("");
    }

    public void mostrarPerros() {
        for (String i : a) {
            System.out.println(i);
        }
        System.out.println("Volviendo al menu...");
        System.out.println("");
    }

    public void recorrerPerros() {
        leer.nextLine();
        Iterator<String> ite = a.iterator();
        System.out.println("Ingrese la raza que quiere remover de la lista");
        String rm = leer.next();
        boolean b = false;
        while (ite.hasNext()) {
            if (ite.next().equalsIgnoreCase(rm)) {
                ite.remove();
                b=true;
            }
        }
        if (!b){
            System.out.println("La raza no se encuentra en la lista");
        }
        mostrarPerros();
        System.out.println("Volviendo al menu...");
        System.out.println("");
    }

    public void menu() {
        int opc = 0;
        do {
        System.out.println("Menu");
        System.out.println("");
        System.out.println("Seleccione la opcion que desee");
        System.out.println("");
        System.out.println("1. Ingresar una raza de perro");
        System.out.println("2. Quitar una raza y mostrar la lista");
        System.out.println("3. Mostrar la lista");
        System.out.println("4. Salir");
        opc = leer.nextInt();
        switch (opc) {
                case 1:
                    llenarDePerros();
                    break;
                case 2:
                    recorrerPerros();
                    break;
                case 3:
                    mostrarPerros();
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 4);
    }
}
