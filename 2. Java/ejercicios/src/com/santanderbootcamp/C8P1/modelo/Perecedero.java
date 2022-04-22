package com.santanderbootcamp.C8P1.modelo;

public class Perecedero extends Producto {
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "Dias por caducar=" + diasPorCaducar +
                "} " + super.toString();
    }

    @Override
    public double calcular(int cantProductos) {
        double precioFinal = super.calcular(cantProductos);

        switch (diasPorCaducar) {
            case 1:
                precioFinal /= 4;
                break;
            case 2:
                precioFinal /= 3;
                break;
            case 3:
                precioFinal /= 2;
        }

        return precioFinal;
    }
}
