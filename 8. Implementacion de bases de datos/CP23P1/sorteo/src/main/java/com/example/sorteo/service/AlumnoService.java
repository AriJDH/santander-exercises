package com.example.sorteo.service;

import com.example.sorteo.dto.RequestAlumnoDto;
import com.example.sorteo.dto.ResponseAlumnoDto;
import com.example.sorteo.dto.ResponseDto;
import com.example.sorteo.entity.Alumno;
import com.example.sorteo.repository.IAlumnoRepository;
import com.example.sorteo.repository.ITemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {

    @Autowired
    IAlumnoRepository alumnoRepository;

    @Autowired
    ITemaRepository temaRepository;

    ModelMapper modelMapper = new ModelMapper();


    public ResponseDto addStudent(RequestAlumnoDto alumnoDto) {
        Alumno alumno = modelMapper.map(alumnoDto,Alumno.class);
        if(alumnoDto.getTema().getId() != 0){
            alumno.setTema(temaRepository.findById(alumnoDto.getTema().getId()).get());
        }
        alumnoRepository.save(alumno);
        return new ResponseDto("Se ha creado un nuevo alumno con id: "+ alumno.getId(), 201);
    }

    public List<ResponseAlumnoDto> listarAlumnos() {
        List<Alumno> listaAlumnos = alumnoRepository.findAll();
        List<ResponseAlumnoDto> listaResponse = listaAlumnos.stream().map(alumno -> modelMapper.map(alumno,ResponseAlumnoDto.class))
                .collect(Collectors.toList());

        return listaResponse;
    }
}
