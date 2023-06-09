/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author OvExX
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Chihuahua","Teddy","Croquetas",10 );
        perro1.alimentarse();
        Animal perro2 = new Perro("Doberman","Stitch","Carnivoro",15);
        perro2.alimentarse();
        Animal gato1 = new Gato("Siames","Pelusa","Galletas",15);
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Fino","Spark","Pasto",25);
        caballo1.alimentarse();
    }
    
}
