package pe.edu.upc.egymbackend.dtos;

public class EntrenadorDisponibleDTO {
    private String nombreEntrenador;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String estado;
    private String experiencia;

    public EntrenadorDisponibleDTO() {
    }

    public EntrenadorDisponibleDTO(String nombreEntrenador, String apellidoPaterno, String apellidoMaterno, String estado, String experiencia) {
        this.nombreEntrenador = nombreEntrenador;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.estado = estado;
        this.experiencia = experiencia;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
