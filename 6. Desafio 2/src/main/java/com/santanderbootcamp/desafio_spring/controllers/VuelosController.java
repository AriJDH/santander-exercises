package com.santanderbootcamp.desafio_spring.controllers;

import com.santanderbootcamp.desafio_spring.dto.request.PayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.dto.VuelosDto;
import com.santanderbootcamp.desafio_spring.service.VuelosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Tag(name = "Busqueda de vuelos registrados, filtro por fecha y destino, y registro de clientes (compra de pasajes de vuelo")
public class VuelosController {

    @Autowired
    VuelosService vuelosService;

    @Operation(summary = "Se obtiene una lista de Vuelos registrados.", description = "Se crea una lista de vuelos en base al json vuelos.json y se la devuelve")
    @GetMapping("/api/v1/flights")
    public ResponseEntity<List<VuelosDto>> getVuelosRegistrados() {
        return new ResponseEntity<>(vuelosService.getElementos(), HttpStatus.OK);
    }

    @Operation(summary = "Se obtiene una lista filtrada de todos los vuelos disponibles por un rango de fecha y destino", description = "Se pasa por parametro una fecha desde, hasta, y un destino. Luego se crea y obtiene una lista de vuelos con dichos filtros")
    @GetMapping(value = "/api/v1/flights", params = {"dateFrom", "dateTo", "destination"})
    public ResponseEntity<List<VuelosDto>> getVueloPorFechaYDestino(@RequestParam String dateFrom, @RequestParam String dateTo, @RequestParam String destination) {
        return new ResponseEntity<>(vuelosService.getElementosDisponiblesPorFechaYDestino(dateFrom, dateTo, destination), HttpStatus.OK);
    }

    @Operation(summary = "Se registra un cliente al reservar un vuelo y se devuelve el monto a pagar.", description = "Se ingresa un Payload con diversos datos del cliente, cantidad de asientos, destino y vuelo y se devuelve una response con los datos de la persona y el monto final a pagar")
    @PostMapping("/api/v1/flight-reservation")
    public ResponseEntity<ResponsePayloadVuelosDto> registrarClientesVuelo(@Valid @RequestBody PayloadVuelosDto clienteDto) {
        return new ResponseEntity<>(vuelosService.registrarYMostrarCliente(clienteDto), HttpStatus.OK);
    }
}