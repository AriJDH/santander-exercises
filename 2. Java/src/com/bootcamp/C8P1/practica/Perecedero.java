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

    @Override
    public String toString() {
        return super.toString() + ", dias para caducar=" + diasPorCaducar;
    }

    @Override
    public int aumentar_si_perecedero(int contador_perecederos) {
        return contador_perecederos;
    }

    @Override
    public double acumular_si_perecedero(double acum_perecederos, int cantidad) {
        return acum_perecederos + calcular(cantidad);
    }

    @Override
    public int aumentar_si_no_perecedero(int contador_no_perecederos) {
        return contador_no_perecederos;
    }

    @Override
    public double acumular_si_no_perecedero(double acum_no_perecederos, int cantidad) {
        return acum_no_perecederos;
    }
}
