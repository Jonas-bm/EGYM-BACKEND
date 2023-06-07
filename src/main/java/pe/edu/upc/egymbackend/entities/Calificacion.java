package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name= "calificaciones")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "name", length = 40, nullable = false)
    private String name;
    @Column(name= "puntuacion", length = 10, nullable = false)
    private String puntuacion;
    @Column(name= "comentarios", length = 1000, nullable = false)
    private String comentario;

    public Calificacion() {
    }

    public Calificacion(int id, String name, String puntuacion, String comentario) {
        this.id = id;
        this.name = name;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int idCalificacion) {
        this.id = idCalificacion;
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
