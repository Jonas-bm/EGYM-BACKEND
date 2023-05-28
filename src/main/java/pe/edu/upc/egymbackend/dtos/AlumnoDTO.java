package pe.edu.upc.egymbackend.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class AlumnoDTO {
    private int idAlumno;
    private String nombreAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int dniAlumno;
    private String direccionAlumno;
    private String celularAlumno;
    private LocalDate fechaNacimiento;
    private int pesoAlumno;
    private int tallaAlumno;

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