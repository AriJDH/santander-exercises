package com.ejPOSTyResponse.ejPOSTyResponse.controllers;

import com.ejPOSTyResponse.ejPOSTyResponse.dto.HabitacionDTO;
import com.ejPOSTyResponse.ejPOSTyResponse.dto.PropiedadDTO;
import com.ejPOSTyResponse.ejPOSTyResponse.services.ServiceCalculo;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class ConstructoraController {
    private ServiceCalculo ser = new ServiceCalculo();

    @PostMapping("/totalMetrosPropiedad")
    public ResponseEntity<Double> getMetrosProp(@RequestBody PropiedadDTO prop) {
        return new ResponseEntity<>(ser.getMetrosProp(prop), HttpStatus.OK);
    }

    @PostMapping("/precio")
    public ResponseEntity<Double> getPrecioProp(@RequestBody PropiedadDTO prop) {
        return new ResponseEntity<>(ser.getPrecio(prop), HttpStatus.OK);
    }

    @PostMapping("/getMostHabitacion")
    public ResponseEntity<Optional<HabitacionDTO>> getHabitacionMost(@RequestBody PropiedadDTO prop) {
        return new ResponseEntity<>(ser.getHabitacionMost(prop), HttpStatus.OK);
    }

    @PostMapping("/metrosPorHabitacion")
    public ResponseEntity<HashMap<String, Double>> getMetrosHabitaciones(@RequestBody PropiedadDTO prop) {
        return new ResponseEntity<>(ser.getMetrosHabitaciones(prop), HttpStatus.OK);
    }

}
