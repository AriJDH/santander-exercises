package com.digitalhouse.obtenerdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotEmpty
    @Pattern(regexp = "[A-Z](\\p{Alpha}||\\s)+", message = "El nombre del estudiante debe comenzar con mayúscula.")
    String studentName;

    String message;
    Double averageScore;
    @NotEmpty
    List<@Valid SubjectDTO> subjects;

    public String calcularPromedio() {

        double total = 0;
        for (int i = 0; i < subjects.size(); i++) {
            total +=  subjects.get(i).getScore();
        }

        double promedio = total / subjects.size();

        if (promedio >= 7) {
            return "felicidades, aprobaste. Tu promedio es de " + promedio;
        }

        return "Desaprobaste. Tu promedio es de " + promedio;

    }
}
