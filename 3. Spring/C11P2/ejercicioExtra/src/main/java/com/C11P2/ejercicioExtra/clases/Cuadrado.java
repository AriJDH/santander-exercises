package com.C11P2.ejercicioExtra.clases;

import lombok.Data;

@Data
public class Cuadrado extends Cuadrilatero{

    public Cuadrado(int x, int y) {
        super(x, y);
    }

    @Override
    public int calcularArea() {
        return (this.x - this.y)*(this.x + this.y);
    }
}
