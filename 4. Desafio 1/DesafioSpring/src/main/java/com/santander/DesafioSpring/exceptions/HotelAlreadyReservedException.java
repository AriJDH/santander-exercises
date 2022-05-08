package com.santander.DesafioSpring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class HotelAlreadyReservedException extends RuntimeException{
    public HotelAlreadyReservedException(String message) {
        super(message);
    }
}