package com.santander.bootcamp.modulos;

public class Perecedero extends Producto{

    int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        if(diasPorCaducar == 1){
            return (cantidadDeProductos*precio) / 4;

        } else if(diasPorCaducar == 2){
            return (cantidadDeProductos*precio) / 3;

        } else if(diasPorCaducar > 3){
            return (cantidadDeProductos*precio);
        }

        return (cantidadDeProductos*precio) / 2;
    }


    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
