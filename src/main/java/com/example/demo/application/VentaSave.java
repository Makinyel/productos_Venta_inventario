package com.example.demo.application;

import com.example.demo.domain.entities.Venta;
import com.example.demo.domain.service.VentaSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class VentaSave {
    private final VentaSaveService ventaSaveService;

    public Venta saveVenta(Venta venta) {
        return ventaSaveService.saveVenta(venta);
    }
}
