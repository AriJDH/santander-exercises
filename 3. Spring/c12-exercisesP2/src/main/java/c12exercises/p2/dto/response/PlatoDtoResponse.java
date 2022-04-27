package c12exercises.p2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatoDtoResponse {

    private String nombre;
    private List<IngredienteDtoResponse> ingredientes;

}
