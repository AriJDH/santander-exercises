package com.bootcamp._desafio_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorDTO {
    private String nombre;
    private String descripcion;
}
