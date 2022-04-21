package com.ejercicio.modelos;

public class NoPerecedero extends Productos {

    protected String tipo;

    public NoPerecedero() {
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                "} " + super.toString();
    }

    public double calcular(int cantProducto) {
        double precioTotal = cantProducto * precio;
        return precioTotal;
    }
}
