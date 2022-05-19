package com.santander.bootcamp.M9C23P1.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlumnoDTO {

    private String nombre;
    private String apellido;
    private String curso;
    private TemaDTO temaDTO;

}
