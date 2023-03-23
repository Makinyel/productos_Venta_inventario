package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoEditService;
import com.example.demo.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoEditAdapter implements ProductoEditService {
    private final ProductoRepository productoRepository;

    @Override
    public void editProducto(Producto producto) {
        productoRepository.editCar(producto.getIdProducto(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCantidad());
    }
}
