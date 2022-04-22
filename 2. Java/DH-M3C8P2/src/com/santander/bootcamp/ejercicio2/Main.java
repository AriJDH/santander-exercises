package com.santander.bootcamp.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Gonzalo", new Nave(Coordenadas.crearAleatoriamente())));
        jugadores.add(new Jugador("Adolfo", new ArrayList<Nave>(List.of(
                new Nave(Coordenadas.crearAleatoriamente()),
                new Nave(Coordenadas.crearAleatoriamente())
        ))));
        jugadores.add(new Jugador("Aguirre", new ArrayList<Nave>(List.of(
                new Nave(Coordenadas.crearAleatoriamente()),
                new Nave(Coordenadas.crearAleatoriamente()),
                new Nave(Coordenadas.crearAleatoriamente())
        ))));

        Juego juego = new Juego(jugadores, new ArrayList<>(List.of(
                Coordenadas.crearAleatoriamente(),
                Coordenadas.crearAleatoriamente(),
                Coordenadas.crearAleatoriamente(),
                Coordenadas.crearAleatoriamente(),
                Coordenadas.crearAleatoriamente()
        )));

        juego.empezarJuego();
    }
}
