package ResolucionesEjerciciosPOO;

public class MainExcepciones {
    public static void main(String[] args) {
        Excepciones1 practica = new Excepciones1();
        try {
            practica.cociente();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa terminado.");
    }
}
