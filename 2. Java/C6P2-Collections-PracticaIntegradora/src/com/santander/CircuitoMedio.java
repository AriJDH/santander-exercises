package com.santander;

public class CircuitoMedio {
    private double km = 5;
    private int precio;
    private int categoria = 2;

    public CircuitoMedio() {
    }

    public double getKm() {return km;}
    public void setKm(double km) {this.km = km;}

    public double getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}

    public int calcular_precio (int edad) {
        if (edad < 18){
            return 2000;
        }
        else{
            return 2300;
        }
    }
}
