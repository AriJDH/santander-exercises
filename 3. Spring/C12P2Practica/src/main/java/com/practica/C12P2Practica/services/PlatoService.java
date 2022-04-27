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
        //pruebo solo con el primer ingrediente

        List<CaloriaIngrediente> calorias_ingredientes = new ArrayList<>();
        //dentro de un loop por cada ingrediente del plato
            IngredienteDTO ingrediente_del_plato = ingredientes.get(0);
            Ingrediente ingrediente_repo = ingredienteDao.getElementoPorId(ingrediente_del_plato.getNombre());
            String nombre_ingrediente_repo = ingrediente_repo.getName();
            Double calorias_ingrediente_repo = ingrediente_repo.getCalories();

            // calculo la calorias segun el peso
            // calorias son cada 100g

            // TODO: ver donde meto el 100
            Double total_calorias_ingrediente = calorias_ingrediente_repo * ingrediente_del_plato.getPeso() / 100;

            CaloriaIngrediente caloriaIngrediente = new CaloriaIngrediente(nombre_ingrediente_repo, total_calorias_ingrediente);

            calorias_ingredientes.add(caloriaIngrediente);
            //hago el map a DTO
        List<CaloriaIngredienteDTO> caloria_ingrediente_DTOs = calorias_ingredientes.stream().map(
                c -> new CaloriaIngredienteDTO(c.getNombre(),c.getTotalCalorias())
        ).collect(Collectors.toList());

        return caloria_ingrediente_DTOs;
    }
}
