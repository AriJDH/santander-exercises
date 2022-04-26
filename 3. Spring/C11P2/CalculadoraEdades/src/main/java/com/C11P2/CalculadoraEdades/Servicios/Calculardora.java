package com.C11P2.CalculadoraEdades.Servicios;

import java.nio.channels.UnsupportedAddressTypeException;
import java.time.LocalDate;
import java.time.Period;

public class Calculardora {

public static String getEdad(int dias,int meses,int años){
    Period Edad = Period.between(LocalDate.of(años, meses, dias),LocalDate.now());
    return "Edad: " + Edad.getYears()+ " Años";
}
}
