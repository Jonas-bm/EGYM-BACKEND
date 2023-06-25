package pe.edu.upc.egymbackend.dtos;

public class EntrenadorCitaEntrenadorDTO {
    private String nameEntrenador;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int citaEntrenadorCount;

    public EntrenadorCitaEntrenadorDTO() {
    }

    public EntrenadorCitaEntrenadorDTO(String nameEntrenador, String apellidoPaterno, String apellidoMaterno, int citaEntrenadorCount) {
        this.nameEntrenador = nameEntrenador;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.citaEntrenadorCount = citaEntrenadorCount;
    }

    public String getNameEntrenador() {
        return nameEntrenador;
    }

    public void setNameEntrenador(String nameEntrenador) {
        this.nameEntrenador = nameEntrenador;
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

    public int getCitaEntrenadorCount() {
        return citaEntrenadorCount;
    }

    public void setCitaEntrenadorCount(int citaEntrenadorCount) {
        this.citaEntrenadorCount = citaEntrenadorCount;
    }
}
