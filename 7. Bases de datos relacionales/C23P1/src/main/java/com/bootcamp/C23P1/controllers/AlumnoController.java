package com.bootcamp.C23P1.controllers;

import com.bootcamp.C23P1.dtos.AlumnoDTO;
import com.bootcamp.C23P1.dtos.CreateAlumnoRequestDTO;
import com.bootcamp.C23P1.dtos.CreateAlumnoResponseDTO;
import com.bootcamp.C23P1.dtos.SorteoResponseDTO;
import com.bootcamp.C23P1.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @PostMapping(path = "createAlumno")
    public ResponseEntity<CreateAlumnoResponseDTO> createAlumno(@RequestBody CreateAlumnoRequestDTO createAlumnoRequestDTO){
        return new ResponseEntity<>(alumnoService.createAlumno(createAlumnoRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping(path = "getAlumnos")
    public List<AlumnoDTO> getAllAlumnos(){
        return alumnoService.getAllAlumnos();
    }

    @GetMapping(path = "/alumnos/draw")
    public SorteoResponseDTO sorteoOrden(){
        return alumnoService.sorteoOrden();
    }

}
