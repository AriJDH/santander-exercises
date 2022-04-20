package p2.ejercicio1;

public class App {
    public static void main(String[] args) {
        PracticaExcepciones p = new PracticaExcepciones();

        try {
            p.Cociente();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programa finalizado");
    }
}
