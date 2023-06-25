package pe.edu.upc.egymbackend.dtos;

public class CitaxFechaDTO {
    private String nombreNutricionista;
    private int Citacountxdate;

    public CitaxFechaDTO() {
    }

    public CitaxFechaDTO(String nombreNutricionista, int citacountxdate) {
        this.nombreNutricionista = nombreNutricionista;
        Citacountxdate = citacountxdate;
    }

    public String getNombreNutricionista() {
        return nombreNutricionista;
    }

    public void setNombreNutricionista(String nombreNutricionista) {
        this.nombreNutricionista = nombreNutricionista;
    }

    public int getCitacountxdate() {
        return Citacountxdate;
    }

    public void setCitacountxdate(int citacountxdate) {
        Citacountxdate = citacountxdate;
    }
}
