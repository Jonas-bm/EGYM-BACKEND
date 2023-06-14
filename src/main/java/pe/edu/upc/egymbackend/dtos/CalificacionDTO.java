package pe.edu.upc.egymbackend.dtos;

import javax.persistence.Column;

public class CalificacionDTO {
    private int id;
    private String name;
    private String puntuacion;
    private String comentario;

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
