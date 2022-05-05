package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotEmpty(message = "El nombre de la materia no puede estar vacío.")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30,message = "La longitud del nombre no puede superar los 30 caracteres.")
    String name;

    @NotEmpty(message = "La nota no puede estar vacío.")
    @DecimalMin("0.0")
    @DecimalMax("10")
    Double score;
}
