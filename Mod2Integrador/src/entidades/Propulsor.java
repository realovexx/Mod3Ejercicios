/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class Propulsor {
    private int consumo = 1; //Hay que inventar un nivel de consumo
    private int tiempoDeUso;
    public boolean daniado;
    private String lado;
    private boolean destruido;
    

    public Propulsor() {
        daniado = false;
        destruido = false;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(int tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    
}
