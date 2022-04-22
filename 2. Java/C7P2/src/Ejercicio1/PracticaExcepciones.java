package Ejercicio1;

public class PracticaExcepciones {
    private static int b = 5;
    private static int a = 0;

    public static void main(String[] args) {
        dividir();
    }

    public static void dividir() {
        try {
            if (a == 0)
                throw new IllegalArgumentException("No se puede dividir por cero");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
