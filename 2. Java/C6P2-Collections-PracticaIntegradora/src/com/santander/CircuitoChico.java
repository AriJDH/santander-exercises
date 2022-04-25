package com.santander;

import java.util.List;

public class CircuitoChico {
    private double km = 2;
    private int precio;
    private int categoria = 1;
    private List<Participante> circuito_chico;

    public CircuitoChico() {
    }

    public double getKm() {return km;}
    public void setKm(double km) {this.km = km;}

    public double getPrecio() {return precio;}
    public void setPrecio(int precio) {this.precio = precio;}

    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}

    public int calcular_precio (int edad) {
        if (edad < 18){
            return 1300;
        }
        else{
            return 1500;
        }
    }
}
