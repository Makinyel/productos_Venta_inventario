package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.ProductoDelete;
import com.example.demo.application.ProductoEdit;
import com.example.demo.application.ProductoGet;
import com.example.demo.application.ProductoSave;
import com.example.demo.domain.entities.Producto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/producto")
public class ProductoController {
  private final ProductoDelete productoDelete;
  private final ProductoSave productoSave;
  private final ProductoGet productoGet;
  private final ProductoEdit productoEdit;

  @PostMapping
  public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
    return new ResponseEntity<>(productoSave.saveProducto(producto), HttpStatus.CREATED);
  }

  @DeleteMapping("/id/{id}")
  public void deleteProducto(@PathVariable String id){
    productoDelete.deleteProducto(id);
  }

  @GetMapping
  public ResponseEntity<Producto> getProducto(@RequestParam String id){
    return ResponseEntity.ok(productoGet.getProducto(id));
  }
  @Transactional
  @PutMapping
  public void editProducto(@RequestBody Producto producto){
      productoEdit.edit(producto);
  }
}
