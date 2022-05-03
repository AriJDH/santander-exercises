package com.bootcamp._desafio_spring.controller;

import com.bootcamp._desafio_spring.dto.*;
import com.bootcamp._desafio_spring.model.Vuelo;
import com.bootcamp._desafio_spring.service.HotelService;
import com.bootcamp._desafio_spring.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class VueloController {

    @Autowired

    private VueloService vueloService = new VueloService();

    //TODO Controller: para que funcione el formato debe ser yyyy-mm-dd; aplica para todos los body que tengan alguna fecha

    @PostMapping("api/v1/flights")
    public ResponseEntity<RespuestaDto> postReservaVuelo(@RequestBody VueloDto vueloDto) {
        RespuestaDto respuesta = vueloService.agregar(vueloDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("api/v1/flight-reservation")
    public ResponseEntity<RespuestaReservaVueloDto> postReservaVuelo(@RequestBody RequestReservaVueloDto requestReservaVueloDto) {
        RespuestaReservaVueloDto respuesta = vueloService.reservar(requestReservaVueloDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("/api/v1/flights")
    public ResponseEntity<RespuestaDto> actualizacionVuelo(@RequestBody VueloDto vueloDto) {
        RespuestaDto respuesta = vueloService.actualizar(vueloDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/api/v1/flights")
    public ResponseEntity<List<VueloDto>> getVuelos() {
        List<VueloDto> vueloDtos = vueloService.getVuelos();
        return new ResponseEntity<>(vueloDtos, HttpStatus.OK);

    }

    @GetMapping(value = "/api/v1/flights", params = {"fechaDesde", "fechaHasta", "origen", "destino"})
    public ResponseEntity<List<VueloDto>> getVuelosDisponibles(@RequestParam(value = "fechaDesde") String fechaDesde,
                                                               @RequestParam(value = "fechaHasta") String fechaHasta,
                                                               @RequestParam(value = "origen") String origen,
                                                               @RequestParam(value = "destino") String destino) {

        // parseo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaDesdeParseo = LocalDate.parse(fechaDesde, formatter);
        LocalDate fechaHastaParseo = LocalDate.parse(fechaHasta, formatter);

        //prueba

        List<VueloDto> vuelosDtos = vueloService.obtenerVuelos(origen, destino, fechaDesdeParseo, fechaHastaParseo);
        return new ResponseEntity<>(vuelosDtos, HttpStatus.OK);
    }


}
