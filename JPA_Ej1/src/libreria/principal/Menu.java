package libreria.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Menu {

    private final LibroServicio ls;
    private final AutorServicio as;
    private final EditorialServicio es;
    private final Scanner leer;

    public Menu() {
        ls = new LibroServicio();
        as = new AutorServicio();
        es = new EditorialServicio();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void ui() {
        int opc = 0;
        do {
            try {
                System.out.println("Sistema de gestion de Libreria");
                System.out.println("");
                System.out.println("Seleccione el criterio de consulta");
                System.out.println("1. Libros");
                System.out.println("2. Autores");
                System.out.println("3. Editoriales");
                System.out.println("0. Salir.");
                opc = leer.nextInt();
                System.out.println("");
                while (opc < 0 || opc > 3) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                    System.out.println("");
                }
                switch (opc) {
                    case 1:
                        uilibro();
                        break;
                    case 2:
                        leer.nextLine();
                        uiautor();
                        break;
                    case 3:
                        uiedit();
                        break;
                    default:
                        System.out.println("Saliendo...");
                        System.out.println("");
                }
            } catch (Exception e) {
                System.out.println("Error de sistema");
                System.out.println(e.getMessage());
            }
        } while (opc != 0);
    }

    public void uilibro() throws Exception {
        try {
            int opc;
            int anio;
            int ejemplares;
            int prestados;
            int restantes;
            long isbn;
            String opc2;
            String titulo;
            String nombre;
            Libro libro = new Libro();
            List<Libro> libros = new ArrayList();
            do {
                // opc = 0;
                System.out.println("Menu de gestion de Libros");
                System.out.println("Seleccione la opcion deseada");
                System.out.println("");
                System.out.println("1. Ingresar nuevo libro a Base de Datos");
                System.out.println("2. Buscar un libro");
                System.out.println("3. Modificar un libro existente");
                System.out.println("4. Eliminar un libro de la Base de Datos");
                System.out.println("5. Mostrar todos los libros");
                System.out.println("0. Volver al menu principal.");
                opc = leer.nextInt();
                System.out.println("");
                while (opc < 0 || opc > 5) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                    System.out.println("");
                }
                switch (opc) {
                    case 1:
                        leer.nextLine();
                        System.out.println("A continuacion, Ingrese los datos solicitados:");
                        System.out.println("Titulo: ");
                        titulo = leer.nextLine();
                        System.out.println("Año de publicacion:");
                        anio = leer.nextInt();
                        leer.nextLine();
                        System.out.println("Cantidad de ejemplares que han ingresado");
                        ejemplares = leer.nextInt();
                        prestados = 0;
                        restantes = ejemplares;
                        System.out.println("");
                        leer.nextLine();
                        System.out.println("Seleccione el autor:");
                        Autor autor = as.buscar();
                        System.out.println("Seleccione la editorial");
                        Editorial editorial = es.buscar();
                        libro = ls.crearLibro(titulo, anio, ejemplares, prestados, restantes, autor, editorial);
                        System.out.println("El libro " + libro.getTitulo() + " por " + autor.getNombre() + " ha sido guardado");
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("1. Busqueda por ISBN/Titulo");
                        System.out.println("2. Busqueda multiple por Autor");
                        System.out.println("3. Busqueda multiple por Editorial");
                        opc = leer.nextInt();
                        System.out.println("");
                        while (opc < 1 || opc > 3) {
                            System.out.println("Opcion invalida, reintente");
                            opc = leer.nextInt();
                            System.out.println("");
                        }
                        switch (opc) {
                            case 1:
                                libro = ls.buscar();
                                System.out.println(libro.toString());
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Ingrese nombre del autor");
                                nombre = leer.nextLine();
                                System.out.println("Listar solo resultados Activos? S/n");
                                opc2 = leer.next();
                                System.out.println("");
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                    System.out.println("");
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libros = ls.buscarPorAutorAlta(nombre);
                                    System.out.println("Se han encontrado " + libros.size() + " Resultado/s.");
                                    System.out.println("");
                                } else {
                                    libros = ls.buscarPorAutor(nombre);
                                    System.out.println("Se han encontrado " + libros.size() + " Resultado/s.");
                                    System.out.println("");
                                }
                                for (Libro aux : libros) {
                                    System.out.println(aux.toString());
                                }
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Ingrese nombre de la Editorial");
                                nombre = leer.nextLine();
                                System.out.println("Listar solo resultados Activos? S/n");
                                opc2 = leer.next();
                                System.out.println("");
                                while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                                    System.out.println("Opcion invalida, reintente");
                                    opc2 = leer.next();
                                    System.out.println("");
                                }
                                if (opc2.equalsIgnoreCase("s")) {
                                    libros = ls.buscarPorEditorialAlta(nombre);
                                    System.out.println("Se han encontrado " + libros.size() + " Resultado/s.");
                                    System.out.println("");
                                } else {
                                    libros = ls.buscarPorEditorial(nombre);
                                    System.out.println("Se han encontrado " + libros.size() + " Resultado/s.");
                                    System.out.println("");
                                }
                                for (Libro aux : libros) {
                                    System.out.println(aux.toString());
                                }
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Hubo un error. Saliendo...");
                        }
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Ingrese el numero ISBN del libro a modificar");
                        isbn = leer.nextLong();
                        System.out.println("");
                        ls.editarLibro(isbn);
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("Ingrese el numero de ISBN del libro que desea eliminar");
                        isbn = leer.nextLong();
                        Libro librobuscado = ls.buscarPorISBN(isbn);
                        System.out.println("");
                        System.out.println("Esta por eliminar " + librobuscado.getTitulo() + " Por " + librobuscado.getAutor().getNombre() + ". Está seguro de que desea proceder? (S/n)");
                        opc2 = leer.next();
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc = leer.nextInt();
                            System.out.println("");
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            System.out.println("Registro eliminado. Libro Alta: " + ls.eliminarLibroLogico(isbn));
                        } else {
                            System.out.println("No hubo cambios");
                        }
                        System.out.println("");
                        System.out.println("Regresando al menu");
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Listar solo resultados Activos? S/n");
                        opc2 = leer.next();
                        System.out.println("");
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                            System.out.println("");
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            libros = ls.listarAltas();
                        } else {
                            libros = ls.listarLibros();
                        }
                        System.out.println("");
                        System.out.println("Se han encontrado " + libros.size() + " resultado/s.");
                        System.out.println("");

                        for (Libro aux : libros) {
                            System.out.println(aux.toString());
                        }
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Saliendo al menu principal...");
                        System.out.println("");
                }
            } while (opc != 0);
        } catch (Exception e) {
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
        }
    }

    public void uiautor() {
        int opc;
        int id;
        String opc2;
        String nombre;
        Autor autor = new Autor();
        List<Autor> autores = new ArrayList();
        try {
            do {
                System.out.println("Menu de gestión de autores");
                System.out.println("Seleccione la opcion deseada");
                System.out.println("");
                System.out.println("1. Ingresar nuevo autor a Base de Datos");
                System.out.println("2. Buscar un autor");
                System.out.println("3. Modificar un autor existente");
                System.out.println("4. Dar de baja/eliminar un autor");
                System.out.println("5. Mostrar todos los autores");
                System.out.println("0. Volver al menu principal.");
                opc = leer.nextInt();
                System.out.println("");
                while (opc < 0 || opc > 5) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                    System.out.println("");
                }
                switch (opc) {
                    case 1:
                        leer.nextLine();
                        System.out.println("A continuacion, ingrese el nombre del Autor");
                        nombre = leer.nextLine();
                        System.out.println("");
                        autor = as.crearAutor(nombre);
                        System.out.println("El autor " + autor.getNombre() + " ha sido guardado");
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    case 2:
                        autor = as.buscar();
                        System.out.println(autor.toString());
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 3:
                        as.editarAutor();
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("Ingrese el numero de ID del autor que desea eliminar");
                        id = leer.nextInt();
                        Autor autorbuscado = as.buscarPorId(id);
                        leer.nextLine();
                        System.out.println("Esta por eliminar el autor " + autorbuscado.getNombre() + ". Está seguro de que desea proceder? (S/n)");
                        opc2 = leer.next();
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                            System.out.println("");
                        }
                        System.out.println("");
                        if (opc2.equalsIgnoreCase("s")) {
                            System.out.println("Registro eliminado: Alta = " + as.eliminarAutorLogico(id));
                        } else {
                            System.out.println("No hubo cambios");
                        }
                        System.out.println("");
                        System.out.println("Regresando al menu");
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Listar solo autores activos? S/n");
                        opc2 = leer.next();
                        System.out.println("");
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                            System.out.println("");
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            autores = as.listarAltas();
                            System.out.println("Se han encontrado " + autores.size() + " resultado/s.");
                            System.out.println("");
                        } else {
                            autores = as.listarAutores();
                            System.out.println("Se han encontrado " + autores.size() + " resultado/s.");
                            System.out.println("");
                        }
                        for (Autor aux : autores) {
                            System.out.println(aux.toString());
                        }
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Saliendo al menu principal...");
                        System.out.println("");
                }
            } while (opc != 0);
        } catch (Exception e) {
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
        }
    }

    public void uiedit() {
        int opc;
        int id;
        String opc2;
        String nombre;
        Editorial editorial = new Editorial();
        List<Editorial> editoriales = new ArrayList();
        try {
            do {
                System.out.println("Menu de gestión de editoriales");
                System.out.println("Seleccione la opcion deseada");
                System.out.println("");
                System.out.println("1. Ingresar nueva editorial a Base de Datos");
                System.out.println("2. Buscar una editorial");
                System.out.println("3. Modificar una editorial existente");
                System.out.println("4. Dar de baja/eliminar una editorial");
                System.out.println("5. Mostrar todas las editoriales");
                System.out.println("0. Volver al menu principal.");
                opc = leer.nextInt();
                System.out.println("");
                while (opc < 0 || opc > 5) {
                    System.out.println("Opcion invalida, reintente");
                    opc = leer.nextInt();
                    System.out.println("");
                }
                switch (opc) {
                    case 1:
                        leer.nextLine();
                        System.out.println("A continuacion, ingrese el nombre de la Editorial");
                        nombre = leer.nextLine();
                        System.out.println("");
                        editorial = es.crearEditorial(nombre);
                        System.out.println("La editorial " + editorial.getNombre() + " ha sido guardada");
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    case 2:
                        editorial = es.buscar();
                        System.out.println(editorial.toString());
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 3:
                        es.editarEditorial();
                        System.out.println("Volviendo al menu");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("Ingrese el numero de ID de la editorial que desea eliminar");
                        id = leer.nextInt();
                        Editorial edbuscado = es.buscarPorId(id);
                        System.out.println("Esta por eliminar la editorial " + edbuscado.getNombre() + ". Está seguro de que desea proceder? (S/n)");
                        opc2 = leer.next();
                        System.out.println("");
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc = leer.nextInt();
                            System.out.println("");
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            System.out.println("Registro eliminado: Alta = " + es.eliminarEditorialL(id));
                        } else {
                            System.out.println("No hubo cambios");
                        }
                        System.out.println("");
                        System.out.println("Regresando al menu");
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Listoar solo editoriales activas? S/n");
                        opc2 = leer.next();
                        System.out.println("");
                        while (!opc2.equalsIgnoreCase("s") && !opc2.equalsIgnoreCase("n")) {
                            System.out.println("Opcion invalida, reintente");
                            opc2 = leer.next();
                            System.out.println("");
                        }
                        if (opc2.equalsIgnoreCase("s")) {
                            editoriales = es.listarAltas();
                            System.out.println("Se han encontrado " + editoriales.size() + " resultado/s.");
                            System.out.println("");
                        } else {
                            editoriales = es.listarEditoriales();
                            System.out.println("Se han encontrado " + editoriales.size() + " resultado/s.");
                            System.out.println("");
                        }
                        for (Editorial aux : editoriales) {
                            System.out.println(aux.toString());
                        }
                        System.out.println("");
                        System.out.println("Volviendo al menu...");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Saliendo al menu principal...");
                        System.out.println("");
                }
            } while (opc != 0);
        } catch (Exception e) {
            System.out.println("Error de sistema");
            System.out.println(e.getMessage());
        }
    }
}
