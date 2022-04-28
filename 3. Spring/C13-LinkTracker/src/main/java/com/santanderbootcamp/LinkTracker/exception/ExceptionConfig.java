package com.santanderbootcamp.LinkTracker.exception;

import com.santanderbootcamp.LinkTracker.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(URLInvalidaException.class)
    public ResponseEntity<ErrorDto> handlerException(URLInvalidaException urlInvalidaException) {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("La URL es invalida");
        errorDto.setDescripcion("La URL proporcionada no es valida");
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DatosInvalidosException.class)
    public ResponseEntity<ErrorDto> handlerException(DatosInvalidosException datosInvalidosException) {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Los datos no son validos");
        errorDto.setDescripcion("No se encontro un registro que coincida");
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
