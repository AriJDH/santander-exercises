package com.caloriasStarWars.caloriasStarWars.model;

import com.caloriasStarWars.caloriasStarWars.dto.IngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private List<Ingredient> ingredientes;
    private String name;



    public void agregarIngredientes(List<Ingredient> ingredientes) {
        this.ingredientes = ingredientes;
    }


public Ingredient buscarIngredienteConMasCalorias(){
   return ingredientes.stream().max(new Comparator<Ingredient>() {
        @Override
        public int compare(Ingredient o1, Ingredient o2) {
            return o1.getCalories() - o2.getCalories();
        }
    }).orElse(null);

}

    public int calcularCaloriasTotal(){
        int suma =0;
        for (Ingredient i:ingredientes) {
            suma +=i.getCalories();
        }
        return suma;
    }






}
