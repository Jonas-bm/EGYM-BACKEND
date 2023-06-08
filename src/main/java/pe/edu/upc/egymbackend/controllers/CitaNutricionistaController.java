package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.CitaNutricionistaDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.services.ICitaNutricionistaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cita_Nutricionista")
public class CitaNutricionistaController {
    @Autowired
    private ICitaNutricionistaService cnS;
    @PostMapping
    public void registrar(@RequestBody CitaNutricionistaDTO dto){
        ModelMapper m=new ModelMapper();
        CitaNutricionista cn=m.map(dto, CitaNutricionista.class);
        cnS.insertar(cn);
    }
    @GetMapping
    public List<CitaNutricionistaDTO> listar(){
        return cnS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CitaNutricionistaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        cnS.eliminar(id);
    }
}
