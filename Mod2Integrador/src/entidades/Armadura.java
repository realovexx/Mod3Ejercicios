/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidades.ArcGenerator;
import entidades.Consola;

/**
 *
 * @author OvExX
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private Propulsor propulsorDerecho;
    private Propulsor propulsorIzquierdo;
    private Repulsor repulsorDerecho;
    private Repulsor repulsorIzquierdo;
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

    public Propulsor getPropulsorDerecho() {
        return propulsorDerecho;
    }

    public void setPropulsorDerecho(Propulsor propulsorDerecho) {
        this.propulsorDerecho = propulsorDerecho;
    }

    public Propulsor getPropulsorIzquierdo() {
        return propulsorIzquierdo;
    }

    public void setPropulsorIzquierdo(Propulsor propulsorIzquierdo) {
        this.propulsorIzquierdo = propulsorIzquierdo;
    }

    public Repulsor getRepulsorDerecho() {
        return repulsorDerecho;
    }

    public void setRepulsorDerecho(Repulsor repulsorDerecho) {
        this.repulsorDerecho = repulsorDerecho;
    }

    public Repulsor getRepulsorIzquierdo() {
        return repulsorIzquierdo;
    }

    public void setRepulsorIzquierdo(Repulsor repulsorIzquierdo) {
        this.repulsorIzquierdo = repulsorIzquierdo;
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
    
    
}
