package com.santander;

public class Perecedero extends Producto {
    protected int diasPorCadudar;



    public Perecedero(String nombre, double precio, int diasPorCadudar) {
        super(nombre, precio);
        this.diasPorCadudar = diasPorCadudar;
    }

    public int getDiasPorCadudar() {
        return diasPorCadudar;
    }

    public void setDiasPorCadudar(int diasPorCadudar) {
        this.diasPorCadudar = diasPorCadudar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCadudar=" + diasPorCadudar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public float calcular(int cantidadDeProductos){
        switch (diasPorCadudar){
            case 1:
                return (float)precio*cantidadDeProductos/4;

            case 2:
                return (float)precio*cantidadDeProductos/3;

            case 3:
                return (float)precio*cantidadDeProductos/2;

            default:
                return (float) precio*cantidadDeProductos;

        }
    }
}
