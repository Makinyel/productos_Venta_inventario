package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.VentaSave;
import com.example.demo.domain.entities.Venta;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/venta")
public class VentaController {

    private final VentaSave ventaSave;

    @PostMapping
    public ResponseEntity<Venta> saveVenta(@RequestBody Venta venta) {
        return new ResponseEntity<>(ventaSave.saveVenta(venta), HttpStatus.CREATED);
    }


}
