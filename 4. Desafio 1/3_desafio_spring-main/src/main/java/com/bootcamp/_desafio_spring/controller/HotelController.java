package com.bootcamp._desafio_spring.controller;

import com.bootcamp._desafio_spring.dto.*;
import com.bootcamp._desafio_spring.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelService hotelService = new HotelService();



    @GetMapping("/")
    public String home(){
        return "Estas en home";
    }

    @GetMapping("/api/v1/hotels")
    public ResponseEntity<List<HotelDto>> getHoteles(){
        List<HotelDto> hotelDtos = hotelService.getHoteles();
        return new ResponseEntity<>(hotelDtos, HttpStatus.OK);
    }

    @GetMapping(value = "/api/v1/hotels", params = {"dateFrom","dateTo","destination"})
    public ResponseEntity<List<HotelDto>> getHotelesDisponibles(@RequestParam(value="dateFrom") String dateFrom,
                                                                           @RequestParam(value="dateTo") String dateTo,
                                                                           @RequestParam(value="destination") String destination){

        // parseo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaDesde = LocalDate.parse(dateFrom, formatter);
        LocalDate fechaHasta = LocalDate.parse(dateTo, formatter);

        //prueba
        List<HotelDto> hotelDtos = hotelService.getHoteles(destination, fechaDesde, fechaHasta);
        return new ResponseEntity<>(hotelDtos, HttpStatus.OK);
    }

    @PostMapping("/api/v1/booking")
    public ResponseEntity<RespuestaReservaDto> postReserva(@RequestBody RequestReservaDto requestReservaDto){
        RespuestaReservaDto respuesta = hotelService.reservar(requestReservaDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("api/v1/hotels")
    public ResponseEntity<RespuestaDto> agregarHotel(@RequestBody HotelDto hotelDto) {
        RespuestaDto respuesta = hotelService.agregar(hotelDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("/api/v1/hotels")
    public ResponseEntity<RespuestaDto> actualizacionHotel(@RequestBody HotelDto hotelDto) {
        RespuestaDto respuesta = hotelService.actualizar(hotelDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}
