package com.santanderbootacamp.Ejercicios.dto;


import com.santanderbootacamp.Ejercicios.models.Asignatura;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AlumnoDto {
    private String nombre;
    private List<Asignatura> asignaturas = null;
}
