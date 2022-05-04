package com.santander.AgenciaDeTurismo.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class HotelFechaException extends RuntimeException{
    public HotelFechaException() {
    }

    public HotelFechaException(String message) {
        super(message);
    }
}
