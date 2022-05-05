package com.digitalhouse.obtenerdiploma.exceptions;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ObtenerDiplomaExceptionController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(MethodArgumentNotValidException e) {
        ErrorDTO error = new ErrorDTO(400, "MethodArgumentNotValidException", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
