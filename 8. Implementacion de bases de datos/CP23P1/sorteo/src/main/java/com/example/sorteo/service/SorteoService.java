package com.example.sorteo.service;

import com.example.sorteo.dto.ResponseAlumnoDto;
import com.example.sorteo.entity.Alumno;
import com.example.sorteo.repository.IAlumnoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class SorteoService {
    
    @Autowired
    IAlumnoRepository alumnoRepository;
    ModelMapper modelMapper = new ModelMapper();

    public List<ResponseAlumnoDto> sortear() {
        List<Alumno> listaAlumnos = alumnoRepository.findAll();
        Collections.shuffle(listaAlumnos);
        List<Alumno> listaElegidos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaElegidos.add(listaAlumnos.get(i));
        }
        return listaElegidos.stream().map(alumno -> modelMapper.map(alumno,ResponseAlumnoDto.class))
                .collect(Collectors.toList());
    }
}
