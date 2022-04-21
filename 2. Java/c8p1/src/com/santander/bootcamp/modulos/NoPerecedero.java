package com.santander.bootcamp.modulos;

public class NoPerecedero extends Producto {
    String tipo;

    public NoPerecedero(String nombre, int precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }



}
