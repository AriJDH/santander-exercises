package com.santander.DesafioSpring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseStatusDTO {
    private int code;
    private String message;
}
