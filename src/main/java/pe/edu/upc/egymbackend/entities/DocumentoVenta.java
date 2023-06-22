package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Documento_Venta")
public class DocumentoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocumentoventa;
    @Column(name="fecha",nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;

    public DocumentoVenta() {
    }

    public DocumentoVenta(Integer idDocumentoventa, LocalDate fecha, Alumno alumno) {
        this.idDocumentoventa = idDocumentoventa;
        this.fecha = fecha;
        this.alumno = alumno;
    }

    public Integer getIdDocumentoventa() {
        return idDocumentoventa;
    }

    public void setIdDocumentoventa(Integer idDocumentoventa) {
        this.idDocumentoventa = idDocumentoventa;
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
