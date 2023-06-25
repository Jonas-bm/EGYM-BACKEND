package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.DetalleVentaDTO;
import pe.edu.upc.egymbackend.dtos.DocVentaDetVentaDTO;
import pe.edu.upc.egymbackend.dtos.DocumentoVentaDTO;
import pe.edu.upc.egymbackend.dtos.ProductoAlumnoDTO;
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
    //@PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public void registrar(@RequestBody DocumentoVentaDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoVenta dv=m.map(dto,DocumentoVenta.class);
        dvS.insertar(dv);
    }
    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
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
    @GetMapping("/producto-count")
    public List<ProductoAlumnoDTO> getProductoAlumno() {
        List<ProductoAlumnoDTO> productoAlumnoDTOS = dvS.reporte01();
        return productoAlumnoDTOS;
    }
}
