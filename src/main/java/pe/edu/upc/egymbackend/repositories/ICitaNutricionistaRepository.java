package pe.edu.upc.egymbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICitaNutricionistaRepository extends JpaRepository<CitaNutricionista,Integer> {

    @Query(value="SELECT \n" +
            "  CONCAT(n.nombre_nutricionista, ' ', n.apellidos_nutricionista) AS nombre_completo_nutricionista,\n" +
            "  n.telefono,\n" +
            "  COUNT(cn.id_cita_nutricionista) \n" +
            "FROM cita_nutricionista cn\n" +
            "JOIN nutricionistas n ON cn.id_nutricionista = n.id\n" +
            "JOIN alumnos a ON cn.id_alumno = a.id\n" +
            "GROUP BY n.nombre_nutricionista, n.apellidos_nutricionista, n.telefono;\n",nativeQuery = true)
    List<String[]>getContarCitasxNutricionista();


    @Query(value = "SELECT CONCAT(n.nombre_nutricionista, ' ', n.apellidos_nutricionista) AS nombre_completo_nutricionista, COUNT(cn.id_cita_nutricionista)\n" +
            "FROM cita_nutricionista cn \n" +
            "JOIN nutricionistas n ON cn.id_nutricionista = n.id \n" +
            "WHERE cn.fecha = CURRENT_DATE \n" +
            "GROUP BY n.nombre_nutricionista, n.apellidos_nutricionista \n" +
            "ORDER BY COUNT(cn.id_cita_nutricionista) DESC;\n",
            nativeQuery = true)
    List<String[]> getCitasxfecha();



}
