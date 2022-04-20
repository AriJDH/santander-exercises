package PracticaPOO.clases;

public class BibliotecaException extends Exception {

    private String mensaje;

    public BibliotecaException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "BibliotecaException{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
