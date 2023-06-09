/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaxtra2;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OvExX
 */
public class HerenciaXtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polideportivo p1 = new Polideportivo();
        p1.crearPoli();
        Polideportivo p2 = new Polideportivo("Sportivo Pilar",true,70,10,50);
        EdificioDeOficinas o1 = new EdificioDeOficinas();
        o1.crearOfi();
        EdificioDeOficinas o2 = new EdificioDeOficinas(5,15,6,20,30,15);
        List<Edificio> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(o1);
        lista.add(o2);
        int contadorTechado = 0;
        int contadorAbierto = 0;
        for (Edificio aux : lista){
            aux.calcularSuperficie();
            aux.calcularVolumen();
            if (aux instanceof Polideportivo){
                if (((Polideportivo) aux).isTechado()){
                contadorTechado +=1;
            }else{
                contadorAbierto +=1;
                }
            }else if(aux instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) aux).cantPersonas();
            }
        }
        System.out.println("Cantidad de Polideportivos techados: "+contadorTechado);
        System.out.println("Cantidad de Polideportivos abiertos: "+contadorAbierto);
    }
    
}
