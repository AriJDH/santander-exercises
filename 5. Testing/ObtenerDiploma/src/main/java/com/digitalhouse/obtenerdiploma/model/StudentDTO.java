package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotEmpty(message = "El nombre del alumno no puede estar vacío")
    @Size(min= 1, max = 50,message = "La longitud del nombre no puede superar los 50 caracteres.")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    private String studentName;
    private String message;
    private Double averageScore;
    @NotEmpty(message = "La lista no puede ser vacía.")
    List<@Valid SubjectDTO> subjects;
}
