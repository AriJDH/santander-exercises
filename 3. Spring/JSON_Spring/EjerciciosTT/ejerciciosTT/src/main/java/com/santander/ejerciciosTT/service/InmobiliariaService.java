package com.santander.ejerciciosTT.service;

import com.santander.ejerciciosTT.DTO.HabitacionDTO;
import com.santander.ejerciciosTT.models.Habitacion;
import com.santander.ejerciciosTT.models.PropiedadDTO;
import com.santander.ejerciciosTT.models.PropiedadInmobiliaria;

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