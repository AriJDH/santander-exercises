package SorteoAlumnos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentSorteadosDTO {

    private String first_name;

    private String last_name;

    private String topic_name;

    private String topic_complexity;

}
