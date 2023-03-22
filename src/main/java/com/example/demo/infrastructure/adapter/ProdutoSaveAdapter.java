package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoSaveService;
import com.example.demo.infrastructure.dto.ProductoDto;
import com.example.demo.infrastructure.mapper.ProductoMapper;
import com.example.demo.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProdutoSaveAdapter implements ProductoSaveService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;
  @Override
  public Producto saveProducto(Producto producto) {
    return productoMapper.toProductoEntity(productoRepository.save(productoMapper.toDto(producto)));
  }
}
