package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Entrenador;

import java.util.List;

public interface IEntrenadorService {

    public void insert(Entrenador entrenador);
    List<Entrenador> list();
}
