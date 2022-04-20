package prueba1;

public class ClaseExcepciones {

    public void provocarExcepcion(){
        try {
            int numero=0/10;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
