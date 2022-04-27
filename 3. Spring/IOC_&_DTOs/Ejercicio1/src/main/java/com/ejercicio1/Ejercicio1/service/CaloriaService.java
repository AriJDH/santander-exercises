package com.ejercicio1.Ejercicio1.service;

import com.ejercicio1.Ejercicio1.dto.request.IngredienteDTO;
import com.ejercicio1.Ejercicio1.dto.request.PlatoDTO;

import com.ejercicio1.Ejercicio1.dto.response.IngredienteConCaloriasDTO;
import com.ejercicio1.Ejercicio1.dto.response.PlatoCaloriasTotalesDTO;
import com.ejercicio1.Ejercicio1.dto.response.PlatoConCaloriasDTO;
import com.ejercicio1.Ejercicio1.repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "CaloriaService")
public class CaloriaService {

    @Autowired
    @Qualifier(value = "CaloriaImplDao")
    Dao caloriaImplDao;

    public PlatoCaloriasTotalesDTO calcularCaloriasTotales(PlatoDTO platoDTO) {
        double total = caloriaImplDao.caloriasTotales(platoDTO.getIngredientes());
        return new PlatoCaloriasTotalesDTO(platoDTO.getNombre(), total);
    }

    public PlatoConCaloriasDTO calcularCaloriasIngredientes(PlatoDTO platoDTO) {
        List<IngredienteConCaloriasDTO> ingredientesConCalorias=new ArrayList<>();
        for (IngredienteDTO ingrediente : platoDTO.getIngredientes()) {
            ingredientesConCalorias.add(new IngredienteConCaloriasDTO(ingrediente.getName(), caloriaImplDao.obtenerCalorias(ingrediente)));
        }
        return new PlatoConCaloriasDTO(platoDTO.getNombre(),ingredientesConCalorias);
    }


    public IngredienteConCaloriasDTO obtenerIngredienteConMayorCalorias(PlatoDTO platoDTO) {
        double mayorCalorias= caloriaImplDao.obtenerCalorias(platoDTO.getIngredientes().get(0));
        IngredienteConCaloriasDTO ingredienteConMayorCaloria= new IngredienteConCaloriasDTO(platoDTO.getIngredientes().get(0).getName(),mayorCalorias);
        double caloriaAux;
        for (IngredienteDTO ingrediente : platoDTO.getIngredientes()) {
            caloriaAux= caloriaImplDao.obtenerCalorias(ingrediente);
            if(caloriaAux> mayorCalorias){
                ingredienteConMayorCaloria.setCalorias(caloriaAux);
                ingredienteConMayorCaloria.setNombre(ingrediente.getName());
                mayorCalorias=caloriaAux;
            }
        }
        return ingredienteConMayorCaloria;
    }
}
