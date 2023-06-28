package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {

    @Query(value = "SELECT p.nombre AS NOMBRE_PRODUCTO, SUM(dv. monto_total) AS MONTO\n" +
            "FROM productos p\n" +
            "INNER JOIN detalle_venta dv\n" +
            "ON dv.id_producto = p.id\n" +
            "GROUP BY p.nombre\n" +
            "ORDER BY MONTO DESC\n" +
            "LIMIT 1", nativeQuery = true)
    List<String[]> productoGeneraIngresos();

}
