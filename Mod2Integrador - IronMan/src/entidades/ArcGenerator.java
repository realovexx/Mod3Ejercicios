/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class ArcGenerator {
    private int carga;
    private final float cargaMax = Float.MAX_VALUE;
    private float cargaCurrent;

    public ArcGenerator() {
        cargaCurrent = cargaMax;
        carga = (int) (cargaCurrent/cargaMax);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getCargaCurrent() {
        return cargaCurrent;
    }

    public void setCargaCurrent(float cargaCurrent) {
        this.cargaCurrent = cargaCurrent;
    }

    public float getCargaMax() {
        return cargaMax;
    }
    
}
