package com.santander.AgenciaDeTurismo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class VueloDepartOutOfBoundsException extends RuntimeException{

    public VueloDepartOutOfBoundsException(String message) {
        super(message);
    }

}
