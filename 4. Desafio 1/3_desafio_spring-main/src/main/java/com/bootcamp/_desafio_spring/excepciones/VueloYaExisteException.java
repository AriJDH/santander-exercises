package com.bootcamp._desafio_spring.excepciones;

public class VueloYaExisteException extends RuntimeException{
    public VueloYaExisteException() {
        super("Alta denegada");
    }
}
