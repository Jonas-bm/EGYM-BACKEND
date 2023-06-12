package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class RutinaAsignadaDTO {
    private Integer idRutinaAsignada;
    private String nombreRutina;
    private String descripcion;
    private String repeticiones;
    private String tiempoRutina;
    private CitaEntrenador citaEntrenador;

    public Integer getIdRutinaAsignada() {
        return idRutinaAsignada;
    }

    public void setIdRutinaAsignada(Integer idRutinaAsignada) {
        this.idRutinaAsignada = idRutinaAsignada;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getTiempoRutina() {
        return tiempoRutina;
    }

    public void setTiempoRutina(String tiempoRutina) {
        this.tiempoRutina = tiempoRutina;
    }

    public CitaEntrenador getCitaEntrenador() {
        return citaEntrenador;
    }

    public void setCitaEntrenador(CitaEntrenador citaEntrenador) {
        this.citaEntrenador = citaEntrenador;
    }
}
