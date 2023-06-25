package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;

import java.util.List;

public interface IRutinaAsignadaService {
    public void insertar(RutinaAsignada rutinaAsignada);
    List<RutinaAsignada> listar();
    public void eliminar(int idRutinaAsignada);
    public RutinaAsignada listId(int idRutinaAsignada);
}
