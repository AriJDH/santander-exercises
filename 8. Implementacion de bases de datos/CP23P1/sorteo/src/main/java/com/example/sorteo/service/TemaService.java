package com.example.sorteo.service;

import com.example.sorteo.dto.ResponseAlumnoDto;
import com.example.sorteo.dto.ResponseDto;
import com.example.sorteo.dto.RequestTemaDto;
import com.example.sorteo.dto.ResponseTemaDto;
import com.example.sorteo.entity.Alumno;
import com.example.sorteo.entity.Tema;
import com.example.sorteo.repository.ITemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TemaService {

    @Autowired
    ITemaRepository temaRepository;
    ModelMapper modelMapper = new ModelMapper();

    public ResponseDto addTema(RequestTemaDto temaDto) {
        Tema tema = modelMapper.map(temaDto,Tema.class);
        temaRepository.save(tema);
        return new ResponseDto("Se ha creado un nuevo tema, con id: "+tema.getId()
                , 201);
    }

    public List<ResponseTemaDto> listarTemas() {

        List<Tema> listaTemas = temaRepository.findAll();
        List<ResponseTemaDto> listaResponse = listaTemas.stream().map(tema -> modelMapper.map(tema,ResponseTemaDto.class))
                .collect(Collectors.toList());
        return listaResponse;
    }
}
