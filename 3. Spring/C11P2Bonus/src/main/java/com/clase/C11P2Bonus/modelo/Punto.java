package com.clase.C11P2Bonus.modelo;

import lombok.Getter;

@Getter
public class Punto {
    private final long X;
    private final long Y;

    public Punto(long x, long y) {
        this.X = x;
        this.Y = y;
    }

    public Punto distancia_con(Punto otro){
        long distancia_x = Math.abs(this.X - otro.getX());
        long distancia_y = Math.abs(this.Y - otro.getY());

        return new Punto(distancia_x, distancia_y);
    }
}
