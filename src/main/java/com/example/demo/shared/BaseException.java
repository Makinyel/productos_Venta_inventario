package com.example.demo.shared;

import java.time.LocalDateTime;
import java.time.ZoneId;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException {

  private final HttpStatus status;
  private final String code;
  private final String mensaje;
  private final LocalDateTime date;
  private final ExceptionCode exceptionCode;

  public BaseException(HttpStatus status, ExceptionCode exceptionCode, String mensaje) {
    this.status = status;
    this.code = exceptionCode.getCode();
    this.mensaje = mensaje;
    this.date = LocalDateTime.now(ZoneId.systemDefault());
    this.exceptionCode = exceptionCode;
  }

}
