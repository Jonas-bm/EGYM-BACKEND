package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Alumno;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class SuscripcionDTO {
    private Integer idSusripcion;
    private Alumno alumno;
    private String Pago;
    private String tipoSuscripcion;
    private BigDecimal precio;
    private LocalDate fechaSuscripcion;
    private LocalDate fechaExpiracion;

    public Integer getIdSusripcion() {
        return idSusripcion;
    }

    public void setIdSusripcion(Integer idSusripcion) {
        this.idSusripcion = idSusripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String pago) {
        Pago = pago;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDate getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public void setFechaSuscripcion(LocalDate fechaSuscripcion) {
        this.fechaSuscripcion = fechaSuscripcion;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}
