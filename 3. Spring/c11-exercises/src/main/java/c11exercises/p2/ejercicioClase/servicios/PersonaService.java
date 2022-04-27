package c11exercises.p2.ejercicioClase.servicios;

import c11exercises.p2.ejercicioClase.dao.Dao;
import c11exercises.p2.ejercicioClase.dao.DaoPersonImplJson;
import c11exercises.p2.ejercicioClase.dao.DaoPersonaImplArray;
import c11exercises.p2.ejercicioClase.dto.PersonDto;
import c11exercises.p2.ejercicioClase.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(value = "PersonaService")
public class PersonaService {

    @Autowired
    @Qualifier("DaoPersonImplJson")
    Dao<String, Persona> personaDao; //= new DaoPersonImplJson();

    public PersonDto getPersona() {
        PersonDto persona = new PersonDto();
        persona.setName("asd");
        persona.setLastname("Aaa");

        return persona;
    }

    public List<PersonDto> getPersonas() {
        List<Persona> list = personaDao.getElements();

        List<PersonDto> res = list.stream().map(p->new PersonDto(p.getName(),
                p.getLastname())).collect(Collectors.toList());
        return res;
    }

    public void addPerson(PersonDto person) {
        Persona persona = new Persona(person.getName(), person.getLastname());
        personaDao.addElement(persona);
    }
}
