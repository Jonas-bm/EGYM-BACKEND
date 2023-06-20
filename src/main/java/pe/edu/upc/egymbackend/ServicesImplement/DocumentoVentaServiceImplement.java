package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.entities.DocumentoVenta;
import pe.edu.upc.egymbackend.repositories.IDocumentoVentaRepository;
import pe.edu.upc.egymbackend.services.IDocumentoVentaService;

import java.util.List;
@Service
public class DocumentoVentaServiceImplement implements IDocumentoVentaService {
    @Autowired
    private IDocumentoVentaRepository dvR;
    @Override
    public void insertar(DocumentoVenta documentoVenta) {
        dvR.save(documentoVenta);
    }

    @Override
    public List<DocumentoVenta> listar() {
        return dvR.findAll();
    }

    @Override
    public void eliminar(int idDocumentoVenta) {
        dvR.deleteById(idDocumentoVenta);
    }

    @Override
    public DocumentoVenta listId(int idDocumentoVenta) {
        return dvR.findById(idDocumentoVenta).orElse(new DocumentoVenta());
    }
}
