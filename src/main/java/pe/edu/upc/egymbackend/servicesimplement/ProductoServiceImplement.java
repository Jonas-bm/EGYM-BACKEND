package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.dtos.ProductoGeneraMasIngresosDTO;
import pe.edu.upc.egymbackend.entities.Producto;
import pe.edu.upc.egymbackend.repositories.IProductoRepository;
import pe.edu.upc.egymbackend.services.IProductoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {
    @Autowired
    private IProductoRepository pR;

    @Override
    public void insert(Producto producto) {
        pR.save(producto);
    }

    @Override
    public List<Producto> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idProducto) {
        pR.deleteById(idProducto);
    }

    @Override
    public Producto listId(int idProducto) {
        return pR.findById(idProducto).orElse(new Producto());
    }

    @Override
    public List<ProductoGeneraMasIngresosDTO> reporte05() {
        List<String[]> productoIngresos = pR.productoGeneraIngresos();
        List<ProductoGeneraMasIngresosDTO> productoIngresosDTOs = new ArrayList<>();

        for (String[] data : productoIngresos) {
            ProductoGeneraMasIngresosDTO dto = new ProductoGeneraMasIngresosDTO();
            dto.setNameProduct(data[0]);
            dto.setTotalAmount(new BigDecimal(data[1]));
            productoIngresosDTOs.add(dto);
        }

        return productoIngresosDTOs;
    }
}
