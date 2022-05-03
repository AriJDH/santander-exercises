package com.santander.bootcamp.M4C13.exceptions;

import com.santander.bootcamp.M4C13.DTO.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LinkExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LinkNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleException(LinkNotFoundException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(LinkInactiveException.class)
    public ResponseEntity<ErrorDTO> handleException(LinkInactiveException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(LinkInvalidException.class)
    public ResponseEntity<ErrorDTO> handleException(LinkInvalidException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(LinkInvalidPasswordException.class)
    public ResponseEntity<ErrorDTO> handleException(LinkInvalidPasswordException e) {
        return new ResponseEntity<>(new ErrorDTO(e.getMessage()), HttpStatus.UNAUTHORIZED);
    }

}
