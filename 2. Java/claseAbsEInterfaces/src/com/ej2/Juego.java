package com.ej2;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Participante> participantes;

    public Juego(){
        this.participantes=new ArrayList<>();
    }
    public void addParticipante(Participante p1){
        participantes.add(p1);
    }
    public NaveAbs jugar(ArrayList<double[]> coordenadasParaJugar, Participante p1, Participante p2){
        //devuelve el participante ganador
        if (participantes.contains(p1) && participantes.contains(p2)){
            //si están registrados
            for (double[] coordenada: coordenadasParaJugar) {
                double d1= p1.distanciaAcoordenada(coordenada);
                System.out.println(d1);
                double d2= p2.distanciaAcoordenada(coordenada);
                System.out.println(d2);
                if (d1<d2){
                    p1.getElementoParaJugar().sumarPunto();
                    System.out.println("El ganador de esta batalla es la nave " + p1.getElementoParaJugar());
                }else{
                    if (d2<d1){
                        p2.getElementoParaJugar().sumarPunto();
                        System.out.println("El ganador de esta batalla es la nave " + p2.getElementoParaJugar());
                    }
                }
            }
            if (p1.getElementoParaJugar().getPuntos() > p2.getElementoParaJugar().getPuntos()){
                return p1.getElementoParaJugar();
            }else{
                if (p2.getElementoParaJugar().getPuntos() > p1.getElementoParaJugar().getPuntos()){
                    return p2.getElementoParaJugar();
                }
            }
        }
        return null;
    }
}
