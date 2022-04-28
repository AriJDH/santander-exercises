package com.blogExcepciones.blogExcepciones.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionNoEncontrado extends RuntimeException{
    public ExceptionNoEncontrado(String sms){
        super(sms);
    }
}
