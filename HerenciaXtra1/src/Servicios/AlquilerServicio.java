/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Alquiler;
import entidades.Barco;
import entidades.Velero;
import entidades.Yate;
import entidades.aMotor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class AlquilerServicio {
    
    private Scanner leer;

    public AlquilerServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }
   
    public Alquiler nuevoAlq(){
        Alquiler a = new Alquiler();
        System.out.println("Formulario de Alquiler nautico");
        System.out.println("==============================");
        System.out.println("A continuación, ingrese los datos del barco que desea alquilar");
        System.out.println("");
        System.out.println("Qué tipo de nave va a alquilar? "
                       + "(Elija la opción correspondiente al barco de su interes)");
        System.out.println("1.- Velero");
        System.out.println("2.- Barco a motor de pequeño o mediano tamaño");
        System.out.println("3.- Yate de lujo");
        System.out.println("4.- Otro sin motor ni vela");
        int opc = leer.nextInt();
        while (opc<1||opc>4){
            System.out.println("Ingreso invalido, intentelo nuevamente");
            opc = leer.nextInt();
        }
        switch (opc){
            case 1:
                Velero velero = new Velero();
                velero.crearVelero();
                a.setBarco(velero);
                break;
            case 2:
                aMotor amotor = new aMotor();
                amotor.crearBarcoAMotor();
                a.setBarco(amotor);
                break;
            case 3:
                Yate yate = new Yate();
                yate.crearYate();
                a.setBarco(yate);
                break;
            default:
                Barco bote = new Barco();
                bote.crearBarco();
                a.setBarco(bote);
        }
        System.out.println("=============================");
        System.out.println("");
        System.out.println("A continuacion, comlpetaremos sus datos personales");
        System.out.println("");
        leer.nextLine();
        System.out.println("Ingrese su nombre");
        a.setNombre(leer.nextLine());
        System.out.println("Ingrese su Documento de identidad");
        a.setDni(leer.nextInt());
        System.out.println("El alquiler comienza hoy? (S/n)");
        String opc2 = leer.next();
        while (!opc2.equalsIgnoreCase("s")&&!opc2.equalsIgnoreCase("n")){
        System.out.println("Ingreso invalido, intentelo nuevamente");
        opc2 = leer.next();
        }
        if (opc2.equalsIgnoreCase("s")){
            Date d = new Date();
            a.setInicio(d);
        }else{
            System.out.println("Ingrese año de inicio");
            int anio = leer.nextInt();
            System.out.println("Ingrese el numero de mes");
            int mes = leer.nextInt();
            System.out.println("Ingrese el dia");
            int dia = leer.nextInt();
            Date d = new Date(anio-1900,mes-1,dia);
            a.setInicio(d);
        }
            System.out.println("Hasta cuando deseas alquilarlo?");
            System.out.println("");
            System.out.println("Ingrese año de fin");
            int anio2 = leer.nextInt();
            System.out.println("Ingrese el numero de mes");
            int mes2 = leer.nextInt();
            System.out.println("Ingrese el dia");
            int dia2 = leer.nextInt();
            Date d2 = new Date(anio2-1900,mes2-1,dia2);
            a.setFin(d2);
            System.out.println("Cual es la posicion de amarre del barco?");
            a.setPosicion(leer.nextInt());
        return a;
    }
    
    public void calcularAlquiler(Alquiler a){
        long finms = a.getFin().getTime();
        long inicioms = a.getInicio().getTime();
        long diasOcupado = (finms-inicioms)/(1000*60*60*24);
        Double modulo = 10*(a.getBarco().getEslora());
        Double valorAlquiler = diasOcupado*modulo;
        if (a.getBarco() instanceof Velero){
            Velero velero = (Velero) a.getBarco();
            valorAlquiler += velero.getMastiles()*50; //invento valor de 50 por mastil
        }else if (a.getBarco() instanceof Yate){
            Yate yate = (Yate) a.getBarco();
            valorAlquiler += (double) (yate.getCV()*5)+(yate.getCamarotes()*200); //valor por camarote = 200
        }else if (a.getBarco() instanceof aMotor){
            aMotor lancha = (aMotor) a.getBarco();
            valorAlquiler += (double)lancha.getCV()*5; //500 cada 100 CV
        }
        System.out.println("El valor del alquiler de la matricula "+a.getBarco().getMatricula()+" desde ");
        System.out.println(a.getInicio()+" y hasta "+a.getFin()+" \n("+diasOcupado+" dias ocupado) vale $"+valorAlquiler);
        
    }
    
}
