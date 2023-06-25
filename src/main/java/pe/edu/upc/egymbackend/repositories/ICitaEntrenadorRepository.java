package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;

import java.util.List;

@Repository
public interface ICitaEntrenadorRepository extends JpaRepository<CitaEntrenador,Integer> {
    @Query(value = "SELECT e.nombre, e.apellido_paterno,e.apellido_materno, COUNT(ce.id_cita) \n" +
            "FROM entrenadores e \n" +
            "JOIN cita_entrenador ce ON e.id = ce.id_entrenador\n" +
            "GROUP BY e.nombre, e.apellido_paterno,e.apellido_materno \n" +
            "ORDER BY COUNT(ce.id_cita) DESC", nativeQuery = true)
    List<String[]> getCountDateByTrainer();
}
