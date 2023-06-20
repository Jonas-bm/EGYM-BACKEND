package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;

import java.util.List;

public interface ICitaEntrenadorService {
    public void insertar(CitaEntrenador citaEntrenador);
    List<CitaEntrenador>listar();
    public void eliminar(int idCitaEntrenador);
}
