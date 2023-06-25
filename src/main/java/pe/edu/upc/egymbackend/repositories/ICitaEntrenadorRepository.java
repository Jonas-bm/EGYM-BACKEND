package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;

import java.util.List;

@Repository
public interface ICitaEntrenadorRepository extends JpaRepository<CitaEntrenador,Integer> {
    @Query(value = "SELECT e.nombre_entrenador, COUNT(ce.id_cita) " +
            "FROM entrenadores e " +
            "JOIN cita_entrenador ce ON e.id = ce.id_cita" +
            "GROUP BY e.nombre " +
            "ORDER BY COUNT(ce.id_cita) DESC", nativeQuery = true)
    List<String[]> getCountDateByTrainer();
}
