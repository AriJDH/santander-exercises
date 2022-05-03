package com.bootcamp._desafio_spring.excepciones;

public class YaExisteReservaEnPeriodoException extends RuntimeException{
    public YaExisteReservaEnPeriodoException() {
        super("Ya existe una reserva para el periodo indicado");
    }
}
