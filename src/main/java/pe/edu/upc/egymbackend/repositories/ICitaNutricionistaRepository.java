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

    @Query(value="Select n.nombre_nutricionista,n.telefono,count(cn.id_cita_nutricionista) from cita_nutricionista cn\n" +
            "join nutricionistas n on cn.id_nutricionista=n.id\n" +
            "group by  n.nombre_nutricionista, n.telefono order by count(n.nombre_nutricionista) DESC",nativeQuery = true)
    List<String[]>getContarCitasxNutricionista();

    @Query(value = "SELECT n.nombre_nutricionista, COUNT(cn.id_cita_nutricionista) " +
            "FROM cita_nutricionista cn " +
            "JOIN nutricionistas n ON cn.id_nutricionista = n.id " +
            "WHERE cn.fecha=CURRENT_DATE " +
            "GROUP BY n.nombre_nutricionista " +
            "ORDER BY COUNT(n.nombre_nutricionista) DESC",
            nativeQuery = true)
    List<String[]> getCitasxfecha();



}
