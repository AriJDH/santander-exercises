package com.santander.bootcamp.ejercicio2;

import java.util.List;

public class Juego {
    protected List<Jugador> jugadores;
    protected List<Coordenadas> objetivos;

    public Juego(List<Jugador> jugadores, List<Coordenadas> objetivos) {
        this.setJugadores(jugadores);
        this.setObjetivos(objetivos);
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Coordenadas> getObjetivos() {
        return this.objetivos;
    }

    public void setObjetivos(List<Coordenadas> objetivos) {
        this.objetivos = objetivos;
    }

    public Jugador calcularGanadorObjetivo(Coordenadas objetivo) {
        double auxiliar, distanciaMenor = this.getJugadores().get(0).calcularDistancia(objetivo);
        Jugador ganador = this.getJugadores().get(0);

        for (Jugador j: this.getJugadores()) {
            auxiliar = j.calcularDistancia(objetivo);
            if (auxiliar < distanciaMenor) {
                distanciaMenor = auxiliar;
                ganador = j;
            }
        }

        ganador.sumarPuntos(1);

        return ganador;
    }

    public void empezarJuego() {
        System.out.printf("%nJugadores:");
        for (Jugador jugador: this.getJugadores()) {
            System.out.printf("%n%-15s%s", jugador.getNombre(), jugador.mostrarFlota());
        }

        System.out.println();

        for (Coordenadas objetivo: this.getObjetivos()) {
            System.out.printf("%nNuevo objetivo: (%d, %d)", objetivo.getX(), objetivo.getY());
            Jugador ganador = this.calcularGanadorObjetivo(objetivo);
            System.out.printf("%nGanador: %s%n", ganador.getNombre());
        }

        System.out.printf("%nPuntajes finales:");
        for (Jugador jugador: this.getJugadores()) {
            System.out.printf("%n%-15s%d", jugador.getNombre(), jugador.getPuntuacion());
        }
    }
}
