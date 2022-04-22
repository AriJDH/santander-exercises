package com.santander.ejercicio2;

public class ParticipanteFlota {
    private String nombre;
    private FlotaNave flota;

    public ParticipanteFlota(String nombre, FlotaNave flota) {
        this.nombre = nombre;
        this.flota = flota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FlotaNave getFlota() {
        return flota;
    }

    public void setFlota(FlotaNave flota) {
        this.flota = flota;
    }

    @Override
    public String toString() {
        return "ParticipanteFlota{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                '}';
    }
}
