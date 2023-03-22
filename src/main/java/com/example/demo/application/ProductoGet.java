package com.example.demo.application;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGet {
  private final ProductoGetService productoGetService;

  public Producto getProducto(String id){
    return productoGetService.getProducto(id);
  }
}
