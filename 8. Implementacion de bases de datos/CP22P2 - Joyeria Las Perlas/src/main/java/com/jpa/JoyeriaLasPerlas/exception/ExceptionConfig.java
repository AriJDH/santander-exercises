package com.jpa.JoyeriaLasPerlas.exception;

import com.jpa.JoyeriaLasPerlas.dto.ErrorDto;
import com.jpa.JoyeriaLasPerlas.dto.RespuestaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(JoyaNoExisteException.class)
    public ResponseEntity<ErrorDto> handlerException(JoyaNoExisteException joyaNoExisteException){
        ErrorDto errorDto = new ErrorDto("Joya inexistente","Exception: " + joyaNoExisteException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

}