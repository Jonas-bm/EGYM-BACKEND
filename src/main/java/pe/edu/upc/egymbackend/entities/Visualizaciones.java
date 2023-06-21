package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name="Visualizaciones")
public class Visualizaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVisualizaciones;
    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "idVideosRutionarios")
    private VideosRutinario videosRutinario;
    @Column(name="comentario",length = 200,nullable = false)
    private String comentario;

    public Visualizaciones() {
    }

    public Visualizaciones(Integer idVisualizaciones, Alumno alumno, VideosRutinario videosRutinario, String comentario) {
        this.idVisualizaciones = idVisualizaciones;
        this.alumno = alumno;
        this.videosRutinario = videosRutinario;
        this.comentario = comentario;
    }

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
