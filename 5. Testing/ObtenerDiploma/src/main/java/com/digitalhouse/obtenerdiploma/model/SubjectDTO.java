package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotBlank(message = "El nombre de la materia no puede estar vacio")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s||[á-ü])+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max=30, message = "La longitud del nombre no puede superar los 30 caracteres.")
    String name;
    @NotNull(message = "La nota no puede estar vacia")
    @Min(value = 0, message = "La nota minima es 0.0")
    @Max(value = 10, message = "La nota maxima es 10.0")
    Double score;
}
