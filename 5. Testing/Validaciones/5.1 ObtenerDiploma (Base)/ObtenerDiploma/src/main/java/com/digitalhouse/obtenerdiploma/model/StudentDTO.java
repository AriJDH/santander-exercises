package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.lang.NonNullFields;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
public class StudentDTO {
    @Valid
    @NotNull(message = "El nombre del alumno no puede estar vacio")
    @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres")
    @Pattern(regexp = "[A-Z]([A-Za-zÀ-ÿ]||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    String studentName;



    String message;

    Double averageScore;

    @NotBlank(message = "La lista no puede ser vacia")
    List<@Valid SubjectDTO> subjects;
}
