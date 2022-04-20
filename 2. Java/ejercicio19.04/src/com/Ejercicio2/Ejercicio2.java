package com.Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ParticipanteCarrera part1 = new ParticipanteCarrera(39655607, "Kati", "Venegas",25,1154813021,911293919,"R+");
        ParticipanteCarrera part2 = new ParticipanteCarrera(32655607, "Eze", "Maldonado",26,114543453,112939198,"R-");
        ArrayList<ParticipanteCarrera> partLista =new ArrayList<ParticipanteCarrera>();
        partLista.add(part1);
        partLista.add(part2);
        System.out.println(partLista);

        Carrera cCarrera = new Carrera();
        int circuito = cCarrera.guardarParticipante(partLista);



    }
}
