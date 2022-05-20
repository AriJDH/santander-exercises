package com.santander.moviesapp.exception;


import com.santander.moviesapp.dto.ExceptionDTO;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionController {

    @ExceptionHandler(ElementNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleElementNotFoundException(ElementNotFoundException e){
        ExceptionDTO response = new ExceptionDTO();

        response.setError_exception("ElementNotFoundException");
        response.setError_message(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        ExceptionDTO response = new ExceptionDTO();

        response.setError_exception("MethodArgumentNotValidException");
        e.getBindingResult().getAllErrors().forEach((error) ->{
            response.setError_message(error.getDefaultMessage());
        });

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ExceptionDTO> handleHttpMessageNotReadableException(HttpMessageNotReadableException e){
        ExceptionDTO response = new ExceptionDTO();

        response.setError_exception("HttpMessageNotReadableException");
        response.setError_message(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ExceptionDTO> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e){
        ExceptionDTO response = new ExceptionDTO();

        response.setError_exception("MethodArgumentTypeMismatchException");
        response.setError_message("Tipo de dato erroneo, por favor verifique los datos ingresado.");

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ExceptionDTO> handleConstraintViolationException(ConstraintViolationException e){
        ExceptionDTO response = new ExceptionDTO();

        response.setError_exception("ConstraintViolationException");
        List<String> messages = List.of(e.getMessage().split(","));
        messages.forEach(
                (message) -> response.setError_message(message.trim())
        );

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
