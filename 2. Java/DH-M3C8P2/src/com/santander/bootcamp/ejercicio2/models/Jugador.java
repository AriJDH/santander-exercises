package com.santander.bootcamp.ejercicio2.models;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Nave> flota;
    private int puntuacion;

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

        for (Nave naveActual: this.getFlota()) {
            auxiliar += " " + naveActual.mostrarUbicacion();
        }

        return auxiliar + " }";
    }

    public static Jugador crearAleatoria(String nombre) {
        int cantidad = (int) Math.floor(Math.random() / Math.nextDown(1.0) * 4) + 1;
        return new Jugador(nombre, Nave.crearListaAleatoria(cantidad));
    }

    public static List<Jugador> crearListaAleatoria(int size) {
        List<Jugador> lista = new ArrayList<>(size);

        for (int x = 0; x < size; x++) {
            lista.add(Jugador.crearAleatoria("Jugador_" + x));
        }

        return lista;
    }
}
