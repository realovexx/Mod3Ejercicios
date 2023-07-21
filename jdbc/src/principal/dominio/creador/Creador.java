package principal.dominio.creador;


public class Creador {

   private int id_creador;
   private String nombre;

    public Creador() {
    }

    public Creador(int id_creador, String nombre) {
        this.id_creador = id_creador;
        this.nombre = nombre;
    }

    public int getId_creador() {
        return id_creador;
    }

    public void setId_creador(int id_creador) {
        this.id_creador = id_creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Creador{" + "id_creador=" + id_creador + ", nombre=" + nombre + '}';
    }
   
   
    
}
