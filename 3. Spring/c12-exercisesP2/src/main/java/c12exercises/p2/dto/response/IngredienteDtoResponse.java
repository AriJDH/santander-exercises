package c12exercises.p2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IngredienteDtoResponse {

    private String name;
    private Double calories;

}
