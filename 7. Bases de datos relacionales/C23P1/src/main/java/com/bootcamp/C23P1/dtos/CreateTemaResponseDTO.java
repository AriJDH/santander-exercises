package com.bootcamp.C23P1.dtos;

import lombok.Data;

@Data
public class CreateTemaResponseDTO {

    private String message;
    private int code;
    private TemaDTO tema;

}
