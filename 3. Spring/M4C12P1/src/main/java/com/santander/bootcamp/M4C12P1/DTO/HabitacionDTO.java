package com.santander.bootcamp.M4C12P1.DTO;

import com.santander.bootcamp.M4C12P1.models.Habitacion;
import lombok.Data;

@Data
public class HabitacionDTO {
    private String nombre;
    private double metrosCuadrados;

    public HabitacionDTO(Habitacion habitacion) {
        this.setNombre(habitacion.getNombre());
        this.setMetrosCuadrados(habitacion.calcularMetrosCuadrados());
    }
}

