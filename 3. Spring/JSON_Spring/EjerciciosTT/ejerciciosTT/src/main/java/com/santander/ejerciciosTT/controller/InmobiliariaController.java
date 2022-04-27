package com.santander.ejerciciosTT.controller;

import com.santander.ejerciciosTT.DTO.HabitacionDTO;
import com.santander.ejerciciosTT.models.Habitacion;
import com.santander.ejerciciosTT.models.PropiedadDTO;
import com.santander.ejerciciosTT.models.PropiedadInmobiliaria;
import com.santander.ejerciciosTT.service.InmobiliariaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InmobiliariaController {

    final private InmobiliariaService inmobiliariaService = new InmobiliariaService();

    @PostMapping("/metrocuadrado")
    public PropiedadDTO calcularMetroCuadrados(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return inmobiliariaService.calcularMetrosCuadrados(propiedadInmobiliaria);
    }

    @PostMapping("/valorpropiedad")
    public String calcularValorPropiedad(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return inmobiliariaService.calcularValorPropiedad(propiedadInmobiliaria);
    }

    @PostMapping("/habitaciongrande")
    public Habitacion mostrarHabitacionBoquita(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return inmobiliariaService.mostrarHabitacionBoquita(propiedadInmobiliaria);
    }

    @PostMapping("/metroscuadradoporhabitacion")
    public List<HabitacionDTO> metrosCuadradoPorHabitacion(@RequestBody PropiedadInmobiliaria propiedadInmobiliaria) {
        return inmobiliariaService.metrosCuadradoPorHabitacion(propiedadInmobiliaria);
    }


}
