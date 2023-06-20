package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public void insertar(Suscripcion suscripcion);
    List<Suscripcion> listar();
    public void eliminar(int idSuscripcion);
    public Suscripcion listId(int idSuscripcion);
}
