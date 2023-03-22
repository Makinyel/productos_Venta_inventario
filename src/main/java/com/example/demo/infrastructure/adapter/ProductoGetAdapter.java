package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoGetService;
import com.example.demo.infrastructure.dto.ProductoDto;
import com.example.demo.infrastructure.mapper.ProductoMapper;
import com.example.demo.infrastructure.repository.ProductoRepository;
import com.example.demo.shared.ProductoAlreadyExistsException;
import com.example.demo.shared.ProductoNotFoundException;
import java.util.Objects;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGetAdapter implements ProductoGetService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;
  @Override
  public Producto getProducto(String id) {
    Optional<ProductoDto> productoDto = productoRepository.findById(id);
    if (Objects.nonNull(productoDto)) {
      return productoDto.map(productoMapper::toProductoEntity)
              .orElseThrow(() -> new ProductoNotFoundException("No se encuentra el producto"));
    }
    throw new ProductoAlreadyExistsException("Ya existe el producto");
  }

}
