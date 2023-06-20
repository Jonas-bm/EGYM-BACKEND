package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.Suscripcion;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion,Integer> {
}
