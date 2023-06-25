package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.dtos.DocVentaDetVentaDTO;
import pe.edu.upc.egymbackend.dtos.EntrenadorDisponibleDTO;
import pe.edu.upc.egymbackend.entities.DetalleVenta;

import java.util.List;

public interface IDetalleVentaService {
    public void insertar(DetalleVenta detalleVenta);
    List<DetalleVenta> listar();
    public void eliminar(int idDetalleVenta);
    public List<DocVentaDetVentaDTO> reporte01();
}
