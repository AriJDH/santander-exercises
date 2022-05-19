package com.sorteo.service;

import com.sorteo.dto.AlumnoDto;
import com.sorteo.dto.SorteoDto;
import com.sorteo.dto.TemaDto;
import com.sorteo.entity.Alumno;
import com.sorteo.entity.Tema;
import com.sorteo.repository.AlumnoRepository;
import com.sorteo.repository.TemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


@Service
public class SchoolService implements ISchoolService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private TemaRepository temaRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<AlumnoDto> getAlumnos() {

        List<Alumno> alumnoList = alumnoRepository.findAll();
        return alumnoList.stream().map(alumno ->
                modelMapper.map(alumno, AlumnoDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<TemaDto> getTemas() {

        List<Tema> temaList = temaRepository.findAll();
        return temaList.stream().map(tema ->
                modelMapper.map(tema, TemaDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<SorteoDto> getSorteo() {
        List <Alumno> alumnoList = alumnoRepository.findAll();
        Integer idMax = alumnoList.get(alumnoList.size() -1).getId();
        Integer cantMax = 2;
        List<Alumno> alumnosSorteo = new ArrayList<>();
        ThreadLocalRandom.current().ints(0,idMax).distinct().limit(cantMax)
                .forEach(id -> {
                    alumnosSorteo.add(alumnoRepository.findAlumnoById(id));
                });


        return alumnosSorteo.stream().map(alumno -> modelMapper.map(alumno, SorteoDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void saveTema(TemaDto temaDto) {

        Tema tema = modelMapper.map(temaDto, Tema.class);

        tema = this.temaRepository.save(tema);

    }

    @Override
    public void saveAlummno(AlumnoDto alumnoDto) {

        Alumno alumno = modelMapper.map(alumnoDto, Alumno.class);

        alumno = this.alumnoRepository.save(alumno);

    }
}
