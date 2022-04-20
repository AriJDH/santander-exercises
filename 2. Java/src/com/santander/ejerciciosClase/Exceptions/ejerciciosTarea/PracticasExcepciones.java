package com.santander.ejercicioPOO.ejerciciosClase.Exceptions.ejerciciosTarea;

public class PracticasExcepciones {
    static void chequearValor(int algo){
        if (algo==0){
            throw new IllegalArgumentException("No se puede dividir por 0");
        }
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            PracticasExcepciones.chequearValor(a);
            double division = b/a;
        } catch (IllegalArgumentException e){
            System.out.println(e);
        } finally {
            System.out.println("Este codigo se ejecuta siempre.");
        }
    }
}
