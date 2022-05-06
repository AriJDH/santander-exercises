package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    @NotBlank(message = "El nombre del alumno no puede estar vacio.")
    @Size(max = 50, message = "La longitud del nombre del alumno no puede superar los 50 caracteres.")
    String studentName;


    String message;
    Double averageScore;

    @NotEmpty(message = "La lista no puede estar vacía.")
    List<@Valid SubjectDTO> subjects;
}
