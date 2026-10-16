package com.carritogt.carrito.service;

import com.carritogt.carrito.entity.Producto;
import com.carritogt.carrito.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listaProductos() {
        return productoRepository.findAll();
    }
    public Producto buscarProducto(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
}