package com.santander.bootcamp.M4C12P2.controllers;

import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;
import com.santander.bootcamp.M4C12P2.services.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @PostMapping("/agregarPlato")
    public ResponseEntity<String> agregarPlato(@RequestBody PlatoDTO platoDTO) {
        platoService.agregarPlato(platoDTO);
        return new ResponseEntity<>("Su plato fue agregado.", HttpStatus.CREATED);
    }

    @GetMapping("/obtenerPlato/{nombrePlato}")
    public ResponseEntity<PlatoDTO> obtenerPlato(@PathVariable String nombrePlato) {
        return new ResponseEntity<>(platoService.obtenerPlato(nombrePlato), HttpStatus.OK);
    }

    @GetMapping("/obtenerCalorias/{nombrePlato}")
    public ResponseEntity<String> obtenerCalorias(@PathVariable String nombrePlato) {
        return new ResponseEntity<>(String.format("%.2f", platoService.calcularCalorias(nombrePlato)), HttpStatus.OK);
    }

    @GetMapping("/obtenerCaloriasIngredientes/{nombrePlato}")
    public ResponseEntity<List<IngredienteCaloriasDTO>> obtenerCaloriasIngredientes(@PathVariable String nombrePlato) {
        return new ResponseEntity<>(platoService.obtenerCaloriasIngredientes(nombrePlato), HttpStatus.OK);
    }

    @GetMapping("/obtenerIngredientesMasCalorico/{nombrePlato}")
    public ResponseEntity<IngredienteCaloriasDTO> obtenerIngredientesMasCalorico(@PathVariable String nombrePlato) {
        return new ResponseEntity<>(platoService.obtenerIngredientesMasCalorico(nombrePlato), HttpStatus.OK);
    }
}
