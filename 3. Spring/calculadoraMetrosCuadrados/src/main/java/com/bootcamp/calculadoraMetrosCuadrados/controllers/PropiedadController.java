package com.bootcamp.calculadoraMetrosCuadrados.controllers;

import com.bootcamp.calculadoraMetrosCuadrados.models.Habitacion;
import com.bootcamp.calculadoraMetrosCuadrados.models.PropiedadInmobiliaria;
import com.bootcamp.calculadoraMetrosCuadrados.services.PropiedadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PropiedadController {

    PropiedadService service = new PropiedadService();

    @PostMapping(path = "addPropiedad")
    public void addPropiedad(@RequestBody PropiedadInmobiliaria propiedad){
        service.addPropiedad(propiedad);
    }

    @GetMapping(path = "getPropiedades")
    public List<PropiedadInmobiliaria> getPropiedades(){
        return service.getPropiedades();
    }

    @GetMapping(path = "getPropiedad/{nombrePropiedad}")
    public PropiedadInmobiliaria getPropiedadByNombre(@PathVariable String nombrePropiedad){
        return service.getPropiedadByNombre(nombrePropiedad);
    }

    @GetMapping(path = "calcularMetrosCuadrados/{nombrePropiedad}")
    public double calcularMetrosCuadradosByNombre(@PathVariable String nombrePropiedad){
        return service.calcularMetrosCuadrados(nombrePropiedad);
    }

    @GetMapping(path = "calcularValorPropiedad/{nombrePropiedad}")
    public double calcularValorPropiedad(@PathVariable String nombrePropiedad){
        return service.calcularValorPropiedad(nombrePropiedad);
    }

    @GetMapping(path = "getHabitacionMasGrande/{nombrePropiedad}")
    public Habitacion getHabitacionMasGrandeByNombrePropiedad(@PathVariable String nombrePropiedad){
        return service.getHabitacionMasGrande(nombrePropiedad);
    }


    @GetMapping(path = "getMetrosCuadradosPorHabitacion/{nombrePropiedad}")
    public String[][] getMetrosCuadradosPorHabitacion(@PathVariable String nombrePropiedad){
        return service.getMetrosCuadradosHabitaciones(nombrePropiedad);
    }



}
