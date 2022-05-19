package com.santander.bootcamp.M9C23P1.controllers;

import com.santander.bootcamp.M9C23P1.dtos.AlumnoDTO;
import com.santander.bootcamp.M9C23P1.dtos.MensajeDTO;
import com.santander.bootcamp.M9C23P1.dtos.TemaDTO;
import com.santander.bootcamp.M9C23P1.services.EscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class EscuelaController {

    @Autowired
    private EscuelaService escuelaService;

    @PostMapping("/students")
    public ResponseEntity<MensajeDTO> agregaAlumno(@RequestBody AlumnoDTO alumnoDTO) {
        return ResponseEntity.ok().body(escuelaService.agregarAlumno(alumnoDTO));
    }

    @PostMapping("/topics")
    public ResponseEntity<MensajeDTO> agregaTema(@RequestBody TemaDTO temasDTO) {
        return ResponseEntity.ok().body(escuelaService.agregarTema(temasDTO));
    }

    @GetMapping("/students/")
    public ResponseEntity<List<AlumnoDTO>> getAlumnos() {
        return ResponseEntity.ok().body(escuelaService.getAlumnos());
    }

    @GetMapping("/topics/")
    public ResponseEntity<List<TemaDTO>> getTemas() {
        return ResponseEntity.ok().body(escuelaService.getTemas());
    }

    @GetMapping("/students/draw")
    public ResponseEntity<List<AlumnoDTO>> desafortunados() {
        return ResponseEntity.ok().body(escuelaService.getAlumnosDesafortunados());
    }

}
