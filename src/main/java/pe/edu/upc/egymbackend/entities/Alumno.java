package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "alumnos")


public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre",length=60,nullable = false)
    private String nombre;
    @Column(name = "apellidoPaterno",length = 60,nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno",length = 60,nullable = false)
    private String apellidoMaterno;
    @Column(name="dni",length = 8,nullable = false)
    private String dni;
    @Column(name = "direccion",length = 100,nullable = false)
    private String direccion;
    @Column(name = "celular",length = 9,nullable = false)
    private long celular;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "peso",length = 10,nullable = false)
    private Double peso;
    @Column(name = "talla",length = 10,nullable = false)
    private Double talla;
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String direccion, long celular, LocalDate fechaNacimiento, Double peso, Double talla) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.talla = talla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }
}
