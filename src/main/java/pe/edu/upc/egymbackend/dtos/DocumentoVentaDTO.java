package pe.edu.upc.egymbackend.dtos;

import pe.edu.upc.egymbackend.entities.Alumno;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DocumentoVentaDTO {
    private Integer idDocumentoventa;
    private BigDecimal montoTotal;
    private LocalDate fecha;
    private Alumno alumno;

    public Integer getIdDocumentoventa() {
        return idDocumentoventa;
    }

    public void setIdDocumentoventa(Integer idDocumentoventa) {
        this.idDocumentoventa = idDocumentoventa;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
