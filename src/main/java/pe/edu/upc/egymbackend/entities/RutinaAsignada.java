package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rutina_Asignada")
public class RutinaAsignada {
    @Id
    @GeneratedValue
    private Integer idRutinaAsignada;
    @Column(name="nombreRutina",length = 50,nullable = false)
    private String nombreRutina;
    @Column(name="descripcion",length = 100,nullable = false)
    private String descripcion;
    @Column(name="repeticiones",length = 50,nullable = false)
    private String repeticiones;
    @Column(name="tiempoRutina",length = 50,nullable = false)
    private String tiempoRutina;
    @OneToOne
    @JoinColumn(name = "idCita")
    private CitaEntrenador citaEntrenador;

    public RutinaAsignada() {
    }

    public RutinaAsignada(Integer idRutinaAsignada, String nombreRutina, String descripcion, String repeticiones, String tiempoRutina, CitaEntrenador citaEntrenador) {
        this.idRutinaAsignada = idRutinaAsignada;
        this.nombreRutina = nombreRutina;
        this.descripcion = descripcion;
        this.repeticiones = repeticiones;
        this.tiempoRutina = tiempoRutina;
        this.citaEntrenador = citaEntrenador;
    }

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
