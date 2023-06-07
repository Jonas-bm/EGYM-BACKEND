package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Nutricionista;
import pe.edu.upc.egymbackend.repositories.INutricionistaRepository;
import pe.edu.upc.egymbackend.services.INutricionistaService;

import java.util.List;

@Service
public class NutricionistaServiceImplement implements INutricionistaService {
    @Autowired
    private INutricionistaRepository nR;

    @Override
    public void insert(Nutricionista nutricionista) {
        nR.save(nutricionista);
    }

    @Override
    public List<Nutricionista> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int idNutricionista) {
        nR.deleteById(idNutricionista);
    }

    @Override
    public Nutricionista listId(int idNutricionista) {
        return nR.findById(idNutricionista).orElse(new Nutricionista());
    }
}
