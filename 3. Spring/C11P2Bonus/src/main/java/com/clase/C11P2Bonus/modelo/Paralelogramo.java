package com.clase.C11P2Bonus.modelo;

public class Paralelogramo extends Cuadrilatero {
    public Paralelogramo(Punto a, Punto b, Punto c, Punto d) {
        //TODO: validar que sea paralelogramo, caso contrario lanzar excepcion
        super(a, b, c, d);
    }

    private void validar(Punto a, Punto b, Punto c, Punto d){
        //int suma_lados = a.distancia_con(b)
    }

    //HIPOTESIS.a siempre diagonal a c y b siempre diagonal a D
    @Override
    public long calcularArea() {
        long ha = this.A.distancia_con(C).getY();
        long a = this.A.distancia_con(B).getX();
        return a * ha;
    }
}
