package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotBlank
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres")
    String name;

    @DecimalMin(value = "0.0", message = "La mínima nota es 0.0")
    @DecimalMax(value = "10.0", message = "La máxima nota es 10.0")
    double score;
}
