package com.claseExtra.claseExtra.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public abstract class Cuadrilatero {
    protected int y;
    protected int x;


    public abstract int calcularArea();
}
