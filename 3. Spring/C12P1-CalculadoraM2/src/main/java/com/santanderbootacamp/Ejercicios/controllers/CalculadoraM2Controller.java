package com.santanderbootacamp.Ejercicios.controllers;

import com.santanderbootacamp.Ejercicios.dto.PropiedadDto;
import com.santanderbootacamp.Ejercicios.services.CalculadoraM2Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraM2Controller {
    private CalculadoraM2Service calculadora = new CalculadoraM2Service();

    @PostMapping("/propiedad/nueva")
    public ResponseEntity<String> nuevaPropiedad(@RequestBody PropiedadDto propiedad) {
        if (calculadora.agregarPropiedad(propiedad.getNombre(),propiedad.getDireccion(), propiedad.getHabitaciones())) {
            return new ResponseEntity<>("Se agrego la propiedad", HttpStatus.OK);
        }
        return new ResponseEntity<>("No se pudo agregar la propiedad", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/propiedad/m2")
    public ResponseEntity<String> totalM2(@RequestBody PropiedadDto propiedad) {
        String metros2 = String.format("%.2f",calculadora.calcularTotalM2(propiedad.getDireccion()));
        if (metros2.equals("0.00")) {
            return new ResponseEntity<>("No hay una propiedad con esa dirección", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("La propiedad mide " + metros2 + " metros cuadrados", HttpStatus.OK);
    }

    @PostMapping("/propiedad/valor")
    public ResponseEntity<String> valorPropiedad(@RequestBody PropiedadDto propiedad) {
        String valor = String.format("%.2f",calculadora.valorPropiedad(propiedad.getDireccion()));
        if (valor.equals("0.00")) {
            return new ResponseEntity<>("No hay una propiedad con esa dirección", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("La propiedad tiene un valor de " + valor + "USD", HttpStatus.OK);
    }

    @PostMapping("/propiedad/habitacionmasgrande")
    public ResponseEntity<String> habitacionMasGrande(@RequestBody PropiedadDto propiedad) {
        String laMasGrande = calculadora.habitacionMasGrande(propiedad.getDireccion());
        if (laMasGrande.equals("")) {
            return new ResponseEntity<>("No hay una propiedad con esa dirección", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Habitacion más grande:\n" + laMasGrande, HttpStatus.OK);
    }

    @PostMapping("/propiedad/m2porhabitacion")
    public ResponseEntity<String> metros2PorHabitacion(@RequestBody PropiedadDto propiedad) {
        String laMasGrande = calculadora.calcularM2PorHabitacion(propiedad.getDireccion()).toString();
        if (laMasGrande.equals("[]")) {
            return new ResponseEntity<>("No hay una propiedad con esa dirección", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Tamaño habitaciones(en m2):\n" + laMasGrande, HttpStatus.OK);
    }
}
