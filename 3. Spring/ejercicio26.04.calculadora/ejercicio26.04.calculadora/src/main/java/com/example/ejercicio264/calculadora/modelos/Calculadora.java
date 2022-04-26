package com.example.ejercicio264.calculadora.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculadora {
    private Integer dia, mes, anio, edad;
}
