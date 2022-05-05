package com.digitalhouse.obtenerdiploma.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotEmpty(message = "El nombre de la materia no puede estar vacio")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size(max = 30, message = "El nombre de la materia no puede superar los 30 caracteres.")
    String name;
    @NotNull(message = "La nota no puede estar vacía.")
    @DecimalMin(value = "0.0", message = "La nota mínima es 0.")
    @DecimalMax(value = "10.0", message = "La nota máxima es 10.")
    Double score;
}
