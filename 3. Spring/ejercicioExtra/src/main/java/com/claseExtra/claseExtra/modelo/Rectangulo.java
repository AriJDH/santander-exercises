package com.claseExtra.claseExtra.modelo;

public class Rectangulo extends Cuadrilatero{
    private int xSubUno;
    private int ySunUno;
    public Rectangulo(int y, int x,int subX, int subY) {
        super(y, x);
        this.xSubUno = xSubUno;
        this.ySunUno = ySunUno;
    }


    @Override
    public int calcularArea() {
        return (this.x - this.y) * 2 + (xSubUno - ySunUno) * 2;
    }
}
