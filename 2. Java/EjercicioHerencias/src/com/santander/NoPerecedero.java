package com.santander;

public class NoPerecedero extends Producto {
    protected String tipo;

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

    public float calcular(int cantidadDeProductos){
        return (float) precio * cantidadDeProductos;

    }

}
