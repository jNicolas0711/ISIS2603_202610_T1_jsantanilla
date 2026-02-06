package co.edu.uniandes.dse.TallerPersistencia.entities;

public class PeliculaEntity extends BaseEntity {

    private String nombre;
    private String director;
    private Integer duracion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
}
