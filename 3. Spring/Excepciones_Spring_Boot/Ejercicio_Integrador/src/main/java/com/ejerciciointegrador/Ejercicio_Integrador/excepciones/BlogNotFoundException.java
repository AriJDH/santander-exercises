package com.ejerciciointegrador.Ejercicio_Integrador.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "No se encuentra el blog con ese id")
public class BlogNotFoundException extends RuntimeException{
    public BlogNotFoundException() {
    }

    public BlogNotFoundException(String message) {
        super(message);
    }

}
