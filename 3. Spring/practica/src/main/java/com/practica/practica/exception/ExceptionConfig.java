package com.practica.practica.exception;

import com.practica.practica.dtos.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// al parecer puede que haya que indicar a que controller corresponde
@ControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PersonaNoSeEncuentraException.class)
    public ResponseEntity<ErrorDTO> handlerException(PersonaNoSeEncuentraException personaNoSeEncuentraException){
        ErrorDTO errorDto = new ErrorDTO();
        errorDto.setNombre("Sin registro de cliente");
        errorDto.setDescripcion("Exception: " + personaNoSeEncuentraException.getMessage());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    //... se pueden agregar mas excepciones aca
}
