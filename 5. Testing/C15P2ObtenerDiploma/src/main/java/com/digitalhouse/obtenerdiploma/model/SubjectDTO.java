package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotNull
    @NotEmpty(message = "El nombre de la materia no puede estar vacía.")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||[áéíúó]||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres.")
    String name;

    @NotNull(message = "La nota no puede estar vacía")
    @Min(value = 0, message = "La minima nota es 0.0.")
    @Max(value = 10, message = "La máxima nota es 10.0.")
    Double score;
}
