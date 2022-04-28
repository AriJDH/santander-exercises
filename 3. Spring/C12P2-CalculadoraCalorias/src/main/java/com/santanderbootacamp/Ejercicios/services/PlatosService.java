package com.santanderbootacamp.Ejercicios.services;

import com.santanderbootacamp.Ejercicios.dto.RequestIngredienteDto;
import com.santanderbootacamp.Ejercicios.dto.PlatoDto;
import com.santanderbootacamp.Ejercicios.dto.ResponseIngredienteDto;
import com.santanderbootacamp.Ejercicios.models.Ingrediente;
import com.santanderbootacamp.Ejercicios.repo.IngredientesDaoImpl;
import com.santanderbootacamp.Ejercicios.repo.PlatosDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatosService implements IPlatosService {
    @Autowired
    PlatosDaoImpl platosDao;
    @Autowired
    IngredientesDaoImpl ingredientesDao;

    @Override
    public void agregar(PlatoDto plato) {
        List<RequestIngredienteDto> ingredientesDto = plato.getIngredientes();
        List<Ingrediente> ingredientesPlato = new ArrayList<>();
        for(int i = 0; i < ingredientesDto.size(); i++) {
            Ingrediente ingrediente = ingredientesDao.getElemento(ingredientesDto.get(i).getName());
            ingrediente.setCalories(ingrediente.getCalories() * ingredientesDto.get(i).getQuantity() / 100);
            ingredientesPlato.add(ingredientesDao.getElemento(ingredientesDto.get(i).getName()));
        }
        platosDao.agregarPlato(plato.getName(), ingredientesPlato);
    }

    @Override
    public Integer totalCalorias(PlatoDto plato) {
        List<Ingrediente> ingredientes = platosDao.getElemento(plato.getName()).getIngredientes();
        return ingredientes.stream().mapToInt(Ingrediente::getCalories).sum();
    }

    @Override
    public List<ResponseIngredienteDto> caloriasPorIngredientes(PlatoDto plato) {
        List<Ingrediente> ingredientes = platosDao.getElemento(plato.getName()).getIngredientes();
        List<ResponseIngredienteDto> ingredienteDtos = new ArrayList<>();
        for(Ingrediente ingrediente: ingredientes) {
            ingredienteDtos.add(new ResponseIngredienteDto(ingrediente.getName(),ingrediente.getCalories()));
        }
        return ingredienteDtos;
    }
}
