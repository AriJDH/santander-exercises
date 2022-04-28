package com.C13.practicaIntegradora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "No existe el post")
public class EntradaBlogException extends RuntimeException{

    public EntradaBlogException(String mensaje){
        super(mensaje);
    }

}
