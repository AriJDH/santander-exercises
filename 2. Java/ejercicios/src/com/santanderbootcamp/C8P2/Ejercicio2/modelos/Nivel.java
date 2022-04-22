package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.modelos;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private List<Participante> participantes;

    public Nivel(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public Participante participanteGanadorCoordenada(int x, int y) {
        Participante participante = participantes.get(0);
        double distancia = participantes.get(0).distanciaACoordenadaDeNave(x, y);
        double distancia2;
        for(int i = 0; i < participantes.size(); i++) {
            distancia2 = participantes.get(i).distanciaACoordenadaDeNave(x, y);
            if (distancia2 < distancia) {
                distancia = distancia2;
                participante = participantes.get(i);
            }
        }
        return participante;
    }

    public void iniciarJuego(int coord[][]) {
        List<String> participantesGanadores = new ArrayList<>();
        Participante participanteGanador = participanteGanadorCoordenada(coord[0][0], coord[0][1]);
        Participante participante = participanteGanador;
        participante.sumarPunto(coord[0][0], coord[0][1]);
        participantesGanadores.add(participante.toString());
        for(int i = 1; i < coord.length; i++) {
            participante = participanteGanadorCoordenada(coord[i][0], coord[i][1]);
            participante.sumarPunto(coord[i][0], coord[i][1]);
            participantesGanadores.add(participante.toString());
            if(participanteGanador.getPuntuacion() < participante.getPuntuacion()) {
                participanteGanador = participante;
            }
        }

        System.out.println("El participante ganador es:\n" + participanteGanador);
        System.out.println();
        for(int i = 0; i < coord.length; i++) {
            System.out.println("En la coordenada (" + coord[i][0] + ", " + coord[i][1] + "): ");
            System.out.println(participantesGanadores.get(i));
            System.out.println();
        }
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
