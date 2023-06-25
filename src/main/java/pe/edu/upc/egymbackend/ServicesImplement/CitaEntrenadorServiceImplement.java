package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.repositories.ICitaEntrenadorRepository;
import pe.edu.upc.egymbackend.services.ICitaEntrenadorService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitaEntrenadorServiceImplement implements ICitaEntrenadorService {
    @Autowired
    private ICitaEntrenadorRepository ceR;
    @Override
    public void insertar(CitaEntrenador citaEntrenador) {
        ceR.save(citaEntrenador);
    }

    @Override
    public List<CitaEntrenador> listar() {
        return ceR.findAll();
    }

    @Override
    public void eliminar(int idCitaEntrenador) {
        ceR.deleteById(idCitaEntrenador);
    }

    @Override
    public CitaEntrenador listId(int idCitaEntrenador) {
        return ceR.findById(idCitaEntrenador).orElse(new CitaEntrenador());
    }
    public List<EntrenadorCitaEntrenadorDTO> reporte01() {
        List<String[]> countDateByTrainer = ceR.getCountDateByTrainer();
        List<EntrenadorCitaEntrenadorDTO> entrenadorCitaEntrenadorDTOSDTOs = new ArrayList<>();

        for (String[] data : countDateByTrainer) {
            EntrenadorCitaEntrenadorDTO dto = new EntrenadorCitaEntrenadorDTO();
            dto.setNameEntrenador(data[0]);
            dto.setCitaEntrenadorCount(Integer.parseInt(data[1]));
            entrenadorCitaEntrenadorDTOSDTOs.add(dto);
        }

        return entrenadorCitaEntrenadorDTOSDTOs;
    }

}
