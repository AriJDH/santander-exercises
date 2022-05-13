package com.digitalhouse.obtenerdiploma.controller;

import com.digitalhouse.obtenerdiploma.exceptions.ObtenerDiplomaExceptions;
import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ObtenerDiplomaExceptionController {

    @ExceptionHandler (ObtenerDiplomaExceptions.class)
    ResponseEntity<ErrorDTO> excepciones (ObtenerDiplomaExceptions e){
        e.printStackTrace();
        return new ResponseEntity<>(e.getErrorDTO(), e.getStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(MethodArgumentNotValidException e) {
        ErrorDTO error = new ErrorDTO("MethodArgumentNotValidException", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
