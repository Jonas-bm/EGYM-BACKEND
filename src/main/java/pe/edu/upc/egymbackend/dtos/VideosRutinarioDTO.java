package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Entrenador;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class VideosRutinarioDTO {
    private Integer idVideosRutinarios;
    private Entrenador entrenador;
    private String nombreTipoVideo;
    private String descripcion;
    private String duracion;

    public Integer getIdVideosRutinarios() {
        return idVideosRutinarios;
    }

    public void setIdVideosRutinarios(Integer idVideosRutinarios) {
        this.idVideosRutinarios = idVideosRutinarios;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombreTipoVideo() {
        return nombreTipoVideo;
    }

    public void setNombreTipoVideo(String nombreTipoVideo) {
        this.nombreTipoVideo = nombreTipoVideo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
