package com.santander.C12P1EjercicioPractico.dto;

import lombok.*;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString

public class AlumnoDTO {
    private String name;
    private HashMap<String,Double> materias_aprobadas;
}
