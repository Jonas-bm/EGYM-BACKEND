package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
@Entity
@Table(name = "entrenadores")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrenador;
    @Column(name = "nombre",length = 60, nullable = false)
    private String nombre;

    @Column(name = "apellidoPaterno", length = 40, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", length = 40, nullable = false)
    private String apellidoMaterno;

    @Column(name = "dni", length = 8, nullable = false)
    private String dni;

    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;

    @Column(name = "correo", length = 40, nullable = false)
    private String correo;

    @Column(name = "habilidades", length = 100, nullable = false)
    private String habilidades;

    @Column(name = "experiencia", length = 100, nullable = false)
    private String experiencia;

    @Column(name = "educacion", length = 100, nullable = false)
    private String educacion;

    @Column(name = "estado", length = 50, nullable = false)
    private String estado;

    public Entrenador() {
    }

    public Entrenador(int idEntrenador, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String correo, String habilidades, String experiencia, String educacion, String estado) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.educacion = educacion;
        this.estado = estado;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
