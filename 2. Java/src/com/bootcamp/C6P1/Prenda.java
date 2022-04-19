package com.bootcamp.C6P1;

public class Prenda {
    private final String modelo;
    private final String marca;

    public Prenda(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return ("Modelo " + modelo + " Marca " + marca);
    }
}
