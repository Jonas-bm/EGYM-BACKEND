package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.Entrenador;

import java.util.List;

@Repository
public interface IEntrenadorRepository extends JpaRepository<Entrenador, Integer> {


}
