package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.dtos.EntrenadorConMasRutinasDTO;
import pe.edu.upc.egymbackend.dtos.ProductoGeneraMasIngresosDTO;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;

import java.util.List;

public interface IRutinaAsignadaService {
    public void insertar(RutinaAsignada rutinaAsignada);
    List<RutinaAsignada> listar();
    public void eliminar(int idRutinaAsignada);

    public List<EntrenadorConMasRutinasDTO> reporte06();

}
