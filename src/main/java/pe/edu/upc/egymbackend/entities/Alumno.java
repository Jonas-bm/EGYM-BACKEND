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
    private int dniAlumno;
    @Column(name = "direccionAlumno",length = 100,nullable = false)
    private String direccionAlumno;
    @Column(name = "celularAlumno",length = 9,nullable = false)
    private String celularAlumno;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "pesoAlumno",length = 10,nullable = false)
    private int pesoAlumno;
    @Column(name = "tallaAlumno",length = 10,nullable = false)
    private int tallaAlumno;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombreAlumno, String apellidoPaterno, String apellidoMaterno, int dniAlumno, String direccionAlumno, String celularAlumno, LocalDate fechaNacimiento, int pesoAlumno, int tallaAlumno) {
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

    public int getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(int dniAlumno) {
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

    public int getPesoAlumno() {
        return pesoAlumno;
    }

    public void setPesoAlumno(int pesoAlumno) {
        this.pesoAlumno = pesoAlumno;
    }

    public int getTallaAlumno() {
        return tallaAlumno;
    }

    public void setTallaAlumno(int tallaAlumno) {
        this.tallaAlumno = tallaAlumno;
    }
}
