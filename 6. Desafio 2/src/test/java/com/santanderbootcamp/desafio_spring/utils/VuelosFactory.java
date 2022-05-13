package com.santanderbootcamp.desafio_spring.utils;

import com.santanderbootcamp.desafio_spring.modelos.Vuelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VuelosFactory {

    public static Vuelos getVuelos(){
        Vuelos vuelos1 = new Vuelos(
                "BAPI-1235",
                "Buenos Aires",
                "Puerto Iguazú",
                "Economy",
                6500,
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("15/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
        return vuelos1;
    }

    public static Vuelos getVuelos2(){
        Vuelos vuelos2 = new Vuelos(
                "PIBA-1333",
                "Puerto Iguazú",
                "Bogotá",
                "Business",
                25735,
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("21/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
        return vuelos2;
    }

    public static Vuelos getVuelos3(){
        Vuelos vuelos2 = new Vuelos(
                "PIBA-1420",
                "Puerto Iguazú",
                "Buenos Aires",
                "Economy",
                25735,
                LocalDate.parse("11/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("23/04/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
        return vuelos2;
    }

    public static List<Vuelos> listaVuelos() {
        List<Vuelos> vuelos = new ArrayList<>();
        vuelos.add(VuelosFactory.getVuelos());
        vuelos.add(VuelosFactory.getVuelos2());
        vuelos.add(VuelosFactory.getVuelos3());
        return vuelos;
    }
}
