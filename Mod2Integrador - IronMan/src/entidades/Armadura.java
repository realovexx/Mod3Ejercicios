/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidades.ArcGenerator;
import entidades.Consola;
import java.util.List;

/**
 *
 * @author OvExX
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private List<Propulsor> piernas;
    private List<Repulsor> brazos;
    private int resistencia;
    private int salud;
    private ArcGenerator arcGenerator;
    private Consola consola;
    private Sintetizador synth;
    

    public Armadura() {
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public ArcGenerator getArcGenerator() {
        return arcGenerator;
    }

    public void setArcGenerator(ArcGenerator arcGenerator) {
        this.arcGenerator = arcGenerator;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSynth() {
        return synth;
    }

    public void setSynth(Sintetizador synth) {
        this.synth = synth;
    }

    public List<Propulsor> getPiernas() {
        return piernas;
    }

    public void setPiernas(List<Propulsor> piernas) {
        this.piernas = piernas;
    }

    public List<Repulsor> getBrazos() {
        return brazos;
    }

    public void setBrazos(List<Repulsor> brazos) {
        this.brazos = brazos;
    }
    
    
}
