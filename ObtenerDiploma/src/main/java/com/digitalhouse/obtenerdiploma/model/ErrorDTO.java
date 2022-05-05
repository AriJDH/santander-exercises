package com.digitalhouse.obtenerdiploma.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {
    private String nombre;
    private String message;
}
