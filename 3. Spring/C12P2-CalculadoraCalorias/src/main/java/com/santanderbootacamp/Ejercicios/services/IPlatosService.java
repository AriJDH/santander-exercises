package com.santanderbootacamp.Ejercicios.services;

import com.santanderbootacamp.Ejercicios.dto.PlatoDto;
import com.santanderbootacamp.Ejercicios.dto.ResponseIngredienteDto;

import java.util.List;

public interface IPlatosService {

    public void agregar(PlatoDto plato);

    public Integer totalCalorias(PlatoDto plato);

    public List<ResponseIngredienteDto> caloriasPorIngredientes(PlatoDto plato);
}
