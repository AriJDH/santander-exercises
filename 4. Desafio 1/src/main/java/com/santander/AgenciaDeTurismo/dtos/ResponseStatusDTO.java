package com.santander.AgenciaDeTurismo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseStatusDTO {
    private int code;
    private String message;
}
