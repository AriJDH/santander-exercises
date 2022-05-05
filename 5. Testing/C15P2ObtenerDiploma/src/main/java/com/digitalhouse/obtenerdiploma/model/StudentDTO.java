package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres")
    @NotNull(message = "El nombre del alumno no puede estar vacio")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "La lista no puede ser vacía.")
    List<@Valid SubjectDTO> subjects;
}
