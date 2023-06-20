package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.VideosRutinario;
import pe.edu.upc.egymbackend.repositories.IVideosRutinarioRepository;
import pe.edu.upc.egymbackend.services.IVideosRutinarioService;

import java.util.List;

@Service
public class VideosRutinarioServiceImplement implements IVideosRutinarioService {
    @Autowired
    private IVideosRutinarioRepository vrR;
    @Override
    public void insertar(VideosRutinario videosRutinario) {
        vrR.save(videosRutinario);
    }

    @Override
    public List<VideosRutinario> listar() {
        return vrR.findAll();
    }

    @Override
    public void eliminar(int idVideosRutinario) {
        vrR.deleteById(idVideosRutinario);
    }

    @Override
    public VideosRutinario listId(int idVideosRutinario) {
        return vrR.findById(idVideosRutinario).orElse(new VideosRutinario());
    }
}
