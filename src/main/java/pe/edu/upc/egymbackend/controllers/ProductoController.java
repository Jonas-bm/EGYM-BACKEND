package pe.edu.upc.egymbackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.egymbackend.dtos.ProductoDTO;
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
    public void insert(@RequestBody ProductoDTO dto){
        ModelMapper m = new ModelMapper();
        Producto a=m.map(dto, Producto.class);
        aS.insert(a);
    }

    @GetMapping
    public List<ProductoDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
}
