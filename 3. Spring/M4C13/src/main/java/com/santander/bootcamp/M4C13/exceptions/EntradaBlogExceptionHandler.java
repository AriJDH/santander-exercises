package com.santander.bootcamp.M4C13.exceptions;

import com.santander.bootcamp.M4C13.DTO.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class EntradaBlogExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntradaBlogIdAlreadyExistsException.class)
    public ResponseEntity<ErrorDTO> handleException (EntradaBlogIdAlreadyExistsException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EntradaBlogNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleException (EntradaBlogNotFoundException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.NOT_FOUND);
    }

}
