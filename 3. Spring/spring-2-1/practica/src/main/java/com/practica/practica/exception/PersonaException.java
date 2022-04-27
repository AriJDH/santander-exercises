package com.practica.practica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no existe registro de persona")
public class PersonaException extends RuntimeException{

    public PersonaException(String mensaje) {
        super(mensaje);
    }

}
