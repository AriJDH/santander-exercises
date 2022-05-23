package com.santander.sorteo.service;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.response.AlumnoResponseDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.entity.Alumno;
import com.santander.sorteo.entity.Tema;
import com.santander.sorteo.repository.IAlumnoRepository;
import com.santander.sorteo.repository.ITemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    @Autowired
    IAlumnoRepository alumnoRepository;

    @Autowired
    ITemaRepository temaRepository;

    ModelMapper modelMapper = new ModelMapper();

    //Primero debemos asegurarnos que exista el tema para luego asociarlo al alumno
    public SuccessDTO newStudent (AlumnoResquestDTO alumnoResquestDTO) {
        //verifico que el idTema del alumno ingresado exista
        Integer idTema = alumnoResquestDTO.getTema().getId();
        if (temaRepository.findById(idTema).isEmpty()) {
            throw new RuntimeException();
        }
        Alumno alumno = modelMapper.map(alumnoResquestDTO, Alumno.class);
        alumnoRepository.save(alumno);
        SuccessDTO successDTO = new SuccessDTO(HttpStatus.CREATED.value(), "El alumno se creo correctamente.");
        return successDTO;
    }

}
