package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.service.ProductoDeleteService;
import com.example.demo.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDeleteAdapter implements ProductoDeleteService {
  private final ProductoRepository productoRepository;

  @Override
  public void deleteProduct(String id) {
    productoRepository.deleteById(id);
  }
}
