package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.services.IComponente;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    List<Jugador> jugadores;

    public Juego() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void jugar() {

        double minimoPuntaje = jugadores.get(0).jugar();
        int indiceGanador = 0;
        for (int i = 1; i < jugadores.size(); i++) {
            if (minimoPuntaje > jugadores.get(i).jugar()) {
                minimoPuntaje = jugadores.get(i).jugar();
                indiceGanador = i;
            }
        }
        jugadores.get(indiceGanador).aumentarPuntaje();
    }

    public Jugador obtenerGanador() {
        int indiceGanador = 0;
        int puntajeMaximo = jugadores.get(0).getPuntaje();
        for (int i = 1; i < jugadores.size(); i++) {
            if (puntajeMaximo < jugadores.get(i).getPuntaje()) {
                puntajeMaximo = jugadores.get(i).getPuntaje();
                indiceGanador = i;
            }
        }
        return jugadores.get(indiceGanador);
    }


}
