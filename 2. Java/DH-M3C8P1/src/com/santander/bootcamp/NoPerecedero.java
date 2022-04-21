package com.santander.bootcamp;

public class NoPerecedero extends Producto{
    protected String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.setTipo(tipo);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio + '\'' +
                ", tipo='" + tipo +
                "} " + super.toString();
    }
}
