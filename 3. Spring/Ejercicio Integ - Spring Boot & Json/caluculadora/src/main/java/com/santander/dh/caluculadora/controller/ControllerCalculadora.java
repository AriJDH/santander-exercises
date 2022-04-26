package com.santander.dh.caluculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

@RestController
public class ControllerCalculadora {

    @GetMapping("/calculadora")
    public String calculadoraDeEdad(@RequestParam String fechaDeNacimiento){

        String[] arrayFechaUsuario = fechaDeNacimiento.split("/");
        ArrayList<Integer> fechaFinal = new ArrayList<>();
        for (int i = 0; i < arrayFechaUsuario.length; i++) {
            int fechaInt = Integer.parseInt(arrayFechaUsuario[i]);
            fechaFinal.add(fechaInt);
            System.out.println(fechaFinal.get(i));
        }
        return getEdad(fechaFinal);
    }

    public String getEdad(ArrayList<Integer> fechaFinal){
        Period edad = Period.between(LocalDate.of(fechaFinal.get(2),fechaFinal.get(1),fechaFinal.get(0)), LocalDate.now());
        return String.format("Usted tiene: %d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays());

    }

}
