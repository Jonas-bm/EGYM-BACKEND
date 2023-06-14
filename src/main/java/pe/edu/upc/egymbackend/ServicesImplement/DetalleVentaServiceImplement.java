package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.DetalleVenta;
import pe.edu.upc.egymbackend.repositories.IDetalleVentaRepository;
import pe.edu.upc.egymbackend.services.IDetalleVentaService;

import java.util.List;
@Service
public class DetalleVentaServiceImplement implements IDetalleVentaService {
    @Autowired
    private IDetalleVentaRepository dvR;
    @Override
    public void insertar(DetalleVenta detalleVenta) {
        dvR.save(detalleVenta);
    }

    @Override
    public List<DetalleVenta> listar() {
        return dvR.findAll();
    }

    @Override
    public void eliminar(int idDetalleVenta) {
        dvR.deleteById(idDetalleVenta);
    }
}
