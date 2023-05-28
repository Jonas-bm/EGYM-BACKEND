package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.egymbackend.entities.Nutricionista;

public interface INutricionistaRepository extends JpaRepository<Nutricionista,Integer> {
}
