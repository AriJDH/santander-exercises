package ResolucionesEjerciciosPOO;

public class PracticaExcepciones {
    int a = 0;
    int b = 300;

    public double cociente() {
        try {
            return b/a;
        } catch(Exception e) {
            System.out.println("Se ha producido un error.");
        }
        return 0;
    }
}
