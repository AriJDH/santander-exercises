package com.digitalhouse.obtenerdiploma.model;

import lombok.Data;

@Data
public class ErrorDTO {
    private String mensaje;

    public ErrorDTO(String mensaje) {
        this.mensaje = "ERROR:"+ mensaje;
    }
}
