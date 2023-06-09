/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author OvExX
 */
public class Baraja {

    private Set<Carta> mazo;
    private Set<Carta> monton;
    private Scanner leer;

    public Baraja() {
        leer = new Scanner(System.in).useDelimiter("\n");
        mazo = new HashSet();
        monton = new HashSet();
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setPalo(Palos.ESPADAS);
            c.setNumero(i + 1);
            if (i != 7 && i != 8) {
                mazo.add(c);
            }
        }
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setPalo(Palos.BASTOS);
            c.setNumero(i + 1);
            if (i != 7 && i != 8) {
                mazo.add(c);
            }
        }
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setPalo(Palos.OROS);
            c.setNumero(i + 1);
            if (i != 7 && i != 8) {
                mazo.add(c);
            }
        }
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setPalo(Palos.COPAS);
            c.setNumero(i + 1);
            if (i != 7 && i != 8) {
                mazo.add(c);
            }
        }
    }

    public Set<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(Set<Carta> mazo) {
        this.mazo = mazo;
    }

    public void barajar() {
        List<Carta> pasoAlista = new ArrayList<>(mazo);
        Collections.shuffle(pasoAlista);
        mazo.clear();
        for (Carta aux : pasoAlista) {
            mazo.add(aux);
        }
    }

    public void darCartas() {
        Iterator<Carta> it = mazo.iterator();
        System.out.println("Cuantas cartas te doy?");
        int opc = leer.nextInt();
        for (int i = 0; i < opc; i++) {
            Carta carta = it.next();
            System.out.println("Dando " + carta.toString());
            System.out.println("Guardada en monton");
            it.remove();
            monton.add(carta);
        }
    }

    public void cartasMonton() {
        if (monton.size() > 0) {
            System.out.println("Las cartas que salieron son las siguientes");
            for (Carta aux : monton) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No han salido cartas!");
        }

    }

    public void mostrarBaraja() {
        System.out.println("Las cartas disponibles son las siguientes");
        for (Carta aux : mazo) {
            System.out.println(aux);
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+mazo.size()+" cartas disponibles");
    }
    
    public void siguienteCarta(){
        
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }

}
