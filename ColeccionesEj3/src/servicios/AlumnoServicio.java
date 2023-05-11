/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class AlumnoServicio {

    private Scanner leer;
    private ArrayList<Alumno> listAlumno;

    public AlumnoServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        listAlumno = new ArrayList();
    }

    public ArrayList<Alumno> crearAlumno() {
        String opc;
        do {
            System.out.println("Registraremos al alumno");
            Alumno pibe = new Alumno();
            System.out.println("Ingrese el nombre el Alumno");
            pibe.setNombre(leer.next());
            System.out.println("A continuacion, completaremos las notas del Alumno");
            ArrayList<Integer> grade = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota de la materia " + (i + 1));
                grade.add(leer.nextInt());
            }
            pibe.setNota(grade);
            listAlumno.add(pibe);
            System.out.println("Desea agregar un Alumno? S/n");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.next();
            }
        } while (opc.equalsIgnoreCase("s"));
        return listAlumno;
    }

    public void alumNota() {
        System.out.println("Ingrese el nombre del alumno");
        System.out.println("Calcularemos su nota final");
        System.out.println("");
        String chango = leer.next();
        int cont = 0;
        for (Alumno aux : listAlumno) {
            if (aux.getNombre().contains(chango)) {
                System.out.println("La nota final de " + chango + " es " + notaFinal(aux));
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El alumno no se encuentra en base de datos");
        }
    }

    public double notaFinal(Alumno a) {
        double promedio = 0.0;
        int suma = 0;
        for (int i = 0; i < a.getNota().size(); i++) {
            suma += a.getNota().get(i);
        }
        promedio = (double) suma / a.getNota().size();
        return promedio;
    }

    public void menu() {
        System.out.println("Datos Alumnos:");
        System.out.println("");
        crearAlumno();
        int opc;
        do {
            System.out.println("Menu, seleccione la opcion deseada: ");
            System.out.println("1. Mostrar la nota final de un alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Agregar mas alumnos");
            System.out.println("4. Salir.");
            opc = leer.nextInt();
            while (opc < 1 || opc > 4) {
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    alumNota();
                    break;
                case 2:
                    System.out.println(toString());
                    break;
                case 3:
                    crearAlumno();
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 4);
    }

    @Override
    public String toString() {
        return listAlumno + "";
    }

}
