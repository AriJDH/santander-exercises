package com.blogExcepciones.blogExcepciones.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor
public class ErrorDto {
    private String nombre,descripcion;
}
