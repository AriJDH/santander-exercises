package com.C12P1.comida.controllers;

import com.C12P1.comida.dto.request.PlatoDtoRequest;
import com.C12P1.comida.dto.response.PlatoDtoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class Controller {

    @PostMapping("/recibirdato")
    public ResponseEntity<String> recibirPlato(@RequestBody PlatoDtoRequest plato){
        return new ResponseEntity<>("Plato recibido", HttpStatus.CREATED);
    }

    @GetMapping("/caloriasTotales/{nombre}")
    public ResponseEntity<PlatoDtoResponse> caloriasTotales(@PathVariable String nombre){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/calodiasPorIngrediente/{nombre}")
    public ResponseEntity<List<IngredienteDtoResponse>> caloriasPorIngrediente(@PathVariable String nombre){

    }

}
