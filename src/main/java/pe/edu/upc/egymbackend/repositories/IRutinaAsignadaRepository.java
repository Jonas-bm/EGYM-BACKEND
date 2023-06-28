package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;

import java.util.List;

@Repository
public interface IRutinaAsignadaRepository extends JpaRepository<RutinaAsignada,Integer> {

    @Query(value = "SELECT CONCAT(e.nombre, ' ', e.apellido_paterno, ' ', e.apellido_materno) AS nombre_entrenador, COUNT(ra.id_rutina_asignada) AS rutinas_asignadas\n" +
            "FROM rutina_asignada ra\n" +
            "INNER JOIN cita_entrenador ce ON ra.id_cita = ce.id_cita\n" +
            "INNER JOIN entrenadores e ON e.id = ce.id_entrenador\n" +
            "GROUP BY e.nombre, e.apellido_paterno, e.apellido_materno\n" +
            "ORDER BY rutinas_asignadas DESC\n" +
            "LIMIT 3;\n", nativeQuery = true)
    List<String[]> entrenadorMasRutinas();

}
