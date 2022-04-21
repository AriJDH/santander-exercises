package com.bootcamp.C8P1.practica;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcular(int cantidad) {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public int aumentar_si_perecedero(int contador_perecederos) {
        return 0;
    }

    public double acumular_si_perecedero(double acum_perecederos, int cantidad) {
        return 0;
    }

    public int aumentar_si_no_perecedero(int contador_no_perecederos) {
        return 0;
    }

    public double acumular_si_no_perecedero(double acum_no_perecederos, int cantidad) {
        return 0;
    }
}
