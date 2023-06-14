package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Cita_NUtricionista")
public class CitaNutricionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCitaNutricionista;
    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "idNutricionista")
    private Nutricionista nutricionista;
    @Column(name="fecha",nullable = false)
    private LocalDate fecha;
    @Column(name="descripcion",length = 100,nullable = false)
    private String descripcion;

    public CitaNutricionista() {
    }

    public CitaNutricionista(Integer idCitaNutricionista, Alumno alumno, Nutricionista nutricionista, LocalDate fecha, String descripcion) {
        this.idCitaNutricionista = idCitaNutricionista;
        this.alumno = alumno;
        this.nutricionista = nutricionista;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Integer getIdCitaNutricionista() {
        return idCitaNutricionista;
    }

    public void setIdCitaNutricionista(Integer idCitaNutricionista) {
        this.idCitaNutricionista = idCitaNutricionista;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
