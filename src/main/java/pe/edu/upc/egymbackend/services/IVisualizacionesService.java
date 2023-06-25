package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.entities.Visualizaciones;

import java.util.List;

public interface IVisualizacionesService {
    public void insertar(Visualizaciones visualizaciones);
    List<Visualizaciones> listar();
    public void eliminar(int idVisualizaciones);
    public Visualizaciones listId(int idVisualizaciones);
}
