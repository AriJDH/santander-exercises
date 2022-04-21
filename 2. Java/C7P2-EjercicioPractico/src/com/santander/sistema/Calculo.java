package com.santander.sistema;

public class Calculo {
    private double a;
    private double b;

    public Calculo() {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {this.a = a;}
    public void setB(double b) {this.b = b;}

    public double getA() {return a;}
    public double getB() {return b;}

    public String toString() {
        return ("A :" + this.getA() + " B:" + this.getB() );
    }

    public double mayor(double a,double b){
        return Math.max(a,b);
    }

    public double menor(double a,double b){
        return Math.min(a,b);
    }

    public double potencia(double a,double b){
        return Math.pow(a,b);
    }

    public double coseno(double a){
        return Math.cos(a);
    }

    public double raiz_cuadrada(double a) {
        return Math.sqrt(a);
    }

    public double aleatorio (){
        return Math.random()*99;
    }
}
