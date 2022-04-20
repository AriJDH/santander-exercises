package com.resolucion.ejercicio_4.clases;

public class Calculo {
    public Calculo() {
    }

    public int cualEsMayor(int a, int b){
        return Math.max(a,b);

    }
    public int cualEsMenor(int a, int b){
        return Math.min(a,b);
    }

    public double calcularPotencia(int a, int b){
        return Math.pow(a,b);
    }

    public double calcularCoseno(double a){
        return Math.cos(a);
    }

    public double calcularRaizCuadrada(int a) {
        return Math.sqrt(a);
    }

    public double numeroAleatorio(){
        return Math.subtractExact(0,999);
    }


}
