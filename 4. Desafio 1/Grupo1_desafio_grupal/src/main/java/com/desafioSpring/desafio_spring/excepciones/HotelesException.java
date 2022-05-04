package com.desafioSpring.desafio_spring.excepciones;


//exception utilizada cuando ocurre un error con los hoteles
public class HotelesException extends RuntimeException {
    public HotelesException(String mensaje) {
        super(mensaje);
    }
}
