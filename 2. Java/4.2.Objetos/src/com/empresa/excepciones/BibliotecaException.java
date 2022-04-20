package com.empresa.excepciones;

public class BibliotecaException extends Exception{

    private String mensaje;

    public BibliotecaException() {

    }

    public BibliotecaException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "BibliotecaException{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
