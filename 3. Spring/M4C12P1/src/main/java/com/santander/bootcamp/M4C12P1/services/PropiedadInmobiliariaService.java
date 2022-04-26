package com.santander.bootcamp.M4C12P1.services;

import com.santander.bootcamp.M4C12P1.DTO.HabitacionDTO;
import com.santander.bootcamp.M4C12P1.models.Habitacion;
import com.santander.bootcamp.M4C12P1.models.PropiedadInmobiliaria;

import java.util.List;
import java.util.stream.Collectors;

public class PropiedadInmobiliariaService {

    private final double precioMetroCuadrado = 800.0;

    public double calcularMetrosCuadrados(PropiedadInmobiliaria propiedadInmobiliaria) {
        return propiedadInmobiliaria.calcularMetrosCuadrados();
    }

    public double calcularValorPropiedad(PropiedadInmobiliaria propiedadInmobiliaria) {
        return propiedadInmobiliaria.calcularMetrosCuadrados() * precioMetroCuadrado;
    }

    public Habitacion MostrarHabitacionMasGrande(PropiedadInmobiliaria propiedadInmobiliaria) {
        return propiedadInmobiliaria.getHabitaciones().stream().reduce(
            propiedadInmobiliaria.getHabitaciones().get(0),
            (mayor, habitacion) -> mayor.calcularMetrosCuadrados() < habitacion.calcularMetrosCuadrados() ? habitacion : mayor
        );
    }

    public List<HabitacionDTO> MostrarMetrosCuadradosPorHabitacion(PropiedadInmobiliaria propiedadInmobiliaria) {
        return propiedadInmobiliaria.getHabitaciones().stream().map(h -> new HabitacionDTO(h)).collect(Collectors.toList());
    }
}
