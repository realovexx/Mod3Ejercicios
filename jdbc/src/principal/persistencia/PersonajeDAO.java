package principal.persistencia;

import principal.dominio.personajes.Personaje;

public class PersonajeDAO extends DAO {
    
    public void guardarPersonaje (Personaje p) throws Exception{        
        try {            
            if (p == null) {
                throw new Exception("Debe indicar un personaje");
            }            
            String sql = "INSERT INTO personaje (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)"
                    + "VALUES ( '"+p.getNombre_real()+"','"+p.getPersonaje()+"',"+p.getInteligencia()+",'"+p.getFuerza()+"',"
                    +p.getVelocidad()+","+p.getPoder()+","+p.getAparicion()+",'"+p.getOcupacion()+"',"+p.getId_creador()+"')";            
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }        
    }
    
    public void modificarCreador(Personaje p) throws Exception{
        try {
            if (p == null){
                throw new Exception("Debe indicar un personaje a modificar");
            }
            String sql = "UPDATE personajes SET "
                    + "nombre_real = '"+p.getNombre_real()+"'"
                    +",personaje = '"+p.getPersonaje()+"'"
                    +",inteligencia = "+p.getInteligencia()+""
                    +",fuerza = '"+p.getFuerza()+"'"
                    +",velocidad = "+p.getVelocidad()+""
                    +",poder = "+p.getPoder()+""
                    +",aparicion = "+p.getAparicion()+""
                    +",ocupacion = '"+p.getOcupacion()+"'"
                    +",id_creador = "+p.getId_creador()+""
                    + " WHERE id_personaje = "+ p.getId_personaje()+"";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarPersonaje(String alias) throws Exception {
        try {
            String sql = "DELETE FROM personajes WHERE personaje = '"+alias+"'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
