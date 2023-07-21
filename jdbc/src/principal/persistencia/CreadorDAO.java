package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import principal.dominio.creador.Creador;


public final class CreadorDAO extends DAO {
    
    public void guardarCreador(Creador c) throws Exception{        
        try {            
            if (c == null) {
                throw new Exception("Debe indicar un creador");
            }            
            String sql = "INSERT INTO creador (nombre)"
                    + "VALUES ( '"+c.getNombre()+"')";            
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public void modificarCreador(Creador c) throws Exception{
        try {
            if (c == null){
                throw new Exception("Debe indicar un creador a modificar");
            }
            String sql = "UPDATE creador SET "
                    + "nombre = '"+c.getNombre()+"' WHERE id_creador = "+ c.getId_creador();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarCreador(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM creador WHERE nombre = '"+nombre+"'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Creador buscarCreadorNombre(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM creador "
                    + "WHERE nombre = '"+nombre+"'";
            consultarBase(sql);
            Creador c = null;
            while (resultado.next()) {                
                c = new Creador();
                c.setNombre(resultado.getString(1));
            }
            desconectarBase();
            return c;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Creador> listarCreadores() throws Exception{
        try {
            String sql = "SELECT nombre FROM creador";
            consultarBase(sql);
            Creador c = null;
            Collection<Creador> creadores = new ArrayList();
            while (resultado.next()) {                
                c = new Creador();
                c.setNombre(resultado.getString(1));
                creadores.add(c);
            }
            desconectarBase();
            return creadores;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
