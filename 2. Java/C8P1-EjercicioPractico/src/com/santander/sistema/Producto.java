package com.santander.sistema;

public class Producto {
    protected String nombre;
    protected double precio;

    //constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //getters
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    //setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(double precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double calcular(int cantProducto){
        return getPrecio()*cantProducto;
    }

}
