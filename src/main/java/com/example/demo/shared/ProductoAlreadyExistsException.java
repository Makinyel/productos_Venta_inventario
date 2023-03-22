package com.example.demo.shared;

import org.springframework.http.HttpStatus;

public class ProductoAlreadyExistsException extends BaseException {

  public ProductoAlreadyExistsException(String mensaje) {
    super(HttpStatus.FOUND, ExceptionCode.PRODUCTO_ALREADY_EXISTS, mensaje);
  }
}
