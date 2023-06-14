package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Suscripcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSusripcion;
    @OneToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;
    @Column(name = "Pago",nullable = false)
    private String Pago;
    @Column(name="tipoSuscripcion",length = 50,nullable = false)
    private String tipoSuscripcion;
    @Column(name = "precio",nullable = false)
    private BigDecimal precio;
    @Column(name = "fechaSuscripcion",nullable = false)
    private LocalDate fechaSuscripcion;
    @Column(name = "fechaExpiracion",nullable = false)
    private LocalDate fechaExpiracion;

    public Suscripcion() {
    }

    public Suscripcion(Integer idSusripcion, Alumno alumno, String pago, String tipoSuscripcion, BigDecimal precio, LocalDate fechaSuscripcion, LocalDate fechaExpiracion) {
        this.idSusripcion = idSusripcion;
        this.alumno = alumno;
        Pago = pago;
        this.tipoSuscripcion = tipoSuscripcion;
        this.precio = precio;
        this.fechaSuscripcion = fechaSuscripcion;
        this.fechaExpiracion = fechaExpiracion;
    }

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
