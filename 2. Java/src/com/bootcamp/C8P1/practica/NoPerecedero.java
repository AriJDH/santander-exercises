package com.bootcamp.C8P1.practica;

public class NoPerecedero extends Producto {
    String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }


}
