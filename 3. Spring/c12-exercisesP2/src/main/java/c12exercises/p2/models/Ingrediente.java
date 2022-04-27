package c12exercises.p2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ingrediente {
    private String nombre;
    private double cantidad;
    private double calorias;
}
