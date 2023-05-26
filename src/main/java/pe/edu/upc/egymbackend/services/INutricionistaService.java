package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Nutricionista;

import java.util.List;

public interface INutricionistaService {
    public void insert(Nutricionista nutricionista);
    List<Nutricionista>list();
    public void delete(int idNutricionista);
    public Nutricionista listId(int idNutricionista);
}
