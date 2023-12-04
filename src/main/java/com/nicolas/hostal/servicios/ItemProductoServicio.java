package com.nicolas.hostal.servicios;

import java.util.List;

import com.nicolas.hostal.dao.ItemProductoDAO;
import com.nicolas.hostal.dao.mysql.MySQLDaoManager;
import com.nicolas.hostal.modelo.ItemProducto;

public class ItemProductoServicio {
    ItemProductoDAO items;

    public ItemProductoServicio(){
        this.items = MySQLDaoManager.getInstance().getItemProductoDAO();
    }

    // CRUD

    public void registrarItemProducto(ItemProducto i){
        items.insertar(i);
    }

    public void modificarItemProducto(ItemProducto i){
        items.modificar(i);
    }

    public void eliminarItemProducto(ItemProducto i){
        items.eliminar(i);
    }

    public List<ItemProducto> obtenerTodosItemsProducto(){
        return items.obtenerTodos();
    }

    public ItemProducto obtenerItemProducto(int id){
        return items.obtener(id);
    }
}
