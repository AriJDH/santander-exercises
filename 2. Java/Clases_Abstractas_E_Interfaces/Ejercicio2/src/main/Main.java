package main;

import clases.Composite;
import clases.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[][] metioritos = {{3, 2},{4,2}};

        List<Participante> participantes = new LinkedList<>();

        participantes.add(new Participante("Juancito", new Nave(5, 2)));
        participantes.add(new Participante("Pepito", new Nave(3, 2)));
        List<Nave> listaDeNaves = new LinkedList<>();
        listaDeNaves.add(new Nave(4, 2));
        listaDeNaves.add(new Nave(4, 2));
        participantes.add(new Participante("Marta", new ParticipanteFlota(listaDeNaves)));

        for (int i = 0; i < metioritos.length; i++) {
            double distanciaMinima = participantes.get(0).getEquipo().calcularDistancia(metioritos[0][0],metioritos[0][1]);
            int personaMinima = 0;
            double distanciaAux;
            for (int p=0; p<participantes.size();p++) {
                distanciaAux = participantes.get(p).getEquipo().calcularDistancia(metioritos[i][0], metioritos[i][1]);
                System.out.println(distanciaAux);
                if (distanciaMinima > distanciaAux) {
                    distanciaMinima = distanciaAux;
                    personaMinima =p;
                }
            }
            participantes.get(personaMinima).setPuntaje(participantes.get(personaMinima).getPuntaje()+1);

        }
        for (Participante participante :
                participantes) {
            System.out.println(participante.getPuntaje());
        }

    }
}
