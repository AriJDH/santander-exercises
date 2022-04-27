package com.practica.practica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

///Comentado dado que usamos el ExceptionHandler en el controller
//@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no existe registro de persona")
public class PersonaNoSeEncuentraException extends RuntimeException {
    public PersonaNoSeEncuentraException(String msg) {
        super(msg);
    }
}
