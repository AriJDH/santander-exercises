package c12exercises.p2.controllers;

import c12exercises.p2.Application;
import c12exercises.p2.dto.request.PlatoDtoRequest;
import c12exercises.p2.dto.response.IngredienteDtoResponse;
import c12exercises.p2.dto.response.PlatoDtoResponse;
import c12exercises.p2.models.Plato;
import c12exercises.p2.services.PlatoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    PlatoService platoService = new PlatoService();

    @PostMapping("/recibirPlato")
    public ResponseEntity<String> recibirPlato(@RequestBody PlatoDtoRequest plato) {

        Logger LOGGER = LoggerFactory.getLogger(Application.class);
        LOGGER.info(String.valueOf(plato));
        platoService.recibirPlato(plato);
        return new ResponseEntity<>("Plato cargado", HttpStatus.CREATED);
    }

    @GetMapping("/mostrarPlatos")
    public ResponseEntity<List<Plato>> mostrarPlatos() {

        return new ResponseEntity<>(platoService.mostrarPlatos(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/mostrarIngredientes")
    public ResponseEntity<List<IngredienteDtoResponse>> mostrarIngredientes() {
        return new ResponseEntity<>(platoService.mostrarIngredientes(), HttpStatus.OK);
    }

    @GetMapping("/caloriasTotales/{nombre}")
    public ResponseEntity<PlatoDtoResponse> caloriasTotales(@PathVariable String nombre) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/caloriasPorIngrediente/{nombre}")
    public ResponseEntity<List<IngredienteDtoResponse>> caloriasPorIngrediente(@PathVariable String name) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/ingredienteConMasCalorias/{nombre}")
    public ResponseEntity<IngredienteDtoResponse> ingredienteConMasCalorias(@PathVariable String name) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}

/*
*
* {"nombre": "plato", "ingredientes": [{"nombre": "Aceitunas negras", "cantidad": 1}, {"nombre": "Aceitunas verdes", cantidad: 2}]}
*
* */