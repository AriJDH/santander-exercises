package com.santanderbootacamp.Ejercicios.services;

import com.santanderbootacamp.Ejercicios.dao.HabitacionDao;
import com.santanderbootacamp.Ejercicios.dao.PropiedadDao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculadoraM2Service {
    private List<PropiedadDao> propiedades = new ArrayList<>();

    public boolean agregarPropiedad(String nombre, String direccion, List<HabitacionDao> habitaciones) {
        if (nombre == null || direccion == null || habitaciones == null) {
            return false;
        }
        propiedades.add(new PropiedadDao(nombre, direccion, habitaciones));
        return true;
    }

    public Double calcularTotalM2(String direccion) {
        Double metros2 = 0.0;
        PropiedadDao propiedadEncontrada = propiedades.stream().filter(
                prop->prop.getDireccion().equalsIgnoreCase(direccion)
        ).findFirst().orElse(null);
        if (propiedadEncontrada != null) {
            metros2 = propiedadEncontrada.calcularM2();
        }
        return metros2;
    }

    public Double valorPropiedad(String direccion) {
        return calcularTotalM2(direccion) * 800;
    }

    public String habitacionMasGrande(String direccion) {
        PropiedadDao propiedadEncontrada = propiedades.stream().filter(
                prop->prop.getDireccion().equalsIgnoreCase(direccion)
        ).findFirst().orElse(null);
        if (propiedadEncontrada == null) {
            return "";
        }
        HabitacionDao laMasGrande = propiedadEncontrada.habitacionMasGrande();
        if (laMasGrande == null) {
            return "";
        }
        return laMasGrande.toString();
    }

    public List<Double> calcularM2PorHabitacion(String direccion) {
        PropiedadDao propiedadEncontrada = propiedades.stream().filter(
                prop->prop.getDireccion().equalsIgnoreCase(direccion)
        ).findFirst().orElse(null);
        if (propiedadEncontrada == null) {
            return new ArrayList<>();
        }
        return propiedadEncontrada.getHabitaciones().stream().map(HabitacionDao::calcularM2).collect(Collectors.toList());
    }
}
