package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name="Videos_Rutinario")
public class VideosRutinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVideosRutinarios;
    @ManyToOne
    @JoinColumn(name="idEntrenador")
    private Entrenador entrenador;
    @Column(name = "nombreTipoVideo",length =50,nullable = false)
    private String nombreTipoVideo;
    @Column(name = "descripcion",length = 150,nullable = false)
    private String descripcion;
    @Column(name = "duracion",length = 50,nullable = false)
    private String duracion;

    public VideosRutinario() {
    }

    public VideosRutinario(Integer idVideosRutinarios, Entrenador entrenador, String nombreTipoVideo, String descripcion, String duracion) {
        this.idVideosRutinarios = idVideosRutinarios;
        this.entrenador = entrenador;
        this.nombreTipoVideo = nombreTipoVideo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

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
