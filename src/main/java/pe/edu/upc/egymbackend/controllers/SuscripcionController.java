package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.DocumentoVentaDTO;
import pe.edu.upc.egymbackend.dtos.SuscripcionDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.DocumentoVenta;
import pe.edu.upc.egymbackend.entities.Suscripcion;
import pe.edu.upc.egymbackend.services.ISuscripcionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripcion")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService sS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody SuscripcionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripcion s=m.map(dto,Suscripcion.class);
        sS.insertar(s);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
    public List<SuscripcionDTO> listar(){
        return sS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        sS.eliminar(id);
    }
    @GetMapping("/{id}")
    public SuscripcionDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        SuscripcionDTO dto=m.map(sS.listId(id),SuscripcionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody SuscripcionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripcion sus=m.map(dto,Suscripcion.class);
        sS.insertar(sus);
    }
}
