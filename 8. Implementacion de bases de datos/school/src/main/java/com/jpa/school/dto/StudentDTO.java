package com.jpa.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    Integer id;
    String dni;
    String name;
    Boolean disabled;
    CourseDTO course;
    LegajoDTO legajo;
}
