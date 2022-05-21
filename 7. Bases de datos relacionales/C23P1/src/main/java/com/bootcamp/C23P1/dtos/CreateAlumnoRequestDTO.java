package com.bootcamp.C23P1.dtos;

import com.bootcamp.C23P1.models.Tema;
import lombok.Data;

@Data
public class CreateAlumnoRequestDTO {
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;
    private Tema tema;
}
