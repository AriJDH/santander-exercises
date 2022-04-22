package com.bootcamp.C8P2.practica.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NaveSimple naveSimple = new NaveSimple("A1",0,0);
        naveSimple.calcular_distancia(20,10);

        List<NaveSimple> naves = new ArrayList<>();
        NaveSimple nave1 = new NaveSimple("A1",0,0);
        NaveSimple nave2 = new NaveSimple("A2",5,0);
        NaveSimple nave3 = new NaveSimple("A3",10,0);
        naves.add(nave1);
        naves.add(nave2);
        naves.add(nave3);

        Flota flota = new Flota(naves);

        double distancia_promedio = flota.calcular_distancia(10,10);
        System.out.println("Promedio flota: " + distancia_promedio);

        Jugador jugador_azul = new Jugador("azul", flota);

        double distancia_jugador_flota = jugador_azul.calcular_distancia(10, 10);
        System.out.println("jugador con flota: " + distancia_jugador_flota);

        Jugador jugador_rojo = new Jugador("rojo", naveSimple);
        double distancia_jugador_nave = jugador_rojo.calcular_distancia(10,10);
        System.out.println("jugador con solo nave: " + distancia_jugador_nave);

    }
}
