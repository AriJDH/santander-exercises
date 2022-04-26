package com.C11P2.ejercicio.services;


import java.time.LocalDate;
import java.time.Period;

public class Servicio {

    public int calcularEdad(int dia, int mes, int año){
        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

}
