package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.EntrenadorConMasRutinasDTO;
import pe.edu.upc.egymbackend.dtos.ProductoGeneraMasIngresosDTO;
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
    //PreAuthorize("hasAuthority('ENTRENADOR')")
    public void registrar(@RequestBody RutinaAsignadaDTO dto){
        ModelMapper m=new ModelMapper();
        RutinaAsignada rua=m.map(dto, RutinaAsignada.class);
        ruaS.insertar(rua);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ENTRENADOR','ALUMNO','ADMIN')")
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

    @GetMapping("/entrenador-rutinas")
    public List<EntrenadorConMasRutinasDTO> getEntrenadoresRutinas() {
        List<EntrenadorConMasRutinasDTO> rutinaEntrenador = ruaS.reporte06();
        return rutinaEntrenador;
    }

}
