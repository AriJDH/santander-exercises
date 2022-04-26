package com.multiplesParametros.multiplesParametros.controllers;

import com.multiplesParametros.multiplesParametros.modelo.Persona;
import com.multiplesParametros.multiplesParametros.servicios.PersonaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class PersonaController {
    private PersonaServicio pServicio= new PersonaServicio();

    @GetMapping("/getPersona")
    public Persona getPersona(){
        Persona p1= new Persona();
        p1.setApellido("Marcos");
        p1.setNombre("Valen");
        return p1;
    }
    @GetMapping("/getPersonasFiltradas/{filtro}")
    public Stream<Persona> getPersonasFiltradas(@PathVariable String filtro){
        return pServicio.getPersonasFiltradas(filtro);
    }
    @GetMapping("/getPersonas")
    public List<Persona> getPersonas(){
        return pServicio.getPersonas();
    }

    @GetMapping("/getSaludo")
    public String getSaludo(@RequestParam String nombre, @RequestParam String apellido){
        return ("Hola por get a "+ nombre + " " + apellido);
    }



}
