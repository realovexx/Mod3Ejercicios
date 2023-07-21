package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {

    private ProductoDAO dao;
    FabricanteServicio fs = new FabricanteServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen Productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* METODO CONSULTA JAVA
    public void imprimirEntre() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos para imprimir");
            } else {
                for (Producto p : productos) {
                    if (p.getPrecio() >= 120 & p.getPrecio() <= 202) {
                        System.out.println("Producto: " + p.getNombre() + " - Precio $ " + p.getPrecio());
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     */
 /* METODO CONSULTA JAVA
    public void imprimirPortatil() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen Productos para imprimir");
            } else {
                for (Producto p : productos) {
                    if (!p.getNombre().contains("Portátil")) {
                    } else {
                        System.out.println(p.toString());
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     */
    public Collection<Producto> nombreyPrecio() throws Exception {

        try {

            Collection<Producto> productos = dao.nombreyPrecio();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println("Producto: " + p.getNombre() + " - Precio $ " + p.getPrecio());
                }
            }

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void impNyP() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = nombreyPrecio();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println("Producto: " + p.getNombre() + " - Precio $ " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* METODO QUE CONSULTA E IMPRIME */
    public Collection<Producto> productosEntre() throws Exception {

        try {

            Collection<Producto> productos = dao.productosEntre();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println("Producto: " + p.getNombre() + " - Precio $ " + p.getPrecio());
                }
            }
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    /* METODO QUE CONSULTA E IMPRIME PORTÁTIL*/
    public Collection<Producto> productosPortatil() throws Exception {

        try {

            Collection<Producto> productos = dao.contienePortatil();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    /* METODO QUE CONSULTA E IMPRIME PRODUCTO + BARATO*/
    public Collection<Producto> productoBarato() throws Exception {

        try {

            Collection<Producto> productos = dao.productoBarato();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void cargarProducto() throws Exception {

        try {

            //Creamos el producto
            Producto producto = new Producto();
            System.out.println("Carga del Producto");
            System.out.println("");
            producto.setCodigo(0); //SE PONE 0 PARA QUE AGREGUE EL NUMERO QUE SIGUE EN LA BASE DE DATOS. POR EJ SI EL ULTIMO ERA 10, ACA AGREGAMOS EL 11
            System.out.println("Ingrese el Nombre del Producto");
            producto.setNombre(leer.next());
            System.out.println("Ingrese el Precio del Producto");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el Codigo del Fabricante");
            producto.setCodigoFabricante(leer.nextInt());

            dao.ingresarProducto(producto);

            System.out.println("¡Producto Cargado con Exito!");

        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo del Producto");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            //Verificamos
            if (producto == null) {
                throw new Exception("No se encontró producto para el codigo indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto() throws Exception {

        try {
//Buscamos
            System.out.println("Ingrese el codigo del producto: ");
            int cod = leer.nextInt();

            Producto producto = buscarProductoPorCodigo(cod);

            System.out.println("Ingrese el nuevo nombre: ");
            producto.setNombre(leer.next());
            if (leer == null) {
                throw new Exception("Debe indicar el Nombre");
            }
            System.out.println("Ingrese el nuevo precio: ");
            producto.setPrecio(leer.nextDouble());
            if (leer == null) {
                throw new Exception("Debe indicar un precio");
            }
            System.out.println("Ingrese el nuevo codigo del Fabricante: ");
            producto.setCodigoFabricante(leer.nextInt());
            if (producto.getCodigoFabricante() < 0) {
                throw new Exception("Debe indicar el Codigo del Fabricante");
            }            

            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void menu() throws Exception {
        boolean salir = false;
        do {

            System.out.println("");
            System.out.println(">> TIENDA <<");
            System.out.println("");
            System.out.println(" Menu de Opciones: ");

            System.out.println("1) Listar todos los Productos");
            System.out.println("2) Listar todos los Fabricantes");
            System.out.println("3) Mostrar Nombre y Precio de los Productos");
            System.out.println("4) Productos que valen entre 120 y 202");
            System.out.println("5) Lista de Portatiles");
            System.out.println("6) Nombre y Precio del Producto más Barato");
            System.out.println("7) Ingresar un Producto");
            System.out.println("8) Ingresar un Fabricante");
            System.out.println("9) Modificar un Producto");
            System.out.println("0) Salir ");
            System.out.println("");
            System.out.println("Ingrese una opción: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\t ~ Lista de Productos ~ \n");
                    this.imprimirProductos();
                    break;
                case 2:
                    System.out.println("\t ~ Lista de Fabricantes ~ \n");
                    this.fs.listarFabricantes();
                    break;
                case 3:
                    System.out.println("\t ~ Productos con Nombre y Precio ~ \n");
                    this.nombreyPrecio();
                    /*this.impNyP();*/
                    break;
                case 4:
                    System.out.println("\t ~ Productos entre U$S 120 y U$S 202 ~ \n");
                    this.productosEntre();
                    /*this.imprimirEntre();*/
                    break;
                case 5:
                    System.out.println("\t ~ Portatiles ~ \n");
                    this.productosPortatil();
                    break;
                case 6:
                    System.out.println("\t ~ Producto más barato ~ \n");
                    this.productoBarato();
                    break;
                case 7:
                    System.out.println("\t ~ Agregar Producto ~ \n");
                    this.cargarProducto();
                    break;
                case 8:
                    System.out.println("\t ~ Agregar Fabricante ~ \n");
                    this.fs.cargarFabricante();
                    break;
                case 9:
                    System.out.println("\t ~ Modificar un Producto ~ \n");
                    this.modificarProducto();
                    break;

                case 0:
                    System.out.println("¡¡Aplicacion Finalizada!!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!salir);
    }

}
