package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.EntrenadorDisponibleDTO;
import pe.edu.upc.egymbackend.entities.Entrenador;

import java.util.List;

public interface IEntrenadorService {

    public void insert(Entrenador entrenador);
    List<Entrenador> list();
    public  void delete(int idEntrenador);

    public Entrenador listId(int idEntrenador);
    public List<EntrenadorDisponibleDTO> reporte01();
}
