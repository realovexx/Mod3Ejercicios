/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesej_ii;

/**
 *
 * @author OvExX
 */
public class RevolverDeAgua {
    private int posActual;
    private int posAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void llenarRevolver() {
        posActual =  (int)(Math.random()*6);
        posAgua = (int)(Math.random()*6);
    }
    
    public boolean mojar(){
    return posActual == posAgua;
}
    public void siguienteChorro(){
        if (posActual==5){
            posActual=0;
        }else{
        posActual++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua {" + "Posicion Actual =" + posActual + ", Posicion del Agua =" + posAgua + '}';
    }
    
    
    
    
}
