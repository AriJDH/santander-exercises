package com.bootcamp._desafio_spring.excepciones;

public class VueloNoExisteException extends RuntimeException{
    public VueloNoExisteException() {
        super("Vuelo inexistente");
    }
}
