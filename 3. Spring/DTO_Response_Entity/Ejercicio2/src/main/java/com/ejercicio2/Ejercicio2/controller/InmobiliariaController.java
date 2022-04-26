package com.ejercicio2.Ejercicio2.controller;

import com.ejercicio2.Ejercicio2.dto.HabitacionDTO;
import com.ejercicio2.Ejercicio2.dto.PropiedadDTO;
import com.ejercicio2.Ejercicio2.modelos.Habitacion;
import com.ejercicio2.Ejercicio2.modelos.PropiedadInmobiliaria;
import com.ejercicio2.Ejercicio2.service.InmobiliariaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InmobiliariaController {

    final private InmobiliariaService inmobiliariaService= new InmobiliariaService();

    @PostMapping("/metrocuadrado")
    public PropiedadDTO calcularMetroCuadrados(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria){
        return inmobiliariaService.calcularMetrosCuadrados(propiedadInmobiliaria);
    }

    @PostMapping("/valorpropiedad")
    public String calcularValorPropiedad(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria){
        return inmobiliariaService.calcularValorPropiedad(propiedadInmobiliaria);
    }

    @PostMapping("/habitaciongrande")
    public Habitacion mostrarHabitacionBoquita(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria){
        return inmobiliariaService.mostrarHabitacionBoquita(propiedadInmobiliaria);
    }
    @PostMapping("/metroscuadradoporhabitacion")
    public List<HabitacionDTO> metrosCuadradoPorHabitacion(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria){
        return inmobiliariaService.metrosCuadradoPorHabitacion(propiedadInmobiliaria);
    }


}
