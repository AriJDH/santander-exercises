package com.ejercicio.modelos;

public class Perecedero extends Productos {

    public int diasPorCaducar;

    public Perecedero() {
    }

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "díasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double calcular(int cantProducto) {
        double precioTotal = 0;
        switch (diasPorCaducar) {
            case 1:
                precioTotal = cantProducto * precio / 4;
                break;
            case 2:
                precioTotal = cantProducto * precio / 3;
                break;
            case 3:
                precioTotal = cantProducto * precio / 2;
                break;
            default:
                precioTotal = cantProducto * precio;
        }
        return precioTotal;
    }
}
