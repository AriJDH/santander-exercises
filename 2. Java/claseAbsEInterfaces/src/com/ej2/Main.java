package com.ej2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NaveAbs navep1= new NaveSimple("navep1",7,8);
        NaveAbs navep2= new NaveSimple("navep2",5,4);
        NaveAbs navep3= new NaveSimple("navep3",1,2);
        Flota flotap2= new Flota("flotap2");
        flotap2.addElemento(navep2);
        flotap2.addElemento(navep3);
        Participante p1 = new Participante(navep1,"juan");
        Participante p2 = new Participante(flotap2,"martin");
        Juego j1 = new Juego();
        j1.addParticipante(p1);
        j1.addParticipante(p2);
        ArrayList<double[]> coordenadas= new ArrayList<>();
        coordenadas.add(new double[] {5,4});
        coordenadas.add(new double[] {1,2});
        System.out.println(j1.jugar(coordenadas,p1,p2));
    }
}
