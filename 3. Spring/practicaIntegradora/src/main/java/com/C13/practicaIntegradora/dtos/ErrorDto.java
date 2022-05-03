package com.C13.practicaIntegradora.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ErrorDto {
    private String nombre;
    private String descripcion;
}
