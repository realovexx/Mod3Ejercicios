/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Juego {

    private int numeroSecreto;
    private Scanner leer;

    public Juego() {
        numeroSecreto = (int) (1 + (Math.random() * 499));
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void juego() {
        System.out.println("Estoy imaginando un numero del 1 al 500, podés adivinarlo?");
        int contadorIntentos = 0;
        int intento = 0;
        do {
            try {
                System.out.println("Ingresá cual numero crees que es");
                intento = leer.nextInt();
                if (intento > numeroSecreto) {
                    System.out.println("Fallaste, el numero secreto es menor al que ingresaste... \n Pero podés seguir intentando!");
                }else if (intento < numeroSecreto){
                    System.out.println("Fallaste, el numero secreto es mayor al que ingresaste... \n Pero podés seguir intentando!");                
                }else if (intento < 1 || intento > 500){
                    System.out.println("Acordate que es del 1 al 500!");
                }
            } catch (InputMismatchException a) {
                System.out.println("Hay que adivinar un numero!");
                System.out.println("Este intento igual cuenta");
                leer.nextLine();
            }
            contadorIntentos++;
        } while (intento != numeroSecreto);
        System.out.println("Lo lograste! El numero era " + numeroSecreto);
        System.out.println("Lo adivinaste en " + contadorIntentos + " intentos!");
    }

}
