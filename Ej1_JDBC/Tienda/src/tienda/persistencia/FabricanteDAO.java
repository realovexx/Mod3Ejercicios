package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

        /* CONSULTA DE TODA LA TABLA FABRICANTE */
    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                /*Fabricante fabricante = fabricanteServicio.buscarUsuarioPorId(codigo);
                mascota.setUsuario(usuario);*/
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void guardarFabricante(Fabricante Fabricante) throws Exception {

        try {
            if (Fabricante == null) {////voy a validar el usuario
                throw new Exception("Debe indicar otro Fabricante");////lanza el sieguiente mensaje
            }
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES (' " + Fabricante.getCodigo() + " ' , ' " + Fabricante.getNombre() + " ' )";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante Fabricante) throws Exception {
        try {
            if (Fabricante == null) {
                throw new Exception("Debe indicar el Fabricante que desea modificar");
            }
            String sql = "UPDATE fabricante SET"
                    + "clave = '" + Fabricante.getCodigo() + " ' WHERE nombre = ' " + Fabricante.getNombre() + " ');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM  fabricante WHERE nombre = ' " + nombre + " ' ";
        } catch (Exception e) {
            throw e;
        }
    }
}
