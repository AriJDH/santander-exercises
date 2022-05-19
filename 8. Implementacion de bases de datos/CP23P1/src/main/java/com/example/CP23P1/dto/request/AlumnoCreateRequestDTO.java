package com.example.CP23P1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoCreateRequestDTO {
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;
    private TemaOnlyIdRequestDTO tema;
}
