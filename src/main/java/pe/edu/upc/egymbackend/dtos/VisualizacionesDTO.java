package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Alumno;
import pe.edu.upc.egymbackend.entities.VideosRutinario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VisualizacionesDTO {
    private Integer idVisualizaciones;
    private Alumno alumno;
    private VideosRutinario videosRutinario;
    private String comentario;

    public Integer getIdVisualizaciones() {
        return idVisualizaciones;
    }

    public void setIdVisualizaciones(Integer idVisualizaciones) {
        this.idVisualizaciones = idVisualizaciones;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public VideosRutinario getVideosRutinario() {
        return videosRutinario;
    }

    public void setVideosRutinario(VideosRutinario videosRutinario) {
        this.videosRutinario = videosRutinario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
