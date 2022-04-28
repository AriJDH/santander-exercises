package com.blogExcepciones.blogExcepciones.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionEncontrada extends RuntimeException{
    public ExceptionEncontrada(String sms){
        super(sms);
    }
}
