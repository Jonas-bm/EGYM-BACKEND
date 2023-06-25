package pe.edu.upc.egymbackend.dtos;

public class NutricionistaCitaNutricionistaDTO {
    private String nombre_nutricionista;
    private String telefono;
    private int CitaCountxNutri;

    public NutricionistaCitaNutricionistaDTO() {
    }

    public NutricionistaCitaNutricionistaDTO(String nombre_nutricionista, String telefono, int citaCountxNutri) {
        this.nombre_nutricionista = nombre_nutricionista;
        this.telefono = telefono;
        CitaCountxNutri = citaCountxNutri;
    }

    public String getNombre_nutricionista() {
        return nombre_nutricionista;
    }

    public void setNombre_nutricionista(String nombre_nutricionista) {
        this.nombre_nutricionista = nombre_nutricionista;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCitaCountxNutri() {
        return CitaCountxNutri;
    }

    public void setCitaCountxNutri(int citaCountxNutri) {
        CitaCountxNutri = citaCountxNutri;
    }
}
