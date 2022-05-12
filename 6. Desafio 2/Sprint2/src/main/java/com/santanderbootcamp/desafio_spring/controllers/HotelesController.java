package com.santanderbootcamp.desafio_spring.controllers;

import com.santanderbootcamp.desafio_spring.dto.HotelesDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.service.HotelesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Tag(name = "Busqueda de hoteles registrados, filtro por fecha y destino, y registro de clientes (reserva de habitaciones")
public class HotelesController {

    @Autowired
    HotelesService hotelesService;

    @Operation(summary = "Se obtiene una lista de Hoteles registrados.", description = "Se crea una lista de Hoteles en base al json hoteles.json y se la devuelve")
    @GetMapping("/api/v1/hotels")
    public ResponseEntity<List<HotelesDto>> getHotelesRegistrados() {
        return new ResponseEntity<>(hotelesService.getElementos(), HttpStatus.OK);
    }

    @Operation(summary = "Se obtiene una lista filtrada con los hoteles disponibles por rango de fechas y destino", description = "Se pasa por parametro una fecha desde, hasta, y un destino. Luego se crea y obtiene una lista de hoteles con dichos filtros")
    @GetMapping(value = "/api/v1/hotels", params = {"dateFrom", "dateTo", "destination"})
    public ResponseEntity<List<HotelesDto>> getHotelesDisponiblesPorFechaYDestino(@RequestParam String dateFrom, @RequestParam String dateTo, @RequestParam String destination) {
        return new ResponseEntity<>(hotelesService.getElementosDisponiblesPorFechaYDestino(dateFrom, dateTo, destination), HttpStatus.OK);
    }

    @Operation(summary = "Se registra un cliente en un cuarto de hotel y se devuelve el monto a pagar.", description = "Se ingresa un Payload con diversos datos del hotel y habitación a alquilar y se devuelve una response con los datos de la persona y el monto final a pagar")
    @PostMapping(value = "/api/v1/booking")
    public ResponseEntity<ResponsePayloadHotelesDto> registrarClientesHotel(@Valid @RequestBody PayloadHotelesDto clienteDto) {
        return new ResponseEntity<>(hotelesService.registrarYMostrarCliente(clienteDto), HttpStatus.OK);
    }

}
