package com.ejercicio2.ejercicio2.modelos;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Persona {

    private String nombre;
    private String apellido;

    private LocalDate fechaNacimiento;

}
