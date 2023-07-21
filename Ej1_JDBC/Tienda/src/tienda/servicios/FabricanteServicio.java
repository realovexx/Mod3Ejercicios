package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {

    private FabricanteDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }

    /* METODO PARA CONSULTAR E IMPRIMIR FABRICANTES */
    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen Fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f.toString());
                }
            }

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
        public void cargarFabricante() throws Exception {

        try {

            //Creamos el Fabricante
            Fabricante fabricante = new Fabricante();
            System.out.println("Carga del Fabricante");
            System.out.println("");
            fabricante.setCodigo(0); //SE PONE 0 PARA QUE AGREGUE EL NUMERO QUE SIGUE EN LA BASE DE DATOS. POR EJ SI EL ULTIMO ERA 10, ACA AGREGAMOS EL 11
            System.out.println("Ingrese el Nombre del Fabricante");
            fabricante.setNombre(leer.next());

            dao.guardarFabricante(fabricante);
            
            System.out.println("¡Fabricante Cargado con Exito!");

        } catch (Exception e) {
            throw e;
        }
    }

}
