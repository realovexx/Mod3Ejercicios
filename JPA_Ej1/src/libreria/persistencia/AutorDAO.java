package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    public void eliminarAutorLogico(Integer id) throws Exception{
        Autor autor = buscarPorId(id);
        autor.setAlta(Boolean.FALSE);
        super.eliminarLogico(autor);
    }

    public void editarAutor(Autor autor) throws Exception {
        super.editar(autor);
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class).setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

    public List<Autor> listartodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }  
    
        public List<Autor> listarAltas() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = TRUE").getResultList();
        desconectar();
        return autores;
    }  
}
