package com.carritogt.carrito.controller;

import com.carritogt.carrito.entity.ShoppingCart;

import com.carritogt.carrito.service.ShoppingCartService;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@RestController 
@RequestMapping("/api/carrito")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping
    public List<ShoppingCart> listarCarrito() {
        return shoppingCartService.listarCarrito();
    }
    @PostMapping
public ShoppingCart agregarProducto(@RequestBody ShoppingCart item) {
    return shoppingCartService.agregarProducto(item);
}
@DeleteMapping("/{id}")
public void eliminarProducto(@PathVariable Integer id) {
    shoppingCartService.eliminarProducto(id);
}

}

