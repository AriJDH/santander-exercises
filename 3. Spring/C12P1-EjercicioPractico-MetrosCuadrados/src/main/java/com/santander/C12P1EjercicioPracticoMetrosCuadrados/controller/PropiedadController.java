package com.santander.C12P1EjercicioPracticoMetrosCuadrados.controller;

import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.HabitacionDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.PropiedadDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.modelos.Propiedad;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.servicio.IPropiedadService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropiedadController {
    @Autowired
    IPropiedadService propiedadService;

    @PostMapping("/propiedad")
    public ResponseEntity<Double> getMetrosCuadradosProp (@RequestBody PropiedadDto propiedadDto ){
        Double metros_cuadrados = propiedadService.calcular_propiedad(propiedadDto);
        return new ResponseEntity<>(metros_cuadrados, HttpStatus.OK);
    }

    @PostMapping("/propiedad")
    public ResponseEntity<Double> getValorPropiedad (@RequestBody PropiedadDto propiedadDto ){
        Double valor_metros = propiedadService.valor_propiedad(propiedadDto);
        return new ResponseEntity<>(valor_metros, HttpStatus.OK);
    }

    @PostMapping("/propiedad")
    public ResponseEntity<HabitacionDto> getMetrosCuadradosMayor (@RequestBody PropiedadDto propiedadDto ){
        HabitacionDto habitacion = propiedadService.habitacion_mas_grande(propiedadDto);
        return new ResponseEntity<>(habitacion, HttpStatus.OK);
    }

    @PostMapping("/propiedad")
    public ResponseEntity<Double> getMetrosCuadradosHab (@RequestBody HabitacionDto habitacionDto ){
        Double metros_cuadrados = propiedadService.calcular_habitacion(habitacionDto);
        return new ResponseEntity<>(metros_cuadrados, HttpStatus.OK);
    }


}
