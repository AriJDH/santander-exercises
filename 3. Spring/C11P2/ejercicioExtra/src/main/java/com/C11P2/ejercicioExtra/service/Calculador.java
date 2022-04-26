package com.C11P2.ejercicioExtra.service;

import com.C11P2.ejercicioExtra.clases.*;

public class Calculador {

    public int calcularAreaCuadrado(int x, int y){
        Cuadrilatero cu = new Cuadrado(x, y);
        return cu.calcularArea();
    }

    public int calcularAreaRectangulo(int x, int y, int subX, int subY){
        Cuadrilatero re = new Rectangulo(x, y, subX, subY);
        return re.calcularArea();
    }

    public int calcularAreaParalelogramo(int x, int y, int subX, int subY){
        Cuadrilatero pl = new Paralelogramo(x, y, subX, subY);
        return pl.calcularArea();
    }

    public int calcularAreaTrapezoide(int x, int y, int xSubUno, int ySubUno, int xSubDos, int ySubDos, int xSubTres, int ySubTres){
        Cuadrilatero tr = new Trapezoide(x, y, xSubUno, ySubUno, xSubDos, ySubDos, xSubTres, ySubTres);
        return tr.calcularArea();
    }

}
