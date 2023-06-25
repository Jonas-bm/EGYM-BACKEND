package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.EntrenadorDisponibleDTO;
import pe.edu.upc.egymbackend.entities.Entrenador;
import pe.edu.upc.egymbackend.repositories.IEntrenadorRepository;
import pe.edu.upc.egymbackend.services.IEntrenadorService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrenadorServiceImplement implements IEntrenadorService {
    @Autowired
    private IEntrenadorRepository eR;

    @Override
    public void insert(Entrenador entrenador) {
        eR.save(entrenador);
    }

    @Override
    public List<Entrenador> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEntrenador) {
        eR.deleteById(idEntrenador);
    }

    @Override
    public Entrenador listId(int idEntrenador) {
        return eR.findById(idEntrenador).orElse(new Entrenador());
    }

    @Override
    public List<EntrenadorDisponibleDTO> reporte01() {
        List<String[]> entrenadorDisponible = eR.getEntrenadorDisponible();
        List<EntrenadorDisponibleDTO> entrenadorDisponibleDTOs = new ArrayList<>();

        for (String[] data : entrenadorDisponible) {
            EntrenadorDisponibleDTO dto = new EntrenadorDisponibleDTO();
            dto.setNombreEntrenador(data[0]);
            dto.setApellidoPaterno(data[1]);
            dto.setApellidoMaterno(data[2]);
            dto.setEstado(data[3]);
            dto.setExperiencia(data[4]);
            entrenadorDisponibleDTOs.add(dto);
        }
        return entrenadorDisponibleDTOs;
    }
}
