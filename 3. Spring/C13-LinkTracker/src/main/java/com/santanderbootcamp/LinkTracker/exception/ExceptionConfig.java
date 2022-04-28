package com.santanderbootcamp.LinkTracker.exception;

import com.santanderbootcamp.LinkTracker.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(DatosInvalidosException.class)
    public ResponseEntity<ErrorDto> handlerException(DatosInvalidosException datosInvalidosException) {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setNombre("Los datos no son validos");
        errorDto.setDescripcion("No se encontro un registro que coincida o el formato de los datos no es valido");
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }
}
