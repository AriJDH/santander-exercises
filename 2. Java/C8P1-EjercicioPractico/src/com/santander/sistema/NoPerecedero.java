package com.santander.sistema;

public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    @Override
    public double calcular(int cantProducto) {
        return super.calcular(cantProducto);
    }

}
