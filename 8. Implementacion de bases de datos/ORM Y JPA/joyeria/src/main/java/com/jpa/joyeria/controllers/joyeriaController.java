package com.jpa.joyeria.controllers;

import com.jpa.joyeria.joyeriaDTO.JoyaDTO;
import com.jpa.joyeria.joyeriaDTO.StatusCode;
import com.jpa.joyeria.models.Joya;
import com.jpa.joyeria.services.JoyeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class joyeriaController {

    @Autowired
    JoyeriaService joyeriaService;

    @PostMapping("/joya/new")
    public ResponseEntity<StatusCode> addJoya(@RequestBody JoyaDTO joyadto) {
        return new ResponseEntity<>(joyeriaService.addJoya(joyadto), HttpStatus.OK);
    }

    @GetMapping("/joyas")
    public ResponseEntity<List<JoyaDTO>> listJoyas() {
        return ResponseEntity.ok()
                .body(joyeriaService.findAllJoyas());


    }
}