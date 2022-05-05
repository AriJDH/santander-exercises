package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotEmpty(message = "El nombre de la materia no puede estar vacio")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe empezar con mayuscula")
    @Size(min = 1, max= 30, message = "La longitud del nombre no puede superar los 30 caracteres")
    String name;
    @NotEmpty(message = "El nota no debe estar vacia")
    @Min(value = 0, message = "minimo 0")
    @Max(value = 10, message = "maximo 10")
    Double score;
}
