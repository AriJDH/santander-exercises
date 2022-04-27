package com.practica.C12P2Practica.services;

import com.practica.C12P2Practica.dao.Dao;
import com.practica.C12P2Practica.dao.IngredienteDaoImplJson;
import com.practica.C12P2Practica.dto.CaloriaIngredienteDTO;
import com.practica.C12P2Practica.dto.IngredienteDTO;
import com.practica.C12P2Practica.dto.PlatoDTO;
import com.practica.C12P2Practica.model.CaloriaIngrediente;
import com.practica.C12P2Practica.model.Ingrediente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatoService {

    //@Autowired
    //@Qualifier(value="ingredienteDao")
    Dao<String, Ingrediente> ingredienteDao = new IngredienteDaoImplJson();

    public List<CaloriaIngredienteDTO> getCaloriasTotalesIngredientes(PlatoDTO platoDTO) {
        List<IngredienteDTO> ingredientes = platoDTO.getIngredientes();
        List<CaloriaIngrediente> calorias_ingredientes = new ArrayList<>();
        //dentro de un loop por cada ingrediente del plato
        for (IngredienteDTO ingrediente_del_plato: ingredientes) {
            Ingrediente ingrediente_repo = ingredienteDao.getElementoPorId(ingrediente_del_plato.getNombre());
            String nombre_ingrediente_repo = ingrediente_repo.getName();
            Double calorias_ingrediente_repo = ingrediente_repo.getCalories();

            // HIPOTESIS: calorias json son cada 100g
            // TODO: ver donde meto el 100
            // calculo la calorias segun el peso
            Double total_calorias_ingrediente = calorias_ingrediente_repo * ingrediente_del_plato.getPeso() / 100;

            CaloriaIngrediente caloriaIngrediente = new CaloriaIngrediente(nombre_ingrediente_repo, total_calorias_ingrediente);

            calorias_ingredientes.add(caloriaIngrediente);
        }

        //hago el map a DTO
        List<CaloriaIngredienteDTO> caloria_ingrediente_DTOs = calorias_ingredientes.stream().map(
                c -> new CaloriaIngredienteDTO(c.getNombre(),c.getTotalCalorias())
        ).collect(Collectors.toList());

        return caloria_ingrediente_DTOs;
    }
}
