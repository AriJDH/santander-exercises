package com.santanderbootcamp.desafio_spring.utils;

import com.santanderbootcamp.desafio_spring.modelos.Hoteles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HotelesFactory {
    public static List<Hoteles> listaHoteles() {
        List<Hoteles> hoteles = new ArrayList<>();
        hoteles.add(HotelesFactory.getHotel());
        hoteles.add(HotelesFactory.getHotel2());
        hoteles.add(HotelesFactory.getHotel3());
        return hoteles;
    }

    public static Hoteles getHotel() {
        Hoteles hotel1 = new Hoteles(
                "CH-0002",
                "Cataratas Hotel",
                "Puerto Iguazú",
                "Doble",
                6300.0,
                LocalDate.parse("10/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("22/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "NO"
        );
        return hotel1;
    }

    public static Hoteles getHotel2() {
        Hoteles hotel2 = new Hoteles(
                "BA-0003",
                "Buenos Hotel 2",
                "Buenos Aires",
                "Triple",
                8200.0,
                LocalDate.parse("11/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("23/04/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "NO"
        );
        return hotel2;
    }

    public static Hoteles getHotel3() {
        Hoteles hotel3 = new Hoteles(
                "BA-0004",
                "Buenos Hotel 3",
                "Buenos Aires",
                "Triple",
                8200.0,
                LocalDate.parse("11/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("23/04/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                "SI"
        );
        return hotel3;
    }
}