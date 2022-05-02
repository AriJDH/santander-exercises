package com.inmobiliaria.calcularMetrosCuadrados.datos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PropiedadDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;
}
