package com.bootcamp.PracticaExcepciones.Ejercicio4;

public  class Calculos {
    // el static hace que yo pueda llamar a la clase sin crear una instancia :)
    public static double Max(double a,double b){
        return Math.max(a,b);
    }
    public static double Min(double a,double b){
        return Math.min(a,b);
    }
    public static double Exponent(double a,double exponent){
        return Math.pow(a,exponent);
    }
    public static float Cos(double a){
        return (float) Math.cos(a);
    }
    public static float RaizC(double a){
        return (float) Math.pow(a,0.5f);
    }
    public static float Random(){
        return (float) Math.random()*999;
    }

}


