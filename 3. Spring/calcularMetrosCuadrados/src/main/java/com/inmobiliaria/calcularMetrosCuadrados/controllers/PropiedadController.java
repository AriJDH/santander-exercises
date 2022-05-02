package com.inmobiliaria.calcularMetrosCuadrados.controllers;

import com.inmobiliaria.calcularMetrosCuadrados.datos.PropiedadDTO;
import com.inmobiliaria.calcularMetrosCuadrados.datos.ResponsePropiedadDTO;

import com.inmobiliaria.calcularMetrosCuadrados.services.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PropiedadController {
    PropiedadService service=new PropiedadService();

    @GetMapping("/propiedad")
    public ResponseEntity<ResponsePropiedadDTO> obtenerDatosPropiedad(@RequestBody PropiedadDTO propiedad){
        System.out.println(propiedad);
        return new ResponseEntity<>(service.obtenerDatos(propiedad),HttpStatus.OK);
    }
}
