package com.resolucion.ejercicio_4.main;

import com.resolucion.ejercicio_4.clases.Calculo;

public class Main {
    public static void main(String[] args) {
        Calculo calculo=new Calculo();
        System.out.println("El mayor entre 4 y 9 es: "+calculo.cualEsMayor(4,9));
        System.out.println("El menor entre 1 y 44 es: "+calculo.cualEsMenor(1,44));
        System.out.println("Potencia de 5 elevado a la 3:  "+calculo.calcularPotencia(5,3));
        System.out.println("El coseno de 45 es igual a: "+calculo.calcularCoseno(45));
        System.out.println("La raiz cuadrada de 81 es igual a "+calculo.calcularRaizCuadrada(81));
        System.out.println("Mostrando numero aleatorio entre 0 y 999: "+calculo.numeroAleatorio());

    }
}
