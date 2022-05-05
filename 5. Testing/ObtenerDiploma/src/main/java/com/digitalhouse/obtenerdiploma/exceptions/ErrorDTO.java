package com.digitalhouse.obtenerdiploma.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDTO {

    String exception;
    String message;

}
