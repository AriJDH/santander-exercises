package com.practica.C13Blog.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorDTO {
    private String nombre;
    private String descripcion;
}
