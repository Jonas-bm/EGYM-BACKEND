package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.RecetaAsignada;

import java.util.List;

public interface IRecetaAsignadaService {
    public void insertar(RecetaAsignada recetaAsignada);
    List<RecetaAsignada> listar();
    public void eliminar(int idRecetaAsignada);
}
