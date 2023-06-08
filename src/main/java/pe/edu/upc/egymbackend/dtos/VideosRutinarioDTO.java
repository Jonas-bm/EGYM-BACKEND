package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Entrenador;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class VideosRutinarioDTO {
    private Integer idVideosRutionarios;
    private Entrenador entrenador;
    private String nombreTipoVideo;
    private String descripcion;
    private BigDecimal duracion;

    public Integer getIdVideosRutionarios() {
        return idVideosRutionarios;
    }

    public void setIdVideosRutionarios(Integer idVideosRutionarios) {
        this.idVideosRutionarios = idVideosRutionarios;
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

    public BigDecimal getDuracion() {
        return duracion;
    }

    public void setDuracion(BigDecimal duracion) {
        this.duracion = duracion;
    }
}
