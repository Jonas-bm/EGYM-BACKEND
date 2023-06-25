package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.services.ICitaEntrenadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citaEntrenador")
public class CitaEntrenadorController {
    @Autowired
    private ICitaEntrenadorService ceS;
    //@PreAuthorize("hasAuthority('ENTRENADOR')")
    @PostMapping
    public void registrar(@RequestBody CitaEntrenadorDTO dto){
        ModelMapper m=new ModelMapper();
        CitaEntrenador ce=m.map(dto,CitaEntrenador.class);
        ceS.insertar(ce);
    }
    @GetMapping
   // @PreAuthorize("hasAnyAuthority('ENTRENADOR','ALUMNO','ADMIN')")
    public List<CitaEntrenadorDTO> listar(){
        return ceS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CitaEntrenadorDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        ceS.eliminar(id);
    }
    @GetMapping("/{id}")
    public CitaEntrenadorDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CitaEntrenadorDTO dto=m.map(ceS.listId(id),CitaEntrenadorDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CitaEntrenadorDTO dto){
        ModelMapper m=new ModelMapper();
        CitaEntrenador ciEntr=m.map(dto,CitaEntrenador.class);
        ceS.insertar(ciEntr);
    }

    @GetMapping("/citaEntrenador-count")
    public List<EntrenadorCitaEntrenadorDTO> getDateTrainerCountByTrainer() {
        List<EntrenadorCitaEntrenadorDTO> entrenadorCitaEntrenadorDTOS = ceS.reporte01();
        return entrenadorCitaEntrenadorDTOS;
    }
}
