package pe.edu.upc.egymbackend.dtos;

import java.math.BigDecimal;

public class EntrenadorConMasRutinasDTO {

    private String nameEntrenador;
    private int idRutina;

    public EntrenadorConMasRutinasDTO(){
    }

    public EntrenadorConMasRutinasDTO(String nameEntrenador, int idRutina) {
        this.nameEntrenador = nameEntrenador;
        this.idRutina = idRutina;
    }

    public String getNameEntrenador() {
        return nameEntrenador;
    }

    public void setNameEntrenador(String nameEntrenador) {
        this.nameEntrenador = nameEntrenador;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }
}
