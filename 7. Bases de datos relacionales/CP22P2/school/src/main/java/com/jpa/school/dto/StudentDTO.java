package com.jpa.school.dto;

import com.jpa.school.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    String dni;
    String name;
    Boolean disabled;
    /*o le paso el id o le paso el curseDTOo*/
    Integer courseId;
    //CourseRepository course;
}
