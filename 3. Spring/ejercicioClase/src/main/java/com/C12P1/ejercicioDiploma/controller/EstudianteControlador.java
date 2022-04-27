package com.C12P1.ejercicioDiploma.controller;

import com.C12P1.ejercicioDiploma.EjercicioClaseApplication;
import com.C12P1.ejercicioDiploma.modelo.Estudiante;
import com.C12P1.ejercicioDiploma.servicios.EstudianteServ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteControlador {

    EstudianteServ estudianteServ = new EstudianteServ();
    Logger LOGGER = LoggerFactory.getLogger(EjercicioClaseApplication.class);

    @GetMapping("/getStudents")
    public ResponseEntity<List<Estudiante>> getStudents() {

        return new ResponseEntity<>(estudianteServ.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/getStudent/{name}")
    public ResponseEntity<Estudiante> getStudent(@PathVariable String name) {

        Estudiante s;
        try {
            s = estudianteServ.getStudent(name);
        } catch (Exception InvalidPathException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("/average/{name}")
    public ResponseEntity<String> getAverage(@PathVariable String name) {

        double average = 0;
        try {
            average = estudianteServ.getAverage(name);
        } catch (Exception InvalidPathException) {
            return new ResponseEntity<>("Este estudiante no existe", HttpStatus.BAD_REQUEST);
        }

        String msg;

        if (average >= 9) {
            msg = "Felicitaciones, tu promedio es de: " + average;
        } else {
            msg = "Tu promedio es de: " + average;
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Estudiante s) {
        estudianteServ.addStudent(s);

        LOGGER.info(String.valueOf(s));
        return new ResponseEntity<>("Estudiante agregado con exito", HttpStatus.CREATED);
    }

}