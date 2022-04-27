package com.santanderbootacamp.Ejercicios.dto;

import com.santanderbootacamp.Ejercicios.dao.HabitacionDao;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PropiedadDto {
    private String nombre;
    private String direccion;
    private List<HabitacionDao> habitaciones;
}
