package com.santander.bootcamp.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    protected String nombre;
    protected List<Nave> flota;
    protected int puntuacion;

    public Jugador(String nombre, List<Nave> flota) {
        this.setNombre(nombre);
        this.setFlota(flota);
        this.setPuntuacion(0);
    }

    public Jugador(String nombre, Nave nave) {
        List<Nave> flota = new ArrayList<>(1);
        flota.add(nave);
        this.setNombre(nombre);
        this.setFlota(flota);
        this.setPuntuacion(0);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nave> getFlota() {
        return this.flota;
    }

    public void setFlota(List<Nave> flota) {
        this.flota = flota;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public double calcularDistancia(Coordenadas objetivo) {
        double suma = 0;
        for(Nave nave: this.getFlota()) {
            suma += Coordenadas.calcularDistancia(objetivo, nave.getUbicacion());
        }
        return suma / this.getFlota().size();
    }

    public void sumarPuntos(int puntos) {
        this.setPuntuacion(this.getPuntuacion() + puntos);
    }

    public String mostrarFlota() {
        String auxiliar = "{";

        for (Nave nave: this.getFlota()) {
            auxiliar += " " + nave.mostrarUbicacion();
        }

        return auxiliar + " }";
    }
}
