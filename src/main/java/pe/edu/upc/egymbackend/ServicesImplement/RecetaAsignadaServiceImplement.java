package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.RecetaAsignada;
import pe.edu.upc.egymbackend.repositories.IRecetaAsignadaRepository;
import pe.edu.upc.egymbackend.services.IRecetaAsignadaService;

import java.util.List;

@Service
public class RecetaAsignadaServiceImplement implements IRecetaAsignadaService {
    @Autowired
    private IRecetaAsignadaRepository reaR;
    @Override
    public void insertar(RecetaAsignada recetaAsignada) {
        reaR.save(recetaAsignada);
    }

    @Override
    public List<RecetaAsignada> listar() {
        return reaR.findAll();
    }

    @Override
    public void eliminar(int idRecetaAsignada) {
        reaR.deleteById(idRecetaAsignada);
    }

    @Override
    public RecetaAsignada listId(int idRecetaAsignada) {
        return reaR.findById(idRecetaAsignada).orElse(new RecetaAsignada());
    }
}
