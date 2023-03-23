package com.example.demo.application;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoEditService;
import com.example.demo.domain.service.ProductoGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class ProductoEdit {
    private ProductoEditService productoEditService;
    private final ProductoGetService productoGetService;

    public void edit(Producto producto){
        Producto p1 = productoGetService.getProducto(producto.getIdProducto());
        if (Objects.isNull(p1)){
            log.info("Producto No existe");
        }
        productoEditService.editProducto(producto);
    }
}
