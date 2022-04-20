package com.Ejercicio2;

public class Calculos {

    private double a = 10;
    private double b = 3;

    public Calculos(){


    }

    public double mayor(){
        double mayor;
        mayor = Math.max(a,b);

        return mayor;
    }
    public double menor(){
        double menor;
        menor = Math.min(a,b);

        return menor;
    }
    public double potencia(){
        double potencia;
        potencia = Math.pow(a,b);

        return potencia;
    }
    public double raiz(){
        double raiz;
        raiz = Math.sqrt(a);

        return raiz;
    }
    public double aleatorio(){
        double aleatorio;
        aleatorio = Math.round(Math.random()*100);

        return aleatorio;
    }



}
