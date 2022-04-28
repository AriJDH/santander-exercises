package com.bootcamp.practicaCalculadoraDeCalorias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PlatoDTO {

    String name;
    List<IngredienteDTO> ingredientesDTO;

}
