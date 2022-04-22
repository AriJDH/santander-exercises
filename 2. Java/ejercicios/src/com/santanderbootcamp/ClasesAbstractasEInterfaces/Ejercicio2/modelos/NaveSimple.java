package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.modelos;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.interfaces.InterfaceNaveOFlota;

public class NaveSimple implements InterfaceNaveOFlota {
    private final String nombre;
    private int coordX;
    private int coordY;
    private int puntuacion = 0;

    public NaveSimple(String nombre, int coordX, int coordY) {
        this.nombre = nombre;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void sumarPunto() {
        puntuacion++;
    }

    public static double calcularDistancia(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }

    @Override
    public NaveSimple masCercanaACoordenada(int x, int y) {
        return this;
    }

    @Override
    public double distanciaACoordenada(int x, int y) {
        return calcularDistancia(x, coordX, y, coordY);
    }

    @Override
    public String toString() {
        return "NaveSimple{" + nombre + '(' + coordX + ',' + coordY + ") - Puntuación " + puntuacion + '}';
    }
}
