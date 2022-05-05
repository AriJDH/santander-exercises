package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @Valid
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s||[á-ü])+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    @NotBlank (message = "El nombre del estudiante es obligatorio")
    @Size(min = 1, max = 50, message = "El nombre del estudiante debe tener como maximo 50 caracteres.")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty (message = "La lista de materias debe tener al menos una materia")
    //@NotNull deja pasar listas vacias
    List<@Valid SubjectDTO> subjects;
}
