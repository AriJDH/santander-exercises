package com.digitalhouse.obtenerdiploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorDTO {
    private String nombre;
    private String descripcion;
}