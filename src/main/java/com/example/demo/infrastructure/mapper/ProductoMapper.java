package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Producto;
import com.example.demo.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
  Producto toProductoEntity(ProductoDto productoDto);
  @Mapping(target = "idProducto", source = "idProducto")
  @Mapping(target = "nombre", source = "nombre")
  @Mapping(target = "precio", source = "precio")
  ProductoDto toDto(Producto producto);

}
