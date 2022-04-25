package com.santander;

public class CircuitoAvanzado {
    private double km = 10;
    private int precio;
    private int categoria = 3;

    public CircuitoAvanzado() {
    }

    public double getKm() {return km;}
    public void setKm(double km) {this.km = km;}

    public double getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}

    public int calcular_precio (int edad) {
        if (edad >= 18){
            return 2800;
        }
        else{
            return -1;
        }
    }
}
