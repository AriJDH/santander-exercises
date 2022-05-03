package com.bootcamp._desafio_spring.excepciones;

public class HotelNoEstaDisponibleException extends RuntimeException {
    public HotelNoEstaDisponibleException() {
        super("Hotel no esta disponible en el periodo indicado");
    }
}
