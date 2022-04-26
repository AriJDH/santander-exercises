package integradores.integradorExcepciones.ejercicioUno;

public class Main {
    public static void main(String[] args) {
        PracticaExcepciones p = new PracticaExcepciones();
        try {
            p.calcularCociente();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
