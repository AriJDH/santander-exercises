package c12exercises.p2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredienteDtoRequest {
    private String nombre;
    private double cantidad;
}
