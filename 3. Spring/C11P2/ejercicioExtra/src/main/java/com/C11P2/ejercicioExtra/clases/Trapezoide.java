package com.C11P2.ejercicioExtra.clases;


public class Trapezoide extends Cuadrilatero{

    private int xSubUno;
    private int ySubUno;
    private int xSubDos;
    private int ySubDos;
    private int xSubTres;
    private int ySubTres;

    public Trapezoide(int x, int y, int xSubUno, int ySubUno, int xSubDos, int ySubDos, int xSubTres, int ySubTres) {
        super(x, y);
        this.xSubUno = xSubUno;
        this.ySubUno = ySubUno;
        this.xSubDos = xSubDos;
        this.ySubDos = ySubDos;
        this.xSubTres = xSubTres;
        this.ySubTres = ySubTres;
    }

    @Override
    public int calcularArea() {
        return this.x - this.y + xSubUno - ySubUno + xSubDos - ySubDos + xSubTres - ySubTres;
    }

    public int getxSubUno() {
        return xSubUno;
    }

    public void setxSubUno(int xSubUno) {
        this.xSubUno = xSubUno;
    }

    public int getySubUno() {
        return ySubUno;
    }

    public void setySubUno(int ySubUno) {
        this.ySubUno = ySubUno;
    }

    public int getxSubDos() {
        return xSubDos;
    }

    public void setxSubDos(int xSubDos) {
        this.xSubDos = xSubDos;
    }

    public int getySubDos() {
        return ySubDos;
    }

    public void setySubDos(int ySubDos) {
        this.ySubDos = ySubDos;
    }

    public int getxSubTres() {
        return xSubTres;
    }

    public void setxSubTres(int xSubTres) {
        this.xSubTres = xSubTres;
    }

    public int getySubTres() {
        return ySubTres;
    }

    public void setySubTres(int ySubTres) {
        this.ySubTres = ySubTres;
    }
}
