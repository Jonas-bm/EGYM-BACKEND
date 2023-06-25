package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Suscripcion;
import pe.edu.upc.egymbackend.repositories.ISuscripcionRepository;
import pe.edu.upc.egymbackend.services.ISuscripcionService;

import java.util.List;

@Service
public class SuscripcionServiceImplement implements ISuscripcionService {
    @Autowired
    private ISuscripcionRepository sR;
    @Override
    public void insertar(Suscripcion suscripcion) {
        sR.save(suscripcion);
    }

    @Override
    public List<Suscripcion> listar() {
        return sR.findAll();
    }

    @Override
    public void eliminar(int idSuscripcion) {
        sR.deleteById(idSuscripcion);
    }

    @Override
    public Suscripcion listId(int idSuscripcion) {
        return sR.findById(idSuscripcion).orElse(new Suscripcion());
    }
}
