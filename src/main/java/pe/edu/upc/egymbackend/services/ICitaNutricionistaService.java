package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.dtos.CitaxFechaDTO;
import pe.edu.upc.egymbackend.dtos.NutricionistaCitaNutricionistaDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;

import java.time.LocalDate;
import java.util.List;

public interface ICitaNutricionistaService {
    public void insertar(CitaNutricionista citaNutricionista);
    List<CitaNutricionista> listar();
    public void eliminar(int idCitaNutricionista);
    public CitaNutricionista listId(int idCitaNutricionista);
    public List<NutricionistaCitaNutricionistaDTO>reporteBarreto();
    public List<CitaxFechaDTO>reporteBarreto2();

}
