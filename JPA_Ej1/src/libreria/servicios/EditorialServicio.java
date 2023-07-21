package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.NoResultException;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private final EditorialDAO DAO;
    private final Scanner leer;

    public EditorialServicio() {
        DAO = new EditorialDAO();
        leer = DAO.leer;
    }

    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            editorial.setAlta(true);
            editorial.setNombre(nombre);
            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId(Integer id) throws Exception,NoResultException{
        try{
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

    public Editorial buscarPorNombre(String nombre) throws Exception,NoResultException{
        try{
            return DAO.buscarPorNombre(nombre);
        }catch(NoResultException n){
            System.out.println("La editorial "+nombre+" no existe");
            n.printStackTrace();
            return null;
        }catch(Exception e){
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscar() throws Exception{
        Editorial editorial = new Editorial();
        String edit;
        System.out.println("Desea buscar la editorial por:");
        System.out.println("1. ID?");
        System.out.println("2. Nombre?");
        int opc = leer.nextInt();

        while (opc < 1 || opc > 2) {
            System.out.println("ingrese 1 o 2");
        }
        if (opc == 1) {
            System.out.println("Ingrese el numero ID");
            opc = leer.nextInt();
            editorial = buscarPorId(opc);
        } else {
            leer.nextLine();
            System.out.println("Ingrese el nombre la editorial");
            edit = leer.nextLine();
            editorial = buscarPorNombre(edit);
        }
        return editorial;
    }

    public void editarEditorial() {
        try {
            String opc2;
            String nombre;
            System.out.println("Ingrese el numero ID de la editorial que desea modificar");
            int id = leer.nextInt();
            Editorial editorial = buscarPorId(id);
            System.out.println("Seleccione campo a editar");
            System.out.println("1. Reactivar Editorial");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Cancelar");
            int opc = leer.nextInt();
            while (opc < 1 || opc > 3) {
                System.out.println("Opcion invalida, reintente");
                opc = leer.nextInt();
            }
            switch (opc) {
                case 1:
                    if (editorial.getAlta()) {
                        System.out.println("La editorial ya se encuentra de Alta");
                    } else {
                        editorial.setAlta(Boolean.TRUE);
                        System.out.println("La editorial ha sido dada de Alta");
                    }
                    break;
                case 2:
                    leer.nextLine();
                    System.out.println("Ingrese el nuevo nombre para " + editorial.getNombre());
                    nombre = leer.nextLine();
                    System.out.println("Confirma " + nombre + " como nuevo nombre de la editorial " + editorial.getNombre() + "? S/n");
                    opc2 = leer.next();
                    while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                        System.out.println("Opcion invalida, reintente");
                        opc2 = leer.next();
                    }
                    if (opc2.equalsIgnoreCase("s")) {
                        editorial.setNombre(nombre);
                        System.out.println("El nombre de la editorial ha cambiado a " + editorial.getNombre());
                    } else {
                        System.out.println("No se hicieron cambios");
                        break;
                    }
                    break;
                default:
                    System.out.println("Operacion cancelada.");
                    break;
            }
            DAO.editarEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean eliminarPorId(Integer id) { // <- sin usar
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean eliminarEditorialL(Integer id) {
        try {
            DAO.eliminarEditorialLogico(id);
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }

    }

    public List<Editorial> listarEditoriales() {
        try {
            return DAO.listartodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Editorial> listarAltas() {
        try {
            return DAO.listarAltas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
