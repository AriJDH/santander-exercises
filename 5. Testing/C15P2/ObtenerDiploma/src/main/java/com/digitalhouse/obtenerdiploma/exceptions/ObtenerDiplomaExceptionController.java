package com.digitalhouse.obtenerdiploma.exceptions;

import com.digitalhouse.obtenerdiploma.model.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ObtenerDiplomaExceptionController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDto> handleException (MethodArgumentNotValidException e){
        return new ResponseEntity<>(new ErrorDto(400 ,), HttpStatus.BAD_REQUEST);
    }
}
