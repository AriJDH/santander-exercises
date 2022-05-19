package SorteoAlumnos.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SuccessDto {
    private String msg;
    private Integer code;
}
