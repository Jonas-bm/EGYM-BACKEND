package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Cita_Entrenador")

public class CitaEntrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCita;
    @Column(name="fechaCita",nullable = false)
    private LocalDate fechaCita;
    @Column(name="descripcion",length = 200,nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idEntrenador")
    private Entrenador entrenador;
    @ManyToOne
    @JoinColumn(name="idAlumno")
    private Alumno alumno;

    public CitaEntrenador() {
    }

    public CitaEntrenador(Integer idCita, LocalDate fechaCita, String descripcion, Entrenador entrenador, Alumno alumno) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.descripcion = descripcion;
        this.entrenador = entrenador;
        this.alumno = alumno;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

}
