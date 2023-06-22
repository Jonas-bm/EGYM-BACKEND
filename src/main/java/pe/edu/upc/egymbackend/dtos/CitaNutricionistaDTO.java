package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Alumno;
import pe.edu.upc.egymbackend.entities.Nutricionista;
import java.time.LocalDate;

public class CitaNutricionistaDTO {
    private Integer idCitaNutricionista;
    private Alumno alumno;
    private Nutricionista nutricionista;
    private LocalDate fecha;

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

}
