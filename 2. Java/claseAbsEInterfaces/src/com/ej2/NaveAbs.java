package com.ej2;

public abstract class NaveAbs {
    private String nombre;
    private int puntos;

    public NaveAbs(String nombre) {
        this.nombre = nombre;
        this.puntos=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void sumarPunto() {
        this.puntos++;
    }

    public abstract double distancia(double[] coordenadasDeAsteroide);

    @Override
    public String toString() {
        return "NaveAbs{" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
