package com.bootcamp.C23P1.dtos;

import lombok.Data;

@Data
public class CreateAlumnoResponseDTO {

    private String message;
    private int code;
    private AlumnoDTO alumnoDTO;

}
