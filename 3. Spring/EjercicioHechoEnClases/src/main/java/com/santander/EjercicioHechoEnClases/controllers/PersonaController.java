package com.santander.EjercicioHechoEnClases.controllers;

import com.santander.EjercicioHechoEnClases.modelo.Persona;
import com.santander.EjercicioHechoEnClases.servicios.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    private final PersonaService personaService = new PersonaService();

    @GetMapping("/getpersona")
    public Persona getPersona() {
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");
        return persona;
    }

    /*@GetMapping("/getpersonas")
    public List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Gomez"));
        personas.add(new Persona("Maria","Juarez"));
        return personas;
    }*/

    //Primero llamo a una clase que esta en una capa de servicio
    //LLamo PersonServicios: que devuelva una lista de personas
    //De servicios instaciar una implementacion de Dao en una arrayList. Dao dao= new DaoPersonaImpl()

    @GetMapping("/getpersonas")
    public List<Persona> getServicioPersonas(){
        return personaService.getPersonas();
    }

    @GetMapping("/personas/{dni}")
    public Persona getPersonaDni(@PathVariable String dni){
        return personaService.getPersonaPorDNI(dni);
    }
}
