package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.NoResultException;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private final AutorDAO DAO;
    private final Scanner leer;

    public AutorServicio() {
        DAO = new AutorDAO();
        leer = DAO.leer;
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setAlta(true);
            autor.setNombre(nombre);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorId(Integer id)throws Exception,NoResultException {
        try {
            return DAO.buscarPorId(id);
        }catch(NoResultException n){
            System.out.println("El ID "+id+" no se encuentra en base de datos");
            n.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorNombre(String nombre)throws Exception,NoResultException{
        try {
            return DAO.buscarPorNombre(nombre);
        }catch(NoResultException n){
            System.out.println("El autor "+nombre+" no existe");
            n.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscar() {
        Autor autor = new Autor();
        String auth = "";
        System.out.println("Desea buscar el autor por:");
        System.out.println("1. ID?");
        System.out.println("2. Nombre?");
        int opc = leer.nextInt();

        while (opc < 1 || opc > 2) {
            System.out.println("ingrese 1 o 2");
            opc = leer.nextInt();
        }
       
        if (opc == 1) {
            try{
            System.out.println("Ingrese el numero ID");
            opc = leer.nextInt();
            autor = buscarPorId(opc);
        }catch(NoResultException n){
            System.out.println("El ID "+opc+" no se encuentra en base de datos");
            n.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
            return null;
        }
        } else {
            try{
            leer.nextLine();
            System.out.println("Ingrese el nombre del Autor");
            auth = leer.nextLine();
            autor = buscarPorNombre(auth);
            }catch(NoResultException n){
            System.out.println("El autor "+auth+" no existe");
            n.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
            return null;
        }
        }
        return autor;
    }

    public void editarAutor() {
        try {
            String opc2;
            System.out.println("Ingrese el numero de ID del autor que desea editar");
            int id = leer.nextInt();
            Autor autor = buscarPorId(id);
            System.out.println("Seleccione campo a editar");
            System.out.println("1. Reactivar Autor");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Cancelar");
            int opc = leer.nextInt();
            while (opc < 1 || opc > 3) {
                System.out.println("Opcion invalida, reintente");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    if (autor.getAlta()) {
                        System.out.println("El autor ya se encuentra de Alta");
                    } else {
                        autor.setAlta(Boolean.TRUE);
                        System.out.println("El autor ha sido dada de Alta");
                    }
                    break;
                case 2:
                    leer.nextLine();
                    System.out.println("Ingrese el nuevo nombre para " + autor.getNombre());
                    String nombre = leer.nextLine();
                    System.out.println("Confirma " + nombre + " como nuevo nombre del autor " + autor.getNombre() + "? S/n");
                    opc2 = leer.next();
                    while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                        System.out.println("Opcion invalida, reintente");
                        opc2 = leer.next();
                    }
                    if (opc2.equalsIgnoreCase("s")) {
                        autor.setNombre(nombre);
                        System.out.println("El nombre del autor ha cambiado a " + autor.getNombre());
                    } else {
                        System.out.println("No se hicieron cambios");
                        break;
                    }
                    break;
                default:
                    System.out.println("Operacion cancelada.");
                    break;
            }
            DAO.editarAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public boolean eliminarPorId(Integer id) { // <- sin usar
        try {
            DAO.eliminar(id);
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    } 
    
    public boolean eliminarAutorLogico(Integer id){
        try{
        DAO.eliminarAutorLogico(id);
        return false;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return true;
        }
        
    }
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listartodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    } 
    
    public List<Autor> listarAltas(){
                try {
            return DAO.listarAltas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
