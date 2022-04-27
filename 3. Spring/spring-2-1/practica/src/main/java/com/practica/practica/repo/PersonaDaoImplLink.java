package com.practica.practica.repo;

import com.practica.practica.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository(value = "PersonaDaoImplLink")
public class PersonaDaoImplLink implements Dao<String,Persona>{


    private List<Persona> personas = new LinkedList<>();

    public PersonaDaoImplLink() {
        personas.add(new Persona("Pedro","Perez", LocalDate.of(1980,1,1)));
        personas.add(new Persona("Juana","Juarez", LocalDate.of(1990,10,10)));
        personas.add(new Persona("Marta","Gomez", LocalDate.of(1995, 10,3)));

    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {

    }
}
