package com.desafioSpring.desafio_spring.excepciones;

//exception utilizada cuando ocurre un error con los vuelos
public class VuelosException extends RuntimeException {
    public VuelosException(String mensaje) {
        super(mensaje);
    }
}
