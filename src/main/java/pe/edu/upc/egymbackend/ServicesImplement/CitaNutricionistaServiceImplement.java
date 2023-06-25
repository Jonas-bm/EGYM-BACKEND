package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.dtos.CitaxFechaDTO;
import pe.edu.upc.egymbackend.dtos.NutricionistaCitaNutricionistaDTO;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.repositories.ICitaNutricionistaRepository;
import pe.edu.upc.egymbackend.services.ICitaNutricionistaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CitaNutricionistaServiceImplement implements ICitaNutricionistaService {
    @Autowired
    private ICitaNutricionistaRepository cnR;
    @Override
    public void insertar(CitaNutricionista citaNutricionista) {
        cnR.save(citaNutricionista);
    }

    @Override
    public List<CitaNutricionista> listar() {
        return cnR.findAll();
    }

    @Override
    public void eliminar(int idCitaNutricionista) {
        cnR.deleteById(idCitaNutricionista);
    }

    @Override
    public CitaNutricionista listId(int idCitaNutricionista) {
        return cnR.findById(idCitaNutricionista).orElse(new CitaNutricionista());
    }

    @Override
    public List<NutricionistaCitaNutricionistaDTO> reporteBarreto() {
        List<String[]> contarcitasnutricionista=cnR.getContarCitasxNutricionista();
        List<NutricionistaCitaNutricionistaDTO>citaNutricionistaDTOS=new ArrayList<>();

        for(String[] data: contarcitasnutricionista){
            NutricionistaCitaNutricionistaDTO dto=new NutricionistaCitaNutricionistaDTO();
            dto.setNombre_nutricionista(data[0]);
            dto.setTelefono(data[1]);
            dto.setCitaCountxNutri(Integer.parseInt(data[2]));
            citaNutricionistaDTOS.add(dto);
        }
        return citaNutricionistaDTOS;
    }

    @Override
    public List<CitaxFechaDTO> reporteBarreto2() {
        List<String[]>countxcitasxfecha=cnR.getCitasxfecha();
        List<CitaxFechaDTO>citaxFechaDTOS=new ArrayList<>();

        for(String[] data:countxcitasxfecha){
            CitaxFechaDTO dto=new CitaxFechaDTO();
            dto.setNombreNutricionista(data[0]);
            dto.setCitacountxdate(Integer.parseInt(data[1]));
            citaxFechaDTOS.add(dto);
        }
        return citaxFechaDTOS;
    }


}
