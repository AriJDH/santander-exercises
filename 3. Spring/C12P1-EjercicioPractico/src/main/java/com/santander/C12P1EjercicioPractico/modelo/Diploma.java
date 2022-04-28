package com.santander.C12P1EjercicioPractico.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Diploma {
    private double promedio;
    private String mensaje;
    private Alumno alumno;

}
