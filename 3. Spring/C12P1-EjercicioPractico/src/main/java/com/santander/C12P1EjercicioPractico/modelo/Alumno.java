package com.santander.C12P1EjercicioPractico.modelo;

import lombok.*;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Alumno {
    private String nombre;
    private HashMap<String,Integer> materias_aprobadas;
}
