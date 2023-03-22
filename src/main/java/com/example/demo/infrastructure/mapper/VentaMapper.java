package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Venta;
import com.example.demo.infrastructure.dto.VentaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    VentaDto ventaDto(Venta venta);
    Venta venta(VentaDto ventaDto);
}
