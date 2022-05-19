package com.example.CP23P1.service;

import com.example.CP23P1.dto.request.AlumnoCreateRequestDTO;
import com.example.CP23P1.dto.request.TemaCreateRequestDTO;
import com.example.CP23P1.dto.response.AlumnoResponseDTO;
import com.example.CP23P1.dto.response.AlumnoResponseDrawDTO;
import com.example.CP23P1.dto.response.SuccessDTO;
import com.example.CP23P1.dto.response.TemaResponseDTO;
import com.example.CP23P1.entity.Alumno;
import com.example.CP23P1.entity.Tema;
import com.example.CP23P1.repository.AlumnoRepository;
import com.example.CP23P1.repository.TemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    @Autowired
    AlumnoRepository alumnoRepository;
    @Autowired
    TemaRepository temaRepository;

    ModelMapper modelMap = new ModelMapper();

    public SuccessDTO crearAlumno(AlumnoCreateRequestDTO alumnoCreateRequestDTO) {

        if (temaRepository.findById(alumnoCreateRequestDTO.getTema().getId()).isEmpty()) {
            throw new RuntimeException();
        }

        Alumno alumno = modelMap.map(alumnoCreateRequestDTO, Alumno.class);

        alumnoRepository.save(alumno);

        return new SuccessDTO("Alumno creado", HttpStatus.CREATED.value());

    }

    public SuccessDTO crearTema(TemaCreateRequestDTO temaCreateRequestDTO) {
        Tema tema = modelMap.map(temaCreateRequestDTO, Tema.class);
        temaRepository.save(tema);

        return new SuccessDTO("Tema creado", HttpStatus.CREATED.value());
    }

    public List<AlumnoResponseDTO> mostarAlumnos() {
        return alumnoRepository.findAll().stream().map(alumno -> modelMap.map(alumno, AlumnoResponseDTO.class)).collect(Collectors.toList());
    }

    public List<TemaResponseDTO> mostrarTemas() {
        return temaRepository.findAll().stream().map(tema -> modelMap.map(tema, TemaResponseDTO.class)).collect(Collectors.toList());
    }

    public List<AlumnoResponseDrawDTO> sortearAlumnos() {
        List<Alumno> alumnoList = alumnoRepository.findAll();
        Integer max = alumnoList.get(alumnoList.size() - 1).getId();
        Integer min = alumnoList.get(0).getId();
        Integer ammount_chosen = alumnoList.size() / 3;
        List<Alumno> alumnos = new ArrayList<>();
        ThreadLocalRandom.current().ints(min, max).distinct().limit(ammount_chosen).forEach(n -> {
            alumnos.add(alumnoRepository.findById(n).orElseThrow(RuntimeException::new));
        });
        return alumnos.stream().map(alumno -> modelMap.map(alumno, AlumnoResponseDrawDTO.class)).collect(Collectors.toList());

    }
}
