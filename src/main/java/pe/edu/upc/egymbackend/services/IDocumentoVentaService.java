package pe.edu.upc.egymbackend.services;


import pe.edu.upc.egymbackend.dtos.DocVentaDetVentaDTO;
import pe.edu.upc.egymbackend.dtos.ProductoAlumnoDTO;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;

import pe.edu.upc.egymbackend.entities.DocumentoVenta;

import java.util.List;

public interface IDocumentoVentaService {
    public void insertar(DocumentoVenta documentoVenta);
    List<DocumentoVenta> listar();
    public void eliminar(int idDocumentoVenta);

    public List<ProductoAlumnoDTO> reporte01();

    public DocumentoVenta listId(int idDocumentoVenta);

}
