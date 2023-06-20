package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.DetalleVenta;

import java.util.List;

public interface IDetalleVentaService {
    public void insertar(DetalleVenta detalleVenta);
    List<DetalleVenta> listar();
    public void eliminar(int idDetalleVenta);
    public DetalleVenta listId(int idDetalleVenta);
}
