package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.RecetaAsignada;

@Repository
public interface IRecetaAsignadaRepository extends JpaRepository<RecetaAsignada,Integer> {
}
