package com.multiplesParametros.multiplesParametros.servicios;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdadServicio {

    public int getEdad(Integer day, Integer month, Integer year){
        return Period.between(LocalDate.of(year,month,day),LocalDate.now()).getYears();
    }
}
