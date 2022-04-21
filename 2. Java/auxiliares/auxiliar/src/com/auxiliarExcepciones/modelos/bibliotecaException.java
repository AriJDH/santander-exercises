package com.auxiliarExcepciones.modelos;

public class bibliotecaException extends Throwable {

    private String mensaje;

    public bibliotecaException() {

    }

    public bibliotecaException(String mensaje) {
        this.mensaje = mensaje;
    }
}
