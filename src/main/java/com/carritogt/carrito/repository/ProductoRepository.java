package com.carritogt.carrito.repository;

import com.carritogt.carrito.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
