package c11exercises.p2.ejercicioClase.dao;

import c11exercises.p2.ejercicioClase.models.Persona;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "DaoPersonImplJson")
public class DaoPersonImplJson implements Dao<String, Persona> {

    List<Persona> personas = new ArrayList<>();

    public DaoPersonImplJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:personas.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());

        TypeReference<List<Persona>> typeRef = new TypeReference<>() {};
        List<Persona> personas = null;
        try {
            personas = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.personas = personas;


    }

    @Override
    public List<Persona> getElements() {
        return this.personas;
    }

    @Override
    public void addElement(Persona person) {
        this.personas.add(person);
    }
}
