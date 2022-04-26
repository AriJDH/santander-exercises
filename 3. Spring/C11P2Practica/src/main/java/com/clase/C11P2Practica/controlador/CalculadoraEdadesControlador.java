package com.clase.C11P2Practica.controlador;

import com.clase.C11P2Practica.servicio.EdadServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraEdadesControlador {

    @GetMapping("/getedad/{dia}/{mes}/{anio}")
    public String getEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio){
        EdadServicio edadServicio = new EdadServicio();

        return "Edad: " + edadServicio.getEdad(dia, mes, anio);
    }

}
