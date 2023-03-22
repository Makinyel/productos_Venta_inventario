package com.example.demo.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Producto {
  private String idProducto;
  private String nombre;
  private double precio;
  private int cantidad;

  public Producto(String idProducto, String nombre, double precio, int cantidad) {
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }
}
