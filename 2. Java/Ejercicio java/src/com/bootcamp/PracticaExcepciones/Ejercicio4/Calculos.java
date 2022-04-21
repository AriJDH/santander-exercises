package com.bootcamp.PracticaExcepciones.Ejercicio4;

public class Calculos {

    public double Max(double a,double b){
        return Math.max(a,b);
    }
    public double Min(double a,double b){
        return Math.min(a,b);
    }
    public double Exponent(double a,double exponent){
        return Math.pow(a,exponent);
    }
    public float Cos(double a){
        return (float) Math.cos(a);
    }
    public float RaizC(double a){
        return (float) Math.pow(a,0.5f);
    }
    public float Random(){
        return (float) Math.random()*999;
    }

}


