package com.bootcamp.C9P1.practica;

public class Vehiculo {
    private final String marca;
    private final String modelo;
    private final double costo;

    public Vehiculo(String marca, String modelo, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", costo=" + costo +
                '}';
    }

    public String getMarca() {
        return marca;
    }
}
