package com.example.demo.application;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.entities.Venta;
import com.example.demo.domain.service.VentaSaveService;
import com.example.demo.infrastructure.adapter.ClienteGetAdapter;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class VentaSave {
    private final VentaSaveService ventaSaveService;
    private final ClienteGetAdapter clienteGetAdapter;
    private final ProductoGet productoGet;
    private final ProductoEdit productoEdit;

    public Venta saveVenta(Venta venta) {
        Producto producto = productoGet.getProducto(venta.getIdProducto());
        log.info("CANTIDAD "+producto.getCantidad());
        if(producto.getCantidad()>0){
            Cliente cliente = clienteGetAdapter.getCliente(venta.getIdClient());
            if (Objects.nonNull(cliente)){
                if (cliente.getEstado())  {
                    return ventaSaveService.saveVenta(venta);
                }log.info("USUARIO INACTIVO NO SE LE PUEDE VENDER");
                }
            log.info("Cliente con el id [{}] No Existe",cliente.getId());
            return null;
        } log.info("NO HAY PRODUCTOS EN STOCK");
        return null;
    }


}
