package C11P2_Ejercicio4.controllers;


import C11P2_Ejercicio4.models.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CalculadoraController {

    @GetMapping(path= "/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio){
        return Calculadora.calcularEdad(dia,mes,anio);
    }
}
