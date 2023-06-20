package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaNutricionistaDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.VisualizacionesDTO;
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
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody VisualizacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Visualizaciones v=m.map(dto, Visualizaciones.class);
        vS.insertar(v);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
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
}
