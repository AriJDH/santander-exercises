package com.bootcamp.practicaCalculadoraDeCalorias.services;

import com.bootcamp.practicaCalculadoraDeCalorias.dto.IngredienteDTO;
import com.bootcamp.practicaCalculadoraDeCalorias.dto.PlatoDTO;
import com.bootcamp.practicaCalculadoraDeCalorias.models.Ingrediente;
import com.bootcamp.practicaCalculadoraDeCalorias.repositorys.DAO;
import com.bootcamp.practicaCalculadoraDeCalorias.repositorys.IngredienteDaoImplement;

import java.util.ArrayList;
import java.util.List;

public class IngredienteService {

    DAO dao = new IngredienteDaoImplement();

    public List<IngredienteDTO> getIngredientes() {

        List<Ingrediente> ingredientes = dao.getElements();
        List<IngredienteDTO> ingredienteDTOS = new ArrayList<>();

        ingredientes.forEach(ingrediente -> {

            ingredienteDTOS.add(new IngredienteDTO(
                    ingrediente.getName(), ingrediente.getCalories()));
        });
        return ingredienteDTOS;
    }

    public double calcularCaloriasPlato(PlatoDTO platoDTO) {
        double caloriasTotales = 0;

        List<Ingrediente> ingredientes = dao.getElements();

        for (IngredienteDTO ingredienteDTO: platoDTO.getIngredientesDTO()) {
            for (Ingrediente ingrediente: ingredientes) {
                if(ingredienteDTO.getName().equals(ingrediente.getName())){
                    caloriasTotales = caloriasTotales + (ingrediente.getCalories() * ingredienteDTO.getPeso());
                    break;
                }
            }
        }

        return caloriasTotales;
    }

    public List<IngredienteDTO> getCaloriasIngredientes(PlatoDTO platoDTO) {
        List<Ingrediente> ingredientes = dao.getElements();
        List<IngredienteDTO> ingredientesPlato = new ArrayList<>();

        for (IngredienteDTO ingredienteDTO: platoDTO.getIngredientesDTO()) {
            for (Ingrediente ingrediente: ingredientes) {
                if(ingredienteDTO.getName().equals(ingrediente.getName())){
                    ingredientesPlato.add(new IngredienteDTO(ingrediente.getName(), ingrediente.getCalories()));
                }
            }
        }
        return ingredientesPlato;
    }


    public IngredienteDTO getIngredienteConMasCalorias(PlatoDTO platoDTO) {

        List<IngredienteDTO> ingredientes = this.getCaloriasIngredientes(platoDTO);
        IngredienteDTO ingredienteConMasCalorias = ingredientes.get(0);

        for (IngredienteDTO ingrediente: ingredientes) {
            if(ingredienteConMasCalorias.getCalories() < ingrediente.getCalories()){
                ingredienteConMasCalorias = ingrediente;
            }
        }

        return ingredienteConMasCalorias;
    }
}
