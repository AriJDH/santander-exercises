package com.sorteo.controller;

import com.sorteo.dto.AlumnoDto;
import com.sorteo.dto.SorteoDto;
import com.sorteo.dto.TemaDto;
import com.sorteo.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private ISchoolService schoolService;

    @PostMapping("/students")
    public String saveAlumno(@RequestBody AlumnoDto alumnoDto){
        schoolService.saveAlummno(alumnoDto);
        return "Se creo el alumno con exito";
    }

    @PostMapping("/topics")
    public String saveTema(@RequestBody TemaDto temaDto){
        schoolService.saveTema(temaDto);
        return "Se creo el tema con exito";
    }

    @GetMapping("/students/")
    public List<AlumnoDto> getAlumnos(){
        List<AlumnoDto> alumnoDtos = schoolService.getAlumnos();
        return  alumnoDtos;

    }

    @GetMapping("/topics/")
    public List<TemaDto> getTemas(){
        List<TemaDto> temaDtos = schoolService.getTemas();
        return temaDtos;
    }

    @GetMapping("/students/draw")
    public List<SorteoDto> getSorteo(){
        List<SorteoDto> sorteoDtos = schoolService.getSorteo();
        return sorteoDtos;
    }

}
