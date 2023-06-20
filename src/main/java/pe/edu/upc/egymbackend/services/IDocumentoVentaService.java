package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.DocumentoVenta;

import java.util.List;

public interface IDocumentoVentaService {
    public void insertar(DocumentoVenta documentoVenta);
    List<DocumentoVenta> listar();
    public void eliminar(int idDocumentoVenta);
    public DocumentoVenta listId(int idDocumentoVenta);
}
