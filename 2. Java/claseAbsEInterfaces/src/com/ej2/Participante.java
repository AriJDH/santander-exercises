package com.ej2;

public class Participante {
    private NaveAbs elementoParaJugar;
    private String nombre;

    public Participante(NaveAbs elementoParaJugar, String nombre) {
        this.elementoParaJugar = elementoParaJugar;
        this.nombre = nombre;
    }

    public double distanciaAcoordenada(double[] coordenadasDeAsteroide){
        return elementoParaJugar.distancia(coordenadasDeAsteroide);
    }

    public NaveAbs getElementoParaJugar() {
        return elementoParaJugar;
    }

    public void setElementoParaJugar(NaveAbs elementoParaJugar) {
        this.elementoParaJugar = elementoParaJugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
