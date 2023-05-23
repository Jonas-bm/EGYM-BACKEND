package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Alumno;

import java.util.List;

public interface IAlumnoService {

    public void insert(Alumno alumno);
    List<Alumno>list();
}
