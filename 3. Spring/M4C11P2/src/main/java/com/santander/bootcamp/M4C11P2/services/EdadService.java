package com.santander.bootcamp.M4C11P2.services;

import java.time.LocalDate;
import java.time.Period;

public class EdadService {

    public int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
