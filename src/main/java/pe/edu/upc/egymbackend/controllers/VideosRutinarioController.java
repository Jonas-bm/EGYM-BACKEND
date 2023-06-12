package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.SuscripcionDTO;
import pe.edu.upc.egymbackend.dtos.VideosRutinarioDTO;
import pe.edu.upc.egymbackend.entities.Suscripcion;
import pe.edu.upc.egymbackend.entities.VideosRutinario;
import pe.edu.upc.egymbackend.services.IVideosRutinarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/videos_rutinario")
public class VideosRutinarioController {
    @Autowired
    private IVideosRutinarioService vrS;
    @PostMapping
    public void registrar(@RequestBody VideosRutinarioDTO dto){
        ModelMapper m=new ModelMapper();
        VideosRutinario vr=m.map(dto,VideosRutinario.class);
        vrS.insertar(vr);
    }
    @GetMapping
    public List<VideosRutinarioDTO> listar(){
        return vrS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VideosRutinarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        vrS.eliminar(id);
    }
}
