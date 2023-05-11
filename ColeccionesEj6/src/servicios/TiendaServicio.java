/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author OvExX
 */
public class TiendaServicio {

    private HashMap<String, Double> maProduct;
    private Scanner leer;

    public TiendaServicio() {
        maProduct = new HashMap();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void newProduct() {
        String art;
        Double precio;
        String opc;
        do {
            System.out.println("Ingrese el nombre del articulo");
            art = leer.next();
            System.out.println("Ahora ingrese el precio del articulo");
            precio = leer.nextDouble();
            maProduct.put(art, precio);
            System.out.println("Desea ingresar otro producto?");
            opc = leer.next();
            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.next();
            }
        } while (opc.equalsIgnoreCase("s"));
        System.out.println("");
    }

    public void modPrecio() {
        System.out.println("Ingrese el nombre del producto con precio a modificar");
        String prod = leer.next();
        boolean sino = false;
        for (Map.Entry<String, Double> entry : maProduct.entrySet()) {
            String key = entry.getKey();
            if (prod.equalsIgnoreCase(key)) {
                System.out.println("Ingrese el nuevo valor");
                entry.setValue(leer.nextDouble());
                sino = true;
            }
        }
        if (sino == false) {
            System.out.println("Producto no encontrado");
        }
        System.out.println("");
    }

    public void delProd() {
        Iterator<Map.Entry<String, Double>> ite = maProduct.entrySet().iterator();
        System.out.println("Ingrese el nombre del producto a eliminar");
        String prod = leer.next();
        boolean sino = false;
        while (ite.hasNext()){
            Map.Entry<String, Double> entry = ite.next();
            if (entry.getKey().equalsIgnoreCase(prod)){
                ite.remove();
                sino = true;
                System.out.println("Producto eliminado");
                
            }
        }
        if (sino == false) {
            System.out.println("Producto no encontrado");
        }
        System.out.println("");
    }

    public void showProd() {
        System.out.println(maProduct);
        System.out.println("");
    }

    public void menu() {
        int opc = 0;
        System.out.println("Configuracion inicial de lista de precios");
        newProduct();
        System.out.println("");
        do {
            System.out.println("Menu");
            System.out.println("");
            System.out.println("Seleccione la opcion que desee");
            System.out.println("");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            System.out.println("");
            while (opc < 0 || opc > 5) {
                System.out.println("Ingreso invalido, intentelo nuevamente");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    modPrecio();
                    break;
                case 3:
                    delProd();
                    break;
                case 4:
                    showProd();
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        } while (opc != 5);
        System.out.println("");
    }
}
