package com.santanderbootcamp.desafio_spring.excepciones;

public class FechasNoValidasException extends RuntimeException{
    public FechasNoValidasException(String mensaje) {
        super(mensaje);
    }
}
