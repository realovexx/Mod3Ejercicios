/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej2y3;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OvExX
 */
public class HerenciaEj2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Lavadora l = new Lavadora();
l.crearLavadora();
l.precioFinalL();
Televisor t = new Televisor();
t.crearTelevisor();
t.precioFinalT();*/
List<Electrodomestico> lista = new ArrayList();
Lavadora l1 = new Lavadora(31d,null,"Gris",'A',80d);
Lavadora l2 = new Lavadora(15d,null,"Blanco",'C',50d);
Televisor t1 = new Televisor(55,true,null,"Negro",'A',30d);
Televisor t2 = new Televisor(32,false,null,"Azul",'D',25d);
/*l1.crearLavadora();
l1.precioFinalL();
l2.crearLavadora();
l2.precioFinalL();
t1.crearTelevisor();
t1.precioFinalT();
t2.crearTelevisor();
t2.precioFinalT();*/
lista.add(l1);
lista.add(l2);
lista.add(t1);
lista.add(t2);
Double sumaL = 0d;
Double sumaT = 0d;
        for (Electrodomestico aux : lista) {
            if (aux instanceof Lavadora){
                ((Lavadora) aux).precioFinalL();
                sumaL += aux.getPrecio();
            }else if (aux instanceof Televisor){
                ((Televisor) aux).precioFinalT();
                sumaT += aux.getPrecio();
            }
        }
        
        System.out.println("Todas las lavadoras sumaron $"+sumaL);
        System.out.println("Todos los televisores sumaron $"+sumaT);
    }
    
}
