package com.ejerciciointegrador.Ejercicio_Integrador.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ErrorDTO {

    private String nombre;
    private String descripcion;

}
