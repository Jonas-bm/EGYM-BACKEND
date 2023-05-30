package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Calificacion;


import java.util.List;

public interface ICalificacionService {
    public void insert(Calificacion calificacion);
    List<Calificacion> list();
    public void delete(int idCalificacion);
    public Calificacion listId(int idCalificacion);
}
