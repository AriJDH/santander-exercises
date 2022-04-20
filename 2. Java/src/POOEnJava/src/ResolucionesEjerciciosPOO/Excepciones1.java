package ResolucionesEjerciciosPOO;

public class Excepciones1 {
    int a = 0;
    int b = 300;

    public double cociente() throws Exception {
        try {
            return b/a;
        } catch(Exception e) {
            throw new IllegalArgumentException("No se puede dividir por 0.");
        }
    }
}
