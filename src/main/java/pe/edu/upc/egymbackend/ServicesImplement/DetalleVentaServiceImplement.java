package pe.edu.upc.egymbackend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.egymbackend.dtos.DocVentaDetVentaDTO;
import pe.edu.upc.egymbackend.dtos.EntrenadorCitaEntrenadorDTO;
import pe.edu.upc.egymbackend.entities.DetalleVenta;
import pe.edu.upc.egymbackend.repositories.IDetalleVentaRepository;
import pe.edu.upc.egymbackend.services.IDetalleVentaService;

import java.util.ArrayList;
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

    @Override
    public List<DocVentaDetVentaDTO> reporte01() {
        List<String[]> documentoDetalleVenta = dvR.getDocumentoDetalleVenta();
        List<DocVentaDetVentaDTO> docVentaDetVentaDTOs = new ArrayList<>();

        for (String[] data : documentoDetalleVenta) {
            DocVentaDetVentaDTO dto = new DocVentaDetVentaDTO();
            dto.setNameAlumno(data[0]);
            dto.setNameProducto(data[1]);
            dto.setMontoTotal(data[2]);
            dto.setFecha(data[3]);
            docVentaDetVentaDTOs.add(dto);
        }

        return docVentaDetVentaDTOs;
    }
}
