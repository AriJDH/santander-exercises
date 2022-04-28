package com.santanderbootacamp.Ejercicios.controllers;

import com.santanderbootacamp.Ejercicios.dto.PlatoDto;
import com.santanderbootacamp.Ejercicios.dto.ResponseIngredienteDto;
import com.santanderbootacamp.Ejercicios.services.PlatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalcCaloriasController {
    @Autowired
    PlatosService platosService;

    @PostMapping("/platos/nuevo")
    public ResponseEntity<String> nuevoPlato(@RequestBody PlatoDto plato) {
        platosService.agregar(plato);
        return new ResponseEntity<>("Se ha cargado el plato", HttpStatus.OK);
    }

    @GetMapping("/platos/caloriastotales/{plato}")
    public ResponseEntity<Integer> caloriasTotales(@RequestBody PlatoDto plato) {
        return new ResponseEntity<>(platosService.totalCalorias(plato), HttpStatus.OK);
    }

    @GetMapping("/platos/caloriasporingrediente/{plato}")
    public ResponseEntity<List<ResponseIngredienteDto>> caloriasPorIngrediente(@RequestBody PlatoDto plato) {
        return new ResponseEntity<>(platosService.caloriasPorIngredientes(plato), HttpStatus.OK);
    }
}
