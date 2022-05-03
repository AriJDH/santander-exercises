package com.bootcamp._desafio_spring.excepciones;

public class HotelNoExisteException extends RuntimeException {
    public HotelNoExisteException() {
        super("No existe un hotel con ese codigo");
    }
}
