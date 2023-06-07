package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name= "calificaciones")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name= "name", length = 40, nullable = false)
    private String name;
    @Column(name= "puntuacion", length = 10, nullable = false)
    private String puntuacion;
    @Column(name= "comentarios", length = 1000, nullable = false)
    private String comentario;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, String name, String puntuacion, String comentario) {
        this.idCalificacion = idCalificacion;
        this.name = name;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
