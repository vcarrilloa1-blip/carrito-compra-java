package com.carritogt.carrito.controller;

import com.carritogt.carrito.entity.Producto;

import com.carritogt.carrito.service.ProductoService;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;
 
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping 
    public List<Producto>
listarProductos() {
    return productoService.listaProductos();
}    
   @GetMapping("/{id}") public Producto buscarProducto(
    @PathVariable Integer id) {
        return productoService.buscarProducto(id);
    } 
}