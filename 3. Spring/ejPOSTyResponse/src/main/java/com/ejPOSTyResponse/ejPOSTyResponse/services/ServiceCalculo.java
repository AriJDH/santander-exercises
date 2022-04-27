package com.ejPOSTyResponse.ejPOSTyResponse.services;

import com.ejPOSTyResponse.ejPOSTyResponse.dto.HabitacionDTO;
import com.ejPOSTyResponse.ejPOSTyResponse.dto.PropiedadDTO;

import java.util.*;

public class ServiceCalculo {
    private final int PRECIOXMT = 800;

    public double getMetrosProp(PropiedadDTO prop) {
        return prop.getHabitaciones().stream().mapToDouble(p -> (p.getAncho() * p.getLargo())).sum();
    }

    public double getPrecio(PropiedadDTO prop) {
        return this.getMetrosProp(prop) * PRECIOXMT;
    }

    public Optional<HabitacionDTO> getHabitacionMost(PropiedadDTO prop) {
        return prop.getHabitaciones().stream().max(new Comparator<HabitacionDTO>() {
            @Override
            public int compare(HabitacionDTO o1, HabitacionDTO o2) {
                return (int) ((o1.getAncho() * o1.getLargo()) - (o2.getAncho() * o2.getLargo()));
            }
        });
    }

    public HashMap<String, Double> getMetrosHabitaciones(PropiedadDTO prop) {
        HashMap<String, Double> mapa = new HashMap<>();
        prop.getHabitaciones().forEach(h -> mapa.put(h.getNombre(), h.getAncho() * h.getLargo()));
        return mapa;
    }
}
