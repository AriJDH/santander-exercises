package com.C11P2.ejercicioExtra.clases;

public class Paralelogramo extends Cuadrilatero{

    private int xSubUno;
    private int ySunUno;

    public Paralelogramo(int x, int y, int xSubUno, int ySunUno) {
        super(x, y);
        this.xSubUno = xSubUno;
        this.ySunUno = ySunUno;
    }

    @Override
    public int calcularArea() {
        return (this.x - this.y) * 2 + (xSubUno - ySunUno) * 2;
    }

    public int getxSubUno() {
        return xSubUno;
    }

    public void setxSubUno(int xSubUno) {
        this.xSubUno = xSubUno;
    }

    public int getySunUno() {
        return ySunUno;
    }

    public void setySunUno(int ySunUno) {
        this.ySunUno = ySunUno;
    }
}
