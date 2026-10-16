package com.carritogt.carrito.service;

import com.carritogt.carrito.entity.ShoppingCart;
import com.carritogt.carrito.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public List<ShoppingCart> listarCarrito() {
        return shoppingCartRepository.findAll();
    }

    public ShoppingCart agregarProducto(ShoppingCart item) {
        return shoppingCartRepository.save(item);
    }

    public void eliminarProducto(Integer id) {
        shoppingCartRepository.deleteById(id);
    }
}
