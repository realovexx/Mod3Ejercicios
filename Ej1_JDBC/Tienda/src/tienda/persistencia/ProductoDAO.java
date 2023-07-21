package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteServicio;

public final class ProductoDAO extends DAO {

    private final FabricanteServicio fabricanteServicio;

    public ProductoDAO() {
        this.fabricanteServicio = new FabricanteServicio();
    }

    /* CONSULTA DE TODA LA TABLA PRODUCTO */
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                /*Fabricante fabricante = fabricanteServicio.buscarUsuarioPorId(codigo);
                mascota.setUsuario(usuario);*/
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    /* CONSULTA DE NOMBRE Y PRECIO */
    public Collection<Producto> nombreyPrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM Producto";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    /* CONSULTA BETWEEN. PRECIO ENTRE */
    public Collection<Producto> productosEntre() throws Exception {
        try {
            String sql = "SELECT * FROM Producto"
                    + " WHERE precio BETWEEN 120 AND 202";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    /* CONSULTA IN. LISTA DE PRODUCTOS QUE CONTENGAN PORTÁTIL */
    public Collection<Producto> contienePortatil() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%Portátil%'";
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    /* CONSULTA MIN. LISTA PRODUCTO MAS BARATO */
    public Collection<Producto> productoBarato() throws Exception {
        try {
            String sql = "SELECT *  FROM PRODUCTO WHERE PRECIO = (SELECT MIN(precio) FROM Producto)";
            /*select * from empleados where sal_emp = (select max(sal_emp) from empleados);*/
            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    /* INGRESAR PRODUCTO A LA BASE DE DATOS */
    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("¡Debe ingresar un producto!");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "')";
            /*select * from empleados where sal_emp = (select max(sal_emp) from empleados);*/
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    //MODIFICAR PRODUCTO
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = " + producto.getPrecio() + " , codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = " + producto.getCodigo();
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCodigo(int cod) throws Exception {
        try {
            String sql = "SELECT codigo FROM producto WHERE codigo = '" + cod + "'";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
