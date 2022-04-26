package com.ejercicios.CP11P2Individual.controller;

import com.ejercicios.CP11P2Individual.modelo.Entidad;
import com.ejercicios.CP11P2Individual.servicios.EntidadServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EntidadController {
    @GetMapping(path = "/{dia}/{mes}/{ano}")
    public String getEntidad(@PathVariable int dia,@PathVariable int mes,@PathVariable int ano){
        Entidad entidad = new Entidad();
        entidad.setAnoNac(ano);
        entidad.setMesNac(mes);
        entidad.setDiaNac(dia);

        String mensaje = String.valueOf(entidad.calcularEdad(dia,mes,ano));


        return mensaje;
    }
}
