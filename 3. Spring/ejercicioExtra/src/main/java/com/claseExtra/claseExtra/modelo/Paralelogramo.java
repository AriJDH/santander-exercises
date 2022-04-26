package com.claseExtra.claseExtra.modelo;

public class Paralelogramo extends Cuadrilatero{

    private int xSubUno;
    private int ySubDos;
    public Paralelogramo(int y, int x, int xSubUno,int ySubDos) {
        super(y, x);
        this.ySubDos=ySubDos;
        this.xSubUno=xSubUno;
    }

    @Override
    public int calcularArea() {
        return 0;
    }
}
