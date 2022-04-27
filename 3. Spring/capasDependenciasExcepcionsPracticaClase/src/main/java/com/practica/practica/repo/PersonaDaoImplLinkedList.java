package com.practica.practica.repo;

import com.practica.practica.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
@Repository(value="PersonaDaoImplLinkedList")
public class PersonaDaoImplLinkedList implements Dao<String,Persona>{

    private List<Persona> personas = new LinkedList<>();

    public PersonaDaoImplLinkedList() {
        personas.add(new Persona("aaaaa","Perez", LocalDate.of(1982,1,1)));
        personas.add(new Persona("Maria","Juarez", LocalDate.of(1985,1,12)));
        personas.add(new Persona("Ramona","Gomez", LocalDate.of(1789,12,1)));

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
