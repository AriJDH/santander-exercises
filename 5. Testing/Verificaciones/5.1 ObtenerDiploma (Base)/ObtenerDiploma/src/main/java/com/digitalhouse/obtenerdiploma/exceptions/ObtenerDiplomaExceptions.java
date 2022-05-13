package com.digitalhouse.obtenerdiploma.exceptions;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ObtenerDiplomaExceptions extends RuntimeException{

    private final ErrorDTO errorDTO;
    private final HttpStatus status;

    public ObtenerDiplomaExceptions(String error, HttpStatus status) {
        this.errorDTO = new ErrorDTO(this.getClass().getSimpleName(), error);
        this.status = status;
    }
}
