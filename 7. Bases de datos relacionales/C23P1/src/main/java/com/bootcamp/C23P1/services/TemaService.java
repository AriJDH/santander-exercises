package com.bootcamp.C23P1.services;

import com.bootcamp.C23P1.dtos.CreateTemaRequestDTO;
import com.bootcamp.C23P1.dtos.CreateTemaResponseDTO;
import com.bootcamp.C23P1.dtos.TemaDTO;
import com.bootcamp.C23P1.models.Tema;
import com.bootcamp.C23P1.repositories.TemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TemaService {

    @Autowired
    TemaRepository temaRepository;

    ModelMapper modelMapper = new ModelMapper();

    public CreateTemaResponseDTO createTema(CreateTemaRequestDTO createTemaRequestDTO) {

        Tema tema = modelMapper.map(createTemaRequestDTO, Tema.class);
        temaRepository.save(tema);
        CreateTemaResponseDTO createTemaResponseDTO = new CreateTemaResponseDTO();

        if(temaRepository.existsById(tema.getId())){
            createTemaResponseDTO.setMessage("Tema creado correctamente");
            createTemaResponseDTO.setCode(HttpStatus.CREATED.value());
            createTemaResponseDTO.setTema(modelMapper.map(tema, TemaDTO.class));

            return createTemaResponseDTO;
        }

        createTemaResponseDTO.setMessage("Error al crear el tema.");
        createTemaResponseDTO.setCode(HttpStatus.NOT_FOUND.value());
        createTemaResponseDTO.setTema(null);

        return createTemaResponseDTO;
    }

    public List<TemaDTO> getAllTemas() {
        List<TemaDTO> listaTemasDTO = new ArrayList<>();
        temaRepository.findAll().stream().map( tema ->
                listaTemasDTO.add(
                        modelMapper.map(tema, TemaDTO.class)
                )
        ).collect(Collectors.toList());
        return listaTemasDTO;
    }
}
