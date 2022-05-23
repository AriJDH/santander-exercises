package com.santander.sorteo.service;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.request.TemaResquestDTO;
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
public class TemaService {
    @Autowired
    ITemaRepository temaRepository;

    @Autowired
    IAlumnoRepository alumnoRepository;

    ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO newTopic (TemaResquestDTO temaResquestDTO) {
        Tema tema = modelMapper.map(temaResquestDTO, Tema.class);
        temaRepository.save(tema);
        SuccessDTO successDTO = new SuccessDTO(HttpStatus.CREATED.value(), "El tema se creo correctamente.");
        return successDTO;
    }

}
