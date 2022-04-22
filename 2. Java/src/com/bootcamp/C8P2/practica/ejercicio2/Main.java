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

        NaveSimple nave1 = new NaveSimple("A1",20,20);
        NaveSimple nave2 = new NaveSimple("A2",30,0);
        NaveSimple nave3 = new NaveSimple("A3",40,30);

        naves.add(nave1);
        naves.add(nave2);
        naves.add(nave3);

        Flota flota = new Flota(naves);

        //flota jugador rojo
        NaveSimple naveSimple = new NaveSimple("R1",12,15);

        Jugador jugador_azul = new Jugador("azul", flota);
        Jugador jugador_rojo = new Jugador("rojo", naveSimple);

        //se inscriben
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador_azul);
        jugadores.add(jugador_rojo);

        //empieza el juego
        //se genera el array de puntos
        List<Punto> puntos = new ArrayList<>();
        int PUNTOS_A_GENERAR = 10;
        int rand_x = 0, rand_y = 0;
        int DISTANCIA_MAX = 50;
        for (int i = 0; i < PUNTOS_A_GENERAR ; i++) {
            rand_x = (int) Math.floor(Math.random() * DISTANCIA_MAX);
            rand_y = (int) Math.floor(Math.random() * DISTANCIA_MAX);
            puntos.add(new Punto(rand_x,rand_y));
        }

        //cada jugador dispara al punto con su flota
        int i_jugador_distancia_min = 0;
        int i_jugador = 0;
        double MAX = 9999;
        double distancia_minima = MAX;
        double distancia = 0;

        for (Punto punto: puntos) {
            System.out.println("Disparando al asteroide en: " + punto.x + "|" + punto.y);
            for (Jugador jugador : jugadores) {
                System.out.println("Jugador: " + jugador);
                distancia = jugador.calcular_distancia(punto.x, punto.y);
                if (distancia < distancia_minima){
                    //TODO: reemplazar por un aliasing a Jugador
                    i_jugador_distancia_min = i_jugador;
                    distancia_minima = distancia;
                }
                i_jugador++;
            }
            //el de distancia minima suma punto
            jugadores.get(i_jugador_distancia_min).incrementar_puntaje();
            i_jugador_distancia_min = 0;
            i_jugador = 0;
            distancia_minima = MAX;
        }

        //juego termino
        int max = 0;
        //aliasing de ganador
        Jugador ganador = null;
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador " + jugador + " puntaje final " + jugador.getPuntaje());
            if(jugador.getPuntaje() > max){
                ganador = jugador;
                max = jugador.getPuntaje();
            }
        }

        System.out.println("El ganador es el jugador de color: " + ganador);

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
