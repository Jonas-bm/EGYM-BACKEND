package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.ProductoDTO;
import pe.edu.upc.egymbackend.dtos.ProductoGeneraMasIngresosDTO;
import pe.edu.upc.egymbackend.entities.Producto;
import pe.edu.upc.egymbackend.services.IProductoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService aS;
    @PostMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody ProductoDTO dto){
        ModelMapper m = new ModelMapper();
        Producto a=m.map(dto, Producto.class);
        aS.insert(a);
    }

    @GetMapping
    //@PreAuthorize("hasAnyAuthority('ALUMNO','ADMIN')")
    public List<ProductoDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }
    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public ProductoDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ProductoDTO dto = m.map(aS.listId(id), ProductoDTO.class);
        return dto;
    }
    @PutMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody ProductoDTO dto) {
        ModelMapper m = new ModelMapper();
        Producto a = m.map(dto, Producto.class);
        aS.insert(a);
    }

    @GetMapping("/producto-ingresos")
    public List<ProductoGeneraMasIngresosDTO> getProductoMasIngresos() {
        List<ProductoGeneraMasIngresosDTO> productoIngresos = aS.reporte05();
        return productoIngresos;
    }


}
