package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.ProductoDelete;
import com.example.demo.application.ProductoGet;
import com.example.demo.application.ProductoSave;
import com.example.demo.domain.entities.Producto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/producto")
public class ProductoController {
  private final ProductoDelete productoDelete;
  private final ProductoSave productoSave;
  private final ProductoGet productoGet;

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
}
