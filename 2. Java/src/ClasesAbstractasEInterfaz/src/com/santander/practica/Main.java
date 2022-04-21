package com.santander.practica;

import com.santander.practica.clases.Soldado;
import com.santander.practica.clases.Tanque;
import com.santander.practica.clases.Tirador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Tirador> jugadores = new ArrayList<>();
        jugadores.add(new Soldado("Jugador1"));
        jugadores.add(new Tanque("Jugador2"));
        if(jugadores.size() > 0) {
            for (Tirador jug : jugadores) {
                int puntajeJug = 0;
                for (int i = 0; i < 10; i++) {
                    if (jug.disparar()) {
                        puntajeJug += jug.calcularPuntaje();
                    }
                }
                System.out.println("Puntaje " + jug.getNombreJugador() + ":" + puntajeJug);
            }
        }
        else {
            throw new Exception("El número de jugadores es incorrecto.");
        }
    }
}

