package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotBlank(message = "El nombre de la materia no puede estar vacío.")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres.")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    String name;

    @NotNull(message = "La nota no puede estar vacía")
    @DecimalMin(value = "0.0", message = "La nota minima es 0.0")
    @DecimalMax(value = "10.0", message = "La nota máxima es 10.0")
    Double score;
    Double score2;
    Double score3;
    Double score4;

}
