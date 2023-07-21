package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.NoResultException;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private final LibroDAO DAO;
    private final Scanner leer;

    public LibroServicio() {
        DAO = new LibroDAO();
        leer = DAO.leer;
    }

    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares, Integer elemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            libro.setAlta(true);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setElemplaresPrestados(elemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public Libro buscarPorISBN(Long isbn) throws Exception, NoResultException {
        try {
            return DAO.buscarPorIsbn(isbn);
        } catch (NoResultException n) {
            System.out.println("Libro no encontrado");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorTitulo(String titulo) throws Exception, NoResultException {
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (NoResultException n) {
            System.out.println("Libro no encontrado");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscar() throws Exception, NoResultException {
        int opc;
        try {
            do {
                System.out.println("Seleccione metodo de busqueda:");
                System.out.println("");
                System.out.println("1. ISBN");
                System.out.println("2. Titulo");
                System.out.println("0. Cancelar");
                opc = leer.nextInt();
                while (opc < 0 || opc > 2) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                }
                if (opc == 1) {
                    System.out.println("Ingrese el ISBN");
                    Long isbn = leer.nextLong();
                    return buscarPorISBN(isbn);
                } else {
                    System.out.println("Ingrese el Titulo");
                    String titulo = leer.nextLine();
                    return buscarPorTitulo(titulo);
                }
            } while (opc != 0);
        } catch (NoResultException n) {
            System.out.println("Libro no encontrado");
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void editarLibro(Long isbn) throws Exception {

        try {
            Libro libro = buscarPorISBN(isbn);
            int opc;
            int anio;
            int id;
            String titulo;
            String opc2;
            System.out.println("Seleccione campo a editar");
            System.out.println("1. Reactivar Libro");
            System.out.println("2. Modificar titulo");
            System.out.println("3. Modificar año de publicacion");
            System.out.println("4. Modificar autor");
            System.out.println("5. Modificar editorial");
            System.out.println("6. Cancelar");
            try {
                opc = leer.nextInt();
                while (opc < 1 || opc > 6) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                }

                switch (opc) {
                    case 1:
                        if (libro.getAlta()) {
                            System.out.println("El libro ya se encuentra de Alta");
                        } else {
                            libro.setAlta(Boolean.TRUE);
                            System.out.println("El libro ha sido dada de alta");
                        }
                        break;
                    case 2:
                        leer.nextLine();
                        System.out.println("Ingrese el nuevo titulo para " + libro.getTitulo());
                        titulo = leer.nextLine();
                        System.out.println("Confirma " + titulo + " como nuevo titulo del libro " + libro.getTitulo() + "? S/n");
                        opc2 = leer.next();
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            libro.setTitulo(titulo);
                            System.out.println("El nombre del libro ha cambiado a " + libro.getTitulo());
                        } else {
                            System.out.println("No se hicieron cambios");
                            break;
                        }
                        break;
                    case 3:
                        leer.nextLine();
                        System.out.println("Ingrese el año de publicacion correcto para " + libro.getTitulo());
                        anio = leer.nextInt();
                        System.out.println("Confirma " + anio + " como nuevo año de publicacion del libro " + libro.getTitulo() + "? S/n");
                        leer.nextLine();
                        opc2 = leer.next();
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            libro.setAnio(anio);
                            System.out.println("El año de publicacion del libro ha cambiado a " + libro.getAnio());
                        } else {
                            System.out.println("No se hicieron cambios");
                            break;
                        }
                        break;
                    case 4:
                        leer.nextLine();
                        String nautor = "";
                        Autor autor = new Autor();
                        AutorServicio as = new AutorServicio();
                        System.out.println("Seleccione el metodo de busqueda del nuevo autor");
                        System.out.println("1. por ID");
                        System.out.println("2. por Nombre de autor");
                        System.out.println("3. Cancelar");
                        opc = leer.nextInt();
                        while (opc < 1 || opc > 3) {
                            System.out.println("Opcion invalida, reintente");
                            opc = leer.nextInt();
                        }
                        switch (opc) {
                            case 1:
                                leer.nextLine();
                                System.out.println("Ingrese el ID del nuevo autor");
                                id = leer.nextInt();
                                nautor = libro.getAutor().getNombre();
                                autor = as.buscarPorId(id);
                                leer.nextLine();
                                System.out.println("Está seguro que desea cambiar el autor " + nautor + " por el nuevo autor " + autor.getNombre() + "? S/n");
                                opc2 = leer.next();
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libro.setAutor(autor);
                                    System.out.println("El Autor del libro ha cambiado a " + libro.getAutor().getNombre());
                                } else {
                                    System.out.println("No se hicieron cambios");
                                    break;
                                }
                                break;
                            case 2:

                                leer.nextLine();
                                System.out.println("Ingrese el nombre del nuevo autor");
                                opc2 = leer.nextLine();
                                autor = as.buscarPorNombre(opc2);
                                nautor = libro.getAutor().getNombre();
                                System.out.println("Está seguro que desea cambiar el autor " + nautor + " por el nuevo autor " + autor.getNombre() + "? S/n");
                                opc2 = leer.next();
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libro.setAutor(autor);
                                    System.out.println("El Autor del libro ha cambiado a " + libro.getAutor().getNombre());
                                } else {
                                    System.out.println("No se hicieron cambios");
                                    break;
                                }
                                break;

                        }
                        break;
                    case 5:
                        leer.nextLine();
                        String nedit = "";
                        Editorial editorial = new Editorial();
                        EditorialServicio es = new EditorialServicio();
                        System.out.println("Seleccione el metodo de busqueda de la nueva editorial");
                        System.out.println("1. por ID");
                        System.out.println("2. por Nombre de editorial");
                        System.out.println("3. Cancelar");
                        opc = leer.nextInt();
                        while (opc < 1 || opc > 3) {
                            System.out.println("Opcion invalida, reintente");
                            opc = leer.nextInt();
                        }
                        switch (opc) {
                            case 1:
                                opc2 = "";
                                leer.nextLine();
                                System.out.println("Ingrese el ID de la nueva editorial");
                                id = leer.nextInt();
                                leer.nextLine();
                                editorial = es.buscarPorId(id);
                                nedit = libro.getEditorial().getNombre();
                                System.out.println("Está seguro que desea cambiar la editorial " + nedit + " por la nueva editorial " + editorial.getNombre() + "? S/n");
                                opc2 = leer.next();
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libro.setEditorial(editorial);
                                    System.out.println("La editorial del libro ha cambiado a " + libro.getEditorial().getNombre());
                                } else {
                                    System.out.println("No se hicieron cambios");
                                    break;
                                }
                                break;
                            case 2:
                                leer.nextLine();
                                System.out.println("Ingrese el nombre de la nueva editorial");
                                opc2 = leer.nextLine();
                                editorial = es.buscarPorNombre(opc2);
                                nedit = libro.getEditorial().getNombre();
                                System.out.println("Está seguro que desea cambiar la editorial " + nedit + " por la nueva editorial " + editorial.getNombre() + "? S/n");
                                opc2 = leer.next();
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libro.setEditorial(editorial);
                                    System.out.println("La editorial del libro ha cambiado a " + libro.getEditorial().getNombre());
                                } else {
                                    System.out.println("No se hicieron cambios");
                                    break;
                                }
                                break;

                        }
                        break;
                    default:
                        System.out.println("Operacion cancelada.");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            DAO.editarLibro(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public boolean eliminarPorISBN(Long isbn) { // <- todavia no se porq boolean
        try {
            DAO.eliminarPorIsbn(isbn);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean eliminarLibroLogico(Long isbn) {
        try {
            DAO.eliminarLibroLogico(isbn);
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }

    }

    public List<Libro> listarLibros() {
        try {
            return DAO.listartodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> listarAltas() {
        try {
            return DAO.listarAltas();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorAutor(String autor) {
        try {
            return DAO.buscarPorAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorAutorAlta(String autor) {
        try {
            return DAO.buscarPorAutorAlta(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorEditorial(String editorial) {
        try {
            return DAO.buscarPorEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorEditorialAlta(String editorial) {
        try {
            return DAO.buscarPorEditorialAlta(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
