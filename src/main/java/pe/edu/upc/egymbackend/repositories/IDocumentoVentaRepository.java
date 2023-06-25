package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.DocumentoVenta;

import java.util.List;

@Repository
public interface IDocumentoVentaRepository extends JpaRepository<DocumentoVenta,Integer> {
    @Query(value = "SELECT a.nombre, a.apellido_paterno,a.apellido_materno, COUNT(dv.id_documentoventa) \n" +
            "FROM alumnos a\n" +
            "JOIN documento_venta dv ON a.id = dv.id_alumno\n" +
            "GROUP BY a.nombre, a.apellido_paterno,a.apellido_materno\n" +
            "ORDER BY COUNT(dv.id_documentoventa) DESC", nativeQuery = true)
    List<String[]> getProductoAlumno();
}
