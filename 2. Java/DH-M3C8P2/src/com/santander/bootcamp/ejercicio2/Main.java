package com.santander.bootcamp.ejercicio2;

import com.santander.bootcamp.ejercicio2.models.Coordenadas;
import com.santander.bootcamp.ejercicio2.models.Juego;
import com.santander.bootcamp.ejercicio2.models.Jugador;


public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego(
                Jugador.crearListaAleatoria(5),
                Coordenadas.crearListaAleatoria(10)
        );

        juego.mostrarJugadores();
        juego.empezar();
        juego.mostrarPuntuacion();
        juego.mostrarGanador();
    }
}
