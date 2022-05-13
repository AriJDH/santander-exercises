package com.example.demo.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Cliente {

    private String nombre;
    private String apellido;

    private LocalDate fechaNacimiento;

}
