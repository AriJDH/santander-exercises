package com.desafioSpring.desafio_spring.controllers;

import com.desafioSpring.desafio_spring.service.HotelesService;
import com.desafioSpring.desafio_spring.service.VuelosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Busqueda de hoteles y vuelos registrados, filtrado por fecha y destino")
public class HotelesYVuelosController {
    @Autowired
    VuelosService vuelosService;
    @Autowired
    HotelesService hotelesService;

    @Operation(summary = "Se obtiene una lista de hoteles y vuelos registrados.", description = "Se crea una lista de hoteles y vuelos en base al json hoteles.json  vuelos.json y se la devuelve")
    @GetMapping("/api/v1/bookingandflights")
    //WOW
    public ResponseEntity<List[]> getVuelosYHotelesPorFechaYDestino(@RequestParam String dateFrom, @RequestParam String dateTo, @RequestParam String destination) {
        return new ResponseEntity<>(new List[]{vuelosService.getElementosDisponiblesPorFechaYDestino(dateFrom, dateTo, destination), hotelesService.getElementosDisponiblesPorFechaYDestino(dateFrom, dateTo, destination)}, HttpStatus.OK);
    }

}
