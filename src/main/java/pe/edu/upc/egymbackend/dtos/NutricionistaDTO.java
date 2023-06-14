package pe.edu.upc.egymbackend.dtos;

import javax.persistence.Column;

public class NutricionistaDTO {
    private int id;
    private String nombreNutricionista;
    private String apellidosNutricionista;
    private String dni;
    private String telefono;
    private String sexo;
    private String Descripcion;
    private String Estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    @Override
    public String toString() {
        return "NutricionistaDTO{" +
                "id=" + id +
                ", nombreNutricionista='" + nombreNutricionista + '\'' +
                ", apellidosNutricionista='" + apellidosNutricionista + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", sexo='" + sexo + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
