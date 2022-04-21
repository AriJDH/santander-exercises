package com.ej2;

public class NaveSimple extends NaveAbs {
    private double[] coordenadas;

    public NaveSimple(String nombre, double x, double y) {
        super(nombre);
        coordenadas= new double[2];
        coordenadas[0]=x;
        coordenadas[1]=y;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public double distancia(double[] coordenadasDeAsteroide) {
        return Math.sqrt(Math.pow((this.getCoordenadas()[0] - coordenadasDeAsteroide[0]),2)  +   Math.pow((this.getCoordenadas()[1] - coordenadasDeAsteroide[1]),2));
    }
}
