package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.VideosRutinario;

import java.util.List;

public interface IVideosRutinarioService {
    public void insertar(VideosRutinario videosRutinario);
    List<VideosRutinario> listar();
    public void eliminar(int idVideosRutinario);
}
