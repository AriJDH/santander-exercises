package com.ejerciciointegrador.Ejercicio_Integrador.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ALREADY_REPORTED,reason = "Hay un blog con ese id")
public class BlogIdTakenException extends RuntimeException{
    public BlogIdTakenException() {
    }

    public BlogIdTakenException(String message) {
        super(message);
    }

}
