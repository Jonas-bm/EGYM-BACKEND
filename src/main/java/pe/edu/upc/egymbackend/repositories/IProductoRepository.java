package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {
}
