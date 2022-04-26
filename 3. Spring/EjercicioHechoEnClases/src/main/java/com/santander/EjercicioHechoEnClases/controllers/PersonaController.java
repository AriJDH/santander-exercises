package com.santander.EjercicioHechoEnClases.controllers;

import com.santander.EjercicioHechoEnClases.modelo.Persona;
import com.santander.EjercicioHechoEnClases.servicios.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {
    PersonaService personaService = new PersonaService();

    @GetMapping("/getpersona")
    public Persona getPersona() {
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");
        return persona;
    }

    @GetMapping("/getpersonas")
    public List<Persona> getPersonas() {

        /*
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Gomez"));
        personas.add(new Persona("Maria","Juarez"));*/
        return personaService.getPersonas();
    }

    //Primero llamo a una clase que etse en una capa de servicio
    //LLamo PersonServicios: que devuelva una lista de personas
    //De servicios instaciar una implementacion de Dao en una arrayList. Dao dao= new DaoPersonaImpl()


}
