package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;

import java.util.List;

public interface ICitaNutricionistaService {
    public void insertar(CitaNutricionista citaNutricionista);
    List<CitaNutricionista> listar();
    public void eliminar(int idCitaNutricionista);
    public CitaNutricionista listId(int idCitaNutricionista);
}
