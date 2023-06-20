package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.DetalleVenta;
import pe.edu.upc.egymbackend.services.IDetalleVentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detalle_venta")
public class DetalleVentaController {
    @Autowired
    private IDetalleVentaService dvS;
    @PostMapping
    public void registrar(@RequestBody DetalleVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DetalleVenta dv=m.map(dto,DetalleVenta.class);
        dvS.insertar(dv);
    }
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
    @GetMapping("/{id}")
    public DetalleVentaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DetalleVentaDTO dto=m.map(dvS.listId(id),DetalleVentaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody DetalleVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DetalleVenta dtven=m.map(dto,DetalleVenta.class);
        dvS.insertar(dtven);
    }
}
