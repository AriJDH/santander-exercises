package c12exercises.p2.dto.request;

import c12exercises.p2.models.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatoDtoRequest {
    private String nombre;
    private List<IngredienteDtoRequest> ingredientes;
}
