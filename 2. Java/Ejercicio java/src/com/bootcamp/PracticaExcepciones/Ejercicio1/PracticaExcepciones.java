package com.bootcamp.PracticaExcepciones.Ejercicio1;

public class PracticaExcepciones {
    public static void main(String[] args) {
        int a = 300;
        int b = 0;


        try {
            if(b==0){
                throw new IllegalArgumentException("No se puede dividir por 0");
            }else{
                int c = a/b;
            }

        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }finally {
            System.out.println("Programa Finalizado");
        }
    }
}
