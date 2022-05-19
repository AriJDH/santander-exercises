package com.santander.aplicacionSorteo.controller;

import com.santander.aplicacionSorteo.dto.AlumnoDTO;
import com.santander.aplicacionSorteo.dto.MensajeDTO;
import com.santander.aplicacionSorteo.dto.TemasDTO;
import com.santander.aplicacionSorteo.service.EscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EscuelaController {

    @Autowired
    EscuelaService escuelaService;

    @PostMapping("/students")
    public ResponseEntity<MensajeDTO> agregaAlumno(@RequestBody AlumnoDTO alumnoDTO){
        return ResponseEntity.ok().body(escuelaService.agregarAlumno(alumnoDTO));
    }
    @PostMapping("/topics")
    public ResponseEntity<MensajeDTO> agregaTema(@RequestBody TemasDTO temasDTO){
        return ResponseEntity.ok().body(escuelaService.agregarTema(temasDTO));
    }
    @GetMapping("/students/")
    public ResponseEntity<List<AlumnoDTO>> getAlumnos(){
        return ResponseEntity.ok().body(escuelaService.getAlumnos());
    }
    @GetMapping("/topics/")
    public ResponseEntity<List<TemasDTO>> getTemas(){
        return ResponseEntity.ok().body(escuelaService.getTemas());
    }
    @GetMapping("/students/draw")
    public ResponseEntity<List<AlumnoDTO>> desafortunados(){
        return ResponseEntity.ok().body(escuelaService.getAlumnosDesafortunados());
    }


}
