package pe.edu.upc.egymbackend.controllers;

import io.swagger.models.auth.In;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.EntrenadorDTO;
import pe.edu.upc.egymbackend.entities.Entrenador;
import pe.edu.upc.egymbackend.services.IEntrenadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {
    @Autowired
    private IEntrenadorService eS;

    @PostMapping
    //@PreAuthorize("hasAuthority('ENTRENADOR')")
    public void insert(@RequestBody EntrenadorDTO dto){
        ModelMapper m=new ModelMapper();
        Entrenador e=m.map(dto, Entrenador.class);
        eS.insert(e);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR','ALUMNO')")
    public List<EntrenadorDTO> list(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EntrenadorDTO.class);
        }).collect(Collectors.toList());
    }
    //@PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('ENTRENADOR')")
   public EntrenadorDTO listId (@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        EntrenadorDTO dto=m.map(eS.listId(id),EntrenadorDTO.class);
        return dto;
    }
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR')")
    @PutMapping
    public void goUpdate(@RequestBody EntrenadorDTO dto){
        ModelMapper m=new ModelMapper();
        Entrenador e=m.map(dto, Entrenador.class);
        eS.insert(e);
    }
}
