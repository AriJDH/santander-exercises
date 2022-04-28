package com.bootcamp.practicaCalculadoraDeCalorias.controllers;

import com.bootcamp.practicaCalculadoraDeCalorias.dto.IngredienteDTO;
import com.bootcamp.practicaCalculadoraDeCalorias.dto.PlatoDTO;
import com.bootcamp.practicaCalculadoraDeCalorias.services.IngredienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class IngredienteController {

    IngredienteService service = new IngredienteService();

    @GetMapping(path = "getIngredientes")
    public List<IngredienteDTO> getIngredientes(){
        return service.getIngredientes();
    }

    @PostMapping(path = "calcularCaloriasPlato")
    public double calcularCaloriasPlato(@RequestBody PlatoDTO platoDTO){
        return service.calcularCaloriasPlato(platoDTO);
    }

    @PostMapping(path = "obtenerCaloriasIngredientes")
    public List<IngredienteDTO> getCaloriasIngredientes(@RequestBody PlatoDTO platoDTO){
        return service.getCaloriasIngredientes(platoDTO);
    }

    @PostMapping(path = "getIngredienteConMasCalorias")
    public IngredienteDTO getIngredienteConMasCalorias(@RequestBody PlatoDTO platoDTO){
        return service.getIngredienteConMasCalorias(platoDTO);
    }


}
