package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "alumnos")


public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;
    @Column(name = "nombreAlumno",length=60,nullable = false)
    private String nombreAlumno;
    @Column(name = "apellidoPaterno",length = 60,nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno",length = 60,nullable = false)
    private String apellidoMaterno;
    @Column(name="dniAlumno",length = 8,nullable = false)
    private String dniAlumno;
    @Column(name = "direccionAlumno",length = 100,nullable = false)
    private String direccionAlumno;
    @Column(name = "celularAlumno",length = 9,nullable = false)
    private String celularAlumno;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "pesoAlumno",length = 10,nullable = false)
    private Double pesoAlumno;
    @Column(name = "tallaAlumno",length = 10,nullable = false)
    private Double tallaAlumno;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombreAlumno, String apellidoPaterno, String apellidoMaterno, String dniAlumno, String direccionAlumno, String celularAlumno, LocalDate fechaNacimiento, Double pesoAlumno, Double tallaAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dniAlumno = dniAlumno;
        this.direccionAlumno = direccionAlumno;
        this.celularAlumno = celularAlumno;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoAlumno = pesoAlumno;
        this.tallaAlumno = tallaAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
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

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getDireccionAlumno() {
        return direccionAlumno;
    }

    public void setDireccionAlumno(String direccionAlumno) {
        this.direccionAlumno = direccionAlumno;
    }

    public String getCelularAlumno() {
        return celularAlumno;
    }

    public void setCelularAlumno(String celularAlumno) {
        this.celularAlumno = celularAlumno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getPesoAlumno() {
        return pesoAlumno;
    }

    public void setPesoAlumno(Double pesoAlumno) {
        this.pesoAlumno = pesoAlumno;
    }

    public Double getTallaAlumno() {
        return tallaAlumno;
    }

    public void setTallaAlumno(Double tallaAlumno) {
        this.tallaAlumno = tallaAlumno;
    }
}
