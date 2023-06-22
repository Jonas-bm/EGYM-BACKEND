package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.NutricionistaDTO;
import pe.edu.upc.egymbackend.entities.Nutricionista;
import pe.edu.upc.egymbackend.services.INutricionistaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nutricionistas")
public class NutricionistaController {

    @Autowired
    private INutricionistaService nS;
    @PostMapping
    //@PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public void insert(@RequestBody NutricionistaDTO dto){
        ModelMapper m=new ModelMapper();
        Nutricionista nutri=m.map(dto,Nutricionista.class);
        nS.insert(nutri);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('NUTRICIONISTA','ALUMNO')")
    public List<NutricionistaDTO>list(){
        return nS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NutricionistaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id){
        nS.delete(id);
    }
    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('NUTRICIONISTA')")
    public NutricionistaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        NutricionistaDTO dto=m.map(nS.listId(id),NutricionistaDTO.class);
        return dto;
    }
    //@PreAuthorize("hasAuthority('NUTRICIONISTA')")
    @PutMapping
    public void goUpdate(@RequestBody NutricionistaDTO dto){
        ModelMapper m=new ModelMapper();
        Nutricionista nutri=m.map(dto,Nutricionista.class);
        nS.insert(nutri);
    }

}
