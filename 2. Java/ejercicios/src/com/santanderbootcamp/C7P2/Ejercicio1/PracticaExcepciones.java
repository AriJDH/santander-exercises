package com.santanderbootcamp.C7P2.Ejercicio1;

public class PracticaExcepciones {
    static int a = 0, b = 300;
    public static int dividir(int a, int b) throws IllegalArgumentException {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        return a/b;
    }

    public static void main(String[] args) {
        int r;

        try {
            //r = b / a;
            dividir(b,a);
       // } catch (Exception e) {
        } catch (IllegalArgumentException e) {
            //System.out.println("Se ha producido un error");
            System.out.println(e);
        }
        System.out.println("Programa finalizado");
    }
}
