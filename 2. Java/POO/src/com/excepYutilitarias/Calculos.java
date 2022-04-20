package com.excepYutilitarias;

public class Calculos {
    public static int mayorNumero(int a, int b){
        return Math.max(a,b);
    }
    public static double potenciar(int num, int pot){
        return Math.pow(num,pot);
    }
    public static double cos(double num){
        return Math.cos(num);
    }
    public static double raiz(double num){
        return Math.sqrt(num);
    }
    public static int randomE0y999(){
        return ((int)(Math.random() * 1000));
    }
    public static void main(String[] args) {
        System.out.println(mayorNumero(200,5));
        System.out.println(potenciar(2,3));
        System.out.println(cos(0));
        System.out.println(raiz(25));
        System.out.println(randomE0y999());
    }
}
