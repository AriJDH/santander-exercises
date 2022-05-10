package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotEmpty(message = "El nombre de la materia no debe estar vacío.")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "La longitud del nombre de la materia no puede superar los 30 caracteres.")
    String name;

    @NotEmpty(message = "La nota de la materia no debe estar vacío.")
    @DecimalMax(value = "10.0", message = "La nota máxima de la materia es de 10.")
    @DecimalMin(value = "0.0", message = "La nota mínima de la materia es de 0.")
    Double score;
}
