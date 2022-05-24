package SorteoAlumnos.dtos;

import SorteoAlumnos.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TopicDTO {

    private Integer id;
    private String name;
    private String complexity;
}
