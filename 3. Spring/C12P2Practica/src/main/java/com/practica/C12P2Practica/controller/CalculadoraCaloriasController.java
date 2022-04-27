package com.practica.C12P2Practica.controller;

import com.practica.C12P2Practica.dto.IngredienteDTO;
import com.practica.C12P2Practica.dto.PlatoDTO;
import com.practica.C12P2Practica.model.Ingrediente;
import com.practica.C12P2Practica.services.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalculadoraCaloriasController {

    @Autowired
    private PlatoService platoService;// = new PlatoService();

    @GetMapping("/")
    public String home(){
        return "Estas en home";
    }

    @GetMapping("/prueba/plato")
    public PlatoDTO getDatosPlato(){
        List<IngredienteDTO> ingredientesDto = new ArrayList<>();
        ingredientesDto.add(new IngredienteDTO("Pan", 100));
        ingredientesDto.add(new IngredienteDTO("Salchicha", 400));
        PlatoDTO mockPlato = new PlatoDTO("Pancho", ingredientesDto);

        return mockPlato;
    }

    @GetMapping("/plato")
    public List<Ingrediente> getDatosPlato(@RequestBody PlatoDTO platoDTO){
        List<Ingrediente> calorias_totales = platoService.getCaloriasTotalesPlato();
        return calorias_totales;
    }


}
