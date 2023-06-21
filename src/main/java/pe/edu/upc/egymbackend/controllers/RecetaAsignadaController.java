package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.CitaNutricionistaDTO;
import pe.edu.upc.egymbackend.dtos.RecetaAsignadaDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.entities.RecetaAsignada;
import pe.edu.upc.egymbackend.services.IRecetaAsignadaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recetaAsignada")
public class    RecetaAsignadaController {
    @Autowired
    private IRecetaAsignadaService raS;
    @PostMapping
    //@PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public void registrar(@RequestBody RecetaAsignadaDTO dto){
        ModelMapper m=new ModelMapper();
        RecetaAsignada ra=m.map(dto, RecetaAsignada.class);
        raS.insertar(ra);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('NUTRICIONISTA','ALUMNO')")
    public List<RecetaAsignadaDTO> listar(){
        return raS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecetaAsignadaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        raS.eliminar(id);
    }
    @GetMapping("/{id}")
    public RecetaAsignadaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RecetaAsignadaDTO dto=m.map(raS.listId(id),RecetaAsignadaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody RecetaAsignadaDTO dto){
        ModelMapper m=new ModelMapper();
        RecetaAsignada rcta=m.map(dto,RecetaAsignada.class);
        raS.insertar(rcta);
    }
}
