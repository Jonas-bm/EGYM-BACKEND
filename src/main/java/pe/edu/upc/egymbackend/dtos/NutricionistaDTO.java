package pe.edu.upc.egymbackend.dtos;

import javax.persistence.Column;

public class NutricionistaDTO {
    private int idNutricionista;
    private String nombreNutricionista;
    private String apellidosNutricionista;
    private String dni;
    private String telefono;
    private String sexo;
    private String Descripcion;
    private String Estado;

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
