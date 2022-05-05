package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank(message = "El nombre del alumno no puede ser vacio")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||[áéíóú]||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres")
    String studentName;

    String message;

    @DecimalMin(value = "0.0", message = "El promedio no puede ser menor a 0.0")
    @DecimalMax(value = "10.0", message = "El promedio no puede ser mayor a 10.0")
    Double averageScore;

    @Valid
    @NotEmpty
    List<SubjectDTO> subjects;
}
