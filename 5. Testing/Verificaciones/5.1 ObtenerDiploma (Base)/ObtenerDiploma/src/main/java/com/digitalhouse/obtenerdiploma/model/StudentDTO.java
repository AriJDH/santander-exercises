package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank (message = "El nombre del alumno no puede estar vació")
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre de la materia debe comenzar con mayúscula.")
    @Size (max = 50, message = "El nombre no puede tener mas de 50 caracteres")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty (message = "La lista no puede estar vacia")
    List<@Valid SubjectDTO> subjects;
}
