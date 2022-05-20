package com.jpa.school.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Integer id;
    private String name;
    private List<StudentDTO> studentDTOS;
}
