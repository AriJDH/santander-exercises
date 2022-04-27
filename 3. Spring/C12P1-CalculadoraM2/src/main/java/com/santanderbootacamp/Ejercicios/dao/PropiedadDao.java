package com.santanderbootacamp.Ejercicios.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class PropiedadDao implements Dao<String, Double>{
    private String nombre;
    private String direccion;
    private List<HabitacionDao> habitaciones;

    @Override
    public Double calcularM2() {
        return habitaciones.stream().mapToDouble(HabitacionDao::calcularM2).sum();
    }

    public HabitacionDao habitacionMasGrande() {
        return habitaciones.stream().max(Comparator.comparing(HabitacionDao::calcularM2)).orElse(null);
    }
}
