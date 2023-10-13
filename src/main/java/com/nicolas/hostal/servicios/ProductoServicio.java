package com.nicolas.hostal.servicios;

import com.nicolas.hostal.dao.DAOManager;
import com.nicolas.hostal.dao.ProductoDAO;
import com.nicolas.hostal.modelo.Producto;
import java.util.List;
import java.util.stream.Collectors;

public class ProductoServicio {

    ProductoDAO productos;

    public ProductoServicio(DAOManager manager) {
        this.productos = manager.getProductoDAO();
    }

    // CRUD
    public void registrarProducto(Producto p) {
        productos.insertar(p);
    }

    public void modificarProducto(Producto p) {
        productos.modificar(p);
    }

    public void borrarProducto(Producto p) {
        productos.eliminar(p);
    }

    public List<Producto> obtenerTodosProductos() {
        return productos.obtenerTodos();
    }

    public List<Producto> obtenerTodosProductosActivos() {
        return productos.obtenerTodos().stream()
                .filter(p -> p.isActivo())
                .collect(Collectors.toList());
    }

    public Producto obtenerProducto(int id) {
        return productos.obtener(id);
    }
}
