package com.claseExtra.claseExtra.modelo;

public class Trapezoide extends Cuadrilatero {
    private int xSubUno;
    private int ySubUno;
    private int xSubDos;
    private int ySubDos;
    private int xSubTres;
    private int ySubTres;

    public Trapezoide(int y, int x,int xSubUno,int ySubUno,int xSubDos,int ySubDos ,int xSubTres,int ySubTres ) {
        super(y, x);
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
}
