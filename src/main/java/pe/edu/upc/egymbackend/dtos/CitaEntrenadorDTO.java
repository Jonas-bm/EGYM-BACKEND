package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Alumno;
import pe.edu.upc.egymbackend.entities.Calificacion;
import pe.edu.upc.egymbackend.entities.Entrenador;
import java.time.LocalDate;

public class CitaEntrenadorDTO {
    private Integer idCita;
    private LocalDate fechaCita;
    private String descripcion;
    private Entrenador entrenador;
    private Alumno alumno;

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
