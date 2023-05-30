package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CalificacionDTO;
import pe.edu.upc.egymbackend.entities.Calificacion;
import pe.edu.upc.egymbackend.services.ICalificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {
    @Autowired
    private ICalificacionService cS;
    @PostMapping
    public void insert(@RequestBody CalificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Calificacion c = m.map(dto, Calificacion.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CalificacionDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CalificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
    cS.delete(id);
    }
    @GetMapping("/{id}")
    public CalificacionDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CalificacionDTO dto=m.map(cS.listId(id),CalificacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CalificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Calificacion c = m.map(dto, Calificacion.class);
        cS.insert(c);
    }
}
