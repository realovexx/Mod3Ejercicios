package principal.dominio.personajes;


public class Personaje {
    private int id_personaje;
    private String nombre_real;
    private String personaje;
    private int inteligencia;
    private String fuerza;
    private int velocidad;
    private int poder;
    private int aparicion;
    private String ocupacion;
    private int id_creador;

    public Personaje() {
    }

    public Personaje(int id_personaje, String nombre_real, String personaje, int inteligencia, String fuerza, int velocidad, int poder, int aparicion, String ocupacion, int id_creador) {
        this.id_personaje = id_personaje;
        this.nombre_real = nombre_real;
        this.personaje = personaje;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.poder = poder;
        this.aparicion = aparicion;
        this.ocupacion = ocupacion;
        this.id_creador = id_creador;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public String getNombre_real() {
        return nombre_real;
    }

    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAparicion() {
        return aparicion;
    }

    public void setAparicion(int aparicion) {
        this.aparicion = aparicion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getId_creador() {
        return id_creador;
    }

    public void setId_creador(int id_creador) {
        this.id_creador = id_creador;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id_personaje=" + id_personaje + ", nombre_real=" + nombre_real + ", personaje=" + personaje + ", inteligencia=" + inteligencia + ", fuerza=" + fuerza + ", velocidad=" + velocidad + ", poder=" + poder + ", aparicion=" + aparicion + ", ocupacion=" + ocupacion + ", id_creador=" + id_creador + '}';
    }
    
    
}
