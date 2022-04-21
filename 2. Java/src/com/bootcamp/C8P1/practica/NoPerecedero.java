package com.bootcamp.C8P1.practica;

public class NoPerecedero extends Producto {
    String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public int aumentar_si_perecedero(int contador_perecederos) {
        return contador_perecederos+1;
    }

    @Override
    public double acumular_si_perecedero(double acum_perecederos, int cantidad) {
        return acum_perecederos;
    }

    @Override
    public int aumentar_si_no_perecedero(int contador_no_perecederos) {
        return contador_no_perecederos+1;
    }

    @Override
    public double acumular_si_no_perecedero(double acum_no_perecederos, int cantidad) {
        return acum_no_perecederos + calcular(cantidad);
    }
}
