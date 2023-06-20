package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.CitaNutricionistaDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.VisualizacionesDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.entities.Visualizaciones;
import pe.edu.upc.egymbackend.services.IVisualizacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/visualizaciones")
public class VisualizacionesController {
    @Autowired
    private IVisualizacionesService vS;
    @PostMapping
    public void registrar(@RequestBody VisualizacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Visualizaciones v=m.map(dto, Visualizaciones.class);
        vS.insertar(v);
    }
    @GetMapping
    public List<VisualizacionesDTO> listar(){
        return vS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VisualizacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        vS.eliminar(id);
    }
    @GetMapping("/{id}")
    public VisualizacionesDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        VisualizacionesDTO dto=m.map(vS.listId(id),VisualizacionesDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody VisualizacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Visualizaciones visu=m.map(dto,Visualizaciones.class);
        vS.insertar(visu);
    }
}
