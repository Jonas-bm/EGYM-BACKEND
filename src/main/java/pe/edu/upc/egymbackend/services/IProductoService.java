package pe.edu.upc.egymbackend.services;

import pe.edu.upc.egymbackend.entities.Producto;

import java.util.List;

public interface IProductoService {
    public void insert(Producto producto);
    List<Producto> list();
    public void delete(int idProducto);
    public Producto listId(int idProducto);
}
