package pe.edu.upc.egymbackend.dtos;

public class EntrenadorCitaEntrenadorDTO {
    private String nameEntrenador;
    private int citaEntrenadorCount;

    public EntrenadorCitaEntrenadorDTO() {
    }

    public EntrenadorCitaEntrenadorDTO(String nameEntrenador, int citaEntrenadorCount) {
        this.nameEntrenador = nameEntrenador;
        this.citaEntrenadorCount = citaEntrenadorCount;
    }

    public String getNameEntrenador() {
        return nameEntrenador;
    }

    public void setNameEntrenador(String nameEntrenador) {
        this.nameEntrenador = nameEntrenador;
    }

    public int getCitaEntrenadorCount() {
        return citaEntrenadorCount;
    }

    public void setCitaEntrenadorCount(int citaEntrenadorCount) {
        this.citaEntrenadorCount = citaEntrenadorCount;
    }
}
