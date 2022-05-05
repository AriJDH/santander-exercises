package com.digitalhouse.obtenerdiploma.controller;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ObtenerDiplomaExceptionController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handlerValidationException(MethodArgumentNotValidException ex){
        ErrorDTO errorDto = new ErrorDTO("Error validation", "Exception: " + ex.getFieldError().getDefaultMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

}
