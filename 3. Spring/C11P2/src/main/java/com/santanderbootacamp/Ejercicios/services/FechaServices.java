package com.santanderbootacamp.Ejercicios.services;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaServices {
    public static int calcularAniosDeFecha(int dia, int mes, int anio) {
        Calendar calendario = new GregorianCalendar();
        int diaActual = calendario.get(Calendar.DATE);
        int mesActual = calendario.get(Calendar.MONTH) + 1;
        int anioActual = calendario.get(Calendar.YEAR);
        int diferencia = anioActual - anio;

        if (mes > mesActual) diferencia--;
        else if (mes == mesActual && dia > diaActual) diferencia--;
        return diferencia;
    }
}
