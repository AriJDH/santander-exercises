package com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PropiedadDto {
    private String nombre;
    private String direccion;
    private List<HabitacionDto> habitacionesDto;
}
