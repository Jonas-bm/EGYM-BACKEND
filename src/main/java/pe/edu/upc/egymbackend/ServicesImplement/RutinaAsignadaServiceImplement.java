package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;
import pe.edu.upc.egymbackend.repositories.IRutinaAsignadaRepository;
import pe.edu.upc.egymbackend.services.IRutinaAsignadaService;

import java.util.List;

@Service
public class RutinaAsignadaServiceImplement implements IRutinaAsignadaService {
    @Autowired
    private IRutinaAsignadaRepository ruaR;
    @Override
    public void insertar(RutinaAsignada rutinaAsignada) {
        ruaR.save(rutinaAsignada);
    }

    @Override
    public List<RutinaAsignada> listar() {
        return ruaR.findAll();
    }

    @Override
    public void eliminar(int idRutinaAsignada) {
        ruaR.deleteById(idRutinaAsignada);
    }

    @Override
    public RutinaAsignada listId(int idRutinaAsignada) {
        return ruaR.findById(idRutinaAsignada).orElse(new RutinaAsignada());
    }
}
