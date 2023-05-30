package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.Calificacion;

@Repository
public interface ICalificacionRepository extends JpaRepository <Calificacion,Integer>{

}
