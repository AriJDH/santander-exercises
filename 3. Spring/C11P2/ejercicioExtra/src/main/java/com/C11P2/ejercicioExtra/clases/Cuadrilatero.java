package com.C11P2.ejercicioExtra.clases;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cuadrilatero {

    protected int x;
    protected int y;

    public abstract int calcularArea();
}
