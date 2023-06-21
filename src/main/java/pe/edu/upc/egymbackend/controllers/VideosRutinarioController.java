package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.SuscripcionDTO;
import pe.edu.upc.egymbackend.dtos.VideosRutinarioDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.Suscripcion;
import pe.edu.upc.egymbackend.entities.VideosRutinario;
import pe.edu.upc.egymbackend.services.IVideosRutinarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/videoRutinario")
public class VideosRutinarioController {
    @Autowired
    private IVideosRutinarioService vrS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ENTRENADOR')")
    public void registrar(@RequestBody VideosRutinarioDTO dto){
        ModelMapper m=new ModelMapper();
        VideosRutinario vr=m.map(dto,VideosRutinario.class);
        vrS.insertar(vr);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR','ALUMNO','ADMIN')")
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
    @GetMapping("/{id}")
    public VideosRutinarioDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        VideosRutinarioDTO dto=m.map(vrS.listId(id),VideosRutinarioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody VideosRutinarioDTO dto){
        ModelMapper m=new ModelMapper();
        VideosRutinario vru=m.map(dto,VideosRutinario.class);
        vrS.insertar(vru);
    }
}
