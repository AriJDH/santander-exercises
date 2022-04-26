package com.santander.cuadrilaterosextra.controller;


import com.santander.cuadrilaterosextra.modelo.Cuadrado;
import com.santander.cuadrilaterosextra.modelo.Punto;
import com.santander.cuadrilaterosextra.modelo.Rectangulo;
import com.santander.cuadrilaterosextra.services.CuadradoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerGeometricas {

    @GetMapping
    public String area(){

        CuadradoServicio servicio = new CuadradoServicio();

        return servicio.areaDeUnCuadrado() + " as a service";

    }
}
