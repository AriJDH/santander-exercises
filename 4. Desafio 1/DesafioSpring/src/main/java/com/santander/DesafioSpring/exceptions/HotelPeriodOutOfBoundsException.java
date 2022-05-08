package com.santander.DesafioSpring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class HotelPeriodOutOfBoundsException extends RuntimeException{

    public HotelPeriodOutOfBoundsException(String message) {
        super(message);
    }

}
