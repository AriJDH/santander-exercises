package com.ejercicio1.Ejercicio1.controller;

import com.ejercicio1.Ejercicio1.dto.request.PlatoDTO;
import com.ejercicio1.Ejercicio1.dto.response.IngredienteConCaloriasDTO;
import com.ejercicio1.Ejercicio1.dto.response.PlatoCaloriasTotalesDTO;

import com.ejercicio1.Ejercicio1.dto.response.PlatoConCaloriasDTO;
import com.ejercicio1.Ejercicio1.service.CaloriaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaloriaController {
    @Autowired
    CaloriaService caloriaService;

    @PostMapping(path = "/caloriasTotales")
    public PlatoCaloriasTotalesDTO calcularCaloriasTotales(@RequestBody PlatoDTO platoDTO){
        return caloriaService.calcularCaloriasTotales(platoDTO);
    }

    @PostMapping(path = "/platoConCalorias")
    public PlatoConCaloriasDTO calcularCaloriasIngredientes(@RequestBody PlatoDTO platoDTO){
        return caloriaService.calcularCaloriasIngredientes(platoDTO);
    }

    @PostMapping(path = "/ingredienteConMayorCalorias")
    public IngredienteConCaloriasDTO obtenerIngredienteConMayorCalorias(@RequestBody PlatoDTO platoDTO){
        return caloriaService.obtenerIngredienteConMayorCalorias(platoDTO);
    }
}
