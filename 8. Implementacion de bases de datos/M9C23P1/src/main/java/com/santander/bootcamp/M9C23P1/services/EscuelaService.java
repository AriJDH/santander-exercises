package com.santander.bootcamp.M9C23P1.services;

import com.santander.bootcamp.M9C23P1.dtos.AlumnoDTO;
import com.santander.bootcamp.M9C23P1.dtos.MensajeDTO;
import com.santander.bootcamp.M9C23P1.dtos.TemaDTO;
import com.santander.bootcamp.M9C23P1.entities.Alumno;
import com.santander.bootcamp.M9C23P1.entities.Tema;
import com.santander.bootcamp.M9C23P1.repositories.AlumnoRepository;
import com.santander.bootcamp.M9C23P1.repositories.TemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EscuelaService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private TemaRepository temaRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    public MensajeDTO agregarAlumno(AlumnoDTO alumnoDTO) {

        Alumno alumno = modelMapper.map(alumnoDTO, Alumno.class);

        alumno.setTema(modelMapper.map(alumnoDTO.getTemaDTO(), Tema.class));

        alumno = this.alumnoRepository.save(alumno);

        if (alumno.getId() == null) throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "No se pudo crear el alumno"
        );

        return new MensajeDTO("Se creo el alumno correctamente", HttpStatus.CREATED.value());
    }

    public MensajeDTO agregarTema(TemaDTO temasDTO) {
        Tema tema = modelMapper.map(temasDTO, Tema.class);

        tema = this.temaRepository.save(tema);

        if (tema.getId() == null) throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "No se pudo crear el tema"
        );

        return new MensajeDTO("Se creo el tema correctamente", HttpStatus.CREATED.value());
    }

    public List<AlumnoDTO> getAlumnos() {
        return alumnoRepository.findAll().stream().map(
                alumno -> {
                    AlumnoDTO aux = modelMapper.map(alumno, AlumnoDTO.class);
                    aux.setTemaDTO(modelMapper.map(alumno, TemaDTO.class));
                    return aux;
                }
        ).collect(Collectors.toList());
    }

    public List<TemaDTO> getTemas() {
        return temaRepository.findAll().stream().map(
                tema -> modelMapper.map(tema, TemaDTO.class)
        ).collect(Collectors.toList());
    }

    public List<AlumnoDTO> getAlumnosDesafortunados() {
        List<Alumno> alumnosList = alumnoRepository.findAll();
        Set<Alumno> alumnosDesafortunados = new HashSet<>();

        if (alumnosList.size() < 5) throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Se debe tener al menos 5 alumnos"
        );

        while (alumnosDesafortunados.size() < 5) {
            alumnosDesafortunados.add(alumnosList.get((int) (Math.random() * alumnosList.size())));
        }

        return alumnosDesafortunados.stream().map(alumno -> {
            AlumnoDTO aux = modelMapper.map(alumno, AlumnoDTO.class);
            aux.setTemaDTO(modelMapper.map(alumno.getTema(), TemaDTO.class));
            return aux;
        }).collect(Collectors.toList());
    }

}
