package pe.edu.upc.egymbackend.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Entrenador;
import pe.edu.upc.egymbackend.repositories.IEntrenadorRepository;
import pe.edu.upc.egymbackend.services.IEntrenadorService;

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
}
