package com.santander.Joyeria.exception;

import com.santander.Joyeria.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(JoyaNoExisteException.class)
    public ResponseEntity<ErrorDTO> handlerException(JoyaNoExisteException joyaNoExisteException){
        ErrorDTO errorDto = new ErrorDTO("Joya inexistente","Exception: " + joyaNoExisteException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
