package c12exercises.p2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Plato {

    private String nombre;
    private List<Ingrediente> ingredientes;

}
