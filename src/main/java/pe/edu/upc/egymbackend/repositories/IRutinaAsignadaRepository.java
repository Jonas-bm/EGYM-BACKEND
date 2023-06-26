package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;

import java.util.List;

@Repository
public interface IRutinaAsignadaRepository extends JpaRepository<RutinaAsignada,Integer> {

    @Query(value = "SELECT e.nombre ENTRENADOR, COUNT(ra.id_rutina_asignada) RUTINAS_ASIGNADAS \n" +
            "FROM rutina_asignada ra\n" +
            "INNER JOIN cita_entrenador ce\n" +
            "ON ra.id_cita = ce.id_cita\n" +
            "INNER JOIN entrenadores e\n" +
            "ON e.id = ce.id_entrenador\n" +
            "GROUP BY nombre\n" +
            "ORDER BY RUTINAS_ASIGNADAS DESC\n" +
            "LIMIT 3", nativeQuery = true)
    List<String[]> entrenadorMasRutinas();

}
