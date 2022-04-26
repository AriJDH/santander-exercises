package com.C11Calculadora.calculadoraEdad.services;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
@Data
public class Calculador {

    public int Calcular(int dia, int mes, int anio) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return Period.between(fecha, LocalDate.now()).getYears();
    }
}
