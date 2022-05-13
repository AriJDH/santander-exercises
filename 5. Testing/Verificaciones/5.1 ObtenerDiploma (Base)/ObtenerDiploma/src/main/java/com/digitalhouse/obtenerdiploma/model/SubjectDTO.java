package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotBlank (message = "El nombre de la materia no puese estar vacío")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 dcaracteres")
    String name;

    @NotNull (message = "La nota no puede estar vacía")
    @DecimalMax (value = "10.0", message = "La máxima nota es de 10.0")
    @DecimalMin (value = "0.0", message = "La mínima nota es de 0.0")
    Double score;
}
