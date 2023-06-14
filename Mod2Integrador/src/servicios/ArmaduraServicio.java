/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Armadura;
import entidades.ArcGenerator;
import entidades.ArmaduraException;
import entidades.Consola;
import entidades.Propulsor;
import entidades.Repulsor;
import entidades.Sintetizador;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class ArmaduraServicio {

    private Scanner leer;

    public ArmaduraServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void bootSequence() {
        System.out.println("Inicializando sistema J.A.R.V.I.S.");
        Armadura mk1 = new Armadura();

        System.out.println("Obteniendo datos de carga Arc");
        ArcGenerator ag = new ArcGenerator();
        mk1.setArcGenerator(ag);

        System.out.println("Cargando consola");
        Consola c = new Consola();
        c.setTiempoDeUso(0);
        mk1.setConsola(c);

        System.out.println("Inicializando sintentizador de voz");
        Sintetizador s = new Sintetizador();
        s.setTiempoDeUso(0);
        mk1.setSynth(s);

        System.out.println("Inicializando dispositivos");

        Propulsor pieDerecho = new Propulsor();
        Propulsor pieIzquierdo = new Propulsor();
        pieDerecho.setTiempoDeUso(0);
        pieIzquierdo.setTiempoDeUso(0);
        mk1.setPropulsorDerecho(pieDerecho);
        mk1.setPropulsorIzquierdo(pieIzquierdo);

        Repulsor manoDerecha = new Repulsor();
        Repulsor manoIzquierda = new Repulsor();
        manoDerecha.setTiempoDeUso(0);
        manoIzquierda.setTiempoDeUso(0);
        mk1.setRepulsorDerecho(manoDerecha);
        mk1.setRepulsorIzquierdo(manoIzquierda);

        System.out.println("Identificacion visual de Armadura");
        mk1.setColorPrimario("Rojo");
        mk1.setColorSecundario("Dorado");
        System.out.println("Paleta de colores: " + mk1.getColorPrimario() + " y " + mk1.getColorSecundario());

        System.out.println("Inicializando soporte vital");
        mk1.setSalud(100);
        mk1.setResistencia(100);

    }

    public float caminar(Armadura mk1)throws ArmaduraException {
        if (mk1.getPropulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Propulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getPropulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Propulsor izquierdo dañado, no se puede ejecutar accion");
        }        
        System.out.println("Cuanto tiempo estamos caminando en minutos?");
        int tiempo = leer.nextInt();
        mk1.getPropulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getPropulsorIzquierdo().setTiempoDeUso(tiempo);
        float consumoTotal = ((mk1.getPropulsorDerecho().getConsumo() * tiempo) + (mk1.getPropulsorIzquierdo().getConsumo() * tiempo));
        System.out.println("Se ha caminado por " + tiempo + " minutos");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorDerecho().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public float correr(Armadura mk1) throws ArmaduraException {
        if (mk1.getPropulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Propulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getPropulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Propulsor izquierdo dañado, no se puede ejecutar accion");
        }
        System.out.println("Cuanto tiempo estamos corriendo en minutos?");
        int tiempo = leer.nextInt();
        mk1.getPropulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getPropulsorIzquierdo().setTiempoDeUso(tiempo);
        float consumoTotal = ((mk1.getPropulsorDerecho().getConsumo() * 2 * tiempo) + (mk1.getPropulsorIzquierdo().getConsumo() * 2 * tiempo));
        System.out.println("Se ha corrido por " + tiempo + " minutos");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorDerecho().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public float propulsarse(Armadura mk1) throws ArmaduraException {
        if (mk1.getPropulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Propulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getPropulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Propulsor izquierdo dañado, no se puede ejecutar accion");
        }
        System.out.println("Durante cuanto tiempo nos estamos propulsando en minutos?");
        int tiempo = leer.nextInt();
        mk1.getPropulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getPropulsorIzquierdo().setTiempoDeUso(tiempo);
        float consumoTotal = ((mk1.getPropulsorDerecho().getConsumo() * 3 * tiempo) + (mk1.getPropulsorIzquierdo().getConsumo() * 3 * tiempo));
        System.out.println("Nos hemos propulsado por " + tiempo + " minutos");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorDerecho().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }

        return consumoTotal;
    }

    public float volar(Armadura mk1) throws ArmaduraException{
        if (mk1.getPropulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Propulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getPropulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Propulsor izquierdo dañado, no se puede ejecutar accion");
        }
        if (mk1.getRepulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Repulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getRepulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Repulsor izquierdo dañado, no se puede ejecutar accion");
        }        
        System.out.println("Durante cuanto tiempo estamos volando en minutos?");
        int tiempo = leer.nextInt();
        mk1.getPropulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getPropulsorIzquierdo().setTiempoDeUso(tiempo);
        mk1.getRepulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getRepulsorIzquierdo().setTiempoDeUso(tiempo);
        float consumoTotal = ((mk1.getPropulsorDerecho().getConsumo() * 3 * tiempo)
                + (mk1.getPropulsorIzquierdo().getConsumo() * 3 * tiempo)
                + (mk1.getRepulsorDerecho().getConsumo() * 2 * tiempo)
                + (mk1.getRepulsorIzquierdo().getConsumo() * 2 * tiempo));
        System.out.println("Hemos volado por " + tiempo + " minutos");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorDerecho().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getPropulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getRepulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getRepulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public float disparar(Armadura mk1) throws ArmaduraException{
        if (mk1.getRepulsorDerecho().isDaniado()) {
            throw new ArmaduraException("Repulsor derecho dañado, no se puede ejecutar accion");
        }
        if (mk1.getRepulsorIzquierdo().isDaniado()) {
            throw new ArmaduraException("Repulsor izquierdo dañado, no se puede ejecutar accion");
        }        
        System.out.println("Durante cuanto tiempo estamos volando en minutos?");
        int tiempo = leer.nextInt();
        mk1.getRepulsorDerecho().setTiempoDeUso(tiempo);
        mk1.getRepulsorIzquierdo().setTiempoDeUso(tiempo);
        float consumoTotal = ((mk1.getRepulsorDerecho().getConsumo() * 3 * tiempo)
                + (mk1.getRepulsorIzquierdo().getConsumo() * 3 * tiempo));
        System.out.println("Hemos disparado por " + tiempo + " minutos");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getRepulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getRepulsorIzquierdo().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public float usarConsola(Armadura mk1) throws ArmaduraException{
        if (mk1.getConsola().isDaniado()) {
            throw new ArmaduraException("Consola dañada, no se puede ejecutar accion");
        }
        System.out.println("Usando consola");
        float consumoTotal = mk1.getConsola().getConsumo();
        System.out.println("Se ha usado la consola");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getConsola().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public float usarSintetizador(Armadura mk1) throws ArmaduraException{
        if (mk1.getSynth().isDaniado()) {
            throw new ArmaduraException("Sintetizador de voz dañado, no se puede ejecutar accion");
        }
        System.out.println("Usando Sintetizador");
        float consumoTotal = mk1.getSynth().getConsumo();
        System.out.println("Se ha usado el sintetizador de voz");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.3) {
            mk1.getSynth().setDaniado(true);
            System.out.println("El dispositivo se ha dañado");
        }
        return consumoTotal;
    }

    public void accion(Armadura mk1) throws ArmaduraException {
        System.out.println("Elija una accion");
        System.out.println("");
        System.out.println("1.- Caminar");
        System.out.println("2.- Correr");
        System.out.println("3.- Propulsarse");
        System.out.println("4.- Volar");
        System.out.println("5.- Disparar desde los guantes");
        System.out.println("6.- Usar consola");
        System.out.println("7.- Usar sintetizador de voz");
        try {
            int opc = leer.nextInt();
            while (opc < 1 || opc > 7) {
                System.out.println("Esa no es una opcion, elija otra vez");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    System.out.println("Se han consumido " + caminar(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - caminar(mk1));
                    break;
                case 2:
                    System.out.println("Se han consumido " + correr(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - correr(mk1));
                    break;
                case 3:
                    System.out.println("Se han consumido " + propulsarse(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - propulsarse(mk1));
                    break;
                case 4:
                    System.out.println("Se han consumido " + volar(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - volar(mk1));
                    break;
                case 5:
                    System.out.println("Se han consumido " + disparar(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - disparar(mk1));
                    break;
                case 6:
                    System.out.println("Se han consumido " + usarConsola(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - usarConsola(mk1));
                    break;
                case 7:
                    System.out.println("Se han consumido " + usarSintetizador(mk1) + "J de carga");
                    mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - usarSintetizador(mk1));
                    break;
            }
            mk1.getArcGenerator().setCarga((int) (mk1.getArcGenerator().getCargaCurrent() / mk1.getArcGenerator().getCargaMax()));
            if (mk1.getArcGenerator().getCarga() < 1) {
                throw new ArmaduraException("Carga de Generador Arc agotada. Cerrando sistema.");
            }
            if (mk1.getArcGenerator().getCarga() < 15) {
                System.out.println("Nivel de carga critico. Es recomendable finalizar el uso de la armadura");
            }
            System.out.println("El nivel de carga actual es de " + mk1.getArcGenerator().getCarga() + "%");
        } catch (InputMismatchException a) {
            System.out.println("Se ha detectado un ingreso invalido. Volviendo a interfaz principal.");
        }
    }

    public void mostrarEstado(Armadura mk1) {
        System.out.println(mk1.toString());
    }

    public void estadoReactor(Armadura mk1) throws ArmaduraException{
        System.out.println("Nivel de carga: " + mk1.getArcGenerator().getCarga() + "%");
        System.out.println("Al usar la consola, se han consumido " + usarConsola(mk1) + "J de carga");
        mk1.getArcGenerator().setCargaCurrent(mk1.getArcGenerator().getCargaCurrent() - usarConsola(mk1));
        mk1.getArcGenerator().setCarga((int) (mk1.getArcGenerator().getCargaCurrent() / mk1.getArcGenerator().getCargaMax()));
    }

    public void informacionReactor(Armadura mk1) {
        System.out.println("Nivel de carga:" + mk1.getArcGenerator().getCargaCurrent() + " Jules");
        System.out.println("En otras palabras");
        System.out.println("");
        System.out.println((mk1.getArcGenerator().getCargaCurrent() * (Math.pow(10, 7))) + " Ergios");
        System.out.println("O " + ((mk1.getArcGenerator().getCargaCurrent() * 2685) * (Math.pow(10, 6))) + " Caballos Vapor-Hora");
    }
    
    public void repararDanios(boolean daniado){
        System.out.println("Intentando reparar daños");
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance <= 0.4) {
            daniado = false;
            System.out.println("Reparacion exitosa");
        }else{
            System.out.println("Falló la reparacion, el dispositivo sigue dañado");
        }
    }
    
    public void revisarDispositivos(){
        
    }
}
