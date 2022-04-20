package com.excepYutilitarias;

public class PracticaExc {
    private int a = 0;
    private int b = 300;

    public void cociente() {
        try {
            System.out.println(b/a);
        } catch (ArithmeticException exp) {
            throw new IllegalArgumentException("no se puede x cero");
        } finally {
            System.out.println("finalizado");
        }
    }


}
