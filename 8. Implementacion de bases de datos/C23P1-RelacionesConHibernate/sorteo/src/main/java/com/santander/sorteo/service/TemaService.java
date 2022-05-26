package com.santander.sorteo.service;

import com.santander.sorteo.dto.request.TemaResquestDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.dto.response.TemaResponseDTO;
import com.santander.sorteo.entity.Tema;
import com.santander.sorteo.repository.IAlumnoRepository;
import com.santander.sorteo.repository.ITemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<TemaResponseDTO> getTopics () {
        List<Tema> listTopics = temaRepository.findAll();
        return listTopics.stream().map(topic->modelMapper.map(topic,TemaResponseDTO.class)).collect(Collectors.toList());
    }
}
