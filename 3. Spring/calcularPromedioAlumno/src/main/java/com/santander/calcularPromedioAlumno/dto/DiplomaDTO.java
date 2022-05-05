package com.santander.calcularPromedioAlumno.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomaDTO {
    private String mensaje;
    private double promedio;
    private AlumnoDTO alumno;
}
