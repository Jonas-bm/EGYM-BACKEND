package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.CitaEntrenadorDTO;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.DocumentoVentaDTO;
import pe.edu.upc.egymbackend.entities.CitaEntrenador;
import pe.edu.upc.egymbackend.entities.DetalleVenta;
import pe.edu.upc.egymbackend.entities.DocumentoVenta;
import pe.edu.upc.egymbackend.services.IDocumentoVentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documentoVenta")
public class DocumentoVentaController {
    @Autowired
    private IDocumentoVentaService dvS;
    @PostMapping
    public void registrar(@RequestBody DocumentoVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoVenta dv=m.map(dto,DocumentoVenta.class);
        dvS.insertar(dv);
    }
    @GetMapping
    public List<DocumentoVentaDTO> listar(){
        return dvS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DocumentoVentaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id){
        dvS.eliminar(id);
    }
    @GetMapping("/{id}")
    public DocumentoVentaDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DocumentoVentaDTO dto=m.map(dvS.listId(id),DocumentoVentaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody DocumentoVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoVenta dve=m.map(dto,DocumentoVenta.class);
        dvS.insertar(dve);
    }
}
