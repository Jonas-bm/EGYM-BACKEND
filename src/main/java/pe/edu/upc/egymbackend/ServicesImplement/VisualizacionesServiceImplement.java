package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Visualizaciones;
import pe.edu.upc.egymbackend.repositories.IVisualizacionesRepository;
import pe.edu.upc.egymbackend.services.IVisualizacionesService;

import java.util.List;
@Service
public class VisualizacionesServiceImplement implements IVisualizacionesService {
    @Autowired
    private IVisualizacionesRepository vR;
    @Override
    public void insertar(Visualizaciones visualizaciones) {
        vR.save(visualizaciones);
    }

    @Override
    public List<Visualizaciones> listar() {
        return vR.findAll();
    }

    @Override
    public void eliminar(int idVisualizaciones) {
        vR.deleteById(idVisualizaciones);
    }
}
