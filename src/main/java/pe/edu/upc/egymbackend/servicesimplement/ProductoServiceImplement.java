package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.Producto;
import pe.edu.upc.egymbackend.repositories.IProductoRepository;
import pe.edu.upc.egymbackend.services.IProductoService;

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
}
