package com.example.demo.domain.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Venta {

    private String id;
    private String idClient;
    private String idProducto;
    private int stock;

    public Venta(String id, String idClient, int stock) {
        this.id = id;
        this.idClient = idClient;
        this.stock = stock;
    }
}
