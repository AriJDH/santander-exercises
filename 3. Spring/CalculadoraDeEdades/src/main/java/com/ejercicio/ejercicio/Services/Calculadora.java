package com.ejercicio.ejercicio.Services;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Calculadora {

    public static int getEdad(LocalDate fecha) {
        LocalDate ahora = LocalDate.now();
        return ahora.getYear() - fecha.getYear();
    }
}
