package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.repositories.ICitaNutricionistaRepository;
import pe.edu.upc.egymbackend.services.ICitaNutricionistaService;

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
}
