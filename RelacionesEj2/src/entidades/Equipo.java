/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Equipo {
    private ArrayList<Jugador> team;
    private Scanner leer;

    public Equipo() {
        team = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Equipo(ArrayList<Jugador> team) {
        this.team = team;
    }

    public ArrayList<Jugador> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Jugador> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Equipo{" + "team=" + team + '}';
    }
    
    public void llenarEquipo(){
        String opc;
        do {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre"); 
            j.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            j.setApellido(leer.next());
            System.out.println("Ingrese posicion (en numero)");
            j.setPos(leer.nextInt());
            System.out.println("Ingrese numero");
            j.setNum(leer.nextInt());
            System.out.println("Desea ingresar otro Jugador?");
            opc = leer.next();
            team.add(j);
        } while (opc.equalsIgnoreCase("s"));
    }
    
    
}
