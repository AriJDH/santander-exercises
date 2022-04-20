package com.santander.bootcamp.ejercicios;


public class Calculos{

    public static int menor(int a, int b){

        if (a <= b) {
            return a;
        }
        return b;
    }

    public static int mayor(int a, int b){

        if (a >= b) {
            return a;
        }
        return b;
    }

    public static double potencia(double base, int exponente){
        return Math.pow(base, exponente);
    }

    public static double cos(double angulo){
        return Math.cos(angulo);
    }

    public static double sqrt(double angulo){
        return Math.sqrt(angulo);
    }

    public static int random(){
        return (int) (Math.random()*1000);
    }






}


