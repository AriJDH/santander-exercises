package com.santander.aplicacionSorteo.service;

import com.santander.aplicacionSorteo.dto.AlumnoDTO;
import com.santander.aplicacionSorteo.dto.MensajeDTO;
import com.santander.aplicacionSorteo.dto.TemasDTO;
import com.santander.aplicacionSorteo.entity.Alumnos;
import com.santander.aplicacionSorteo.entity.Temas;
import com.santander.aplicacionSorteo.repository.AlumnoRepository;
import com.santander.aplicacionSorteo.repository.TemasRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EscuelaService {
    @Autowired
    AlumnoRepository alumnoRepository;
    @Autowired
    TemasRepository temasRepository;
    ModelMapper modelMapper = new ModelMapper();

    public MensajeDTO agregarAlumno(AlumnoDTO alumnoDTO){

        Alumnos alumnos = modelMapper.map(alumnoDTO, Alumnos.class);

        alumnos.setTema(modelMapper.map(alumnoDTO.getTemasDTO(),Temas.class));

        alumnos = this.alumnoRepository.save(alumnos);

        if(alumnos.getId() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"No se pudo crear el alumno");

        return new MensajeDTO("Se creo el alumno correctamente", HttpStatus.CREATED.value());
    }
    public MensajeDTO agregarTema(TemasDTO temasDTO){
        Temas temas = modelMapper.map(temasDTO, Temas.class);

        temas = this.temasRepository.save(temas);

        if(temas.getId() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"No se pudo crear el tema");

        return new MensajeDTO("Se creo el tema correctamente", HttpStatus.CREATED.value());
    }

    public List<AlumnoDTO> getAlumnos(){
       return alumnoRepository.findAll().stream().map(alumnos -> modelMapper.map(alumnos, AlumnoDTO.class)).collect(Collectors.toList());
    }
    public List<TemasDTO> getTemas(){
        return temasRepository.findAll().stream().map(temas -> modelMapper.map(temas, TemasDTO.class)).collect(Collectors.toList());
    }
    public List<AlumnoDTO> getAlumnosDesafortunados(){
        List<Alumnos> alumnosList = alumnoRepository.findAll();
        Set<Alumnos> alumnosDesafortunados = new HashSet<Alumnos>();
        while (alumnosDesafortunados.size()<5) {
            alumnosDesafortunados.add(alumnosList.get((int) (Math.random() * alumnosList.size())));
        }
        return alumnosDesafortunados.stream().map(alumnos -> {
            AlumnoDTO aux = modelMapper.map(alumnos,AlumnoDTO.class);
            aux.setTemasDTO(modelMapper.map(alumnos.getTema(),TemasDTO.class));
            return aux;
        }).collect(Collectors.toList());
    }

}
