package com.santander.bootcamp;

public class Perecedero extends Producto{
    protected int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.setDiasPorCaducar(diasPorCaducar);
    }

    public int getDiasPorCaducar() {
        return this.diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "nombre='" + nombre  + '\'' +
                ", precio=" + precio  + '\'' +
                ", diasPorCaducar=" + diasPorCaducar +
                "} " + super.toString();
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double promocion;
        switch (this.getDiasPorCaducar()) {
            case 1:
                promocion = 0.25;
                break;
            case 2:
                promocion = 0.33;
                break;
            case 3:
                promocion = 0.50;
                break;
            default:
                promocion = 1.00;
                break;
        }

        return super.calcular(cantidadDeProductos) * promocion;
    }
}
