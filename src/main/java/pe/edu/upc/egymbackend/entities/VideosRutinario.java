package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name="Videos_Rutinario")
public class VideosRutinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVideosRutionarios;
    @ManyToOne
    @JoinColumn(name="idEntrenador")
    private Entrenador entrenador;
    @Column(name = "nombreTipoVideo",length =50,nullable = false)
    private String nombreTipoVideo;
    @Column(name = "descripcion",length = 150,nullable = false)
    private String descripcion;
    @Column(name = "duracion",nullable = false)
    private BigDecimal duracion;

    public VideosRutinario() {
    }

    public VideosRutinario(Integer idVideosRutionarios, Entrenador entrenador, String nombreTipoVideo, String descripcion, BigDecimal duracion) {
        this.idVideosRutionarios = idVideosRutionarios;
        this.entrenador = entrenador;
        this.nombreTipoVideo = nombreTipoVideo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

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
