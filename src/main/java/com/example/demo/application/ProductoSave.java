package com.example.demo.application;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoGetService;
import com.example.demo.domain.service.ProductoSaveService;
import com.example.demo.shared.ProductoAlreadyExistsException;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoSave {
  private final ProductoSaveService productoSaveService;
  private final ProductoGetService productoGetService;

  public Producto saveProducto(Producto producto){
    //Producto producto1 = productoGetService.getProducto(producto.getIdProducto());
    /*if(Objects.nonNull(producto1)){
      throw new ProductoAlreadyExistsException("Ya existe el producto.");
    }*/
    return productoSaveService.saveProducto(producto);
  }
}
