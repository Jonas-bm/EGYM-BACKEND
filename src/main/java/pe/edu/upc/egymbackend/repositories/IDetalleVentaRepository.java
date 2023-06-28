package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.DetalleVenta;

import java.util.List;

@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta,Integer> {
    @Query(value = "SELECT CONCAT(a.nombre, ' ', a.apellido_paterno, ' ', a.apellido_materno) AS nombre_completo_alumno, p.nombre AS nombre_producto, dv.monto_total, dvf.fecha\n" +
            "FROM detalle_venta dv\n" +
            "JOIN documento_venta dvf ON dv.id_documentoventa = dvf.id_documentoventa\n" +
            "JOIN alumnos a ON dvf.id_alumno = a.id\n" +
            "JOIN productos p ON dv.id_producto = p.id", nativeQuery = true)
    List<String[]> getDocumentoDetalleVenta();
}
