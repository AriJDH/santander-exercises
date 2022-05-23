package com.santander.moviesapp.exception;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException() {
    }

    public ElementNotFoundException(String message) {
        super(message);
    }

    public ElementNotFoundException(String entity, Integer id) {
        super(entity + "(" + id + ")" + " no pudo ser encontrado");
    }
}
