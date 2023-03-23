package com.example.demo.application;

import com.example.demo.domain.service.ProductoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDelete {
  private final ProductoDeleteService productoDeleteService;

  public void deleteProducto(String id){

    productoDeleteService.deleteProduct(id);
  }
}
