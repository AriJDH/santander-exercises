package com.santander.AgenciaDeTurismo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class HotelDestinationNotFoundException extends RuntimeException {
    public HotelDestinationNotFoundException() {
    }

    public HotelDestinationNotFoundException(String message) {
        super(message);
    }
}
