/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class Televisor extends Electrodomestico{
    private Integer reso;
    private boolean synth;

    public Televisor() {
    }

    public Televisor(Integer reso, boolean synth, Double precio, String color, Character consE, Double peso) {
        super(precio, color, consE, peso);
        this.reso = reso;
        this.synth = synth;
    }

    public Integer getReso() {
        return reso;
    }

    public void setReso(Integer reso) {
        this.reso = reso;
    }

    public boolean isSynth() {
        return synth;
    }

    public void setSynth(boolean synth) {
        this.synth = synth;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        super.crearElectrodomestico();
        System.out.println("Ingrese el tamaño en pulgadas del diagonal de su TV");
        setReso(leer.nextInt());
        System.out.println("Tiene sintonizador TVT? (S/n)");
        String opc = leer.next();
        while (!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n")){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.next();
        }
        if (opc.equalsIgnoreCase("s")){
            synth = true;
        }else{
            synth = false;
        }
        super.precioFinal();
        
    }
    
    public void precioFinalT(){
        super.precioFinal();
        Double pBase = getPrecio();
    //    System.out.println("Precio generico: "+pBase);
        if (reso>40){
            pBase += pBase*0.3;
        }
        if (synth){
            pBase += 500d;
        }
        setPrecio(pBase);
        System.out.println("Precio final televisor: "+getPrecio());
    }
    
}
