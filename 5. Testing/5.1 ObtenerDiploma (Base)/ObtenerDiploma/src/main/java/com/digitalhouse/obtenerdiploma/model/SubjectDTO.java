package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s||[á-ü])+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @NotBlank
    @Size(min = 1, max = 30, message = "El nombre de la materia debe tener como maximo 30 caracteres.")
    String name;

    @NotNull
    @DecimalMin( value="0.0", message = "La nota de la materia debe ser como minimo 0.")
    @DecimalMax( value="10.0", message = "La nota de la materia debe ser como maximo 10.")
    Double score;

    /*
    @NotBlank
    Comprueba que la secuencia de caracteres anotada no sea nula y que la longitud recortada sea mayor que 0.
    La diferencia @NotEmpty que esta restricción solo se puede aplicar en secuencias de caracteres
    y que los espacios en blanco finales se ignoran.
     */
}
