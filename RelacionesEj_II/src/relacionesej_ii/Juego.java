/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesej_ii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Juego {
    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;
    private Scanner leer;

    public Juego() {
        jugadores = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Juego(List<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    public Juego llenarJuego(){
            revolver = new RevolverDeAgua();
            revolver.llenarRevolver();
            jugadores = new ArrayList();
            System.out.println("Ingrese la cantidad de jugadores");
            int cant = leer.nextInt();
            if (cant>6||cant<1){cant = 6;}
            for (int i=0 ; i<cant ; i++){
                Jugador j = new Jugador();
                j.setId(i+1);
                j.setNombre("Jugador-"+j.getId());
                j.setMojado(false);
                jugadores.add(j);
            }
            return new Juego(jugadores,revolver);
    }
    
    public void ronda(Juego j){
        j.getRevolver().llenarRevolver();
        
        for (int i = 0 ; i < 6 ; i++){
            System.out.println("Es el turno de "+j.getJugadores().get(i).getNombre());
            j.getJugadores().get(i).disparo(j.getRevolver());
            System.out.println("Gatillando...");
            if (j.getJugadores().get(i).isMojado()){
              System.out.println(j.getJugadores().get(i).getNombre()+" Se ha mojado!");
              System.out.println("");
              System.out.println("Fin del juego...");
              break;
          }else{
                System.out.println(j.getJugadores().get(i).getNombre()+" se ha salvado!");
                System.out.println("");
                System.out.println("Ahora, siguiente turno");
          }
        }
    }
}
