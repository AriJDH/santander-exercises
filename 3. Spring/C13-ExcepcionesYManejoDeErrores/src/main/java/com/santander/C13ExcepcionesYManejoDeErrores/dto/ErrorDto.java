package com.santander.C13ExcepcionesYManejoDeErrores.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ErrorDto {
    private String nombre;
    private String descripcion;

}
