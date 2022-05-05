package com.digitalhouse.obtenerdiploma.excepciones;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ObtenerDiplomaExceptionController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleValidation(MethodArgumentNotValidException e) {
        ErrorDTO errorDTO = new ErrorDTO("Dato inválido", e.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    protected ResponseEntity<ErrorDTO> handleValidation(HttpMessageNotReadableException e) {
        ErrorDTO errorDTO = new ErrorDTO("Dato inválido", e.getMessage());
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }
}
