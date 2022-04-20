package p2.ejercicio1;

public class PracticaExcepciones {
    private int a;
    private int b;

    public PracticaExcepciones() {
        this.a = 0;
        this.b = 300;
    }

    public double Cociente() {
        try {
            return b/a;
        } catch (Exception e) {
            throw new IllegalArgumentException("No se puede dividir por 0");
        }
    }

}
