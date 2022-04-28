package com.santander.calcularPromedioAlumno.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturasDTO {
    private String nombre;
    private double nota;
}
