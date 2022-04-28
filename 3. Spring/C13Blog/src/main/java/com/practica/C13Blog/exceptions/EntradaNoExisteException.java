package com.practica.C13Blog.exceptions;

public class EntradaNoExisteException extends RuntimeException {
    public EntradaNoExisteException() {
        super("No existe una entrada con ese id");
    }
}
