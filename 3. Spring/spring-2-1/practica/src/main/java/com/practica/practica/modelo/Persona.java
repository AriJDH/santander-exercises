package com.practica.practica.modelo;

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
    // mas datos
}
