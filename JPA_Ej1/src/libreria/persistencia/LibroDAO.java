package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminarPorIsbn(Long isbn) throws Exception {
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }

    public void eliminarLibroLogico(Long isbn) throws Exception {
        Libro libro = buscarPorIsbn(isbn);
        libro.setAlta(Boolean.FALSE);
        super.eliminarLogico(libro);
    }

    public void editarLibro(Libro libro) throws Exception {
        super.editar(libro);
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class).setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> buscarPorAutor(String autor) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Autor a WHERE a.nombre LIKE :autor ").setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorAutorAlta(String autor) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Autor a WHERE a.nombre LIKE :autor AND l.alta = TRUE ").setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorEditorial(String editorial) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Editorial e WHERE e.nombre LIKE :editorial").setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarPorEditorialAlta(String editorial) throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN Editorial e WHERE e.nombre LIKE :editorial AND l.alta = TRUE").setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listartodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarAltas() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = TRUE").getResultList();
        desconectar();
        return libros;
    }
}
