package com.example.demo.shared;

import lombok.Getter;

@Getter
public enum ExceptionCode {
  PRODUCTO_NOT_FOUND("PRO_001","PRODUCTO_NOT_FOUND_EXCEPTION"),

  PRODUCTO_ALREADY_EXISTS("PRO-002","PRODUCTO_ALREADY_EXISTS_EXCEPTION");
  private final String code;
  private final String type;

  ExceptionCode(String code, String type){
    this.code = code;
    this.type = type;
  }

}
