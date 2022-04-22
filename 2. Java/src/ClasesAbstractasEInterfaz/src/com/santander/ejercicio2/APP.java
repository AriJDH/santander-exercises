package com.santander.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {
        List<Integer> posicionJuan = new ArrayList<>(2);
        posicionJuan.add(0);
        posicionJuan.add(3);
        Nave nave = new Nave("Navecinha", posicionJuan);
        Participante juan = new Participante("Juan", nave);
        List<Integer> posicionMica1 = new ArrayList<>(2);
        posicionMica1.add(2);
        posicionMica1.add(2);
        Nave nave1 = new Nave("Nave", posicionMica1);
        List<Integer> posicionMica2 = new ArrayList<>(2);
        posicionMica2.add(4);
        posicionMica2.add(1);
        Nave nave2 = new Nave("Navecinha", posicionMica2);
        FlotaNave flotaMica = new FlotaNave();
        flotaMica.agregarNave(nave1);
        flotaMica.agregarNave(nave2);
        ParticipanteFlota mica = new ParticipanteFlota("Mica", flotaMica);
        List<Integer> objetivo1 = new ArrayList<>(2);
        objetivo1.add(3);
        objetivo1.add(5);
        List<Integer> objetivo2 = new ArrayList<>(2);
        objetivo2.add(3);
        objetivo2.add(0);
        List<Integer> objetivo3 = new ArrayList<>(2);
        objetivo3.add(2);
        objetivo3.add(1);
        List<List> objetivos = new ArrayList<>(3);
        objetivos.add(objetivo1);
        objetivos.add(objetivo2);
        objetivos.add(objetivo3);
        for(List obj : objetivos ) {
            String masCercano = ;

        }

    }
}
