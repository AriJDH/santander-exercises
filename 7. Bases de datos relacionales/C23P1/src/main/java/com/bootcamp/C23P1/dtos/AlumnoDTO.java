package com.bootcamp.C23P1.dtos;

import com.bootcamp.C23P1.models.Tema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;
    private TemaDTO tema;
}
