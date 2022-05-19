package SorteoAlumnos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private String first_name;

    private String last_name;

    private String dni;

    private String course;

    private Integer topicId;
}
