package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.VideosRutinario;

@Repository
public interface IVideosRutinarioRepository extends JpaRepository<VideosRutinario,Integer> {
}
