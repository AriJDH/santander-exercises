package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.controller;

import com.santander.C12P2EjercicioPracticoCalculadoraCalorias.dto.IngredienteDto;
import com.santander.C12P2EjercicioPracticoCalculadoraCalorias.dto.PlatoDto;
import com.santander.C12P2EjercicioPracticoCalculadoraCalorias.servicio.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlatoController {
    @Autowired
    private PlatoService platoService;

    @GetMapping("/prueba/plato")
    public PlatoDto getDatosPlato(){
        List<IngredienteDto> ingredientesDto = new ArrayList<>();
        ingredientesDto.add(new IngredienteDto("Pan", 100.0));
        ingredientesDto.add(new IngredienteDto("Salchicha", 400.0));
        PlatoDto mockPlato = new PlatoDto("Pancho", ingredientesDto);

        return mockPlato;
    }

}
