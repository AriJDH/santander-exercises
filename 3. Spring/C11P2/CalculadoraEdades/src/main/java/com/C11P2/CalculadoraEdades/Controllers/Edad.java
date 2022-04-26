package com.C11P2.CalculadoraEdades.Controllers;

import com.C11P2.CalculadoraEdades.Servicios.Calculardora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Edad {

    @GetMapping(path="/{dias}/{meses}/{anos}")
    public String getEdad(@PathVariable int anos,@PathVariable int meses,@PathVariable int dias ){

        return Calculardora.getEdad(dias,meses,anos);
    }

}
