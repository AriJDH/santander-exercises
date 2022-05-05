package com.digitalhouse.obtenerdiploma.exception;

import com.digitalhouse.obtenerdiploma.model.ErrorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ObtenerDiplomaException extends RuntimeException{

    private ErrorDTO errorDTO;
    private HttpStatus httpStatus;
}
