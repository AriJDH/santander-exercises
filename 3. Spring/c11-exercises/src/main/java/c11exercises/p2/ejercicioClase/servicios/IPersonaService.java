package c11exercises.p2.ejercicioClase.servicios;

import c11exercises.p2.ejercicioClase.dto.PersonDto;

import java.util.List;

public interface IPersonaService {
    public PersonDto getElement();
    public List<PersonDto> getElements();
    public void addElement(PersonDto p);
}
