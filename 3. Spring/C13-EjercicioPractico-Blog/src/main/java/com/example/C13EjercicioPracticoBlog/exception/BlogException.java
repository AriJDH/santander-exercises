package com.example.C13EjercicioPracticoBlog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "El id ingresado ya existe")
public class BlogException extends RuntimeException{

    public BlogException(String mensaje) {
        super(mensaje);
    }
}
