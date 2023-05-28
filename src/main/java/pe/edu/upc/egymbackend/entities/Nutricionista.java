package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "nutricionista")
public class Nutricionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNutricionista;
    @Column(name = "nombreNutricionista",length =60,nullable = false )
    private String nombreNutricionista;
    @Column(name = "apellidosNutricionista",length =60,nullable = false )
    private String apellidosNutricionista;
    @Column(name = "dni",length =8,nullable = false )
    private String dni;
    @Column(name = "telefono",length =9,nullable = false )
    private String telefono;
    @Column(name = "sexo",length =60,nullable = false )
    private String sexo;
    @Column(name = "Descripcion",length =60,nullable = false )
    private String Descripcion;
    @Column(name = "Estado",length =60,nullable = false )
    private String Estado;

    public Nutricionista() {
    }

    public Nutricionista(int idNutricionista, String nombreNutricionista, String apellidosNutricionista, String dni, String telefono, String sexo, String descripcion, String estado) {
        this.idNutricionista = idNutricionista;
        this.nombreNutricionista = nombreNutricionista;
        this.apellidosNutricionista = apellidosNutricionista;
        this.dni = dni;
        this.telefono = telefono;
        this.sexo = sexo;
        Descripcion = descripcion;
        Estado = estado;
    }

    public int getIdNutricionista() {
        return idNutricionista;
    }

    public void setIdNutricionista(int idNutricionista) {
        this.idNutricionista = idNutricionista;
    }

    public String getNombreNutricionista() {
        return nombreNutricionista;
    }

    public void setNombreNutricionista(String nombreNutricionista) {
        this.nombreNutricionista = nombreNutricionista;
    }

    public String getApellidosNutricionista() {
        return apellidosNutricionista;
    }

    public void setApellidosNutricionista(String apellidosNutricionista) {
        this.apellidosNutricionista = apellidosNutricionista;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
