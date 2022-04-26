package com.ejercicio2.Ejercicio2.service;

import com.ejercicio2.Ejercicio2.dto.HabitacionDTO;
import com.ejercicio2.Ejercicio2.dto.PropiedadDTO;
import com.ejercicio2.Ejercicio2.modelos.Habitacion;
import com.ejercicio2.Ejercicio2.modelos.PropiedadInmobiliaria;

import java.util.ArrayList;
import java.util.List;

public class InmobiliariaService {

    private final double PRECIO = 800;

    public PropiedadDTO calcularMetrosCuadrados(PropiedadInmobiliaria propiedadInmobiliaria) {
        double total = 0;
        for (Habitacion habitacion : propiedadInmobiliaria.getHabitaciones()) {
            total += habitacion.devolverMetrosCuadrados();
        }
        return new PropiedadDTO(propiedadInmobiliaria.getNombre(), total);
    }

    public String calcularValorPropiedad(PropiedadInmobiliaria propiedadInmobiliaria) {
        PropiedadDTO propiedadDTO = calcularMetrosCuadrados(propiedadInmobiliaria);
        return String.format("La propiedad vale: USD  %.2f", (propiedadDTO.getMetroCuadrados() * PRECIO));
    }

    public Habitacion mostrarHabitacionBoquita(PropiedadInmobiliaria propiedadInmobiliaria) {
        Habitacion habitacionMasGrande = propiedadInmobiliaria.getHabitaciones().get(0);
        for (Habitacion habitacion : propiedadInmobiliaria.getHabitaciones()) {
            if (habitacion.devolverMetrosCuadrados() > habitacionMasGrande.devolverMetrosCuadrados()) {
                habitacionMasGrande = habitacion;
            }
        }
        return habitacionMasGrande;
    }

    public List<HabitacionDTO> metrosCuadradoPorHabitacion(PropiedadInmobiliaria propiedadInmobiliaria) {
        List<HabitacionDTO> habitaciones = new ArrayList<>();
        for (Habitacion habitacion : propiedadInmobiliaria.getHabitaciones()) {
            habitaciones.add(new HabitacionDTO(habitacion.getNombre(), habitacion.devolverMetrosCuadrados()));
        }
        return habitaciones;
    }
}
