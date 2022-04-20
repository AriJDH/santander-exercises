package com.santander.ejercicioPOO.ejerciciosClase.Exceptions.ejerciciosTarea;

public class Calculos {
    public static void main(String[] args) {
        comparadorMax(10,25);
        comparadorMin(23,1);
        potenciador(2,2);
        calcCos(10);
        calculaRaiz(4);
        dameUnRand();
    }
    public static void comparadorMax(int a, int b){
        int res;
        res = Math.max(a,b);
        System.out.println("El numero "+res+" es el mayor.");
    }
    public static void comparadorMin(int a, int b){
        int res;
        res = Math.min(a,b);
        System.out.println("El numero "+res+" es el menor.");
    }
    public static void potenciador(int base, int potencia) {
        double res;
        res = Math.pow(base,potencia);
        System.out.println("La potencia del numero "+base+" es "+res);
    }
    public static void calcCos(double a){
        double res;
        res=Math.cos(a);
        System.out.println("El coseno del numero "+a+" es "+res);
    }
    public static void calculaRaiz(int a){
        double res;
        res = Math.sqrt(a);
        System.out.println("La raiz cuadrada de "+a+" es "+res);
    }
    public static void dameUnRand(){
        System.out.println("Tu numero random es: "+(Math.random()*1000));
    }

}
