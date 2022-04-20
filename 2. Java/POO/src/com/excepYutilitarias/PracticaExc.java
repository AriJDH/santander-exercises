package com.excepYutilitarias;

public class PracticaExc {
    private int a = 20;
    private int b = 0;

    public double cociente() {
        try {
            return (a/b);
        } catch (ArithmeticException exp) {
            throw new IllegalArgumentException("no se puede x cero");
        } finally {
            System.out.println("finalizado");
        }
    }


}
