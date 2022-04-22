package com.bootcamp.C8P2.practica.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //pruebas_unitarias();
        jugar();
    }

    private static void jugar() {
        //flota jugador azul
        List<NaveSimple> naves = new ArrayList<>();

        NaveSimple nave1 = new NaveSimple("A1",0,0);
        NaveSimple nave2 = new NaveSimple("A2",5,0);
        NaveSimple nave3 = new NaveSimple("A3",10,0);

        naves.add(nave1);
        naves.add(nave2);
        naves.add(nave3);

        Flota flota = new Flota(naves);

        //flota jugador rojo
        NaveSimple naveSimple = new NaveSimple("A1",0,0);

        Jugador jugador_azul = new Jugador("azul", flota);
        Jugador jugador_rojo = new Jugador("rojo", naveSimple);

        //se inscriben
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador_azul);
        jugadores.add(jugador_rojo);

        //empieza el juego
        //se genera el array de puntos
        List<Punto> puntos = new ArrayList<>();
        int puntos_a_generar = 10;
        int rand_x = 0, rand_y = 0;
        int DISTANCIA_MAX = 50;
        for (int i = 0; i < puntos_a_generar ; i++) {
            rand_x = (int) Math.floor(Math.random() * DISTANCIA_MAX);
            rand_y = (int) Math.floor(Math.random() * DISTANCIA_MAX);
            puntos.add(new Punto(rand_x,rand_y));
        }

        //cada jugador dispara al punto con su flota
        for (Punto punto: puntos) {
            System.out.println("Disparando al asteroide en: " + punto.x + "-" + punto.y);
            for (Jugador jugador : jugadores) {
                System.out.println("Jugador: " + jugador);
                jugador.calcular_distancia(punto.x, punto.y);
            }
        }


    }

    private static void pruebas_unitarias() {
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

        Punto punto = new Punto(10,10);
        System.out.println("punto en x: " + punto.x);
    }
}
