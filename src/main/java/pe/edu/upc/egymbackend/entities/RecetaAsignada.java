package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Receta_Asignada")
public class RecetaAsignada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRecetaAsignada;
    @OneToOne
    @JoinColumn(name="idCitaNutricionista")
    private CitaNutricionista citaNutricionista;
    @Column(name="nombreReceta",length = 50,nullable = false)
    private String nombreReceta;
    @Column(name="descripcion",length = 200,nullable = false)
    private String descripcion;

    public RecetaAsignada() {
    }

    public RecetaAsignada(Integer idRecetaAsignada, CitaNutricionista citaNutricionista, String nombreReceta, String descripcion) {
        this.idRecetaAsignada = idRecetaAsignada;
        this.citaNutricionista = citaNutricionista;
        this.nombreReceta = nombreReceta;
        this.descripcion = descripcion;
    }

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
