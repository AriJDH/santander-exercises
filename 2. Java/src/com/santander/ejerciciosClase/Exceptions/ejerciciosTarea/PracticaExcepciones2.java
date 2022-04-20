package com.santander.ejercicioPOO.ejerciciosClase.Exceptions.ejerciciosTarea;

public class PracticaExcepciones2 {
    public static void main(String[] args) {
        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";
        try {


            //Código que arroja excepción
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println(mensajeFinal);
        }
        System.out.println("Este codigo se ejecuta siempre");
    }
}
