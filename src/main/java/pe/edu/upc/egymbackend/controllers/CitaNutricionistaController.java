package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.CitaNutricionistaDTO;

import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;

import pe.edu.upc.egymbackend.dtos.CitaxFechaDTO;
import pe.edu.upc.egymbackend.dtos.NutricionistaCitaNutricionistaDTO;

import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.CitaNutricionista;
import pe.edu.upc.egymbackend.services.ICitaNutricionistaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citaNutricionista")
public class CitaNutricionistaController {
    public LocalDate fechaInicio=LocalDate.of(2023,06,24);
    @Autowired
    private ICitaNutricionistaService cnS;
    //@PreAuthorize("hasAuthority('NUTRICIONISTA')")
    @PostMapping
    public void registrar(@RequestBody CitaNutricionistaDTO dto){
        ModelMapper m=new ModelMapper();
        CitaNutricionista cn=m.map(dto, CitaNutricionista.class);
        cnS.insertar(cn);
    }
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR','NUTRICIONISTA','ALUMNO','ADMIN')")
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

    @GetMapping("/{id}")
    public CitaNutricionistaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CitaNutricionistaDTO dto=m.map(cnS.listId(id),CitaNutricionistaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CitaNutricionistaDTO dto){
        ModelMapper m=new ModelMapper();
        CitaNutricionista ciNutr=m.map(dto,CitaNutricionista.class);
        cnS.insertar(ciNutr);
    }
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR','NUTRICIONISTA','ALUMNO','ADMIN')")
    @GetMapping("/citanxn-count")
    public List<NutricionistaCitaNutricionistaDTO>getContarCitasxNutricionista(){
        List<NutricionistaCitaNutricionistaDTO> citaNutricionistaDTOS=cnS.reporteBarreto();
        return citaNutricionistaDTOS;
    }
    @GetMapping("/ng")
    public List<CitaxFechaDTO>getCitasxfecha(){
        List<CitaxFechaDTO> citaxFechaDTOS=cnS.reporteBarreto2();
        return citaxFechaDTOS;
    }

}
