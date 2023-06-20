package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.entities.DetalleVenta;
import pe.edu.upc.egymbackend.services.IDetalleVentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detalleVenta")
public class DetalleVentaController {
    @Autowired
    private IDetalleVentaService dvS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody DetalleVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DetalleVenta dv=m.map(dto,DetalleVenta.class);
        dvS.insertar(dv);
    }
    //@PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
    @GetMapping
    public List<DetalleVentaDTO>listar(){
        return dvS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DetalleVentaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        dvS.eliminar(id);
    }
}
