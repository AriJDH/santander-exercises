package com.santander.practica_spring_jason;

import java.time.LocalDate;
import java.time.Period;

public class Service {
    public String Saludar() {
        return "Hello World!";
    }

    public int Calcular(int dia, int mes, int anio) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return Period.between(fecha, LocalDate.now()).getYears();
    }
}
