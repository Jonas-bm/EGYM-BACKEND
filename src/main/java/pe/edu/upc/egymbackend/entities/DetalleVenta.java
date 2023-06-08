package pe.edu.upc.egymbackend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Detalle_Venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleVenta;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;
    @Column(name = "montoTotal",nullable = false)
    private BigDecimal montoTotal;
    @Column(name = "fechaVenta",nullable = false)
    private LocalDate fechaVenta;
    @ManyToOne
    @JoinColumn(name = "idDocumentoventa")
    private DocumentoVenta documentoVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer idDetalleVenta, Producto producto, BigDecimal montoTotal, LocalDate fechaVenta, DocumentoVenta documentoVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.producto = producto;
        this.montoTotal = montoTotal;
        this.fechaVenta = fechaVenta;
        this.documentoVenta = documentoVenta;
    }

    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public DocumentoVenta getDocumentoVenta() {
        return documentoVenta;
    }

    public void setDocumentoVenta(DocumentoVenta documentoVenta) {
        this.documentoVenta = documentoVenta;
    }
}
