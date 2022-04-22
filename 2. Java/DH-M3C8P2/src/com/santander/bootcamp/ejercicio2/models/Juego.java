package com.santander.bootcamp.ejercicio2.models;

import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private List<Coordenadas> objetivos;

    public Juego(List<Jugador> jugadores, List<Coordenadas> objetivos) {
        this.setJugadores(jugadores);
        this.setObjetivos(objetivos);
    }

    private List<Jugador> getJugadores() {
        return this.jugadores;
    }

    private void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    private List<Coordenadas> getObjetivos() {
        return this.objetivos;
    }

    private void setObjetivos(List<Coordenadas> objetivos) {
        this.objetivos = objetivos;
    }

    private Jugador calcularGanadorObjetivo(Coordenadas objetivo) {
        double auxiliar, distanciaMenor = this.getJugadores().get(0).calcularDistancia(objetivo);
        Jugador ganador = this.getJugadores().get(0);

        for (Jugador jugadorActual: this.getJugadores()) {
            auxiliar = jugadorActual.calcularDistancia(objetivo);
            if (auxiliar < distanciaMenor) {
                distanciaMenor = auxiliar;
                ganador = jugadorActual;
            }
        }

        ganador.sumarPuntos(1);

        return ganador;
    }

    private Jugador calcularGanadorJuego() {
        double auxiliar, puntajeMayor = this.getJugadores().get(0).getPuntuacion();
        Jugador ganador = this.getJugadores().get(0);

        for (Jugador jugadorActual: this.getJugadores()) {
            auxiliar = jugadorActual.getPuntuacion();
            if(auxiliar > puntajeMayor) {
                puntajeMayor = auxiliar;
                ganador = jugadorActual;
            }
        }

        return ganador;
    }

    public void empezar() {
        for (Coordenadas objetivoActual: this.getObjetivos()) {
            System.out.printf("%nNuevo objetivo: (%d, %d)", objetivoActual.getX(), objetivoActual.getY());
            Jugador ganador = this.calcularGanadorObjetivo(objetivoActual);
            System.out.printf("%nGanador: %s%n", ganador.getNombre());
        }
    }

    public void mostrarJugadores() {
        System.out.printf("%nJugadores:%n");
        for (Jugador jugadorActual: this.getJugadores()) {
            System.out.printf("%-15s%s%n", jugadorActual.getNombre(), jugadorActual.mostrarFlota());
        }
    }

    public void mostrarPuntuacion() {
        System.out.printf("%nPuntuaciones:%n");
        for (Jugador jugadorActual: this.getJugadores()) {
            System.out.printf("%-15s%d%n", jugadorActual.getNombre(), jugadorActual.getPuntuacion());
        }
    }

    public void mostrarGanador() {
        System.out.printf("%nEl ganador del juego %s%n", this.calcularGanadorJuego().getNombre());
    }
}
