package com.claseExtra.claseExtra.modelo;

public class Cuadrado extends Cuadrilatero{

    public Cuadrado(int x, int y) {
        super(y, x);
    }



    @Override
    public int calcularArea() {
       return (this.x-this.y)*(this.x-this.y);
    }



}
