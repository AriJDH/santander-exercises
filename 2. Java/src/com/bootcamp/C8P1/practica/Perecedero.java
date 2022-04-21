package com.bootcamp.C8P1.practica;

public class Perecedero extends Producto {
    private final int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(int cantidad) {
        float multiplicador = (float) 1/2;
        if(diasPorCaducar <= 1){
            multiplicador = (float) 1/4;
        } else if (diasPorCaducar <= 2){
            multiplicador = (float) 1/3;
        }
        return super.calcular(cantidad) * multiplicador;
    }
}
