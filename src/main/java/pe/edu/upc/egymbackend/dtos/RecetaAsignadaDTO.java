package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.CitaNutricionista;


public class RecetaAsignadaDTO {
    private Integer idRecetaAsignada;
    private CitaNutricionista citaNutricionista;
    private String nombreReceta;
    private String descripcion;

    public Integer getIdRecetaAsignada() {
        return idRecetaAsignada;
    }

    public void setIdRecetaAsignada(Integer idRecetaAsignada) {
        this.idRecetaAsignada = idRecetaAsignada;
    }

    public CitaNutricionista getCitaNutricionista() {
        return citaNutricionista;
    }

    public void setCitaNutricionista(CitaNutricionista citaNutricionista) {
        this.citaNutricionista = citaNutricionista;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
