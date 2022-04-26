package com.ejercicios.CP11P2Individual.servicios;

import com.ejercicios.CP11P2Individual.modelo.Entidad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EntidadServicio {

    public int calcularEdad(int dia, int mes, int ano) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);

        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        return periodo.getYears();
    }
}

