package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.RecetaAsignadaDTO;
import pe.edu.upc.egymbackend.dtos.RutinaAsignadaDTO;
import pe.edu.upc.egymbackend.entities.RecetaAsignada;
import pe.edu.upc.egymbackend.entities.RutinaAsignada;
import pe.edu.upc.egymbackend.services.IRutinaAsignadaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutinaAsignada")
public class RutinaAsignadaController {
    @Autowired
    private IRutinaAsignadaService ruaS;
    @PostMapping
    public void registrar(@RequestBody RutinaAsignadaDTO dto){
        ModelMapper m=new ModelMapper();
        RutinaAsignada rua=m.map(dto, RutinaAsignada.class);
        ruaS.insertar(rua);
    }
    @GetMapping
    public List<RutinaAsignadaDTO> listar(){
        return ruaS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RutinaAsignadaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        ruaS.eliminar(id);
    }
}
