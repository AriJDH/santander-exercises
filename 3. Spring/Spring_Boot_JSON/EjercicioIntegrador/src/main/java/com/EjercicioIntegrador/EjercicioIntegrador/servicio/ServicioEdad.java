package com.EjercicioIntegrador.EjercicioIntegrador.servicio;


import java.time.LocalDate;
import java.time.Period;

public class ServicioEdad {

    public int calcularEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }
}
