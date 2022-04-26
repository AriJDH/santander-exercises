package com.santander.bootcamp.M4C12P1.controllers;

import com.santander.bootcamp.M4C12P1.DTO.HabitacionDTO;
import com.santander.bootcamp.M4C12P1.models.Habitacion;
import com.santander.bootcamp.M4C12P1.models.PropiedadInmobiliaria;
import com.santander.bootcamp.M4C12P1.services.PropiedadInmobiliariaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropiedadInmobiliariaController {

    private final PropiedadInmobiliariaService service = new PropiedadInmobiliariaService();

    @PostMapping("/calcularMetrosCuadrados")
    public ResponseEntity<String> calcularMetrosCuadrados(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return new ResponseEntity<>(String.format("%,.2f", service.calcularMetrosCuadrados(propiedadInmobiliaria)), HttpStatus.OK);
    }

    @PostMapping("/calcularValorPropiedad")
    public ResponseEntity<String> calcularValorPropiedad(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return new ResponseEntity<>(String.format("%,.2f USD", service.calcularValorPropiedad(propiedadInmobiliaria)), HttpStatus.OK);
    }

    @PostMapping("/MostrarHabitacionMasGrande")
    public ResponseEntity<Habitacion> MostrarHabitacionMasGrande(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return new ResponseEntity<>(service.MostrarHabitacionMasGrande(propiedadInmobiliaria), HttpStatus.OK);
    }

    @PostMapping("/MostrarMetrosCuadradosPorHabitacion")
    public ResponseEntity<List<HabitacionDTO>> MostrarMetrosCuadradosPorHabitacion(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return new ResponseEntity<>(service.MostrarMetrosCuadradosPorHabitacion(propiedadInmobiliaria), HttpStatus.OK);
    }
}
