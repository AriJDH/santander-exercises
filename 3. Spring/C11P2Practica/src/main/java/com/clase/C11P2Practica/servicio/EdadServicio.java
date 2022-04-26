package com.clase.C11P2Practica.servicio;


import java.time.LocalDate;
import java.time.Period;

public class EdadServicio {

    public long getEdad(int dia, int mes, int anio) {
        LocalDate fecha_nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fecha_hoy = LocalDate.now();

        Period periodo = Period.between(fecha_nacimiento, fecha_hoy);

        return periodo.getYears();
    }
}
