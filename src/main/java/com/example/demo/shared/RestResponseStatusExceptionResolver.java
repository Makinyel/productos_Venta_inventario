package com.example.demo.shared;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(MediaType.APPLICATION_JSON_VALUE)
public class RestResponseStatusExceptionResolver {
  @ExceptionHandler(BaseException.class)
  public ResponseEntity<ErrorResponse> errorHandler(BaseException ex){
    return new ResponseEntity<>(ErrorResponse.builder()
                            .status(ex.getStatus().value())
                            .code(ex.getCode())
                            .mensaje(ex.getMensaje())
                            .date(ex.getDate().toString())
                            .build(), ex.getStatus());
  }
}
