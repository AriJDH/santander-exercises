package com.santander.C11P2EjercicioPracticoHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class CalculadoraEdad {
    @GetMapping("/{dia}/{mes}/{anio}")
    public Integer CalculadoraEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {

        Calendar c = Calendar.getInstance();
        Integer dia_actual = Integer.valueOf(Integer.toString(c.get(Calendar.DATE)));
        Integer mes_actual = Integer.valueOf(Integer.toString(c.get(Calendar.MONTH))); //me da 3 asi que le sumo 1
        Integer anio_actual = Integer.valueOf(Integer.toString(c.get(Calendar.YEAR)));
        ++mes_actual;
        
        Integer edad = anio_actual - anio;
        if (mes_actual < mes) {
            --edad;
        }
        else if(mes_actual == mes && dia_actual < dia){
            --edad;
        }
        else if (edad < 0){
            return -1;
        }
        return edad;
    }
}
