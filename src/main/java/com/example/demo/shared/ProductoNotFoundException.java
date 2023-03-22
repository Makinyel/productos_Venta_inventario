package com.example.demo.shared;

import org.springframework.http.HttpStatus;

public class ProductoNotFoundException extends BaseException{
   public ProductoNotFoundException(String mensaje) {
    super(HttpStatus.NOT_FOUND, ExceptionCode.PRODUCTO_NOT_FOUND, mensaje);
  }
}
