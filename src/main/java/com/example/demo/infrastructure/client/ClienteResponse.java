package com.example.demo.infrastructure.client;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data


public class ClienteResponse {
    private String id;
    private String tipoId;
    private String nombre;
    private String apellido;
    private Boolean estado;

    public ClienteResponse(String id, String tipoId, String nombre, String apellido, Boolean estado) {
        this.id = id;
        this.tipoId = tipoId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
}
