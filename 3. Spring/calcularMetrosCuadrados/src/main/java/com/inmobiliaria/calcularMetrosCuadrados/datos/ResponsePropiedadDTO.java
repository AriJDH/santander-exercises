package com.inmobiliaria.calcularMetrosCuadrados.datos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePropiedadDTO {
    private double totalMetrosCuadrados;
    private double precioTotal;
    private HabitacionDTO habitacionMasGrande;
    private List<HabitacionDTO> habitaciones;

}
