package com.example.demo.infrastructure.adapter;

import com.example.demo.application.VentaSave;
import com.example.demo.domain.entities.Venta;
import com.example.demo.domain.service.VentaSaveService;
import com.example.demo.infrastructure.mapper.VentaMapper;
import com.example.demo.infrastructure.repository.VentaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VentaSaveAdapter implements VentaSaveService {
    private final VentaRepository  ventaRepository;
    private final VentaMapper ventaMapper;

    @Override
    public Venta saveVenta(Venta venta) {
        return ventaMapper.venta(ventaRepository.save(ventaMapper.ventaDto(venta)));
    }
}
