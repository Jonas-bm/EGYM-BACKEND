package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;

@Repository
public interface ICitaEntrenadorRepository extends JpaRepository<CitaEntrenador,Integer> {
}
