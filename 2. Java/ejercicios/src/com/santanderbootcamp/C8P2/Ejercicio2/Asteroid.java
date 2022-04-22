package com.santanderbootcamp.C8P2.Ejercicio2;

import com.santanderbootcamp.C8P2.Ejercicio2.modelos.*;

import java.util.ArrayList;
import java.util.List;

public class Asteroid {

    public static int numeroRandom() {
        return (int)(Math.random() * 1000);
    }

    public static NaveSimple crearNave(String nombre) {
        return new NaveSimple(nombre, numeroRandom(), numeroRandom());
    }

    public static FlotaNaveSimple crearFlota(String[] nombres) {
        List<NaveSimple> navesFlota = new ArrayList<>();
        for(String nombre: nombres) {
            navesFlota.add(crearNave(nombre));
        }
        return new FlotaNaveSimple(navesFlota);
    }

    public static int[][] generarCoordenadas(int cantidad) {
        int[][] coord = new int[cantidad][2];
        for(int i = 0; i < cantidad; i++) {
            coord[i][0] = numeroRandom();
            coord[i][1] = numeroRandom();
        }
        return coord;
    }

    public static void main(String[] args) {
        Participante participante1 = new Participante(crearNave("Pepito"));
        Participante participante2 = new Participante(crearNave("Algo"));
        Participante participante3 = new Participante(crearFlota(new String[]{"Arroba", "Arriba", "Costado"}));
        Participante participante4 = new Participante(crearFlota(new String[]{"Lotus", "Marca", "Sol"}));

        List<Participante> participantes = new ArrayList<>();
        participantes.add(participante1);
        participantes.add(participante2);
        participantes.add(participante3);
        participantes.add(participante4);

        Nivel nivel1 = new Nivel(participantes);
        nivel1.iniciarJuego(generarCoordenadas(5));
    }
}
