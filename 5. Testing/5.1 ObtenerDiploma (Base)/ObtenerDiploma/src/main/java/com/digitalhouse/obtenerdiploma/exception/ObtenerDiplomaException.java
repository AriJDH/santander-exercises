package com.digitalhouse.obtenerdiploma.exception;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ObtenerDiplomaException extends RuntimeException{

    private final ErrorDTO error;
    private final HttpStatus status;

    public ObtenerDiplomaException(String message, HttpStatus status) {
        this.error = new ErrorDTO(this.getClass().getSimpleName(), message);
        this.status = status;
    }
}
