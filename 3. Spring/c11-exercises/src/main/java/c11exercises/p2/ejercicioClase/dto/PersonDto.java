package c11exercises.p2.ejercicioClase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDto {
    private String name;
    private String lastname;
}
