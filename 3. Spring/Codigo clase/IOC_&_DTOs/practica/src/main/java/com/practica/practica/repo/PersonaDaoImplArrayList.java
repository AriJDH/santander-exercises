package com.practica.practica.repo;

import com.practica.practica.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Repository(value = "PersonaDaoImplArrayList")
public class PersonaDaoImplArrayList implements Dao<String, Persona>{

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImplArrayList() {
        personas.add(new Persona("Carlos","Perez", LocalDate.of(2000,3,1)));
        personas.add(new Persona("Maria","Juarez",LocalDate.of(2000,6,1)));
        personas.add(new Persona("Ramona","Gomez",LocalDate.of(2000,3,10)));

    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        personas.add(elemento);
    }
}
